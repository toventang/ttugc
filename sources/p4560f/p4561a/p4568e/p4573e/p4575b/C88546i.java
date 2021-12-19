package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4571c.AbstractC88473f;
import p4560f.p4561a.p4568e.p4571c.AbstractC88475h;
import p4560f.p4561a.p4568e.p4571c.AbstractC88476i;
import p4560f.p4561a.p4568e.p4580f.C88850b;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88901c;
import p4560f.p4561a.p4568e.p4584j.C88902d;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.i */
public final class C88546i<T, U> extends AbstractC88514a<T, U> {

    /* renamed from: c */
    final AbstractC88434g<? super T, ? extends AbstractC90213b<? extends U>> f200876c;

    /* renamed from: d */
    final boolean f200877d = false;

    /* renamed from: e */
    final int f200878e;

    /* renamed from: f */
    final int f200879f;

    static {
        Covode.recordClassIndex(104588);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.b.i$a */
    public static final class C88547a<T, U> extends AtomicReference<AbstractC90215d> implements AbstractC88412b, AbstractC88955l<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a */
        final long f200880a;

        /* renamed from: b */
        final C88548b<T, U> f200881b;

        /* renamed from: c */
        final int f200882c;

        /* renamed from: d */
        final int f200883d;

        /* renamed from: e */
        volatile boolean f200884e;

        /* renamed from: f */
        volatile AbstractC88476i<U> f200885f;

        /* renamed from: g */
        long f200886g;

        /* renamed from: h */
        int f200887h;

        static {
            Covode.recordClassIndex(104589);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88897f.cancel(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (get() == EnumC88897f.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            this.f200884e = true;
            this.f200881b.mo143034a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143033a(long j) {
            if (this.f200887h != 1) {
                long j2 = this.f200886g + j;
                if (j2 >= ((long) this.f200882c)) {
                    this.f200886g = 0;
                    ((AbstractC90215d) get()).request(j2);
                    return;
                }
                this.f200886g = j2;
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            lazySet(EnumC88897f.CANCELLED);
            C88548b<T, U> bVar = this.f200881b;
            if (bVar.f200897h.addThrowable(th)) {
                this.f200884e = true;
                if (!bVar.f200892c) {
                    bVar.f200901n.cancel();
                    for (C88547a<?, ?> aVar : bVar.f200899j.getAndSet(C88548b.f200889l)) {
                        aVar.dispose();
                    }
                }
                bVar.mo143034a();
                return;
            }
            C88925a.m154178a(th);
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.setOnce(this, dVar)) {
                if (dVar instanceof AbstractC88473f) {
                    AbstractC88473f fVar = (AbstractC88473f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f200887h = requestFusion;
                        this.f200885f = fVar;
                        this.f200884e = true;
                        this.f200881b.mo143034a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f200887h = requestFusion;
                        this.f200885f = fVar;
                    }
                }
                dVar.request((long) this.f200883d);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
        @Override // org.p4663a.AbstractC90214c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(U r9) {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4575b.C88546i.C88547a.onNext(java.lang.Object):void");
        }

        C88547a(C88548b<T, U> bVar, long j) {
            this.f200880a = j;
            this.f200881b = bVar;
            int i = bVar.f200894e;
            this.f200883d = i;
            this.f200882c = i >> 2;
        }
    }

    /* renamed from: f.a.e.e.b.i$b */
    static final class C88548b<T, U> extends AtomicInteger implements AbstractC88955l<T>, AbstractC90215d {

        /* renamed from: k */
        static final C88547a<?, ?>[] f200888k = new C88547a[0];

        /* renamed from: l */
        static final C88547a<?, ?>[] f200889l = new C88547a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: a */
        final AbstractC90214c<? super U> f200890a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC90213b<? extends U>> f200891b;

        /* renamed from: c */
        final boolean f200892c;

        /* renamed from: d */
        final int f200893d;

        /* renamed from: e */
        final int f200894e;

        /* renamed from: f */
        volatile AbstractC88475h<U> f200895f;

        /* renamed from: g */
        volatile boolean f200896g;

        /* renamed from: h */
        final C88901c f200897h = new C88901c();

        /* renamed from: i */
        volatile boolean f200898i;

        /* renamed from: j */
        final AtomicReference<C88547a<?, ?>[]> f200899j;

        /* renamed from: m */
        final AtomicLong f200900m;

        /* renamed from: n */
        AbstractC90215d f200901n;

        /* renamed from: o */
        long f200902o;

        /* renamed from: p */
        long f200903p;

        /* renamed from: q */
        int f200904q;

        /* renamed from: r */
        int f200905r;

        /* renamed from: s */
        final int f200906s;

        /* renamed from: e */
        private void m153784e() {
            AbstractC88475h<U> hVar = this.f200895f;
            if (hVar != null) {
                hVar.clear();
            }
        }

        static {
            Covode.recordClassIndex(104590);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143034a() {
            if (getAndIncrement() == 0) {
                mo143035b();
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            if (!this.f200896g) {
                this.f200896g = true;
                mo143034a();
            }
        }

        /* renamed from: c */
        private AbstractC88476i<U> m153782c() {
            AbstractC88475h<U> hVar = this.f200895f;
            if (hVar == null) {
                if (this.f200893d == Integer.MAX_VALUE) {
                    hVar = new C88851c<>(this.f200894e);
                } else {
                    hVar = new C88850b<>(this.f200893d);
                }
                this.f200895f = hVar;
            }
            return hVar;
        }

        /* renamed from: d */
        private boolean m153783d() {
            if (this.f200898i) {
                m153784e();
                return true;
            } else if (this.f200892c || this.f200897h.get() == null) {
                return false;
            } else {
                m153784e();
                Throwable terminate = this.f200897h.terminate();
                if (terminate != C88906h.f201913a) {
                    this.f200890a.onError(terminate);
                }
                return true;
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            AbstractC88475h<U> hVar;
            C88547a<?, ?>[] andSet;
            if (!this.f200898i) {
                this.f200898i = true;
                this.f200901n.cancel();
                C88547a<?, ?>[] aVarArr = this.f200899j.get();
                C88547a<?, ?>[] aVarArr2 = f200889l;
                if (!(aVarArr == aVarArr2 || (andSet = this.f200899j.getAndSet(aVarArr2)) == aVarArr2)) {
                    for (C88547a<?, ?> aVar : andSet) {
                        aVar.dispose();
                    }
                    Throwable terminate = this.f200897h.terminate();
                    if (!(terminate == null || terminate == C88906h.f201913a)) {
                        C88925a.m154178a(terminate);
                    }
                }
                if (getAndIncrement() == 0 && (hVar = this.f200895f) != null) {
                    hVar.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo143035b() {
            boolean z;
            boolean z2;
            long j;
            long j2;
            U u;
            AbstractC90214c<? super U> cVar = this.f200890a;
            int i = 1;
            while (!m153783d()) {
                AbstractC88475h<U> hVar = this.f200895f;
                long j3 = this.f200900m.get();
                if (j3 == Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                long j4 = 0;
                long j5 = 0;
                if (hVar != null) {
                    do {
                        long j6 = 0;
                        u = null;
                        while (j3 != 0) {
                            u = hVar.poll();
                            if (!m153783d()) {
                                if (u == null) {
                                    break;
                                }
                                cVar.onNext(u);
                                j5++;
                                j6++;
                                j3--;
                            } else {
                                return;
                            }
                        }
                        if (j6 != 0) {
                            if (z) {
                                j3 = Long.MAX_VALUE;
                                continue;
                            } else {
                                j3 = this.f200900m.addAndGet(-j6);
                            }
                        }
                        if (j3 == 0) {
                            break;
                        }
                    } while (u != null);
                }
                boolean z3 = this.f200896g;
                AbstractC88475h<U> hVar2 = this.f200895f;
                C88547a<?, ?>[] aVarArr = this.f200899j.get();
                int length = aVarArr.length;
                if (!z3 || ((hVar2 != null && !hVar2.isEmpty()) || length != 0)) {
                    if (length != 0) {
                        long j7 = this.f200903p;
                        int i2 = this.f200904q;
                        if (length <= i2 || aVarArr[i2].f200880a != j7) {
                            if (length <= i2) {
                                i2 = 0;
                            }
                            int i3 = 0;
                            while (aVarArr[i2].f200880a != j7) {
                                i2++;
                                if (i2 == length) {
                                    i2 = 0;
                                }
                                i3++;
                                if (i3 >= length) {
                                    break;
                                }
                            }
                            this.f200904q = i2;
                            this.f200903p = aVarArr[i2].f200880a;
                        }
                        z2 = false;
                        int i4 = 0;
                        while (!m153783d()) {
                            C88547a<T, U> aVar = aVarArr[i2];
                            U u2 = null;
                            while (!m153783d()) {
                                AbstractC88476i<U> iVar = aVar.f200885f;
                                if (iVar != null) {
                                    long j8 = 0;
                                    while (j3 != j4) {
                                        try {
                                            u2 = iVar.poll();
                                            if (u2 == null) {
                                                break;
                                            }
                                            cVar.onNext(u2);
                                            if (!m153783d()) {
                                                j3--;
                                                j8++;
                                            } else {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C88422b.m153670a(th);
                                            aVar.dispose();
                                            this.f200897h.addThrowable(th);
                                            if (!this.f200892c) {
                                                this.f200901n.cancel();
                                            }
                                            if (!m153783d()) {
                                                m153781b(aVar);
                                                i4++;
                                                z2 = true;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    if (j8 != j4) {
                                        if (!z) {
                                            j3 = this.f200900m.addAndGet(-j8);
                                        } else {
                                            j3 = Long.MAX_VALUE;
                                        }
                                        aVar.mo143033a(j8);
                                        j2 = 0;
                                    } else {
                                        j2 = 0;
                                    }
                                    if (!(j3 == j2 || u2 == null)) {
                                        j4 = 0;
                                    }
                                }
                                boolean z4 = aVar.f200884e;
                                AbstractC88476i<U> iVar2 = aVar.f200885f;
                                if (z4 && (iVar2 == null || iVar2.isEmpty())) {
                                    m153781b(aVar);
                                    if (!m153783d()) {
                                        j5++;
                                        z2 = true;
                                    } else {
                                        return;
                                    }
                                }
                                if (j3 == 0) {
                                    this.f200904q = i2;
                                    this.f200903p = aVarArr[i2].f200880a;
                                    j = 0;
                                } else {
                                    i2++;
                                    if (i2 == length) {
                                        i2 = 0;
                                    }
                                    i4++;
                                    j4 = 0;
                                    if (i4 >= length) {
                                        this.f200904q = i2;
                                        this.f200903p = aVarArr[i2].f200880a;
                                        j = 0;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    j = 0;
                    z2 = false;
                    if (j5 != j && !this.f200898i) {
                        this.f200901n.request(j5);
                    }
                    if (!z2 && (i = addAndGet(-i)) == 0) {
                        return;
                    }
                } else {
                    Throwable terminate = this.f200897h.terminate();
                    if (terminate == C88906h.f201913a) {
                        return;
                    }
                    if (terminate == null) {
                        cVar.onComplete();
                        return;
                    } else {
                        cVar.onError(terminate);
                        return;
                    }
                }
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                C88902d.m154098a(this.f200900m, j);
                mo143034a();
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            if (this.f200896g) {
                C88925a.m154178a(th);
            } else if (this.f200897h.addThrowable(th)) {
                this.f200896g = true;
                mo143034a();
            } else {
                C88925a.m154178a(th);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.concurrent.atomic.AtomicReference<f.a.e.e.b.i$a<?, ?>[]> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        private boolean m153780a(C88547a<T, U> aVar) {
            C88547a<?, ?>[] aVarArr;
            C88547a[] aVarArr2;
            do {
                aVarArr = this.f200899j.get();
                if (aVarArr == f200889l) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C88547a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f200899j.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        private void m153781b(C88547a<T, U> aVar) {
            C88547a<?, ?>[] aVarArr;
            C88547a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f200899j.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = 0;
                    while (aVarArr[i] != aVar) {
                        i++;
                        if (i >= length) {
                            return;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f200888k;
                        } else {
                            aVarArr2 = new C88547a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f200899j.compareAndSet(aVarArr, aVarArr2));
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200901n, dVar)) {
                this.f200901n = dVar;
                this.f200890a.onSubscribe(this);
                if (!this.f200898i) {
                    int i = this.f200893d;
                    if (i == Integer.MAX_VALUE) {
                        dVar.request(Long.MAX_VALUE);
                    } else {
                        dVar.request((long) i);
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
        @Override // org.p4663a.AbstractC90214c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r12) {
            /*
            // Method dump skipped, instructions count: 247
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4575b.C88546i.C88548b.onNext(java.lang.Object):void");
        }

        C88548b(AbstractC90214c<? super U> cVar, AbstractC88434g<? super T, ? extends AbstractC90213b<? extends U>> gVar, boolean z, int i, int i2) {
            AtomicReference<C88547a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f200899j = atomicReference;
            this.f200900m = new AtomicLong();
            this.f200890a = cVar;
            this.f200891b = gVar;
            this.f200892c = z;
            this.f200893d = i;
            this.f200894e = i2;
            this.f200906s = Math.max(1, i >> 1);
            atomicReference.lazySet(f200888k);
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super U> cVar) {
        if (!C88581y.m153821a(this.f200799b, cVar, this.f200876c)) {
            this.f200799b.mo143201a((AbstractC88955l) new C88548b(cVar, this.f200876c, this.f200877d, this.f200878e, this.f200879f));
        }
    }

    public C88546i(AbstractC88924h<T> hVar, AbstractC88434g<? super T, ? extends AbstractC90213b<? extends U>> gVar, int i, int i2) {
        super(hVar);
        this.f200876c = gVar;
        this.f200878e = i;
        this.f200879f = i2;
    }
}
