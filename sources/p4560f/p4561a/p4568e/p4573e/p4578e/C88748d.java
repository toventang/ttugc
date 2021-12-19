package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: f.a.e.e.e.d */
public final class C88748d<T> extends AbstractC88637a<T, T> implements AbstractC88986z<T> {

    /* renamed from: e */
    static final C88749a[] f201445e = new C88749a[0];

    /* renamed from: f */
    static final C88749a[] f201446f = new C88749a[0];

    /* renamed from: b */
    final AtomicBoolean f201447b = new AtomicBoolean();

    /* renamed from: c */
    final int f201448c = 16;

    /* renamed from: d */
    final AtomicReference<C88749a<T>[]> f201449d;

    /* renamed from: g */
    public volatile long f201450g;

    /* renamed from: h */
    final C88750b<T> f201451h;

    /* renamed from: i */
    C88750b<T> f201452i;

    /* renamed from: j */
    int f201453j;

    /* renamed from: k */
    Throwable f201454k;

    /* renamed from: l */
    volatile boolean f201455l;

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.d$a */
    public static final class C88749a<T> extends AtomicInteger implements AbstractC88412b {
        private static final long serialVersionUID = 6770240836423125754L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201456a;

        /* renamed from: b */
        final C88748d<T> f201457b;

        /* renamed from: c */
        C88750b<T> f201458c;

        /* renamed from: d */
        int f201459d;

        /* renamed from: e */
        long f201460e;

        /* renamed from: f */
        volatile boolean f201461f;

        static {
            Covode.recordClassIndex(104791);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201461f;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            C88749a<T>[] aVarArr;
            C88749a<T>[] aVarArr2;
            if (!this.f201461f) {
                this.f201461f = true;
                C88748d<T> dVar = this.f201457b;
                do {
                    aVarArr = dVar.f201449d.get();
                    int length = aVarArr.length;
                    if (length != 0) {
                        int i = 0;
                        while (aVarArr[i] != this) {
                            i++;
                            if (i >= length) {
                                return;
                            }
                        }
                        if (i < 0) {
                            return;
                        }
                        if (length == 1) {
                            aVarArr2 = C88748d.f201445e;
                        } else {
                            aVarArr2 = new C88749a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } while (!dVar.f201449d.compareAndSet(aVarArr, aVarArr2));
            }
        }

        C88749a(AbstractC88986z<? super T> zVar, C88748d<T> dVar) {
            this.f201456a = zVar;
            this.f201457b = dVar;
            this.f201458c = dVar.f201451h;
        }
    }

    static {
        Covode.recordClassIndex(104790);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        this.f201455l = true;
        for (C88749a<T> aVar : this.f201449d.getAndSet(f201446f)) {
            m153958a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.d$b */
    public static final class C88750b<T> {

        /* renamed from: a */
        final T[] f201462a;

        /* renamed from: b */
        volatile C88750b<T> f201463b;

        static {
            Covode.recordClassIndex(104792);
        }

        C88750b(int i) {
            this.f201462a = (T[]) new Object[i];
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        this.f201454k = th;
        this.f201455l = true;
        for (C88749a<T> aVar : this.f201449d.getAndSet(f201446f)) {
            m153958a(aVar);
        }
    }

    public C88748d(AbstractC88979t<T> tVar) {
        super(tVar);
        C88750b<T> bVar = new C88750b<>(16);
        this.f201451h = bVar;
        this.f201452i = bVar;
        this.f201449d = new AtomicReference<>(f201445e);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        int i = this.f201453j;
        if (i == this.f201448c) {
            C88750b<T> bVar = new C88750b<>(i);
            bVar.f201462a[0] = t;
            this.f201453j = 1;
            this.f201452i.f201463b = bVar;
            this.f201452i = bVar;
        } else {
            this.f201452i.f201462a[i] = t;
            this.f201453j = i + 1;
        }
        this.f201450g++;
        for (C88749a<T> aVar : this.f201449d.get()) {
            m153958a(aVar);
        }
    }

    /* renamed from: a */
    private void m153958a(C88749a<T> aVar) {
        boolean z;
        if (aVar.getAndIncrement() == 0) {
            long j = aVar.f201460e;
            int i = aVar.f201459d;
            C88750b<T> bVar = aVar.f201458c;
            AbstractC88986z<? super T> zVar = aVar.f201456a;
            int i2 = this.f201448c;
            int i3 = 1;
            while (!aVar.f201461f) {
                boolean z2 = this.f201455l;
                if (this.f201450g == j) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (z) {
                        aVar.f201458c = null;
                        Throwable th = this.f201454k;
                        if (th != null) {
                            zVar.onError(th);
                            return;
                        } else {
                            zVar.onComplete();
                            return;
                        }
                    }
                } else if (z) {
                    aVar.f201460e = j;
                    aVar.f201459d = i;
                    aVar.f201458c = bVar;
                    i3 = aVar.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
                if (i == i2) {
                    bVar = bVar.f201463b;
                    i = 0;
                }
                zVar.onNext(bVar.f201462a[i]);
                i++;
                j++;
            }
            aVar.f201458c = null;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88749a<T>[] aVarArr;
        C88749a<T>[] aVarArr2;
        C88749a<T> aVar = new C88749a<>(zVar, this);
        zVar.onSubscribe(aVar);
        do {
            aVarArr = this.f201449d.get();
            if (aVarArr == f201446f) {
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new C88749a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f201449d.compareAndSet(aVarArr, aVarArr2));
        if (this.f201447b.get() || !this.f201447b.compareAndSet(false, true)) {
            m153958a(aVar);
        } else {
            this.f201095a.mo143062b(this);
        }
    }
}
