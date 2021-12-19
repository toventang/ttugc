package com.p1809e.p1810a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.e.a.b */
public final class C23827b<T> extends AbstractC23829c<T> {

    /* renamed from: a */
    static final C23828a[] f56360a = new C23828a[0];

    /* renamed from: b */
    final AtomicReference<C23828a<T>[]> f56361b = new AtomicReference<>(f56360a);

    /* access modifiers changed from: package-private */
    /* renamed from: com.e.a.b$a */
    public static final class C23828a<T> extends AtomicBoolean implements AbstractC88412b {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f56362a;

        /* renamed from: b */
        final C23827b<T> f56363b;

        static {
            Covode.recordClassIndex(27936);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return get();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f56363b.mo39293a(this);
            }
        }

        C23828a(AbstractC88986z<? super T> zVar, C23827b<T> bVar) {
            this.f56362a = zVar;
            this.f56363b = bVar;
        }
    }

    static {
        Covode.recordClassIndex(27935);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39293a(C23828a<T> aVar) {
        C23828a<T>[] aVarArr;
        C23828a<T>[] aVarArr2;
        do {
            aVarArr = this.f56361b.get();
            if (aVarArr != f56360a) {
                int length = aVarArr.length;
                for (int i = 0; i < length; i++) {
                    if (aVarArr[i] == aVar) {
                        if (i < 0) {
                            return;
                        } else {
                            if (length == 1) {
                                aVarArr2 = f56360a;
                            } else {
                                aVarArr2 = new C23828a[(length - 1)];
                                System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                                System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            }
                        }
                    }
                }
                return;
            }
            return;
        } while (!this.f56361b.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f, com.p1809e.p1810a.AbstractC23829c
    public final void accept(T t) {
        Objects.requireNonNull(t, "value == null");
        C23828a<T>[] aVarArr = this.f56361b.get();
        for (C23828a<T> aVar : aVarArr) {
            if (!aVar.get()) {
                aVar.f56362a.onNext(t);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C23828a<T>[] aVarArr;
        C23828a<T>[] aVarArr2;
        C23828a<T> aVar = new C23828a<>(zVar, this);
        zVar.onSubscribe(aVar);
        do {
            aVarArr = this.f56361b.get();
            int length = aVarArr.length;
            aVarArr2 = new C23828a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f56361b.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            mo39293a(aVar);
        }
    }
}
