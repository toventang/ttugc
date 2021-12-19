package com.p2082ss.android.ugc.aweme.preload.p3563a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4568e.p4581g.RunnableC88877m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.preload.a.c */
public final class C63318c {

    /* renamed from: e */
    public static final C63319a f143711e = new C63319a((byte) 0);

    /* renamed from: a */
    public final PriorityBlockingQueue<RunnableC63320b> f143712a;

    /* renamed from: b */
    public final AtomicInteger f143713b;

    /* renamed from: c */
    public final ExecutorService f143714c;

    /* renamed from: d */
    public final int f143715d;

    static {
        Covode.recordClassIndex(74601);
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.a.c$a */
    public static final class C63319a {
        static {
            Covode.recordClassIndex(74602);
        }

        private C63319a() {
        }

        public /* synthetic */ C63319a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.a.c$c */
    public static final class C63321c {

        /* renamed from: a */
        static C63318c f143718a = new C63318c((byte) 0);

        /* renamed from: b */
        public static final C63321c f143719b = new C63321c();

        private C63321c() {
        }

        static {
            Covode.recordClassIndex(74604);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.preload.a.c$b */
    public static final class RunnableC63320b implements Comparable<RunnableC63320b>, Runnable {

        /* renamed from: a */
        public final C63329e f143716a;

        /* renamed from: b */
        private final Runnable f143717b;

        static {
            Covode.recordClassIndex(74603);
        }

        public final int hashCode() {
            return this.f143716a.hashCode();
        }

        public final void run() {
            this.f143717b.run();
        }

        public final String toString() {
            return "ComparableRunnable{taskInfo=" + this.f143716a + '}';
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(RunnableC63320b bVar) {
            RunnableC63320b bVar2 = bVar;
            if (bVar2 == null) {
                return 1;
            }
            return bVar2.f143716a.f143734c - this.f143716a.f143734c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || (!C89219l.m154714a(getClass(), obj.getClass()))) {
                return false;
            }
            return this.f143716a.equals(((RunnableC63320b) obj).f143716a);
        }

        public RunnableC63320b(C63329e eVar, Runnable runnable) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(runnable, "");
            this.f143716a = eVar;
            this.f143717b = runnable;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.a.c$e */
    static final class C63324e extends AbstractC88398aa.AbstractC88401c {

        /* renamed from: a */
        public final PriorityBlockingQueue<RunnableC63320b> f143723a;

        /* renamed from: b */
        private final C88411a f143724b = new C88411a();

        /* renamed from: c */
        private final C63329e f143725c;

        static {
            Covode.recordClassIndex(74607);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f143724b.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f143724b.isDisposed();
        }

        /* renamed from: com.ss.android.ugc.aweme.preload.a.c$e$a */
        public static final class FutureC63325a implements Future<Object> {

            /* renamed from: a */
            final /* synthetic */ C63324e f143726a;

            /* renamed from: b */
            final /* synthetic */ RunnableC63320b f143727b;

            static {
                Covode.recordClassIndex(74608);
            }

            @Override // java.util.concurrent.Future
            public final Object get() {
                return null;
            }

            @Override // java.util.concurrent.Future
            public final Object get(long j, TimeUnit timeUnit) {
                C89219l.m154721d(timeUnit, "");
                return null;
            }

            public final boolean isCancelled() {
                return false;
            }

            public final boolean isDone() {
                return false;
            }

            public final boolean cancel(boolean z) {
                return this.f143726a.f143723a.remove(this.f143727b);
            }

            FutureC63325a(C63324e eVar, RunnableC63320b bVar) {
                this.f143726a = eVar;
                this.f143727b = bVar;
            }
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo101910a(Runnable runnable) {
            C89219l.m154721d(runnable, "");
            return mo20706a(runnable, 0, TimeUnit.MILLISECONDS);
        }

        public C63324e(C63329e eVar, PriorityBlockingQueue<RunnableC63320b> priorityBlockingQueue) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(priorityBlockingQueue, "");
            this.f143725c = eVar;
            this.f143723a = priorityBlockingQueue;
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
            C89219l.m154721d(runnable, "");
            C89219l.m154721d(timeUnit, "");
            RunnableC63320b bVar = new RunnableC63320b(this.f143725c, runnable);
            RunnableC88877m mVar = new RunnableC88877m(bVar, this.f143724b);
            mVar.setFuture(new FutureC63325a(this, bVar));
            this.f143724b.mo142945a(mVar);
            while (this.f143723a.contains(bVar)) {
                this.f143723a.remove(bVar);
            }
            this.f143723a.offer(bVar, j, timeUnit);
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.a.c$d */
    final class C63322d extends AbstractC88398aa {

        /* renamed from: a */
        final /* synthetic */ C63318c f143720a;

        /* renamed from: c */
        private final C63329e f143721c;

        static {
            Covode.recordClassIndex(74605);
        }

        /* renamed from: com.ss.android.ugc.aweme.preload.a.c$d$a */
        static final class RunnableC63323a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C63322d f143722a;

            static {
                Covode.recordClassIndex(74606);
            }

            RunnableC63323a(C63322d dVar) {
                this.f143722a = dVar;
            }

            public final void run() {
                while (true) {
                    try {
                        this.f143722a.f143720a.f143712a.take().run();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88398aa
        /* renamed from: a */
        public final AbstractC88398aa.AbstractC88401c mo20704a() {
            MethodCollector.m26663i(3755);
            synchronized (this.f143720a.f143713b) {
                try {
                    if (this.f143720a.f143713b.get() < this.f143720a.f143715d) {
                        this.f143720a.f143713b.incrementAndGet();
                        this.f143720a.f143714c.submit(new RunnableC63323a(this));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3755);
                    throw th;
                }
            }
            C63324e eVar = new C63324e(this.f143721c, this.f143720a.f143712a);
            MethodCollector.m26664o(3755);
            return eVar;
        }

        public C63322d(C63318c cVar, C63329e eVar) {
            C89219l.m154721d(eVar, "");
            this.f143720a = cVar;
            this.f143721c = eVar;
        }
    }

    private C63318c() {
        this.f143715d = 1;
        this.f143712a = new PriorityBlockingQueue<>();
        this.f143713b = new AtomicInteger();
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        ExecutorService a2 = C40780g.m82242a(a.mo70028a());
        C89219l.m154716b(a2, "");
        this.f143714c = a2;
    }

    public /* synthetic */ C63318c(byte b) {
        this();
    }
}
