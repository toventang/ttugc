package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener */
public interface ISearchEffectListener extends IEffectPlatformBaseListener<SearchEffectResponse> {
    static {
        Covode.recordClassIndex(95565);
    }

    void onFail(ExceptionResult exceptionResult);
}
