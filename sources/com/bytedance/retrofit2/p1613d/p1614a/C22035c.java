package com.bytedance.retrofit2.p1613d.p1614a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.retrofit2.d.a.c */
final class C22035c<T> extends AbstractC88979t<C22099u<T>> {

    /* renamed from: a */
    private final AbstractC21983b<T> f52052a;

    static {
        Covode.recordClassIndex(25725);
    }

    /* renamed from: com.bytedance.retrofit2.d.a.c$a */
    static final class C22036a implements AbstractC88412b {

        /* renamed from: a */
        private final AbstractC21983b<?> f52053a;

        static {
            Covode.recordClassIndex(25726);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f52053a.cancel();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f52053a.isCanceled();
        }

        C22036a(AbstractC21983b<?> bVar) {
            this.f52053a = bVar;
        }
    }

    C22035c(AbstractC21983b<T> bVar) {
        this.f52052a = bVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super C22099u<T>> zVar) {
        Throwable th;
        boolean z;
        AbstractC21983b<T> clone = this.f52052a.clone();
        zVar.onSubscribe(new C22036a(clone));
        try {
            C22099u<T> execute = clone.execute();
            if (!clone.isCanceled()) {
                zVar.onNext(execute);
            }
            if (!clone.isCanceled()) {
                try {
                    zVar.onComplete();
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
            C88422b.m153670a(th);
            if (z) {
                C88925a.m154178a(th);
            } else if (!clone.isCanceled()) {
                try {
                    zVar.onError(th);
                } catch (Throwable th4) {
                    C88422b.m153670a(th4);
                    C88925a.m154178a(new C88417a(th, th4));
                }
            }
        }
    }
}
