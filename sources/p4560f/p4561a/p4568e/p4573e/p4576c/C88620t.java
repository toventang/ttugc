package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.c.t */
public final class C88620t<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88977r<T> f201067a;

    /* renamed from: b */
    final AbstractC88408ag<? extends T> f201068b;

    static {
        Covode.recordClassIndex(104662);
    }

    /* renamed from: f.a.e.e.c.t$a */
    static final class C88621a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88975p<T> {
        private static final long serialVersionUID = 4603919676453758899L;

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201069a;

        /* renamed from: b */
        final AbstractC88408ag<? extends T> f201070b;

        static {
            Covode.recordClassIndex(104663);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            Object obj = get();
            if (obj != EnumC88441b.DISPOSED && compareAndSet(obj, null)) {
                this.f201070b.mo116431a_(new C88622a(this.f201069a, this));
            }
        }

        /* renamed from: f.a.e.e.c.t$a$a */
        static final class C88622a<T> implements AbstractC88406ae<T> {

            /* renamed from: a */
            final AbstractC88406ae<? super T> f201071a;

            /* renamed from: b */
            final AtomicReference<AbstractC88412b> f201072b;

            static {
                Covode.recordClassIndex(104664);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                this.f201071a.onError(th);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                EnumC88441b.setOnce(this.f201072b, bVar);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSuccess(T t) {
                this.f201071a.onSuccess(t);
            }

            C88622a(AbstractC88406ae<? super T> aeVar, AtomicReference<AbstractC88412b> atomicReference) {
                this.f201071a = aeVar;
                this.f201072b = atomicReference;
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201069a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            this.f201069a.onSuccess(t);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar)) {
                this.f201069a.onSubscribe(this);
            }
        }

        C88621a(AbstractC88406ae<? super T> aeVar, AbstractC88408ag<? extends T> agVar) {
            this.f201069a = aeVar;
            this.f201070b = agVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201067a.mo143239a(new C88621a(aeVar, this.f201068b));
    }

    public C88620t(AbstractC88977r<T> rVar, AbstractC88408ag<? extends T> agVar) {
        this.f201067a = rVar;
        this.f201068b = agVar;
    }
}
