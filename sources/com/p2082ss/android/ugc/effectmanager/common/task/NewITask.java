package com.p2082ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.task.NewITask */
public interface NewITask<T> {
    static {
        Covode.recordClassIndex(95495);
    }

    void cancel();

    void execute(IEffectPlatformBaseListener<T> iEffectPlatformBaseListener);

    String getId();
}
