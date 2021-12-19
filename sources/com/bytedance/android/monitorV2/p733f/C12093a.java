package com.bytedance.android.monitorV2.p733f;

import com.bytedance.android.monitorV2.p732e.RunnableC12092a;
import com.bytedance.android.monitorV2.p740l.C12126c;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.f.a */
public final class C12093a {

    /* renamed from: a */
    public static final C12093a f29021a = new C12093a();

    /* renamed from: b */
    private static final int f29022b = 4;

    /* renamed from: c */
    private static final int f29023c = 8;

    /* renamed from: d */
    private static final long f29024d = f29024d;

    /* renamed from: e */
    private static ExecutorService f29025e;

    private C12093a() {
    }

    /* renamed from: com.bytedance.android.monitorV2.f.a$a */
    static final class RunnableC12094a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f29026a;

        static {
            Covode.recordClassIndex(13823);
        }

        RunnableC12094a(AbstractC89171a aVar) {
            this.f29026a = aVar;
        }

        public final void run() {
            try {
                this.f29026a.invoke();
            } catch (Exception unused) {
                C12126c.m21636a();
            }
        }
    }

    static {
        Covode.recordClassIndex(13822);
    }

    /* renamed from: a */
    public static ExecutorService m21522a() {
        if (f29025e == null) {
            f29025e = new ThreadPoolExecutor(f29022b, f29023c, f29024d, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        ExecutorService executorService = f29025e;
        if (executorService == null) {
            C89219l.m154707a();
        }
        return executorService;
    }

    /* renamed from: a */
    public static void m21523a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        m21522a().execute(new RunnableC12094a(aVar));
    }

    /* renamed from: a */
    public static void m21524a(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        m21522a().execute(new RunnableC12092a(runnable));
    }
}
