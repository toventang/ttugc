package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener */
public interface IDownloadProviderEffectListener extends IEffectPlatformBaseListener<ProviderEffect> {
    static {
        Covode.recordClassIndex(95545);
    }

    void onFail(ProviderEffect providerEffect, ExceptionResult exceptionResult);
}
