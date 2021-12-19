package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4581g.C88883p;

/* renamed from: f.a.e.e.e.aj */
public final class C88655aj extends AbstractC88979t<Long> {

    /* renamed from: a */
    final AbstractC88398aa f201144a;

    /* renamed from: b */
    final long f201145b;

    /* renamed from: c */
    final long f201146c;

    /* renamed from: d */
    final TimeUnit f201147d;

    static {
        Covode.recordClassIndex(104697);
    }

    /* renamed from: f.a.e.e.e.aj$a */
    static final class RunnableC88656a extends AtomicReference<AbstractC88412b> implements AbstractC88412b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: a */
        final AbstractC88986z<? super Long> f201148a;

        /* renamed from: b */
        long f201149b;

        static {
            Covode.recordClassIndex(104698);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (get() == EnumC88441b.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void run() {
            if (get() != EnumC88441b.DISPOSED) {
                AbstractC88986z<? super Long> zVar = this.f201148a;
                long j = this.f201149b;
                this.f201149b = 1 + j;
                zVar.onNext(Long.valueOf(j));
            }
        }

        RunnableC88656a(AbstractC88986z<? super Long> zVar) {
            this.f201148a = zVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super Long> zVar) {
        RunnableC88656a aVar = new RunnableC88656a(zVar);
        zVar.onSubscribe(aVar);
        AbstractC88398aa aaVar = this.f201144a;
        if (aaVar instanceof C88883p) {
            AbstractC88398aa.AbstractC88401c a = aaVar.mo20704a();
            EnumC88441b.setOnce(aVar, a);
            a.mo142905a(aVar, this.f201145b, this.f201146c, this.f201147d);
            return;
        }
        EnumC88441b.setOnce(aVar, aaVar.mo142901a(aVar, this.f201145b, this.f201146c, this.f201147d));
    }

    public C88655aj(long j, long j2, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        this.f201145b = j;
        this.f201146c = j2;
        this.f201147d = timeUnit;
        this.f201144a = aaVar;
    }
}
