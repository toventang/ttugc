package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.EffectConstants;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.p2082ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectChannelTaskResult;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectChannelTask */
public class FetchEffectChannelTask extends NormalTask {
    private EffectConfiguration mConfiguration;
    private int mCurCnt = this.mConfiguration.getRetryCount();
    private EffectContext mEffectContext;
    private ICache mFileCache;
    private IJsonConverter mJsonConverter = this.mConfiguration.getJsonConverter();
    private String mRemoteIp;
    private String mRequestedUrl;
    private String mSelectedHost;
    private IMonitorService monitorService = this.mConfiguration.getMonitorService();
    private String panel;
    private long size;

    static {
        Covode.recordClassIndex(95701);
    }

    private EffectRequest buildEffectListRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        if (!TextUtils.isEmpty(this.panel)) {
            addCommonParams.put("panel", this.panel);
        }
        this.mSelectedHost = this.mEffectContext.getBestHostUrl();
        String buildRequestUrl = NetworkUtils.buildRequestUrl(addCommonParams, this.mSelectedHost + this.mConfiguration.getApiAdress() + "/v3/effects");
        this.mRequestedUrl = buildRequestUrl;
        try {
            this.mRemoteIp = InetAddress.getByName(new URL(buildRequestUrl).getHost()).getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
        return new EffectRequest("GET", buildRequestUrl);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        InputStream inputStream;
        Throwable th;
        Exception e;
        long currentTimeMillis = System.currentTimeMillis();
        EffectRequest buildEffectListRequest = buildEffectListRequest();
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                inputStream = null;
                try {
                    if (isCanceled()) {
                        onFail(new ExceptionResult(10001));
                        CloseUtil.close(null);
                        return;
                    }
                    InputStream execute = this.mConfiguration.getEffectNetWorker().execute(buildEffectListRequest);
                    try {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        EffectNetListResponse effectNetListResponse = (EffectNetListResponse) this.mConfiguration.getEffectNetWorker().parse(buildEffectListRequest, execute, this.mJsonConverter, EffectNetListResponse.class);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (effectNetListResponse.checkValue()) {
                            EffectChannelModel data = effectNetListResponse.getData();
                            EffectChannelResponse buildChannelResponse = new BuildEffectChannelResponse(this.panel, this.mEffectContext.getEffectConfiguration().getEffectDir().getAbsolutePath(), false).buildChannelResponse(data);
                            saveEffectList(data);
                            sendMessage(14, new EffectChannelTaskResult(buildChannelResponse, null));
                            long currentTimeMillis4 = System.currentTimeMillis();
                            IMonitorService iMonitorService = this.monitorService;
                            if (iMonitorService != null) {
                                iMonitorService.monitorStatusRate("effect_list_success_rate", 0, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("panel", this.panel).addValuePair("duration", Long.valueOf(currentTimeMillis4 - currentTimeMillis)).addValuePair("network_time", Long.valueOf(currentTimeMillis2 - currentTimeMillis)).addValuePair("json_time", Long.valueOf(currentTimeMillis3 - currentTimeMillis2)).addValuePair("io_time", Long.valueOf(currentTimeMillis4 - currentTimeMillis3)).addValuePair("size", Long.valueOf(this.size)).addValuePair("effect_platform_type", (Integer) 0).build());
                            }
                            CloseUtil.close(execute);
                            return;
                        } else if (this.mCurCnt == 0) {
                            onFail(new ExceptionResult(10002));
                            CloseUtil.close(execute);
                            return;
                        } else {
                            CloseUtil.close(execute);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        inputStream = execute;
                        try {
                            if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                                onFail(new ExceptionResult(e));
                                CloseUtil.close(inputStream);
                            }
                            CloseUtil.close(inputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            CloseUtil.close(inputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = execute;
                        CloseUtil.close(inputStream);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    if (this.mCurCnt == 0) {
                        break;
                    }
                    break;
                    onFail(new ExceptionResult(e));
                    CloseUtil.close(inputStream);
                }
            } else {
                return;
            }
        }
        onFail(new ExceptionResult(e));
        CloseUtil.close(inputStream);
    }

    private void onFail(ExceptionResult exceptionResult) {
        exceptionResult.setTrackParams(this.mRequestedUrl, this.mSelectedHost, this.mRemoteIp);
        sendMessage(14, new EffectChannelTaskResult(null, exceptionResult));
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            iMonitorService.monitorStatusRate("effect_list_success_rate", 1, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("panel", this.panel).addValuePair("error_code", Integer.valueOf(exceptionResult.getErrorCode())).addValuePair("error_msg", exceptionResult.getMsg()).addValuePair("host_ip", this.mRemoteIp).addValuePair("download_url", this.mRequestedUrl).addValuePair("effect_platform_type", (Integer) 0).build());
        }
    }

    private void saveEffectList(EffectChannelModel effectChannelModel) {
        String generatePanelKey = EffectCacheKeyGenerator.generatePanelKey(this.mConfiguration.getChannel(), this.panel);
        try {
            this.size = this.mFileCache.save(generatePanelKey, this.mJsonConverter.convertObjToJson(effectChannelModel)) / ((long) EffectConstants.f183427KB);
        } catch (Exception e) {
            EPLog.m141899e("FetchEffectChannelTask", Log.getStackTraceString(e));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", effectChannelModel.getVersion());
            this.mFileCache.save("effect_version" + this.panel, jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public FetchEffectChannelTask(EffectContext effectContext, String str, String str2, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
    }
}
