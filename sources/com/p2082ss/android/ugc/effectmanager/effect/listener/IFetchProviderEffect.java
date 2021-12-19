package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect */
public interface IFetchProviderEffect extends IEffectPlatformBaseListener<ProviderEffectModel> {
    static {
        Covode.recordClassIndex(95559);
    }

    void onFail(ExceptionResult exceptionResult);
}
