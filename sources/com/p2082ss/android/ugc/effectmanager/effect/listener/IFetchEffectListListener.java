package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener */
public interface IFetchEffectListListener extends IEffectPlatformBaseListener<List<Effect>> {
    static {
        Covode.recordClassIndex(95553);
    }

    void onFail(ExceptionResult exceptionResult);
}
