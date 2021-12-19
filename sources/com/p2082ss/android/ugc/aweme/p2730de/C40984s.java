package com.p2082ss.android.ugc.aweme.p2730de;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.de.s */
public final class C40984s {

    /* renamed from: a */
    public static final ExecutorService f95824a;

    /* renamed from: b */
    public static final C40984s f95825b = new C40984s();

    private C40984s() {
    }

    /* renamed from: com.ss.android.ugc.aweme.de.s$a */
    public static final class RunnableC40985a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f95826a;

        static {
            Covode.recordClassIndex(48837);
        }

        public RunnableC40985a(AbstractC89171a aVar) {
            this.f95826a = aVar;
        }

        public final void run() {
            this.f95826a.invoke();
        }
    }

    static {
        Covode.recordClassIndex(48836);
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        Objects.requireNonNull(executor, "null cannot be cast to non-null type java.util.concurrent.ExecutorService");
        f95824a = (ExecutorService) executor;
    }

    /* renamed from: b */
    public static final void m82526b(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        f95824a.execute(runnable);
    }

    /* renamed from: a */
    public static final void m82525a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
