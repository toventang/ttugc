package com.bytedance.jedi.arch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20516j;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.arch.internal.e */
public final class ExecutorC20490e implements Executor {

    /* renamed from: a */
    public static final AbstractC89244h f48487a = C89250i.m154773a((AbstractC89171a) C20493c.f48494a);

    /* renamed from: b */
    public static final AbstractC89244h f48488b = C89250i.m154773a((AbstractC89171a) C20492b.f48493a);

    /* renamed from: c */
    public static final C20491a f48489c = new C20491a((byte) 0);

    /* renamed from: d */
    private final LinkedBlockingQueue<Runnable> f48490d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    private Runnable f48491e;

    /* renamed from: com.bytedance.jedi.arch.internal.e$a */
    public static final class C20491a {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f48492a = {new C89232y(C89204ab.m154669a(C20491a.class), "WORKER", "getWORKER()Ljava/util/concurrent/Executor;"), new C89232y(C89204ab.m154669a(C20491a.class), "UNBOUND_EXECUTOR", "getUNBOUND_EXECUTOR$arch_release()Ljava/util/concurrent/ExecutorService;")};

        private C20491a() {
        }

        static {
            Covode.recordClassIndex(24014);
        }

        public /* synthetic */ C20491a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.e$c */
    static final class C20493c extends AbstractC89220m implements AbstractC89171a<Executor> {

        /* renamed from: a */
        public static final C20493c f48494a = new C20493c();

        static {
            Covode.recordClassIndex(24016);
        }

        C20493c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Executor invoke() {
            return C20516j.f48594f.invoke();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.e$d */
    static final class RunnableC20494d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ExecutorC20490e f48495a;

        /* renamed from: b */
        final /* synthetic */ Runnable f48496b;

        static {
            Covode.recordClassIndex(24017);
        }

        RunnableC20494d(ExecutorC20490e eVar, Runnable runnable) {
            this.f48495a = eVar;
            this.f48496b = runnable;
        }

        public final void run() {
            try {
                this.f48496b.run();
            } finally {
                this.f48495a.mo33792a();
            }
        }
    }

    static {
        Covode.recordClassIndex(24013);
    }

    /* renamed from: com.bytedance.jedi.arch.internal.e$b */
    static final class C20492b extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C20492b f48493a = new C20492b();

        static {
            Covode.recordClassIndex(24015);
        }

        C20492b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            return C40780g.m82242a(C40787l.m82269a(EnumC40793o.FIXED).mo70025a(availableProcessors).mo70027a(new ThreadFactoryC20481a()).mo70028a());
        }
    }

    /* renamed from: a */
    public final synchronized void mo33792a() {
        MethodCollector.m26663i(9489);
        Runnable poll = this.f48490d.poll();
        if (poll != null) {
            ((Executor) f48487a.getValue()).execute(poll);
        } else {
            poll = null;
        }
        this.f48491e = poll;
        MethodCollector.m26664o(9489);
    }

    public final synchronized void execute(Runnable runnable) {
        MethodCollector.m26663i(9336);
        C89219l.m154719c(runnable, "");
        this.f48490d.offer(new RunnableC20494d(this, runnable));
        if (this.f48491e == null) {
            mo33792a();
        }
        MethodCollector.m26664o(9336);
    }
}
