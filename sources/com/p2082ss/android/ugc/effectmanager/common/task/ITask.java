package com.p2082ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.task.ITask */
public interface ITask {
    static {
        Covode.recordClassIndex(95494);
    }

    void cancel();

    void execute();
}
