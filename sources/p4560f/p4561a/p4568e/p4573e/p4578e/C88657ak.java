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

/* renamed from: f.a.e.e.e.ak */
public final class C88657ak extends AbstractC88979t<Long> {

    /* renamed from: a */
    final AbstractC88398aa f201150a;

    /* renamed from: b */
    final long f201151b;

    /* renamed from: c */
    final long f201152c;

    /* renamed from: d */
    final long f201153d;

    /* renamed from: e */
    final long f201154e;

    /* renamed from: f */
    final TimeUnit f201155f;

    static {
        Covode.recordClassIndex(104699);
    }

    /* renamed from: f.a.e.e.e.ak$a */
    static final class RunnableC88658a extends AtomicReference<AbstractC88412b> implements AbstractC88412b, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* renamed from: a */
        final AbstractC88986z<? super Long> f201156a;

        /* renamed from: b */
        final long f201157b;

        /* renamed from: c */
        long f201158c;

        static {
            Covode.recordClassIndex(104700);
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
            if (!isDisposed()) {
                long j = this.f201158c;
                this.f201156a.onNext(Long.valueOf(j));
                if (j == this.f201157b) {
                    EnumC88441b.dispose(this);
                    this.f201156a.onComplete();
                    return;
                }
                this.f201158c = j + 1;
            }
        }

        RunnableC88658a(AbstractC88986z<? super Long> zVar, long j, long j2) {
            this.f201156a = zVar;
            this.f201158c = j;
            this.f201157b = j2;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super Long> zVar) {
        RunnableC88658a aVar = new RunnableC88658a(zVar, this.f201151b, this.f201152c);
        zVar.onSubscribe(aVar);
        AbstractC88398aa aaVar = this.f201150a;
        if (aaVar instanceof C88883p) {
            AbstractC88398aa.AbstractC88401c a = aaVar.mo20704a();
            EnumC88441b.setOnce(aVar, a);
            a.mo142905a(aVar, this.f201153d, this.f201154e, this.f201155f);
            return;
        }
        EnumC88441b.setOnce(aVar, aaVar.mo142901a(aVar, this.f201153d, this.f201154e, this.f201155f));
    }

    public C88657ak(long j, long j2, long j3, long j4, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        this.f201153d = j3;
        this.f201154e = j4;
        this.f201155f = timeUnit;
        this.f201150a = aaVar;
        this.f201151b = j;
        this.f201152c = j2;
    }
}
