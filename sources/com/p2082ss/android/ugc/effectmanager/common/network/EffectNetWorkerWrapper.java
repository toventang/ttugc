package com.p2082ss.android.ugc.effectmanager.common.network;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p2082ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import java.io.InputStream;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper */
public class EffectNetWorkerWrapper {
    private Context mContext;
    private IEffectNetWorker mIEffectNetWorker;

    static {
        Covode.recordClassIndex(95488);
    }

    public Context getContext() {
        return this.mContext;
    }

    public IEffectNetWorker getIEffectNetWorker() {
        return this.mIEffectNetWorker;
    }

    public void setIEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
        this.mIEffectNetWorker = iEffectNetWorker;
    }

    private void logRequestedUrl(EffectRequest effectRequest) {
        try {
            EPLog.m141898d("EffectNetWorker", "request url: ".concat(String.valueOf(effectRequest.getUrl().replaceAll("&?device_info=[^&]*", ""))));
        } catch (Exception e) {
            EPLog.m141900e("EffectNetWorker", "error in print url", e);
        }
    }

    public InputStream execute(EffectRequest effectRequest) {
        logRequestedUrl(effectRequest);
        InputStream execute = this.mIEffectNetWorker.execute(effectRequest);
        if (execute != null) {
            return execute;
        }
        if (!NetworkUtils.isNetworkAvailable(this.mContext)) {
            throw new RuntimeException("network unavailable");
        } else if (TextUtils.isEmpty(effectRequest.getErrorMsg())) {
            throw new RuntimeException("Download error");
        } else {
            throw new RuntimeException(effectRequest.getErrorMsg());
        }
    }

    public EffectNetWorkerWrapper(IEffectNetWorker iEffectNetWorker, Context context) {
        this.mIEffectNetWorker = iEffectNetWorker;
        this.mContext = context;
    }

    public <T extends BaseNetResponse> T execute(EffectRequest effectRequest, IJsonConverter iJsonConverter, Class<T> cls) {
        logRequestedUrl(effectRequest);
        InputStream execute = this.mIEffectNetWorker.execute(effectRequest);
        if (execute != null) {
            T t = (T) ((BaseNetResponse) iJsonConverter.convertJsonToObj(execute, cls));
            CloseUtil.close(execute);
            if (t != null) {
                int i = t.status_code;
                if (i == 0) {
                    return t;
                }
                throw new StatusCodeException(i, t.message);
            }
            throw new JSONException("Json convert fail");
        } else if (!NetworkUtils.isNetworkAvailable(this.mContext)) {
            throw new Exception("network unavailable");
        } else if (TextUtils.isEmpty(effectRequest.getErrorMsg())) {
            throw new NetworkErrorException("Download error");
        } else {
            throw new NetworkErrorException(effectRequest.getErrorMsg());
        }
    }

    public <T extends BaseNetResponse> T parse(EffectRequest effectRequest, InputStream inputStream, IJsonConverter iJsonConverter, Class<T> cls) {
        T t = (T) ((BaseNetResponse) iJsonConverter.convertJsonToObj(inputStream, cls));
        if (t != null) {
            int i = t.status_code;
            if (i == 0) {
                return t;
            }
            throw new StatusCodeException(i, t.message);
        }
        throw new JSONException("Json convert fail");
    }
}
