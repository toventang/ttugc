package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.c.o */
public final class C88609o<T> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC88398aa f201040b;

    static {
        Covode.recordClassIndex(104651);
    }

    /* renamed from: f.a.e.e.c.o$a */
    static final class RunnableC88610a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88975p<T>, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final AbstractC88975p<? super T> f201041a;

        /* renamed from: b */
        final AbstractC88398aa f201042b;

        /* renamed from: c */
        T f201043c;

        /* renamed from: d */
        Throwable f201044d;

        static {
            Covode.recordClassIndex(104652);
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
            EnumC88441b.replace(this, this.f201042b.mo142900a(this));
        }

        public final void run() {
            Throwable th = this.f201044d;
            if (th != null) {
                this.f201044d = null;
                this.f201041a.onError(th);
                return;
            }
            T t = this.f201043c;
            if (t != null) {
                this.f201043c = null;
                this.f201041a.onSuccess(t);
                return;
            }
            this.f201041a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201044d = th;
            EnumC88441b.replace(this, this.f201042b.mo142900a(this));
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar)) {
                this.f201041a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            this.f201043c = t;
            EnumC88441b.replace(this, this.f201042b.mo142900a(this));
        }

        RunnableC88610a(AbstractC88975p<? super T> pVar, AbstractC88398aa aaVar) {
            this.f201041a = pVar;
            this.f201042b = aaVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f200998a.mo143239a(new RunnableC88610a(pVar, this.f201040b));
    }

    public C88609o(AbstractC88977r<T> rVar, AbstractC88398aa aaVar) {
        super(rVar);
        this.f201040b = aaVar;
    }
}
