package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2 */
public interface ISearchEffectListenerV2 extends IEffectPlatformBaseListener<SearchEffectResponseV2> {
    static {
        Covode.recordClassIndex(95566);
    }

    void onFail(ExceptionResult exceptionResult);
}
