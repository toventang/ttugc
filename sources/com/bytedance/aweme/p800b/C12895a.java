package com.bytedance.aweme.p800b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.aweme.b.a */
public final class C12895a {

    /* renamed from: a */
    public static ExecutorService f31386a;

    /* renamed from: b */
    public static final ExecutorC12896a f31387b = new ExecutorC12896a();

    /* renamed from: c */
    public static final C12895a f31388c = new C12895a();

    private C12895a() {
    }

    /* renamed from: com.bytedance.aweme.b.a$a */
    public static final class ExecutorC12896a implements Executor {

        /* renamed from: a */
        public final Handler f31389a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(14729);
        }

        /* renamed from: com.bytedance.aweme.b.a$a$a */
        static final class RunnableC12897a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ExecutorC12896a f31390a;

            /* renamed from: b */
            final /* synthetic */ Runnable f31391b;

            static {
                Covode.recordClassIndex(14730);
            }

            RunnableC12897a(ExecutorC12896a aVar, Runnable runnable) {
                this.f31390a = aVar;
                this.f31391b = runnable;
            }

            public final void run() {
                this.f31391b.run();
            }
        }

        public final void execute(Runnable runnable) {
            if (runnable != null) {
                this.f31389a.post(new RunnableC12897a(this, runnable));
            }
        }
    }

    static {
        Covode.recordClassIndex(14728);
    }
}
