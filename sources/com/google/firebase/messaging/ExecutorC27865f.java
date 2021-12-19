package com.google.firebase.messaging;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.f */
public final /* synthetic */ class ExecutorC27865f implements Executor {

    /* renamed from: a */
    static final Executor f65447a = new ExecutorC27865f();

    static {
        Covode.recordClassIndex(33458);
    }

    private ExecutorC27865f() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
