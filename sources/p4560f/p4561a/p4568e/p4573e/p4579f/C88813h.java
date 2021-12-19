package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: f.a.e.e.f.h */
public final class C88813h<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201680a;

    /* renamed from: b */
    final AbstractC88433f<? super T> f201681b;

    static {
        Covode.recordClassIndex(104855);
    }

    /* renamed from: f.a.e.e.f.h$a */
    final class C88814a implements AbstractC88406ae<T> {

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201682a;

        static {
            Covode.recordClassIndex(104856);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201682a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201682a.onSubscribe(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            try {
                C88813h.this.f201681b.accept(t);
                this.f201682a.onSuccess(t);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201682a.onError(th);
            }
        }

        C88814a(AbstractC88406ae<? super T> aeVar) {
            this.f201682a = aeVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201680a.mo116431a_(new C88814a(aeVar));
    }

    public C88813h(AbstractC88408ag<T> agVar, AbstractC88433f<? super T> fVar) {
        this.f201680a = agVar;
        this.f201681b = fVar;
    }
}
