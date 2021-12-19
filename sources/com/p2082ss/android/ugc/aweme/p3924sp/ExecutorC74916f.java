package com.p2082ss.android.ugc.aweme.p3924sp;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.sp.f */
final /* synthetic */ class ExecutorC74916f implements Executor {

    /* renamed from: a */
    static final Executor f168411a = new ExecutorC74916f();

    static {
        Covode.recordClassIndex(87781);
    }

    private ExecutorC74916f() {
    }

    public final void execute(Runnable runnable) {
        new Thread(runnable, "SharedPreferencesImpl-load").start();
    }
}
