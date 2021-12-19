package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.EffectConstants;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.FetchPanelInfoTaskResult;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchPanelInfoTask */
public class FetchPanelInfoTask extends NormalTask {
    private String category;
    private int count;
    private int cursor;
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
    private int requestStrategy = this.mConfiguration.getRequestStrategy();
    private long size;
    private boolean withCategoryEffect;

    static {
        Covode.recordClassIndex(95709);
    }

    private EffectRequest buildEffectListRequest() {
        String str;
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        if (!TextUtils.isEmpty(this.panel)) {
            addCommonParams.put("panel", this.panel);
        }
        if (this.withCategoryEffect) {
            addCommonParams.put("has_category_effects", "true");
            addCommonParams.put("category", this.category);
            addCommonParams.put("cursor", String.valueOf(this.cursor));
            addCommonParams.put("count", String.valueOf(this.count));
        }
        String testStatus = this.mConfiguration.getTestStatus();
        if (testStatus != null) {
            addCommonParams.put("test_status", testStatus);
        }
        this.mSelectedHost = this.mEffectContext.getBestHostUrl();
        StringBuilder append = new StringBuilder().append(this.mSelectedHost).append(this.mConfiguration.getApiAdress());
        if (this.requestStrategy == 2) {
            str = "/panel/info/v2";
        } else {
            str = "/panel/info";
        }
        String buildRequestUrl = NetworkUtils.buildRequestUrl(addCommonParams, append.append(str).toString());
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

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0160, code lost:
        sendMessage(22, new com.p2082ss.android.ugc.effectmanager.effect.task.result.FetchPanelInfoTaskResult(r7, null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x016e, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0182, code lost:
        com.p2082ss.android.ugc.effectmanager.common.utils.CloseUtil.close(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x018f, code lost:
        com.p2082ss.android.ugc.effectmanager.common.utils.CloseUtil.close(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0192, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0193, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0175 A[Catch:{ all -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0193 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0179 A[ADDED_TO_REGION, EDGE_INSN: B:55:0x0179->B:35:0x0179 ?: BREAK  , SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute() {
        /*
        // Method dump skipped, instructions count: 415
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchPanelInfoTask.execute():void");
    }

    private void onFail(ExceptionResult exceptionResult) {
        exceptionResult.setTrackParams(this.mRequestedUrl, this.mSelectedHost, this.mRemoteIp);
        sendMessage(22, new FetchPanelInfoTaskResult(null, exceptionResult));
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            iMonitorService.monitorStatusRate("panel_info_success_rate", 1, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("panel", this.panel).addValuePair("error_code", Integer.valueOf(exceptionResult.getErrorCode())).addValuePair("error_msg", exceptionResult.getMsg()).addValuePair("host_ip", this.mRemoteIp).addValuePair("download_url", this.mRequestedUrl).addValuePair("effect_platform_type", (Integer) 0).build());
        }
    }

    private void saveEffectList(PanelInfoResponse panelInfoResponse) {
        String generatePanelInfoKey = EffectCacheKeyGenerator.generatePanelInfoKey(this.mConfiguration.getChannel(), this.panel);
        try {
            this.size = this.mFileCache.save(generatePanelInfoKey, this.mJsonConverter.convertObjToJson(panelInfoResponse)) / ((long) EffectConstants.f183427KB);
        } catch (Exception e) {
            EPLog.m141899e("FetchPanelInfoTask", Log.getStackTraceString(e));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", panelInfoResponse.getData().getVersion());
            this.mFileCache.save(EffectCacheKeyGenerator.generatePanelInfoVersionKey(this.panel), jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public FetchPanelInfoTask(EffectContext effectContext, String str, String str2, boolean z, String str3, int i, int i2, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.withCategoryEffect = z;
        this.category = str3;
        this.count = i;
        this.cursor = i2;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
    }
}
