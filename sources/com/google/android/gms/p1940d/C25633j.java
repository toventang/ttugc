package com.google.android.gms.p1940d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.d.j */
public final class C25633j {

    /* renamed from: a */
    public static final Executor f60754a = new ExecutorC25634a();

    /* renamed from: b */
    static final Executor f60755b = new ExecutorC25621ab();

    static {
        Covode.recordClassIndex(31044);
    }

    /* renamed from: com.google.android.gms.d.j$a */
    static final class ExecutorC25634a implements Executor {

        /* renamed from: a */
        private final Handler f60756a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(31045);
        }

        public final void execute(Runnable runnable) {
            this.f60756a.post(runnable);
        }
    }
}
