package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.C88445f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.f.t */
public final class C88833t<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<? extends T> f201717a;

    /* renamed from: b */
    final AbstractC88398aa f201718b;

    static {
        Covode.recordClassIndex(104875);
    }

    /* renamed from: f.a.e.e.f.t$a */
    static final class RunnableC88834a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T>, AbstractC88412b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201719a;

        /* renamed from: b */
        final C88445f f201720b = new C88445f();

        /* renamed from: c */
        final AbstractC88408ag<? extends T> f201721c;

        static {
            Covode.recordClassIndex(104876);
        }

        public final void run() {
            this.f201721c.mo116431a_(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
            this.f201720b.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201719a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            this.f201719a.onSuccess(t);
        }

        RunnableC88834a(AbstractC88406ae<? super T> aeVar, AbstractC88408ag<? extends T> agVar) {
            this.f201719a = aeVar;
            this.f201721c = agVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        RunnableC88834a aVar = new RunnableC88834a(aeVar, this.f201717a);
        aeVar.onSubscribe(aVar);
        aVar.f201720b.replace(this.f201718b.mo142900a(aVar));
    }

    public C88833t(AbstractC88408ag<? extends T> agVar, AbstractC88398aa aaVar) {
        this.f201717a = agVar;
        this.f201718b = aaVar;
    }
}
