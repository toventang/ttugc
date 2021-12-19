package p4560f.p4561a.p4591l;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.C88486j;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.l.a */
public final class C88956a<T> extends AbstractC88969g<T> {

    /* renamed from: a */
    static final C88957a[] f201998a = new C88957a[0];

    /* renamed from: b */
    static final C88957a[] f201999b = new C88957a[0];

    /* renamed from: c */
    final AtomicReference<C88957a<T>[]> f202000c = new AtomicReference<>(f201998a);

    /* renamed from: d */
    Throwable f202001d;

    /* renamed from: e */
    T f202002e;

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.l.a$a */
    public static final class C88957a<T> extends C88486j<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* renamed from: c */
        final C88956a<T> f202003c;

        static {
            Covode.recordClassIndex(104999);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143218a() {
            if (!isDisposed()) {
                this.f200734a.onComplete();
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b, p4560f.p4561a.p4568e.p4572d.C88486j
        public final void dispose() {
            if (super.tryDispose()) {
                this.f202003c.mo143217a(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143219a(Throwable th) {
            if (isDisposed()) {
                C88925a.m154178a(th);
            } else {
                this.f200734a.onError(th);
            }
        }

        C88957a(AbstractC88986z<? super T> zVar, C88956a<T> aVar) {
            super(zVar);
            this.f202003c = aVar;
        }
    }

    static {
        Covode.recordClassIndex(104998);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        C88957a<T>[] aVarArr = this.f202000c.get();
        C88957a<T>[] aVarArr2 = f201999b;
        if (aVarArr != aVarArr2) {
            T t = this.f202002e;
            C88957a<T>[] andSet = this.f202000c.getAndSet(aVarArr2);
            int i = 0;
            if (t == null) {
                int length = andSet.length;
                while (i < length) {
                    andSet[i].mo143218a();
                    i++;
                }
                return;
            }
            int length2 = andSet.length;
            while (i < length2) {
                andSet[i].complete(t);
                i++;
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        if (this.f202000c.get() == f201999b) {
            bVar.dispose();
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        C88466b.m153697a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f202000c.get() != f201999b) {
            this.f202002e = t;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo143217a(C88957a<T> aVar) {
        C88957a<T>[] aVarArr;
        C88957a<T>[] aVarArr2;
        do {
            aVarArr = this.f202000c.get();
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
                        aVarArr2 = f201998a;
                    } else {
                        aVarArr2 = new C88957a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f202000c.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        C88466b.m153697a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C88957a<T>[] aVarArr = this.f202000c.get();
        C88957a<T>[] aVarArr2 = f201999b;
        if (aVarArr == aVarArr2) {
            C88925a.m154178a(th);
            return;
        }
        this.f202002e = null;
        this.f202001d = th;
        C88957a<T>[] andSet = this.f202000c.getAndSet(aVarArr2);
        for (C88957a<T> aVar : andSet) {
            aVar.mo143219a(th);
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88957a<T>[] aVarArr;
        C88957a<T>[] aVarArr2;
        C88957a<T> aVar = new C88957a<>(zVar, this);
        zVar.onSubscribe(aVar);
        do {
            aVarArr = this.f202000c.get();
            if (aVarArr == f201999b) {
                Throwable th = this.f202001d;
                if (th != null) {
                    zVar.onError(th);
                    return;
                }
                T t = this.f202002e;
                if (t != null) {
                    aVar.complete(t);
                    return;
                } else {
                    aVar.mo143218a();
                    return;
                }
            } else {
                int length = aVarArr.length;
                aVarArr2 = new C88957a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            }
        } while (!this.f202000c.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            mo143217a(aVar);
        }
    }
}
