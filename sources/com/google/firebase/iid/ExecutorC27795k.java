package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.k */
public final /* synthetic */ class ExecutorC27795k implements Executor {

    /* renamed from: a */
    static final Executor f65300a = new ExecutorC27795k();

    static {
        Covode.recordClassIndex(33383);
    }

    private ExecutorC27795k() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
