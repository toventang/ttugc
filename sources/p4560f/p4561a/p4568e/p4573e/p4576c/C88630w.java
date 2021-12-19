package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.c.w */
public final class C88630w extends AbstractC88973n<Long> {

    /* renamed from: a */
    final long f201085a;

    /* renamed from: b */
    final TimeUnit f201086b;

    /* renamed from: c */
    final AbstractC88398aa f201087c;

    static {
        Covode.recordClassIndex(104672);
    }

    /* renamed from: f.a.e.e.c.w$a */
    static final class RunnableC88631a extends AtomicReference<AbstractC88412b> implements AbstractC88412b, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* renamed from: a */
        final AbstractC88975p<? super Long> f201088a;

        static {
            Covode.recordClassIndex(104673);
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
            this.f201088a.onSuccess(0L);
        }

        RunnableC88631a(AbstractC88975p<? super Long> pVar) {
            this.f201088a = pVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super Long> pVar) {
        RunnableC88631a aVar = new RunnableC88631a(pVar);
        pVar.onSubscribe(aVar);
        EnumC88441b.replace(aVar, this.f201087c.mo20705a(aVar, this.f201085a, this.f201086b));
    }

    public C88630w(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        this.f201085a = j;
        this.f201086b = timeUnit;
        this.f201087c = aaVar;
    }
}
