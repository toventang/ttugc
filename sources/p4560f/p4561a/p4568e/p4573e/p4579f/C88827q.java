package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.f.q */
public final class C88827q<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201702a;

    /* renamed from: b */
    final AbstractC88398aa f201703b;

    static {
        Covode.recordClassIndex(104869);
    }

    /* renamed from: f.a.e.e.f.q$a */
    static final class RunnableC88828a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T>, AbstractC88412b, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201704a;

        /* renamed from: b */
        final AbstractC88398aa f201705b;

        /* renamed from: c */
        T f201706c;

        /* renamed from: d */
        Throwable f201707d;

        static {
            Covode.recordClassIndex(104870);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        public final void run() {
            Throwable th = this.f201707d;
            if (th != null) {
                this.f201704a.onError(th);
            } else {
                this.f201704a.onSuccess(this.f201706c);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201707d = th;
            EnumC88441b.replace(this, this.f201705b.mo142900a(this));
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar)) {
                this.f201704a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            this.f201706c = t;
            EnumC88441b.replace(this, this.f201705b.mo142900a(this));
        }

        RunnableC88828a(AbstractC88406ae<? super T> aeVar, AbstractC88398aa aaVar) {
            this.f201704a = aeVar;
            this.f201705b = aaVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201702a.mo116431a_(new RunnableC88828a(aeVar, this.f201703b));
    }

    public C88827q(AbstractC88408ag<T> agVar, AbstractC88398aa aaVar) {
        this.f201702a = agVar;
        this.f201703b = aaVar;
    }
}
