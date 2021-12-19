package p4560f.p4561a.p4568e.p4573e.p4577d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.d.a */
public final class C88635a<T, R> extends AbstractC88979t<R> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201091a;

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> f201092b;

    static {
        Covode.recordClassIndex(104677);
    }

    /* renamed from: f.a.e.e.d.a$a */
    static final class C88636a<T, R> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T>, AbstractC88412b, AbstractC88986z<R> {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: a */
        final AbstractC88986z<? super R> f201093a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> f201094b;

        static {
            Covode.recordClassIndex(104678);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201093a.onComplete();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88986z, p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.replace(this, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z, p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201093a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(R r) {
            this.f201093a.onNext(r);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            try {
                ((AbstractC88984x) C88466b.m153697a(this.f201094b.apply(t), "The mapper returned a null Publisher")).mo143062b(this);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201093a.onError(th);
            }
        }

        C88636a(AbstractC88986z<? super R> zVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar) {
            this.f201093a = zVar;
            this.f201094b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super R> zVar) {
        C88636a aVar = new C88636a(zVar, this.f201092b);
        zVar.onSubscribe(aVar);
        this.f201091a.mo116431a_(aVar);
    }

    public C88635a(AbstractC88408ag<T> agVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar) {
        this.f201091a = agVar;
        this.f201092b = gVar;
    }
}
