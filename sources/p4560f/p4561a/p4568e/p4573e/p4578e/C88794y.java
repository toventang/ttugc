package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;
import p4560f.p4561a.p4568e.p4571c.AbstractC88475h;
import p4560f.p4561a.p4568e.p4571c.AbstractC88476i;
import p4560f.p4561a.p4568e.p4580f.C88850b;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4568e.p4584j.C88901c;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.y */
public final class C88794y<T, U> extends AbstractC88637a<T, U> {

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> f201620b;

    /* renamed from: c */
    final boolean f201621c;

    /* renamed from: d */
    final int f201622d;

    /* renamed from: e */
    final int f201623e;

    static {
        Covode.recordClassIndex(104836);
    }

    /* renamed from: f.a.e.e.e.y$b */
    static final class C88796b<T, U> extends AtomicInteger implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: k */
        static final C88795a<?, ?>[] f201629k = new C88795a[0];

        /* renamed from: l */
        static final C88795a<?, ?>[] f201630l = new C88795a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: a */
        final AbstractC88986z<? super U> f201631a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> f201632b;

        /* renamed from: c */
        final boolean f201633c;

        /* renamed from: d */
        final int f201634d;

        /* renamed from: e */
        final int f201635e;

        /* renamed from: f */
        volatile AbstractC88475h<U> f201636f;

        /* renamed from: g */
        volatile boolean f201637g;

        /* renamed from: h */
        final C88901c f201638h = new C88901c();

        /* renamed from: i */
        volatile boolean f201639i;

        /* renamed from: j */
        final AtomicReference<C88795a<?, ?>[]> f201640j;

        /* renamed from: m */
        AbstractC88412b f201641m;

        /* renamed from: n */
        long f201642n;

        /* renamed from: o */
        long f201643o;

        /* renamed from: p */
        int f201644p;

        /* renamed from: q */
        Queue<AbstractC88984x<? extends U>> f201645q;

        /* renamed from: r */
        int f201646r;

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201639i;
        }

        static {
            Covode.recordClassIndex(104838);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143110a() {
            if (getAndIncrement() == 0) {
                mo143111b();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201637g) {
                this.f201637g = true;
                mo143110a();
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            Throwable terminate;
            if (!this.f201639i) {
                this.f201639i = true;
                if (mo143112c() && (terminate = this.f201638h.terminate()) != null && terminate != C88906h.f201913a) {
                    C88925a.m154178a(terminate);
                }
            }
        }

        /* renamed from: d */
        private boolean m154000d() {
            if (this.f201639i) {
                return true;
            }
            Object obj = this.f201638h.get();
            if (this.f201633c || obj == null) {
                return false;
            }
            mo143112c();
            Throwable terminate = this.f201638h.terminate();
            if (terminate != C88906h.f201913a) {
                this.f201631a.onError(terminate);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo143112c() {
            C88795a<?, ?>[] andSet;
            this.f201641m.dispose();
            C88795a<?, ?>[] aVarArr = this.f201640j.get();
            C88795a<?, ?>[] aVarArr2 = f201630l;
            if (aVarArr == aVarArr2 || (andSet = this.f201640j.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (C88795a<?, ?> aVar : andSet) {
                EnumC88441b.dispose(aVar);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x012d, code lost:
            r10 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0147, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0149, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x014c, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
            if (r8 != 0) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x00db, code lost:
            if (r7 == r8) goto L_0x00ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fd, code lost:
            if (r7 == r8) goto L_0x00ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x00ff, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0100, code lost:
            r4 = r4 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0102, code lost:
            if (r4 >= r8) goto L_0x0105;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0105, code lost:
            r14.f201644p = r7;
            r14.f201643o = r9[r7].f201624a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x010d, code lost:
            if (r10 == 0) goto L_0x012f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0111, code lost:
            if (r14.f201634d == Integer.MAX_VALUE) goto L_0x0009;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0113, code lost:
            r1 = r10 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0115, code lost:
            if (r10 == 0) goto L_0x0009;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0117, code lost:
            monitor-enter(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            r0 = r14.f201645q.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0120, code lost:
            if (r0 != null) goto L_0x0129;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0122, code lost:
            r14.f201646r--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0127, code lost:
            monitor-exit(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0129, code lost:
            monitor-exit(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x012a, code lost:
            m153996a(r0);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo143111b() {
            /*
            // Method dump skipped, instructions count: 333
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4578e.C88794y.C88796b.mo143111b():void");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201641m, bVar)) {
                this.f201641m = bVar;
                this.f201631a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201637g) {
                C88925a.m154178a(th);
            } else if (this.f201638h.addThrowable(th)) {
                this.f201637g = true;
                mo143110a();
            } else {
                C88925a.m154178a(th);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.concurrent.atomic.AtomicReference<f.a.e.e.e.y$a<?, ?>[]> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        private boolean m153997a(C88795a<T, U> aVar) {
            C88795a<?, ?>[] aVarArr;
            C88795a[] aVarArr2;
            do {
                aVarArr = this.f201640j.get();
                if (aVarArr == f201630l) {
                    EnumC88441b.dispose(aVar);
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C88795a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f201640j.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        private void m153999b(C88795a<T, U> aVar) {
            C88795a<?, ?>[] aVarArr;
            C88795a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f201640j.get();
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
                            aVarArr2 = f201629k;
                        } else {
                            aVarArr2 = new C88795a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f201640j.compareAndSet(aVarArr, aVarArr2));
        }

        /* renamed from: a */
        private void m153996a(AbstractC88984x<? extends U> xVar) {
            boolean z;
            MethodCollector.m26663i(1817);
            do {
                if (!(xVar instanceof Callable)) {
                    long j = this.f201642n;
                    this.f201642n = 1 + j;
                    C88795a<T, U> aVar = new C88795a<>(this, j);
                    if (m153997a(aVar)) {
                        xVar.mo143062b(aVar);
                    }
                } else if (m153998a((Callable) xVar) && this.f201634d != Integer.MAX_VALUE) {
                    z = false;
                    synchronized (this) {
                        try {
                            xVar = this.f201645q.poll();
                            if (xVar == null) {
                                this.f201646r--;
                                z = true;
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(1817);
                            throw th;
                        }
                    }
                }
                MethodCollector.m26664o(1817);
                return;
            } while (!z);
            mo143110a();
            MethodCollector.m26664o(1817);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            MethodCollector.m26663i(1812);
            if (this.f201637g) {
                MethodCollector.m26664o(1812);
                return;
            }
            try {
                AbstractC88984x<? extends U> xVar = (AbstractC88984x) C88466b.m153697a(this.f201632b.apply(t), "The mapper returned a null ObservableSource");
                if (this.f201634d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.f201646r;
                            if (i == this.f201634d) {
                                this.f201645q.offer(xVar);
                                return;
                            }
                            this.f201646r = i + 1;
                        } finally {
                            MethodCollector.m26664o(1812);
                        }
                    }
                }
                m153996a(xVar);
                MethodCollector.m26664o(1812);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201641m.dispose();
                onError(th);
                MethodCollector.m26664o(1812);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [f.a.e.c.h] */
        /* renamed from: a */
        private boolean m153998a(Callable<? extends U> callable) {
            AbstractC88475h<U> hVar;
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    AbstractC88475h<U> hVar2 = this.f201636f;
                    AbstractC88475h<U> hVar3 = hVar2;
                    if (hVar2 == null) {
                        if (this.f201634d == Integer.MAX_VALUE) {
                            hVar = new C88851c(this.f201635e);
                        } else {
                            hVar = new C88850b(this.f201634d);
                        }
                        this.f201636f = hVar;
                        hVar3 = hVar;
                    }
                    if (!hVar3.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f201631a.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                mo143111b();
                return true;
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201638h.addThrowable(th);
                mo143110a();
                return true;
            }
        }

        C88796b(AbstractC88986z<? super U> zVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> gVar, boolean z, int i, int i2) {
            this.f201631a = zVar;
            this.f201632b = gVar;
            this.f201633c = z;
            this.f201634d = i;
            this.f201635e = i2;
            if (i != Integer.MAX_VALUE) {
                this.f201645q = new ArrayDeque(i);
            }
            this.f201640j = new AtomicReference<>(f201629k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.y$a */
    public static final class C88795a<T, U> extends AtomicReference<AbstractC88412b> implements AbstractC88986z<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a */
        final long f201624a;

        /* renamed from: b */
        final C88796b<T, U> f201625b;

        /* renamed from: c */
        volatile boolean f201626c;

        /* renamed from: d */
        volatile AbstractC88476i<U> f201627d;

        /* renamed from: e */
        int f201628e;

        static {
            Covode.recordClassIndex(104837);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201626c = true;
            this.f201625b.mo143110a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201625b.f201638h.addThrowable(th)) {
                if (!this.f201625b.f201633c) {
                    this.f201625b.mo143112c();
                }
                this.f201626c = true;
                this.f201625b.mo143110a();
                return;
            }
            C88925a.m154178a(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(U u) {
            if (this.f201628e == 0) {
                C88796b<T, U> bVar = this.f201625b;
                if (bVar.get() != 0 || !bVar.compareAndSet(0, 1)) {
                    AbstractC88476i iVar = this.f201627d;
                    if (iVar == null) {
                        iVar = new C88851c(bVar.f201635e);
                        this.f201627d = iVar;
                    }
                    iVar.offer(u);
                    if (bVar.getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    bVar.f201631a.onNext(u);
                    if (bVar.decrementAndGet() == 0) {
                        return;
                    }
                }
                bVar.mo143111b();
                return;
            }
            this.f201625b.mo143110a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar) && (bVar instanceof AbstractC88471d)) {
                AbstractC88471d dVar = (AbstractC88471d) bVar;
                int requestFusion = dVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f201628e = requestFusion;
                    this.f201627d = dVar;
                    this.f201626c = true;
                    this.f201625b.mo143110a();
                } else if (requestFusion == 2) {
                    this.f201628e = requestFusion;
                    this.f201627d = dVar;
                }
            }
        }

        C88795a(C88796b<T, U> bVar, long j) {
            this.f201624a = j;
            this.f201625b = bVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super U> zVar) {
        if (!C88695ay.m153919a(this.f201095a, zVar, this.f201620b)) {
            this.f201095a.mo143062b(new C88796b(zVar, this.f201620b, this.f201621c, this.f201622d, this.f201623e));
        }
    }

    public C88794y(AbstractC88984x<T> xVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> gVar, boolean z, int i, int i2) {
        super(xVar);
        this.f201620b = gVar;
        this.f201621c = z;
        this.f201622d = i;
        this.f201623e = i2;
    }
}
