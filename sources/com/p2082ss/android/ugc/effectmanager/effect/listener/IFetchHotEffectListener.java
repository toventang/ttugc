package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener */
public interface IFetchHotEffectListener extends IEffectPlatformBaseListener<FetchHotEffectResponse> {
    static {
        Covode.recordClassIndex(95557);
    }

    void onFailed(ExceptionResult exceptionResult);
}
