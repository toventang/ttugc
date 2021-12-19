package com.p2082ss.android.ugc.effectmanager.knadapt;

import android.accounts.NetworkErrorException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.p2082ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import java.io.InputStream;
import org.json.JSONException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.AdapterExtKt */
public final class AdapterExtKt {
    static {
        Covode.recordClassIndex(95717);
    }

    public static final <T extends AbstractC86845h<?>> T execute(EffectNetWorkerWrapper effectNetWorkerWrapper, EffectRequest effectRequest, IJsonConverter iJsonConverter, Class<T> cls) {
        String str;
        C89219l.m154719c(effectNetWorkerWrapper, "");
        C89219l.m154719c(iJsonConverter, "");
        InputStream execute = effectNetWorkerWrapper.getIEffectNetWorker().execute(effectRequest);
        if (execute != null) {
            T t = (T) ((AbstractC86845h) iJsonConverter.convertJsonToObj(execute, cls));
            CloseUtil.close(execute);
            if (t != null) {
                int statusCode = t.getStatusCode();
                if (statusCode == 0) {
                    return t;
                }
                throw new StatusCodeException(statusCode, t.getResponseMessage());
            }
            throw new JSONException("Json convert fail");
        } else if (NetworkUtils.isNetworkAvailable(effectNetWorkerWrapper.getContext())) {
            String str2 = null;
            if (effectRequest != null) {
                str = effectRequest.getErrorMsg();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (effectRequest != null) {
                    str2 = effectRequest.getErrorMsg();
                }
                throw new NetworkErrorException(str2);
            }
            throw new NetworkErrorException("Download error");
        } else {
            throw new Exception("network unavailable");
        }
    }

    public static final <T extends AbstractC86845h<?>> T parse(EffectNetWorkerWrapper effectNetWorkerWrapper, EffectRequest effectRequest, InputStream inputStream, IJsonConverter iJsonConverter, Class<T> cls) {
        C89219l.m154719c(effectNetWorkerWrapper, "");
        C89219l.m154719c(iJsonConverter, "");
        if (inputStream == null) {
            C89219l.m154707a();
        }
        T t = (T) ((AbstractC86845h) iJsonConverter.convertJsonToObj(inputStream, cls));
        if (t != null) {
            int statusCode = t.getStatusCode();
            if (statusCode == 0) {
                return t;
            }
            throw new StatusCodeException(statusCode, t.getResponseMessage());
        }
        throw new JSONException("Json convert fail");
    }
}
