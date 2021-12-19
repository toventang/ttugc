package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4568e.p4569a.C88443d;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;

/* renamed from: f.a.e.g.b */
public final class C88853b extends AbstractC88398aa {

    /* renamed from: a */
    static final C88855b f201774a;

    /* renamed from: c */
    static final ThreadFactoryC88873j f201775c;

    /* renamed from: d */
    static final int f201776d;

    /* renamed from: e */
    static final C88856c f201777e;

    /* renamed from: f */
    final ThreadFactory f201778f;

    /* renamed from: g */
    final AtomicReference<C88855b> f201779g;

    /* renamed from: f.a.e.g.b$a */
    static final class C88854a extends AbstractC88398aa.AbstractC88401c {

        /* renamed from: a */
        volatile boolean f201780a;

        /* renamed from: b */
        private final C88443d f201781b;

        /* renamed from: c */
        private final C88411a f201782c;

        /* renamed from: d */
        private final C88443d f201783d;

        /* renamed from: e */
        private final C88856c f201784e;

        static {
            Covode.recordClassIndex(104896);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201780a;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f201780a) {
                this.f201780a = true;
                this.f201783d.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo101910a(Runnable runnable) {
            if (this.f201780a) {
                return EnumC88442c.INSTANCE;
            }
            return this.f201784e.mo143141a(runnable, 0, TimeUnit.MILLISECONDS, this.f201781b);
        }

        C88854a(C88856c cVar) {
            this.f201784e = cVar;
            C88443d dVar = new C88443d();
            this.f201781b = dVar;
            C88411a aVar = new C88411a();
            this.f201782c = aVar;
            C88443d dVar2 = new C88443d();
            this.f201783d = dVar2;
            dVar2.mo142945a(dVar);
            dVar2.mo142945a(aVar);
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f201780a) {
                return EnumC88442c.INSTANCE;
            }
            return this.f201784e.mo143141a(runnable, j, timeUnit, this.f201782c);
        }
    }

    public C88853b() {
        this(f201775c);
    }

    /* renamed from: f.a.e.g.b$b */
    static final class C88855b {

        /* renamed from: a */
        final int f201785a;

        /* renamed from: b */
        final C88856c[] f201786b;

        /* renamed from: c */
        long f201787c;

        static {
            Covode.recordClassIndex(104897);
        }

        /* renamed from: b */
        public final void mo143124b() {
            for (C88856c cVar : this.f201786b) {
                cVar.dispose();
            }
        }

        /* renamed from: a */
        public final C88856c mo143123a() {
            int i = this.f201785a;
            if (i == 0) {
                return C88853b.f201777e;
            }
            C88856c[] cVarArr = this.f201786b;
            long j = this.f201787c;
            this.f201787c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        C88855b(int i, ThreadFactory threadFactory) {
            this.f201785a = i;
            this.f201786b = new C88856c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f201786b[i2] = new C88856c(threadFactory);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88398aa.AbstractC88401c mo20704a() {
        return new C88854a(this.f201779g.get().mo143123a());
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: b */
    public final void mo142902b() {
        C88855b bVar = new C88855b(f201776d, this.f201778f);
        if (!this.f201779g.compareAndSet(f201774a, bVar)) {
            bVar.mo143124b();
        }
    }

    static {
        Covode.recordClassIndex(104895);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f201776d = availableProcessors;
        C88856c cVar = new C88856c(new ThreadFactoryC88873j("RxComputationShutdown"));
        f201777e = cVar;
        cVar.dispose();
        ThreadFactoryC88873j jVar = new ThreadFactoryC88873j("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f201775c = jVar;
        C88855b bVar = new C88855b(0, jVar);
        f201774a = bVar;
        bVar.mo143124b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.g.b$c */
    public static final class C88856c extends C88871h {
        static {
            Covode.recordClassIndex(104898);
        }

        C88856c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    private C88853b(ThreadFactory threadFactory) {
        this.f201778f = threadFactory;
        this.f201779g = new AtomicReference<>(f201774a);
        mo142902b();
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo20705a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f201779g.get().mo143123a().mo143143b(runnable, j, timeUnit);
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo142901a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f201779g.get().mo143123a().mo143142b(runnable, j, j2, timeUnit);
    }
}
