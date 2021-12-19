package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88470c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.bn */
public final class C88734bn<T, U extends Collection<? super T>> extends AbstractC88403ab<U> implements AbstractC88470c<U> {

    /* renamed from: a */
    final AbstractC88984x<T> f201380a;

    /* renamed from: b */
    final Callable<U> f201381b = new C88446a.CallableC88449c(16);

    static {
        Covode.recordClassIndex(104776);
    }

    /* renamed from: f.a.e.e.e.bn$a */
    static final class C88735a<T, U extends Collection<? super T>> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88406ae<? super U> f201382a;

        /* renamed from: b */
        U f201383b;

        /* renamed from: c */
        AbstractC88412b f201384c;

        static {
            Covode.recordClassIndex(104777);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201384c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201384c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            U u = this.f201383b;
            this.f201383b = null;
            this.f201382a.onSuccess(u);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201383b.add(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201383b = null;
            this.f201382a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201384c, bVar)) {
                this.f201384c = bVar;
                this.f201382a.onSubscribe(this);
            }
        }

        C88735a(AbstractC88406ae<? super U> aeVar, U u) {
            this.f201382a = aeVar;
            this.f201383b = u;
        }
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88470c
    /* renamed from: a */
    public final AbstractC88979t<U> mo142983a() {
        return C88925a.m154171a(new C88732bm(this.f201380a, this.f201381b));
    }

    public C88734bn(AbstractC88984x<T> xVar) {
        this.f201380a = xVar;
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super U> aeVar) {
        try {
            this.f201380a.mo143062b(new C88735a(aeVar, (Collection) C88466b.m153697a((Object) this.f201381b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C88422b.m153670a(th);
            EnumC88442c.error(th, aeVar);
        }
    }
}
