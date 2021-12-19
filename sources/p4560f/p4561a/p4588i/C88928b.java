package p4560f.p4561a.p4588i;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.p4566c.C88423c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.i.b */
public final class C88928b<T> extends AbstractC88927a<T> {

    /* renamed from: b */
    static final C88929a[] f201957b = new C88929a[0];

    /* renamed from: c */
    static final C88929a[] f201958c = new C88929a[0];

    /* renamed from: d */
    final AtomicReference<C88929a<T>[]> f201959d = new AtomicReference<>(f201958c);

    /* renamed from: e */
    Throwable f201960e;

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.i.b$a */
    public static final class C88929a<T> extends AtomicLong implements AbstractC90215d {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final AbstractC90214c<? super T> f201961a;

        /* renamed from: b */
        final C88928b<T> f201962b;

        static {
            Covode.recordClassIndex(104971);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f201962b.mo143210a((C88929a) this);
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            long j2;
            if (EnumC88897f.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, C88902d.m154096a(j2, j)));
            }
        }

        C88929a(AbstractC90214c<? super T> cVar, C88928b<T> bVar) {
            this.f201961a = cVar;
            this.f201962b = bVar;
        }
    }

    static {
        Covode.recordClassIndex(104970);
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onComplete() {
        C88929a<T>[] aVarArr = this.f201959d.get();
        C88929a<T>[] aVarArr2 = f201957b;
        if (aVarArr != aVarArr2) {
            C88929a<T>[] andSet = this.f201959d.getAndSet(aVarArr2);
            for (C88929a<T> aVar : andSet) {
                if (aVar.get() != Long.MIN_VALUE) {
                    aVar.f201961a.onComplete();
                }
            }
        }
    }

    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    public final void onSubscribe(AbstractC90215d dVar) {
        if (this.f201959d.get() == f201957b) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo143210a(C88929a<T> aVar) {
        C88929a<T>[] aVarArr;
        C88929a<T>[] aVarArr2;
        do {
            aVarArr = this.f201959d.get();
            if (!(aVarArr == f201957b || aVarArr == f201958c)) {
                int length = aVarArr.length;
                for (int i = 0; i < length; i++) {
                    if (aVarArr[i] == aVar) {
                        if (i < 0) {
                            return;
                        } else {
                            if (length == 1) {
                                aVarArr2 = f201958c;
                            } else {
                                aVarArr2 = new C88929a[(length - 1)];
                                System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                                System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            }
                        }
                    }
                }
                return;
            }
            return;
        } while (!this.f201959d.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onError(Throwable th) {
        C88466b.m153697a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C88929a<T>[] aVarArr = this.f201959d.get();
        C88929a<T>[] aVarArr2 = f201957b;
        if (aVarArr == aVarArr2) {
            C88925a.m154178a(th);
            return;
        }
        this.f201960e = th;
        C88929a<T>[] andSet = this.f201959d.getAndSet(aVarArr2);
        for (C88929a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.f201961a.onError(th);
            } else {
                C88925a.m154178a(th);
            }
        }
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onNext(T t) {
        C88466b.m153697a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        C88929a<T>[] aVarArr = this.f201959d.get();
        for (C88929a<T> aVar : aVarArr) {
            long j = aVar.get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    aVar.f201961a.onNext(t);
                    C88902d.m154097a(aVar);
                } else {
                    aVar.cancel();
                    aVar.f201961a.onError(new C88423c("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        C88929a<T>[] aVarArr;
        C88929a<T>[] aVarArr2;
        C88929a<T> aVar = new C88929a<>(cVar, this);
        cVar.onSubscribe(aVar);
        do {
            aVarArr = this.f201959d.get();
            if (aVarArr == f201957b) {
                Throwable th = this.f201960e;
                if (th != null) {
                    cVar.onError(th);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            } else {
                int length = aVarArr.length;
                aVarArr2 = new C88929a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            }
        } while (!this.f201959d.compareAndSet(aVarArr, aVarArr2));
        if (aVar.get() == Long.MIN_VALUE) {
            mo143210a((C88929a) aVar);
        }
    }
}
