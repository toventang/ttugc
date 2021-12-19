package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.f.m */
public final class C88821m<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<? extends T> f201693a;

    static {
        Covode.recordClassIndex(104863);
    }

    /* renamed from: f.a.e.e.f.m$a */
    static final class C88822a<T> implements AbstractC88406ae<T>, AbstractC88412b {

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201694a;

        /* renamed from: b */
        AbstractC88412b f201695b;

        static {
            Covode.recordClassIndex(104864);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201695b.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201695b.isDisposed();
        }

        C88822a(AbstractC88406ae<? super T> aeVar) {
            this.f201694a = aeVar;
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201694a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            this.f201694a.onSuccess(t);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201695b, bVar)) {
                this.f201695b = bVar;
                this.f201694a.onSubscribe(this);
            }
        }
    }

    public C88821m(AbstractC88408ag<? extends T> agVar) {
        this.f201693a = agVar;
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201693a.mo116431a_(new C88822a(aeVar));
    }
}
