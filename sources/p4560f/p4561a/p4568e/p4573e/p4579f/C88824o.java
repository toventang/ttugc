package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.f.o */
public final class C88824o<T, R> extends AbstractC88403ab<R> {

    /* renamed from: a */
    final AbstractC88408ag<? extends T> f201697a;

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends R> f201698b;

    static {
        Covode.recordClassIndex(104866);
    }

    /* renamed from: f.a.e.e.f.o$a */
    static final class C88825a<T, R> implements AbstractC88406ae<T> {

        /* renamed from: a */
        final AbstractC88406ae<? super R> f201699a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends R> f201700b;

        static {
            Covode.recordClassIndex(104867);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201699a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201699a.onSubscribe(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            try {
                this.f201699a.onSuccess(C88466b.m153697a(this.f201700b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C88422b.m153670a(th);
                onError(th);
            }
        }

        C88825a(AbstractC88406ae<? super R> aeVar, AbstractC88434g<? super T, ? extends R> gVar) {
            this.f201699a = aeVar;
            this.f201700b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super R> aeVar) {
        this.f201697a.mo116431a_(new C88825a(aeVar, this.f201698b));
    }

    public C88824o(AbstractC88408ag<? extends T> agVar, AbstractC88434g<? super T, ? extends R> gVar) {
        this.f201697a = agVar;
        this.f201698b = gVar;
    }
}
