package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.AbstractC88444e;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4585f.AbstractC88918a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: f.a.e.e.e.as */
public final class C88673as<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    final AbstractC88918a<T> f201200a;

    /* renamed from: b */
    final int f201201b;

    /* renamed from: c */
    final long f201202c;

    /* renamed from: d */
    final TimeUnit f201203d;

    /* renamed from: e */
    final AbstractC88398aa f201204e;

    /* renamed from: f */
    RunnableC88674a f201205f;

    static {
        Covode.recordClassIndex(104715);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.as$a */
    public static final class RunnableC88674a extends AtomicReference<AbstractC88412b> implements AbstractC88433f<AbstractC88412b>, Runnable {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: a */
        final C88673as<?> f201206a;

        /* renamed from: b */
        AbstractC88412b f201207b;

        /* renamed from: c */
        long f201208c;

        /* renamed from: d */
        boolean f201209d;

        /* renamed from: e */
        boolean f201210e;

        static {
            Covode.recordClassIndex(104716);
        }

        public final void run() {
            this.f201206a.mo143069b(this);
        }

        RunnableC88674a(C88673as<?> asVar) {
            this.f201206a = asVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC88412b bVar) {
            MethodCollector.m26663i(147);
            AbstractC88412b bVar2 = bVar;
            EnumC88441b.replace(this, bVar2);
            synchronized (this.f201206a) {
                try {
                    if (this.f201210e) {
                        ((AbstractC88444e) this.f201206a.f201200a).mo142968a(bVar2);
                    }
                } finally {
                    MethodCollector.m26664o(147);
                }
            }
        }
    }

    /* renamed from: f.a.e.e.e.as$b */
    static final class C88675b<T> extends AtomicBoolean implements AbstractC88412b, AbstractC88986z<T> {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201211a;

        /* renamed from: b */
        final C88673as<T> f201212b;

        /* renamed from: c */
        final RunnableC88674a f201213c;

        /* renamed from: d */
        AbstractC88412b f201214d;

        static {
            Covode.recordClassIndex(104717);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201214d.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f201212b.mo143068a(this.f201213c);
                this.f201211a.onComplete();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
            r4.replace(r6.f201204e.mo20705a(r5, r6.f201202c, r6.f201203d));
         */
        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void dispose() {
            /*
            // Method dump skipped, instructions count: 104
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4578e.C88673as.C88675b.dispose():void");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201211a.onNext(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201214d, bVar)) {
                this.f201214d = bVar;
                this.f201211a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f201212b.mo143068a(this.f201213c);
                this.f201211a.onError(th);
                return;
            }
            C88925a.m154178a(th);
        }

        C88675b(AbstractC88986z<? super T> zVar, C88673as<T> asVar, RunnableC88674a aVar) {
            this.f201211a = zVar;
            this.f201212b = asVar;
            this.f201213c = aVar;
        }
    }

    public C88673as(AbstractC88918a<T> aVar) {
        this(aVar, TimeUnit.NANOSECONDS, C88946a.f201992d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo143068a(RunnableC88674a aVar) {
        MethodCollector.m26663i(129);
        synchronized (this) {
            try {
                RunnableC88674a aVar2 = this.f201205f;
                if (aVar2 != null && aVar2 == aVar) {
                    this.f201205f = null;
                    if (aVar.f201207b != null) {
                        aVar.f201207b.dispose();
                    }
                }
                long j = aVar.f201208c - 1;
                aVar.f201208c = j;
                if (j == 0) {
                    AbstractC88918a<T> aVar3 = this.f201200a;
                    if (aVar3 instanceof AbstractC88412b) {
                        ((AbstractC88412b) aVar3).dispose();
                    } else if (aVar3 instanceof AbstractC88444e) {
                        ((AbstractC88444e) aVar3).mo142968a((AbstractC88412b) aVar.get());
                    }
                }
            } finally {
                MethodCollector.m26664o(129);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo143069b(RunnableC88674a aVar) {
        MethodCollector.m26663i(137);
        synchronized (this) {
            try {
                if (aVar.f201208c == 0 && aVar == this.f201205f) {
                    this.f201205f = null;
                    AbstractC88412b bVar = (AbstractC88412b) aVar.get();
                    EnumC88441b.dispose(aVar);
                    AbstractC88918a<T> aVar2 = this.f201200a;
                    if (aVar2 instanceof AbstractC88412b) {
                        ((AbstractC88412b) aVar2).dispose();
                    } else if (aVar2 instanceof AbstractC88444e) {
                        if (bVar == null) {
                            aVar.f201210e = true;
                        } else {
                            ((AbstractC88444e) aVar2).mo142968a(bVar);
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(137);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        RunnableC88674a aVar;
        boolean z;
        MethodCollector.m26663i(117);
        synchronized (this) {
            try {
                aVar = this.f201205f;
                if (aVar == null) {
                    aVar = new RunnableC88674a(this);
                    this.f201205f = aVar;
                }
                long j = aVar.f201208c;
                if (j == 0 && aVar.f201207b != null) {
                    aVar.f201207b.dispose();
                }
                long j2 = j + 1;
                aVar.f201208c = j2;
                z = true;
                if (aVar.f201209d || j2 != ((long) this.f201201b)) {
                    z = false;
                } else {
                    aVar.f201209d = true;
                }
            } finally {
                MethodCollector.m26664o(117);
            }
        }
        this.f201200a.mo143062b((AbstractC88986z) new C88675b(zVar, this, aVar));
        if (z) {
            this.f201200a.mo143066e(aVar);
        }
    }

    private C88673as(AbstractC88918a<T> aVar, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        this.f201200a = aVar;
        this.f201201b = 1;
        this.f201202c = 0;
        this.f201203d = timeUnit;
        this.f201204e = aaVar;
    }
}
