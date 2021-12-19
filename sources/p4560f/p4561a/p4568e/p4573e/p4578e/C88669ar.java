package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4585f.AbstractC88918a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.ar */
public final class C88669ar<T> extends AbstractC88918a<T> {

    /* renamed from: a */
    final AbstractC88984x<T> f201189a;

    /* renamed from: b */
    final AtomicReference<C88671b<T>> f201190b;

    /* renamed from: c */
    final AbstractC88984x<T> f201191c;

    static {
        Covode.recordClassIndex(104711);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.ar$a */
    public static final class C88670a<T> extends AtomicReference<Object> implements AbstractC88412b {
        private static final long serialVersionUID = -1100270633763673112L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201192a;

        static {
            Covode.recordClassIndex(104712);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C88671b) andSet).mo143067a(this);
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }

        C88670a(AbstractC88986z<? super T> zVar) {
            this.f201192a = zVar;
        }
    }

    /* renamed from: f.a.e.e.e.ar$b */
    static final class C88671b<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: b */
        static final C88670a[] f201193b = new C88670a[0];

        /* renamed from: c */
        static final C88670a[] f201194c = new C88670a[0];

        /* renamed from: a */
        final AtomicReference<C88671b<T>> f201195a;

        /* renamed from: d */
        final AtomicReference<C88670a<T>[]> f201196d = new AtomicReference<>(f201193b);

        /* renamed from: e */
        final AtomicBoolean f201197e;

        /* renamed from: f */
        final AtomicReference<AbstractC88412b> f201198f = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104713);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (this.f201196d.get() == f201194c) {
                return true;
            }
            return false;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            AtomicReference<C88670a<T>[]> atomicReference = this.f201196d;
            C88670a<T>[] aVarArr = f201194c;
            if (atomicReference.getAndSet(aVarArr) != aVarArr) {
                this.f201195a.compareAndSet(this, null);
                EnumC88441b.dispose(this.f201198f);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201195a.compareAndSet(this, null);
            for (C88670a<T> aVar : this.f201196d.getAndSet(f201194c)) {
                aVar.f201192a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this.f201198f, bVar);
        }

        C88671b(AtomicReference<C88671b<T>> atomicReference) {
            this.f201195a = atomicReference;
            this.f201197e = new AtomicBoolean();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            for (C88670a<T> aVar : this.f201196d.get()) {
                aVar.f201192a.onNext(t);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143067a(C88670a<T> aVar) {
            C88670a<T>[] aVarArr;
            C88670a<T>[] aVarArr2;
            do {
                aVarArr = this.f201196d.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = 0;
                    while (!aVarArr[i].equals(aVar)) {
                        i++;
                        if (i >= length) {
                            return;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f201193b;
                        } else {
                            aVarArr2 = new C88670a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f201196d.compareAndSet(aVarArr, aVarArr2));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201195a.compareAndSet(this, null);
            C88670a<T>[] andSet = this.f201196d.getAndSet(f201194c);
            if (andSet.length != 0) {
                for (C88670a<T> aVar : andSet) {
                    aVar.f201192a.onError(th);
                }
                return;
            }
            C88925a.m154178a(th);
        }
    }

    /* renamed from: f.a.e.e.e.ar$c */
    public static final class C88672c<T> implements AbstractC88984x<T> {

        /* renamed from: a */
        private final AtomicReference<C88671b<T>> f201199a;

        static {
            Covode.recordClassIndex(104714);
        }

        public C88672c(AtomicReference<C88671b<T>> atomicReference) {
            this.f201199a = atomicReference;
        }

        @Override // p4560f.p4561a.AbstractC88984x
        /* renamed from: b */
        public final void mo143062b(AbstractC88986z<? super T> zVar) {
            C88671b<T> bVar;
            C88670a<T> aVar = new C88670a<>(zVar);
            zVar.onSubscribe(aVar);
            loop0:
            while (true) {
                bVar = this.f201199a.get();
                if (bVar == null || bVar.isDisposed()) {
                    C88671b<T> bVar2 = new C88671b<>(this.f201199a);
                    if (this.f201199a.compareAndSet(bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                while (true) {
                    C88670a<T>[] aVarArr = bVar.f201196d.get();
                    if (aVarArr != C88671b.f201194c) {
                        int length = aVarArr.length;
                        C88670a<T>[] aVarArr2 = new C88670a[(length + 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        if (bVar.f201196d.compareAndSet(aVarArr, aVarArr2)) {
                            break loop0;
                        }
                    } else {
                        continue;
                        break;
                    }
                }
            }
            if (!aVar.compareAndSet(null, bVar)) {
                bVar.mo143067a(aVar);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201191c.mo143062b(zVar);
    }

    @Override // p4560f.p4561a.p4585f.AbstractC88918a
    /* renamed from: e */
    public final void mo143066e(AbstractC88433f<? super AbstractC88412b> fVar) {
        C88671b<T> bVar;
        while (true) {
            bVar = this.f201190b.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            C88671b<T> bVar2 = new C88671b<>(this.f201190b);
            if (this.f201190b.compareAndSet(bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z = true;
        if (bVar.f201197e.get() || !bVar.f201197e.compareAndSet(false, true)) {
            z = false;
        }
        try {
            fVar.accept(bVar);
            if (z) {
                this.f201189a.mo143062b(bVar);
            }
        } catch (Throwable th) {
            C88422b.m153670a(th);
            throw C88906h.m154104a(th);
        }
    }

    public C88669ar(AbstractC88984x<T> xVar, AbstractC88984x<T> xVar2, AtomicReference<C88671b<T>> atomicReference) {
        this.f201191c = xVar;
        this.f201189a = xVar2;
        this.f201190b = atomicReference;
    }
}
