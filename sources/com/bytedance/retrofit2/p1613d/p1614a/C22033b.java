package com.bytedance.retrofit2.p1613d.p1614a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.retrofit2.d.a.b */
final class C22033b<T> extends AbstractC88979t<C22099u<T>> {

    /* renamed from: a */
    private final AbstractC21983b<T> f52048a;

    static {
        Covode.recordClassIndex(25723);
    }

    /* renamed from: com.bytedance.retrofit2.d.a.b$a */
    static final class C22034a<T> implements AbstractC22030d<T>, AbstractC88412b {

        /* renamed from: a */
        boolean f52049a;

        /* renamed from: b */
        private final AbstractC21983b<?> f52050b;

        /* renamed from: c */
        private final AbstractC88986z<? super C22099u<T>> f52051c;

        static {
            Covode.recordClassIndex(25724);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f52050b.cancel();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f52050b.isCanceled();
        }

        C22034a(AbstractC21983b<?> bVar, AbstractC88986z<? super C22099u<T>> zVar) {
            this.f52050b = bVar;
            this.f52051c = zVar;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<T> bVar, Throwable th) {
            if (!bVar.isCanceled()) {
                try {
                    this.f52051c.onError(th);
                } catch (Throwable th2) {
                    C88422b.m153670a(th2);
                    C88925a.m154178a(new C88417a(th, th2));
                }
            }
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<T> bVar, C22099u<T> uVar) {
            if (!bVar.isCanceled()) {
                try {
                    this.f52051c.onNext(uVar);
                    if (!bVar.isCanceled()) {
                        this.f52049a = true;
                        this.f52051c.onComplete();
                    }
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    C88925a.m154178a(new C88417a(th, th));
                }
            }
        }
    }

    C22033b(AbstractC21983b<T> bVar) {
        this.f52048a = bVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super C22099u<T>> zVar) {
        AbstractC21983b<T> clone = this.f52048a.clone();
        C22034a aVar = new C22034a(clone, zVar);
        zVar.onSubscribe(aVar);
        clone.enqueue(aVar);
    }
}
