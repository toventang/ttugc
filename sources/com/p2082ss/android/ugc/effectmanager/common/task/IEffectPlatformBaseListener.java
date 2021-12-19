package com.p2082ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener */
public interface IEffectPlatformBaseListener<T> {
    static {
        Covode.recordClassIndex(95493);
    }

    void onSuccess(T t);
}
