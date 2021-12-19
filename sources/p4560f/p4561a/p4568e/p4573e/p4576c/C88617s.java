package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.C88445f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.c.s */
public final class C88617s<T> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC88398aa f201062b;

    static {
        Covode.recordClassIndex(104659);
    }

    /* renamed from: f.a.e.e.c.s$a */
    static final class C88618a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88975p<T> {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final C88445f f201063a = new C88445f();

        /* renamed from: b */
        final AbstractC88975p<? super T> f201064b;

        static {
            Covode.recordClassIndex(104660);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201064b.onComplete();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
            this.f201063a.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201064b.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            this.f201064b.onSuccess(t);
        }

        C88618a(AbstractC88975p<? super T> pVar) {
            this.f201064b = pVar;
        }
    }

    /* renamed from: f.a.e.e.c.s$b */
    static final class RunnableC88619b<T> implements Runnable {

        /* renamed from: a */
        final AbstractC88975p<? super T> f201065a;

        /* renamed from: b */
        final AbstractC88977r<T> f201066b;

        static {
            Covode.recordClassIndex(104661);
        }

        public final void run() {
            this.f201066b.mo143239a(this.f201065a);
        }

        RunnableC88619b(AbstractC88975p<? super T> pVar, AbstractC88977r<T> rVar) {
            this.f201065a = pVar;
            this.f201066b = rVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        C88618a aVar = new C88618a(pVar);
        pVar.onSubscribe(aVar);
        aVar.f201063a.replace(this.f201062b.mo142900a(new RunnableC88619b(aVar, this.f200998a)));
    }

    public C88617s(AbstractC88977r<T> rVar, AbstractC88398aa aaVar) {
        super(rVar);
        this.f201062b = aaVar;
    }
}
