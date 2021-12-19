package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.ScanQRCodeResponse;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.ScanQRCodeTaskResult;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectInfoByQRCodeTask */
public class FetchEffectInfoByQRCodeTask extends NormalTask {
    private EffectConfiguration mConfiguration;
    private int mCurCnt = this.mConfiguration.getRetryCount();
    private EffectContext mEffectContext;
    private final EffectQRCode mEffectQRCode;
    private IJsonConverter mJsonConverter;

    static {
        Covode.recordClassIndex(95702);
    }

    private EffectRequest buildEffectListRequest() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.mConfiguration.getSdkVersion())) {
            hashMap.put("sdk_version", this.mConfiguration.getSdkVersion());
        }
        hashMap.put("sec_id", URLEncoder.encode(new JSONObject(this.mEffectQRCode.getQrCodeText()).getString("SecId")));
        if (!TextUtils.isEmpty(this.mConfiguration.getAppID())) {
            hashMap.put("aid", this.mConfiguration.getAppID());
        }
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(hashMap, this.mEffectContext.getBestHostUrl() + this.mConfiguration.getApiAdress() + "/tidyEffect/secId"));
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        InputStream inputStream;
        Throwable th;
        try {
            EffectRequest buildEffectListRequest = buildEffectListRequest();
            while (true) {
                int i = this.mCurCnt;
                this.mCurCnt = i - 1;
                if (i != 0) {
                    try {
                        if (isCanceled()) {
                            onFail(new ExceptionResult(10001));
                            return;
                        }
                        try {
                            inputStream = this.mConfiguration.getEffectNetWorker().execute(buildEffectListRequest);
                            try {
                                ScanQRCodeResponse scanQRCodeResponse = (ScanQRCodeResponse) this.mConfiguration.getEffectNetWorker().parse(buildEffectListRequest, inputStream, this.mJsonConverter, ScanQRCodeResponse.class);
                                if (scanQRCodeResponse.checkValue()) {
                                    ScanQRCodeResponse.DataNode dataNode = scanQRCodeResponse.data;
                                    Effect effect = dataNode.effect.toEffect(dataNode.url_prefix);
                                    EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), Collections.singletonList(effect));
                                    sendMessage(25, new ScanQRCodeTaskResult(effect, null));
                                    FileUtils.INSTANCE.closeQuietly(inputStream);
                                    return;
                                } else if (this.mCurCnt == 0) {
                                    onFail(new ExceptionResult(10002));
                                    FileUtils.INSTANCE.closeQuietly(inputStream);
                                    return;
                                } else {
                                    FileUtils.INSTANCE.closeQuietly(inputStream);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                FileUtils.INSTANCE.closeQuietly(inputStream);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            FileUtils.INSTANCE.closeQuietly(inputStream);
                            throw th;
                        }
                    } catch (Exception e) {
                        if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                            onFail(new ExceptionResult(e));
                        }
                    }
                } else {
                    return;
                }
            }
            onFail(new ExceptionResult(e));
        } catch (JSONException e2) {
            onFail(new ExceptionResult(e2));
        }
    }

    private void onFail(ExceptionResult exceptionResult) {
        sendMessage(22, new ScanQRCodeTaskResult(null, exceptionResult));
    }

    public FetchEffectInfoByQRCodeTask(EffectContext effectContext, EffectQRCode effectQRCode, String str, Handler handler) {
        super(handler, str);
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mJsonConverter = effectConfiguration.getJsonConverter();
        this.mEffectQRCode = effectQRCode;
    }
}
