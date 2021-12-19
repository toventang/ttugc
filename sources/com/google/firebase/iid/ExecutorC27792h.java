package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.h */
final /* synthetic */ class ExecutorC27792h implements Executor {

    /* renamed from: a */
    static final Executor f65295a = new ExecutorC27792h();

    static {
        Covode.recordClassIndex(33380);
    }

    private ExecutorC27792h() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
