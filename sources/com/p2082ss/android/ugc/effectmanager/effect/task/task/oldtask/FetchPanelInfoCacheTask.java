package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.p2082ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.FetchPanelInfoTaskResult;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchPanelInfoCacheTask */
public class FetchPanelInfoCacheTask extends NormalTask {
    private EffectConfiguration mConfiguration;
    private EffectContext mEffectContext;
    private ICache mFileCache;
    private IJsonConverter mJsonConverter = this.mConfiguration.getJsonConverter();
    private IMonitorService monitorService = this.mConfiguration.getMonitorService();
    private String panel;
    private int requestStrategy = this.mConfiguration.getRequestStrategy();

    static {
        Covode.recordClassIndex(95708);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        PanelInfoResponse panelInfoResponse;
        long currentTimeMillis = System.currentTimeMillis();
        InputStream queryToStream = this.mFileCache.queryToStream(EffectCacheKeyGenerator.generatePanelInfoKey(this.mConfiguration.getChannel(), this.panel));
        if (queryToStream == null) {
            sendMessage(22, new FetchPanelInfoTaskResult(null, new ExceptionResult(10004)));
            return;
        }
        try {
            panelInfoResponse = (PanelInfoResponse) this.mJsonConverter.convertJsonToObj(queryToStream, PanelInfoResponse.class);
        } catch (Exception e) {
            EPLog.m141899e("FetchPanelInfoCacheTask", Log.getStackTraceString(e));
            panelInfoResponse = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (panelInfoResponse == null || !panelInfoResponse.checkValue()) {
            mobEvent(currentTimeMillis2 - currentTimeMillis);
            sendMessage(22, new FetchPanelInfoTaskResult(null, new ExceptionResult(10004)));
        } else {
            sendMessage(22, new FetchPanelInfoTaskResult(panelInfoResponse.getData(), null));
        }
        CloseUtil.close(queryToStream);
    }

    private void mobEvent(long j) {
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            iMonitorService.monitorStatusRate("panel_info_success_rate", 0, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("panel", this.panel).addValuePair("duration", Long.valueOf(j)).addValuePair("from_cache", "true").addValuePair("request_strategy", Integer.valueOf(this.requestStrategy)).addValuePair("effect_platform_type", (Integer) 0).build());
        }
    }

    public FetchPanelInfoCacheTask(EffectContext effectContext, String str, String str2, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
    }
}
