package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener */
public interface IScanQRCodeListener extends IEffectPlatformBaseListener<Effect> {
    static {
        Covode.recordClassIndex(95564);
    }

    void onFail(ExceptionResult exceptionResult);
}
