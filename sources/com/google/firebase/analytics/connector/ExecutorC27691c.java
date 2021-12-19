package com.google.firebase.analytics.connector;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.analytics.connector.c */
final /* synthetic */ class ExecutorC27691c implements Executor {

    /* renamed from: a */
    static final Executor f65091a = new ExecutorC27691c();

    static {
        Covode.recordClassIndex(33272);
    }

    private ExecutorC27691c() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
