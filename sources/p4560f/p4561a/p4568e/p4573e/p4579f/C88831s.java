package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.C88496t;

/* renamed from: f.a.e.e.f.s */
public final class C88831s<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<? extends T> f201713a;

    /* renamed from: b */
    final AbstractC88434g<? super Throwable, ? extends AbstractC88408ag<? extends T>> f201714b;

    static {
        Covode.recordClassIndex(104873);
    }

    /* renamed from: f.a.e.e.f.s$a */
    static final class C88832a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T>, AbstractC88412b {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201715a;

        /* renamed from: b */
        final AbstractC88434g<? super Throwable, ? extends AbstractC88408ag<? extends T>> f201716b;

        static {
            Covode.recordClassIndex(104874);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            this.f201715a.onSuccess(t);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar)) {
                this.f201715a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            try {
                ((AbstractC88408ag) C88466b.m153697a(this.f201716b.apply(th), "The nextFunction returned a null SingleSource.")).mo116431a_(new C88496t(this, this.f201715a));
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f201715a.onError(new C88417a(th, th2));
            }
        }

        C88832a(AbstractC88406ae<? super T> aeVar, AbstractC88434g<? super Throwable, ? extends AbstractC88408ag<? extends T>> gVar) {
            this.f201715a = aeVar;
            this.f201716b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201713a.mo116431a_(new C88832a(aeVar, this.f201714b));
    }

    public C88831s(AbstractC88408ag<? extends T> agVar, AbstractC88434g<? super Throwable, ? extends AbstractC88408ag<? extends T>> gVar) {
        this.f201713a = agVar;
        this.f201714b = gVar;
    }
}
