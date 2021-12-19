package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.f.d */
public final class C88805d<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201663a;

    /* renamed from: b */
    final AbstractC88428a f201664b;

    static {
        Covode.recordClassIndex(104847);
    }

    /* renamed from: f.a.e.e.f.d$a */
    static final class C88806a<T> extends AtomicReference<AbstractC88428a> implements AbstractC88406ae<T>, AbstractC88412b {
        private static final long serialVersionUID = -8583764624474935784L;

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201665a;

        /* renamed from: b */
        AbstractC88412b f201666b;

        static {
            Covode.recordClassIndex(104848);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201666b.isDisposed();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            AbstractC88428a aVar = (AbstractC88428a) getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.mo8579a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    C88925a.m154178a(th);
                }
                this.f201666b.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201665a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            this.f201665a.onSuccess(t);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201666b, bVar)) {
                this.f201666b = bVar;
                this.f201665a.onSubscribe(this);
            }
        }

        C88806a(AbstractC88406ae<? super T> aeVar, AbstractC88428a aVar) {
            this.f201665a = aeVar;
            lazySet(aVar);
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201663a.mo116431a_(new C88806a(aeVar, this.f201664b));
    }

    public C88805d(AbstractC88408ag<T> agVar, AbstractC88428a aVar) {
        this.f201663a = agVar;
        this.f201664b = aVar;
    }
}
