package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
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
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.p2082ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.HotEffectTaskResult;
import com.p2082ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchHotEffectTask */
public class FetchHotEffectTask extends NormalTask {
    private int count;
    private int cursor;
    private Map<String, String> extraParams;
    private EffectConfiguration mConfiguration;
    private EffectContext mContext;
    private int mCurCnt;
    private ICache mFileCache;
    private IJsonConverter mJsonConverter;
    private IMonitorService monitorService;
    private long startTime = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(95707);
    }

    private FetchHotEffectResponse getFromCache() {
        FetchHotEffectResponse fetchHotEffectResponse;
        Exception e;
        InputStream queryToStream = this.mFileCache.queryToStream(EffectCacheKeyGenerator.generateHotStickerKey());
        if (queryToStream == null) {
            return null;
        }
        try {
            fetchHotEffectResponse = (FetchHotEffectResponse) this.mJsonConverter.convertJsonToObj(queryToStream, FetchHotEffectResponse.class);
            try {
                fetchHotEffectResponse.setFromCache(true);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            fetchHotEffectResponse = null;
            EPLog.m141899e("FetchPanelInfoCacheTask", Log.getStackTraceString(e));
            System.currentTimeMillis();
            CloseUtil.close(queryToStream);
            return fetchHotEffectResponse;
        }
        System.currentTimeMillis();
        CloseUtil.close(queryToStream);
        return fetchHotEffectResponse;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest buildRequest = buildRequest(this.count, this.cursor);
        this.startTime = System.currentTimeMillis();
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                try {
                    if (isCanceled()) {
                        sendMessage(62, new HotEffectTaskResult(null, new ExceptionResult(10001)));
                        return;
                    }
                    InputStream execute = this.mConfiguration.getEffectNetWorker().execute(buildRequest);
                    long currentTimeMillis = System.currentTimeMillis();
                    FetchHotEffectResponse fetchHotEffectResponse = (FetchHotEffectResponse) AdapterExtKt.parse(this.mConfiguration.getEffectNetWorker(), buildRequest, execute, this.mJsonConverter, FetchHotEffectResponse.class);
                    if (fetchHotEffectResponse != null) {
                        EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchHotEffectResponse.getEffects());
                        EffectUtils.setEffectPath(this.mConfiguration.getEffectDir().getAbsolutePath(), fetchHotEffectResponse.getCollection());
                        EffectUtils.setUrlModel(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getEffects());
                        EffectUtils.setUrlModel(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getCollection());
                        EffectUtils.setEffectRecId(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getEffects());
                        EffectUtils.setEffectRecId(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getCollection());
                        sendMessage(62, new HotEffectTaskResult(fetchHotEffectResponse, null));
                        long currentTimeMillis2 = System.currentTimeMillis();
                        IMonitorService iMonitorService = this.monitorService;
                        if (iMonitorService != null) {
                            iMonitorService.monitorStatusRate("hot_list_success_rate", 0, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("duration", Long.valueOf(currentTimeMillis2 - this.startTime)).addValuePair("network_time", Long.valueOf(currentTimeMillis - this.startTime)).addValuePair("effect_platform_type", (Integer) 0).build());
                        }
                        saveEffectList(fetchHotEffectResponse);
                        return;
                    } else if (this.mCurCnt == 0) {
                        tryGetFromCache(null);
                    }
                } catch (Exception e) {
                    if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                        tryGetFromCache(e);
                        e.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        tryGetFromCache(e);
        e.printStackTrace();
    }

    private void saveEffectList(FetchHotEffectResponse fetchHotEffectResponse) {
        String generateHotStickerKey = EffectCacheKeyGenerator.generateHotStickerKey();
        if (this.mFileCache != null) {
            try {
                this.mFileCache.save(generateHotStickerKey, this.mJsonConverter.convertObjToJson(fetchHotEffectResponse));
            } catch (Exception e) {
                EPLog.m141899e("save hot EffectList", Log.getStackTraceString(e));
            }
        }
    }

    private void tryGetFromCache(Exception exc) {
        if (this.monitorService != null) {
            this.monitorService.monitorStatusRate("hot_list_success_rate", 1, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("error_code", (Integer) 10002).addValuePair("duration", Long.valueOf(System.currentTimeMillis() - this.startTime)).addValuePair("error_msg", Log.getStackTraceString(exc)).addValuePair("effect_platform_type", (Integer) 0).build());
        }
        FetchHotEffectResponse fromCache = getFromCache();
        if (fromCache == null || !fromCache.checkValue()) {
            sendMessage(62, new HotEffectTaskResult(null, new ExceptionResult(new Exception())));
        } else {
            sendMessage(62, new HotEffectTaskResult(fromCache, null));
        }
    }

    private EffectRequest buildRequest(int i, int i2) {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        addCommonParams.put("cursor", String.valueOf(i2));
        addCommonParams.put("count", String.valueOf(i));
        addCommonParams.put("panel", "default");
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, this.mContext.getBestHostUrl() + this.mConfiguration.getApiAdress() + "/hoteffects"));
    }

    public FetchHotEffectTask(EffectContext effectContext, int i, int i2, Map<String, String> map, Handler handler, String str) {
        super(handler, str);
        this.count = i;
        this.cursor = i2;
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
        this.mFileCache = this.mConfiguration.getCache();
        this.mJsonConverter = this.mConfiguration.getJsonConverter();
        this.monitorService = this.mConfiguration.getMonitorService();
    }
}
