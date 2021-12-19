package p4560f.p4561a.p4591l;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.l.c */
public final class C88960c<T> extends AbstractC88969g<T> {

    /* renamed from: a */
    static final C88961a[] f202022a = new C88961a[0];

    /* renamed from: b */
    static final C88961a[] f202023b = new C88961a[0];

    /* renamed from: c */
    final AtomicReference<C88961a<T>[]> f202024c = new AtomicReference<>(f202023b);

    /* renamed from: d */
    Throwable f202025d;

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.l.c$a */
    public static final class C88961a<T> extends AtomicBoolean implements AbstractC88412b {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f202026a;

        /* renamed from: b */
        final C88960c<T> f202027b;

        static {
            Covode.recordClassIndex(105003);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return get();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f202027b.mo143223a(this);
            }
        }

        C88961a(AbstractC88986z<? super T> zVar, C88960c<T> cVar) {
            this.f202026a = zVar;
            this.f202027b = cVar;
        }
    }

    static {
        Covode.recordClassIndex(105002);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        C88961a<T>[] aVarArr = this.f202024c.get();
        C88961a<T>[] aVarArr2 = f202022a;
        if (aVarArr != aVarArr2) {
            C88961a<T>[] andSet = this.f202024c.getAndSet(aVarArr2);
            for (C88961a<T> aVar : andSet) {
                if (!aVar.get()) {
                    aVar.f202026a.onComplete();
                }
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        if (this.f202024c.get() == f202022a) {
            bVar.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo143223a(C88961a<T> aVar) {
        C88961a<T>[] aVarArr;
        C88961a<T>[] aVarArr2;
        do {
            aVarArr = this.f202024c.get();
            if (!(aVarArr == f202022a || aVarArr == f202023b)) {
                int length = aVarArr.length;
                for (int i = 0; i < length; i++) {
                    if (aVarArr[i] == aVar) {
                        if (i < 0) {
                            return;
                        } else {
                            if (length == 1) {
                                aVarArr2 = f202023b;
                            } else {
                                aVarArr2 = new C88961a[(length - 1)];
                                System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                                System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            }
                        }
                    }
                }
                return;
            }
            return;
        } while (!this.f202024c.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        C88466b.m153697a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C88961a<T>[] aVarArr = this.f202024c.get();
        C88961a<T>[] aVarArr2 = f202022a;
        if (aVarArr == aVarArr2) {
            C88925a.m154178a(th);
            return;
        }
        this.f202025d = th;
        C88961a<T>[] andSet = this.f202024c.getAndSet(aVarArr2);
        for (C88961a<T> aVar : andSet) {
            if (aVar.get()) {
                C88925a.m154178a(th);
            } else {
                aVar.f202026a.onError(th);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        C88466b.m153697a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        C88961a<T>[] aVarArr = this.f202024c.get();
        for (C88961a<T> aVar : aVarArr) {
            if (!aVar.get()) {
                aVar.f202026a.onNext(t);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88961a<T>[] aVarArr;
        C88961a<T>[] aVarArr2;
        C88961a<T> aVar = new C88961a<>(zVar, this);
        zVar.onSubscribe(aVar);
        do {
            aVarArr = this.f202024c.get();
            if (aVarArr == f202022a) {
                Throwable th = this.f202025d;
                if (th != null) {
                    zVar.onError(th);
                    return;
                } else {
                    zVar.onComplete();
                    return;
                }
            } else {
                int length = aVarArr.length;
                aVarArr2 = new C88961a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            }
        } while (!this.f202024c.compareAndSet(aVarArr, aVarArr2));
        if (aVar.isDisposed()) {
            mo143223a(aVar);
        }
    }
}
