package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.p */
final class ExecutorC27074p implements Executor {

    /* renamed from: a */
    private final Handler f64056a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32554);
    }

    public final void execute(Runnable runnable) {
        this.f64056a.post(runnable);
    }
}
