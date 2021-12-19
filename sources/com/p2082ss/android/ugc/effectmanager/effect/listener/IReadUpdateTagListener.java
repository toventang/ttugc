package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IReadUpdateTagListener */
public interface IReadUpdateTagListener extends IEffectPlatformBaseListener<HashMap<String, String>> {
    static {
        Covode.recordClassIndex(95563);
    }

    void onFailed(ExceptionResult exceptionResult);
}
