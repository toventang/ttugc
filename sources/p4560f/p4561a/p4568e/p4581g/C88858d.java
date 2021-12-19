package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4568e.p4569a.AbstractC88440a;
import p4560f.p4561a.p4568e.p4569a.C88445f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4580f.C88848a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: f.a.e.g.d */
public final class C88858d extends AbstractC88398aa {

    /* renamed from: d */
    static final AbstractC88398aa f201789d = C88925a.m154184d(C88946a.f201989a);

    /* renamed from: a */
    final boolean f201790a = false;

    /* renamed from: c */
    final Executor f201791c;

    /* renamed from: f.a.e.g.d$c */
    public static final class RunnableC88861c extends AbstractC88398aa.AbstractC88401c implements Runnable {

        /* renamed from: a */
        final boolean f201796a;

        /* renamed from: b */
        final Executor f201797b;

        /* renamed from: c */
        final C88848a<Runnable> f201798c;

        /* renamed from: d */
        volatile boolean f201799d;

        /* renamed from: e */
        final AtomicInteger f201800e = new AtomicInteger();

        /* renamed from: f */
        final C88411a f201801f = new C88411a();

        static {
            Covode.recordClassIndex(104903);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201799d;
        }

        /* renamed from: f.a.e.g.d$c$a */
        static final class RunnableC88862a extends AtomicBoolean implements AbstractC88412b, Runnable {
            private static final long serialVersionUID = -2421395018820541164L;

            /* renamed from: a */
            final Runnable f201802a;

            static {
                Covode.recordClassIndex(104904);
            }

            @Override // p4560f.p4561a.p4565b.AbstractC88412b
            public final void dispose() {
                lazySet(true);
            }

            @Override // p4560f.p4561a.p4565b.AbstractC88412b
            public final boolean isDisposed() {
                return get();
            }

            public final void run() {
                if (!get()) {
                    try {
                        this.f201802a.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }

            RunnableC88862a(Runnable runnable) {
                this.f201802a = runnable;
            }
        }

        /* renamed from: f.a.e.g.d$c$b */
        static final class RunnableC88863b extends AtomicInteger implements AbstractC88412b, Runnable {
            private static final long serialVersionUID = -3603436687413320876L;

            /* renamed from: a */
            final Runnable f201803a;

            /* renamed from: b */
            final AbstractC88440a f201804b;

            /* renamed from: c */
            volatile Thread f201805c;

            static {
                Covode.recordClassIndex(104905);
            }

            /* renamed from: a */
            private void m154057a() {
                AbstractC88440a aVar = this.f201804b;
                if (aVar != null) {
                    aVar.mo142947c(this);
                }
            }

            @Override // p4560f.p4561a.p4565b.AbstractC88412b
            public final boolean isDisposed() {
                if (get() >= 2) {
                    return true;
                }
                return false;
            }

            @Override // p4560f.p4561a.p4565b.AbstractC88412b
            public final void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            m154057a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f201805c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f201805c = null;
                        }
                        set(4);
                        m154057a();
                        return;
                    }
                }
            }

            public final void run() {
                if (get() == 0) {
                    this.f201805c = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f201803a.run();
                            this.f201805c = null;
                            if (compareAndSet(1, 2)) {
                                m154057a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.f201805c = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                m154057a();
                            }
                            throw th;
                        }
                    } else {
                        this.f201805c = null;
                    }
                }
            }

            RunnableC88863b(Runnable runnable, AbstractC88440a aVar) {
                this.f201803a = runnable;
                this.f201804b = aVar;
            }
        }

        /* renamed from: f.a.e.g.d$c$c */
        final class RunnableC88864c implements Runnable {

            /* renamed from: b */
            private final C88445f f201807b;

            /* renamed from: c */
            private final Runnable f201808c;

            static {
                Covode.recordClassIndex(104906);
            }

            public final void run() {
                this.f201807b.replace(RunnableC88861c.this.mo101910a(this.f201808c));
            }

            RunnableC88864c(C88445f fVar, Runnable runnable) {
                this.f201807b = fVar;
                this.f201808c = runnable;
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f201799d) {
                this.f201799d = true;
                this.f201801f.dispose();
                if (this.f201800e.getAndIncrement() == 0) {
                    this.f201798c.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            if (r4.f201799d == false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r3.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            r2 = r4.f201800e.addAndGet(-r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
            if (r2 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                f.a.e.f.a<java.lang.Runnable> r3 = r4.f201798c
                r2 = 1
            L_0x0003:
                boolean r0 = r4.f201799d
                if (r0 == 0) goto L_0x000b
                r3.clear()
                return
            L_0x000b:
                java.lang.Object r0 = r3.poll()
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                if (r0 == 0) goto L_0x001e
                r0.run()
                boolean r0 = r4.f201799d
                if (r0 == 0) goto L_0x000b
                r3.clear()
                return
            L_0x001e:
                boolean r0 = r4.f201799d
                if (r0 == 0) goto L_0x0026
                r3.clear()
                return
            L_0x0026:
                java.util.concurrent.atomic.AtomicInteger r1 = r4.f201800e
                int r0 = -r2
                int r2 = r1.addAndGet(r0)
                if (r2 != 0) goto L_0x0003
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4581g.C88858d.RunnableC88861c.run():void");
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo101910a(Runnable runnable) {
            AbstractC88412b aVar;
            if (this.f201799d) {
                return EnumC88442c.INSTANCE;
            }
            Runnable a = C88925a.m154175a(runnable);
            if (this.f201796a) {
                aVar = new RunnableC88863b(a, this.f201801f);
                this.f201801f.mo142945a(aVar);
            } else {
                aVar = new RunnableC88862a(a);
            }
            this.f201798c.offer(aVar);
            if (this.f201800e.getAndIncrement() == 0) {
                try {
                    this.f201797b.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f201799d = true;
                    this.f201798c.clear();
                    C88925a.m154178a(e);
                    return EnumC88442c.INSTANCE;
                }
            }
            return aVar;
        }

        public RunnableC88861c(Executor executor, boolean z) {
            this.f201797b = executor;
            this.f201798c = new C88848a<>();
            this.f201796a = z;
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo101910a(runnable);
            }
            if (this.f201799d) {
                return EnumC88442c.INSTANCE;
            }
            C88445f fVar = new C88445f();
            C88445f fVar2 = new C88445f(fVar);
            RunnableC88877m mVar = new RunnableC88877m(new RunnableC88864c(fVar2, C88925a.m154175a(runnable)), this.f201801f);
            this.f201801f.mo142945a(mVar);
            Executor executor = this.f201797b;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    mVar.setFuture(((ScheduledExecutorService) executor).schedule((Callable) mVar, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f201799d = true;
                    C88925a.m154178a(e);
                    return EnumC88442c.INSTANCE;
                }
            } else {
                mVar.setFuture(new FutureC88857c(C88858d.f201789d.mo20705a(mVar, j, timeUnit)));
            }
            fVar.replace(mVar);
            return fVar2;
        }
    }

    /* renamed from: f.a.e.g.d$a */
    final class RunnableC88859a implements Runnable {

        /* renamed from: b */
        private final RunnableC88860b f201793b;

        static {
            Covode.recordClassIndex(104901);
        }

        public final void run() {
            this.f201793b.f201795b.replace(C88858d.this.mo142900a(this.f201793b));
        }

        RunnableC88859a(RunnableC88860b bVar) {
            this.f201793b = bVar;
        }
    }

    /* renamed from: f.a.e.g.d$b */
    static final class RunnableC88860b extends AtomicReference<Runnable> implements AbstractC88412b, Runnable {
        private static final long serialVersionUID = -4101336210206799084L;

        /* renamed from: a */
        final C88445f f201794a = new C88445f();

        /* renamed from: b */
        final C88445f f201795b = new C88445f();

        static {
            Covode.recordClassIndex(104902);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (getAndSet(null) != null) {
                this.f201794a.dispose();
                this.f201795b.dispose();
            }
        }

        public final void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.f201794a.lazySet(EnumC88441b.DISPOSED);
                    this.f201795b.lazySet(EnumC88441b.DISPOSED);
                }
            }
        }

        RunnableC88860b(Runnable runnable) {
            super(runnable);
        }
    }

    static {
        Covode.recordClassIndex(104900);
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88398aa.AbstractC88401c mo20704a() {
        return new RunnableC88861c(this.f201791c, this.f201790a);
    }

    public C88858d(Executor executor) {
        this.f201791c = executor;
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo142900a(Runnable runnable) {
        Runnable a = C88925a.m154175a(runnable);
        try {
            if (this.f201791c instanceof ExecutorService) {
                CallableC88876l lVar = new CallableC88876l(a);
                lVar.setFuture(((ExecutorService) this.f201791c).submit(lVar));
                return lVar;
            } else if (this.f201790a) {
                RunnableC88861c.RunnableC88863b bVar = new RunnableC88861c.RunnableC88863b(a, null);
                this.f201791c.execute(bVar);
                return bVar;
            } else {
                RunnableC88861c.RunnableC88862a aVar = new RunnableC88861c.RunnableC88862a(a);
                this.f201791c.execute(aVar);
                return aVar;
            }
        } catch (RejectedExecutionException e) {
            C88925a.m154178a(e);
            return EnumC88442c.INSTANCE;
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo20705a(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable a = C88925a.m154175a(runnable);
        if (this.f201791c instanceof ScheduledExecutorService) {
            try {
                CallableC88876l lVar = new CallableC88876l(a);
                lVar.setFuture(((ScheduledExecutorService) this.f201791c).schedule(lVar, j, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e) {
                C88925a.m154178a(e);
                return EnumC88442c.INSTANCE;
            }
        } else {
            RunnableC88860b bVar = new RunnableC88860b(a);
            bVar.f201794a.replace(f201789d.mo20705a(new RunnableC88859a(bVar), j, timeUnit));
            return bVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo142901a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f201791c instanceof ScheduledExecutorService)) {
            return super.mo142901a(runnable, j, j2, timeUnit);
        }
        try {
            RunnableC88875k kVar = new RunnableC88875k(C88925a.m154175a(runnable));
            kVar.setFuture(((ScheduledExecutorService) this.f201791c).scheduleAtFixedRate(kVar, j, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e) {
            C88925a.m154178a(e);
            return EnumC88442c.INSTANCE;
        }
    }
}
