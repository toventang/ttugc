package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener */
public interface IFetchEffectChannelListener extends IEffectPlatformBaseListener<EffectChannelResponse> {
    static {
        Covode.recordClassIndex(95551);
    }

    void onFail(ExceptionResult exceptionResult);
}
