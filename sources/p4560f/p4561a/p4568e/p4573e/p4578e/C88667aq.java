package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.e.aq */
public final class C88667aq<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88434g<? super Throwable, ? extends T> f201185b;

    static {
        Covode.recordClassIndex(104709);
    }

    /* renamed from: f.a.e.e.e.aq$a */
    static final class C88668a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201186a;

        /* renamed from: b */
        final AbstractC88434g<? super Throwable, ? extends T> f201187b;

        /* renamed from: c */
        AbstractC88412b f201188c;

        static {
            Covode.recordClassIndex(104710);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201188c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201188c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201186a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201186a.onNext(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201188c, bVar)) {
                this.f201188c = bVar;
                this.f201186a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            try {
                Object apply = this.f201187b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f201186a.onError(nullPointerException);
                    return;
                }
                this.f201186a.onNext(apply);
                this.f201186a.onComplete();
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f201186a.onError(new C88417a(th, th2));
            }
        }

        C88668a(AbstractC88986z<? super T> zVar, AbstractC88434g<? super Throwable, ? extends T> gVar) {
            this.f201186a = zVar;
            this.f201187b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88668a(zVar, this.f201185b));
    }

    public C88667aq(AbstractC88984x<T> xVar, AbstractC88434g<? super Throwable, ? extends T> gVar) {
        super(xVar);
        this.f201185b = gVar;
    }
}
