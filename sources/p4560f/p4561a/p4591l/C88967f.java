package p4560f.p4561a.p4591l;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.l.f */
public final class C88967f<T> extends AbstractC88403ab<T> implements AbstractC88406ae<T> {

    /* renamed from: b */
    static final C88968a[] f202045b = new C88968a[0];

    /* renamed from: c */
    static final C88968a[] f202046c = new C88968a[0];

    /* renamed from: a */
    final AtomicReference<C88968a<T>[]> f202047a = new AtomicReference<>(f202045b);

    /* renamed from: d */
    final AtomicBoolean f202048d = new AtomicBoolean();

    /* renamed from: e */
    T f202049e;

    /* renamed from: f */
    Throwable f202050f;

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.l.f$a */
    public static final class C88968a<T> extends AtomicReference<C88967f<T>> implements AbstractC88412b {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: a */
        final AbstractC88406ae<? super T> f202051a;

        static {
            Covode.recordClassIndex(105010);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            C88967f fVar = (C88967f) getAndSet(null);
            if (fVar != null) {
                fVar.mo143229a((C88968a) this);
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        C88968a(AbstractC88406ae<? super T> aeVar, C88967f<T> fVar) {
            this.f202051a = aeVar;
            lazySet(fVar);
        }
    }

    static {
        Covode.recordClassIndex(105009);
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSubscribe(AbstractC88412b bVar) {
        if (this.f202047a.get() == f202046c) {
            bVar.dispose();
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        C88968a<T>[] aVarArr;
        C88968a<T>[] aVarArr2;
        C88968a<T> aVar = new C88968a<>(aeVar, this);
        aeVar.onSubscribe(aVar);
        do {
            aVarArr = this.f202047a.get();
            if (aVarArr == f202046c) {
                Throwable th = this.f202050f;
                if (th != null) {
                    aeVar.onError(th);
                    return;
                } else {
                    aeVar.onSuccess(this.f202049e);
                    return;
                }
            } else {
                int length = aVarArr.length;
                aVarArr2 = new C88968a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            }
        } while (!this.f202047a.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            mo143229a((C88968a) aVar);
        }
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onError(Throwable th) {
        C88466b.m153697a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f202048d.compareAndSet(false, true)) {
            this.f202050f = th;
            for (C88968a<T> aVar : this.f202047a.getAndSet(f202046c)) {
                aVar.f202051a.onError(th);
            }
            return;
        }
        C88925a.m154178a(th);
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSuccess(T t) {
        C88466b.m153697a((Object) t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f202048d.compareAndSet(false, true)) {
            this.f202049e = t;
            for (C88968a<T> aVar : this.f202047a.getAndSet(f202046c)) {
                aVar.f202051a.onSuccess(t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo143229a(C88968a<T> aVar) {
        C88968a<T>[] aVarArr;
        C88968a<T>[] aVarArr2;
        do {
            aVarArr = this.f202047a.get();
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
                        aVarArr2 = f202045b;
                    } else {
                        aVarArr2 = new C88968a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f202047a.compareAndSet(aVarArr, aVarArr2));
    }
}
