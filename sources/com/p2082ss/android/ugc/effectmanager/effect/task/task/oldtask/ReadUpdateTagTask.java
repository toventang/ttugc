package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.ReadTagTaskResult;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.ReadUpdateTagTask */
public class ReadUpdateTagTask extends NormalTask {
    private ICache mCache;
    private String mId;
    private IJsonConverter mJsonConverter;
    private String mUpdateTime;

    static {
        Covode.recordClassIndex(95713);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        InputStream queryToStream = this.mCache.queryToStream("updatetime");
        if (queryToStream == null) {
            sendMessage(52, new ReadTagTaskResult(this.mId, this.mUpdateTime, null, new ExceptionResult(10009)));
            return;
        }
        try {
            HashMap hashMap = (HashMap) this.mJsonConverter.convertJsonToObj(queryToStream, HashMap.class);
            if (hashMap != null) {
                sendMessage(52, new ReadTagTaskResult(this.mId, this.mUpdateTime, hashMap, null));
            } else {
                sendMessage(52, new ReadTagTaskResult(this.mId, this.mUpdateTime, null, new ExceptionResult(new IllegalStateException("local file destroy"))));
            }
        } catch (Exception e) {
            sendMessage(52, new ReadTagTaskResult(this.mId, this.mUpdateTime, null, new ExceptionResult(e)));
        } finally {
            CloseUtil.close(queryToStream);
        }
    }

    public ReadUpdateTagTask(Handler handler, EffectContext effectContext, String str, String str2, String str3) {
        super(handler, str);
        this.mCache = effectContext.getEffectConfiguration().getCache();
        this.mJsonConverter = effectContext.getEffectConfiguration().getJsonConverter();
        this.mId = str2;
        this.mUpdateTime = str3;
    }
}
