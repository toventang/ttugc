package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.e.bm */
public final class C88732bm<T, U extends Collection<? super T>> extends AbstractC88637a<T, U> {

    /* renamed from: b */
    final Callable<U> f201376b;

    static {
        Covode.recordClassIndex(104774);
    }

    /* renamed from: f.a.e.e.e.bm$a */
    static final class C88733a<T, U extends Collection<? super T>> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super U> f201377a;

        /* renamed from: b */
        AbstractC88412b f201378b;

        /* renamed from: c */
        U f201379c;

        static {
            Covode.recordClassIndex(104775);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201378b.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201378b.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            U u = this.f201379c;
            this.f201379c = null;
            this.f201377a.onNext(u);
            this.f201377a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201379c.add(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201379c = null;
            this.f201377a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201378b, bVar)) {
                this.f201378b = bVar;
                this.f201377a.onSubscribe(this);
            }
        }

        C88733a(AbstractC88986z<? super U> zVar, U u) {
            this.f201377a = zVar;
            this.f201379c = u;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super U> zVar) {
        try {
            this.f201095a.mo143062b(new C88733a(zVar, (Collection) C88466b.m153697a((Object) this.f201376b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C88422b.m153670a(th);
            EnumC88442c.error(th, zVar);
        }
    }

    public C88732bm(AbstractC88984x<T> xVar, Callable<U> callable) {
        super(xVar);
        this.f201376b = callable;
    }
}
