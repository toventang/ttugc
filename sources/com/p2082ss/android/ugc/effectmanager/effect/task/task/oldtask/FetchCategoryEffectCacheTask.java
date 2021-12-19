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
import com.p2082ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.FetchCategoryEffectTaskResult;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchCategoryEffectCacheTask */
public class FetchCategoryEffectCacheTask extends NormalTask {
    private String category;
    private int count;
    private int cursor;
    private EffectConfiguration mConfiguration;
    private EffectContext mEffectContext;
    private ICache mFileCache;
    private IJsonConverter mJsonConverter = this.mConfiguration.getJsonConverter();
    private IMonitorService monitorService = this.mConfiguration.getMonitorService();
    private String panel;
    private int requestStrategy = this.mConfiguration.getRequestStrategy();
    private int sortingPosition;

    static {
        Covode.recordClassIndex(95697);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        CategoryEffectListResponse categoryEffectListResponse;
        long currentTimeMillis = System.currentTimeMillis();
        InputStream queryToStream = this.mFileCache.queryToStream(EffectCacheKeyGenerator.generateCategoryEffectKey(this.panel, this.category, this.count, this.cursor, this.sortingPosition));
        if (queryToStream == null) {
            sendMessage(21, new FetchCategoryEffectTaskResult(null, new ExceptionResult(10004)));
            return;
        }
        try {
            categoryEffectListResponse = (CategoryEffectListResponse) this.mJsonConverter.convertJsonToObj(queryToStream, CategoryEffectListResponse.class);
        } catch (Exception e) {
            EPLog.m141899e("FetchCategoryEffectCacheTask", Log.getStackTraceString(e));
            categoryEffectListResponse = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
            mobEvent(currentTimeMillis2 - currentTimeMillis);
            sendMessage(21, new FetchCategoryEffectTaskResult(null, new ExceptionResult(10004)));
        } else {
            sendMessage(21, new FetchCategoryEffectTaskResult(categoryEffectListResponse.getData(), null));
        }
        CloseUtil.close(queryToStream);
    }

    private void mobEvent(long j) {
        IMonitorService iMonitorService = this.monitorService;
        if (iMonitorService != null) {
            iMonitorService.monitorStatusRate("category_list_success_rate", 0, EventJsonBuilder.newBuilder().addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("panel", this.panel).addValuePair("category", this.category).addValuePair("duration", Long.valueOf(j)).addValuePair("from_cache", "true").addValuePair("request_strategy", Integer.valueOf(this.requestStrategy)).addValuePair("effect_platform_type", (Integer) 0).build());
        }
    }

    public FetchCategoryEffectCacheTask(EffectContext effectContext, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.category = str3;
        this.count = i;
        this.cursor = i2;
        this.sortingPosition = i3;
        this.mEffectContext = effectContext;
        EffectConfiguration effectConfiguration = effectContext.getEffectConfiguration();
        this.mConfiguration = effectConfiguration;
        this.mFileCache = effectConfiguration.getCache();
    }
}
