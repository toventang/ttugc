package com.bytedance.android.monitor.p708f;

import com.bytedance.android.monitor.p707e.RunnableC11928a;
import com.bytedance.android.monitor.p714l.C11948b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.f.a */
public final class C11929a {

    /* renamed from: a */
    public static final C11929a f28542a = new C11929a();

    /* renamed from: b */
    private static final int f28543b = 4;

    /* renamed from: c */
    private static final int f28544c = 8;

    /* renamed from: d */
    private static final long f28545d = f28545d;

    /* renamed from: e */
    private static ExecutorService f28546e;

    private C11929a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitor.f.a$a */
    public static final class RunnableC11930a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f28547a;

        static {
            Covode.recordClassIndex(13656);
        }

        RunnableC11930a(AbstractC89171a aVar) {
            this.f28547a = aVar;
        }

        public final void run() {
            try {
                this.f28547a.invoke();
            } catch (Exception unused) {
                C11948b.m21086a();
            }
        }
    }

    static {
        Covode.recordClassIndex(13655);
    }

    /* renamed from: a */
    public static ExecutorService m21040a() {
        if (f28546e == null) {
            f28546e = new ThreadPoolExecutor(f28543b, f28544c, f28545d, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        ExecutorService executorService = f28546e;
        if (executorService == null) {
            C89219l.m154707a();
        }
        return executorService;
    }

    /* renamed from: a */
    public static void m21041a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        m21040a().execute(new RunnableC11930a(aVar));
    }

    /* renamed from: a */
    public static void m21042a(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        m21040a().execute(new RunnableC11928a(runnable));
    }
}
