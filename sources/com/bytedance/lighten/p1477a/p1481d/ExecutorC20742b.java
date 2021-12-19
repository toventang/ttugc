package com.bytedance.lighten.p1477a.p1481d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.lighten.a.d.b */
public final class ExecutorC20742b implements Executor {

    /* renamed from: a */
    private Handler f48947a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(24315);
    }

    /* renamed from: com.bytedance.lighten.a.d.b$a */
    public static class C20743a {

        /* renamed from: a */
        public static final ExecutorC20742b f48948a = new ExecutorC20742b();

        static {
            Covode.recordClassIndex(24316);
        }
    }

    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f48947a.getLooper().getThread()) {
            runnable.run();
        } else {
            this.f48947a.post(runnable);
        }
    }
}
