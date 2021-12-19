package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.o */
final class ExecutorC27073o implements Executor {
    static {
        Covode.recordClassIndex(32553);
    }

    ExecutorC27073o() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
