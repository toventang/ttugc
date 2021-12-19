package com.bytedance.assem.arch.p796c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.c.a */
public final class ExecutorC12736a implements Executor {

    /* renamed from: a */
    public static final AbstractC89244h f30960a = C89250i.m154774a(EnumC89331m.NONE, C12738b.f30964a);

    /* renamed from: b */
    public static final C12737a f30961b = new C12737a((byte) 0);

    /* renamed from: c */
    private final LinkedBlockingQueue<Runnable> f30962c = new LinkedBlockingQueue<>();

    /* renamed from: d */
    private Runnable f30963d;

    /* renamed from: com.bytedance.assem.arch.c.a$a */
    public static final class C12737a {
        static {
            Covode.recordClassIndex(14557);
        }

        private C12737a() {
        }

        public /* synthetic */ C12737a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.assem.arch.c.a$b */
    static final class C12738b extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C12738b f30964a = new C12738b();

        static {
            Covode.recordClassIndex(14558);
        }

        C12738b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            ThreadFactoryC12740b bVar = new ThreadFactoryC12740b();
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = 1;
            a.f95509g = bVar;
            return C40780g.m82242a(a.mo70028a());
        }
    }

    /* renamed from: com.bytedance.assem.arch.c.a$c */
    static final class RunnableC12739c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ExecutorC12736a f30965a;

        /* renamed from: b */
        final /* synthetic */ Runnable f30966b;

        static {
            Covode.recordClassIndex(14559);
        }

        RunnableC12739c(ExecutorC12736a aVar, Runnable runnable) {
            this.f30965a = aVar;
            this.f30966b = runnable;
        }

        public final void run() {
            try {
                this.f30966b.run();
            } finally {
                this.f30965a.mo20561a();
            }
        }
    }

    static {
        Covode.recordClassIndex(14556);
    }

    /* renamed from: a */
    public final synchronized void mo20561a() {
        MethodCollector.m26663i(2557);
        Runnable poll = this.f30962c.poll();
        if (poll != null) {
            ((ExecutorService) f30960a.getValue()).execute(poll);
        } else {
            poll = null;
        }
        this.f30963d = poll;
        MethodCollector.m26664o(2557);
    }

    public final synchronized void execute(Runnable runnable) {
        MethodCollector.m26663i(2551);
        C89219l.m154719c(runnable, "");
        this.f30962c.offer(new RunnableC12739c(this, runnable));
        if (this.f30963d == null) {
            mo20561a();
        }
        MethodCollector.m26664o(2551);
    }
}
