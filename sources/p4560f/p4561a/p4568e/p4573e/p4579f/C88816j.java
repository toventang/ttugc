package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.f.j */
public final class C88816j<T, R> extends AbstractC88403ab<R> {

    /* renamed from: a */
    final AbstractC88408ag<? extends T> f201685a;

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends AbstractC88408ag<? extends R>> f201686b;

    static {
        Covode.recordClassIndex(104858);
    }

    /* renamed from: f.a.e.e.f.j$a */
    static final class C88817a<T, R> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T>, AbstractC88412b {
        private static final long serialVersionUID = 3258103020495908596L;

        /* renamed from: a */
        final AbstractC88406ae<? super R> f201687a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88408ag<? extends R>> f201688b;

        static {
            Covode.recordClassIndex(104859);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        /* renamed from: f.a.e.e.f.j$a$a */
        static final class C88818a<R> implements AbstractC88406ae<R> {

            /* renamed from: a */
            final AtomicReference<AbstractC88412b> f201689a;

            /* renamed from: b */
            final AbstractC88406ae<? super R> f201690b;

            static {
                Covode.recordClassIndex(104860);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                this.f201690b.onError(th);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                EnumC88441b.replace(this.f201689a, bVar);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSuccess(R r) {
                this.f201690b.onSuccess(r);
            }

            C88818a(AtomicReference<AbstractC88412b> atomicReference, AbstractC88406ae<? super R> aeVar) {
                this.f201689a = atomicReference;
                this.f201690b = aeVar;
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201687a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar)) {
                this.f201687a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            try {
                AbstractC88408ag agVar = (AbstractC88408ag) C88466b.m153697a(this.f201688b.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    agVar.mo116431a_(new C88818a(this, this.f201687a));
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201687a.onError(th);
            }
        }

        C88817a(AbstractC88406ae<? super R> aeVar, AbstractC88434g<? super T, ? extends AbstractC88408ag<? extends R>> gVar) {
            this.f201687a = aeVar;
            this.f201688b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super R> aeVar) {
        this.f201685a.mo116431a_(new C88817a(aeVar, this.f201686b));
    }

    public C88816j(AbstractC88408ag<? extends T> agVar, AbstractC88434g<? super T, ? extends AbstractC88408ag<? extends R>> gVar) {
        this.f201686b = gVar;
        this.f201685a = agVar;
    }
}
