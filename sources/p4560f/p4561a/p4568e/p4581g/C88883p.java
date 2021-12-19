package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88413c;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.g.p */
public final class C88883p extends AbstractC88398aa {

    /* renamed from: a */
    public static final C88883p f201859a = new C88883p();

    /* renamed from: f.a.e.g.p$c */
    static final class C88886c extends AbstractC88398aa.AbstractC88401c {

        /* renamed from: a */
        final PriorityBlockingQueue<C88885b> f201867a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        final AtomicInteger f201868b = new AtomicInteger();

        /* renamed from: c */
        volatile boolean f201869c;

        /* renamed from: d */
        private final AtomicInteger f201870d = new AtomicInteger();

        static {
            Covode.recordClassIndex(104928);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201869c = true;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201869c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f.a.e.g.p$c$a */
        public final class RunnableC88887a implements Runnable {

            /* renamed from: a */
            final C88885b f201871a;

            static {
                Covode.recordClassIndex(104929);
            }

            public final void run() {
                this.f201871a.f201866d = true;
                C88886c.this.f201867a.remove(this.f201871a);
            }

            RunnableC88887a(C88885b bVar) {
                this.f201871a = bVar;
            }
        }

        C88886c() {
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo101910a(Runnable runnable) {
            return m154083a(runnable, m153592a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: a */
        private AbstractC88412b m154083a(Runnable runnable, long j) {
            if (this.f201869c) {
                return EnumC88442c.INSTANCE;
            }
            C88885b bVar = new C88885b(runnable, Long.valueOf(j), this.f201868b.incrementAndGet());
            this.f201867a.add(bVar);
            if (this.f201870d.getAndIncrement() != 0) {
                return C88413c.m153658a(new RunnableC88887a(bVar));
            }
            int i = 1;
            while (!this.f201869c) {
                C88885b poll = this.f201867a.poll();
                if (poll == null) {
                    i = this.f201870d.addAndGet(-i);
                    if (i == 0) {
                        return EnumC88442c.INSTANCE;
                    }
                } else if (!poll.f201866d) {
                    poll.f201863a.run();
                }
            }
            this.f201867a.clear();
            return EnumC88442c.INSTANCE;
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = m153592a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m154083a(new RunnableC88884a(runnable, this, a), a);
        }
    }

    C88883p() {
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88398aa.AbstractC88401c mo20704a() {
        return new C88886c();
    }

    static {
        Covode.recordClassIndex(104925);
    }

    /* renamed from: f.a.e.g.p$a */
    static final class RunnableC88884a implements Runnable {

        /* renamed from: a */
        private final Runnable f201860a;

        /* renamed from: b */
        private final C88886c f201861b;

        /* renamed from: c */
        private final long f201862c;

        static {
            Covode.recordClassIndex(104926);
        }

        public final void run() {
            MethodCollector.m26663i(191);
            if (!this.f201861b.f201869c) {
                long a = C88886c.m153592a(TimeUnit.MILLISECONDS);
                long j = this.f201862c;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C88925a.m154178a(e);
                        MethodCollector.m26664o(191);
                        return;
                    }
                }
                if (!this.f201861b.f201869c) {
                    this.f201860a.run();
                }
            }
            MethodCollector.m26664o(191);
        }

        RunnableC88884a(Runnable runnable, C88886c cVar, long j) {
            this.f201860a = runnable;
            this.f201861b = cVar;
            this.f201862c = j;
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo142900a(Runnable runnable) {
        C88925a.m154175a(runnable).run();
        return EnumC88442c.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.g.p$b */
    public static final class C88885b implements Comparable<C88885b> {

        /* renamed from: a */
        final Runnable f201863a;

        /* renamed from: b */
        final long f201864b;

        /* renamed from: c */
        final int f201865c;

        /* renamed from: d */
        volatile boolean f201866d;

        static {
            Covode.recordClassIndex(104927);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C88885b bVar) {
            C88885b bVar2 = bVar;
            long j = this.f201864b;
            long j2 = bVar2.f201864b;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            int i = this.f201865c;
            int i2 = bVar2.f201865c;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return 0;
        }

        C88885b(Runnable runnable, Long l, int i) {
            this.f201863a = runnable;
            this.f201864b = l.longValue();
            this.f201865c = i;
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo20705a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C88925a.m154175a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C88925a.m154178a(e);
        }
        return EnumC88442c.INSTANCE;
    }
}
