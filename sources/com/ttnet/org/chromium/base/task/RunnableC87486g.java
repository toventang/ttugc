package com.ttnet.org.chromium.base.task;

import android.os.Process;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ttnet.org.chromium.base.task.g */
final /* synthetic */ class RunnableC87486g implements Runnable {

    /* renamed from: a */
    private final Runnable f198445a;

    static {
        Covode.recordClassIndex(103432);
    }

    RunnableC87486g(Runnable runnable) {
        this.f198445a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f198445a;
        Process.setThreadPriority(10);
        runnable.run();
    }
}
