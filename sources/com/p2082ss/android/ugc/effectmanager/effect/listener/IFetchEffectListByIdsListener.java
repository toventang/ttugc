package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener */
public interface IFetchEffectListByIdsListener extends IEffectPlatformBaseListener<EffectListResponse> {
    static {
        Covode.recordClassIndex(95552);
    }

    void onFail(ExceptionResult exceptionResult);
}
