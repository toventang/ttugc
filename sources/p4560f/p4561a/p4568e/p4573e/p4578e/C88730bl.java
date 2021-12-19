package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;

/* renamed from: f.a.e.e.e.bl */
public final class C88730bl extends AbstractC88979t<Long> {

    /* renamed from: a */
    final AbstractC88398aa f201372a;

    /* renamed from: b */
    final long f201373b;

    /* renamed from: c */
    final TimeUnit f201374c;

    static {
        Covode.recordClassIndex(104772);
    }

    /* renamed from: f.a.e.e.e.bl$a */
    static final class RunnableC88731a extends AtomicReference<AbstractC88412b> implements AbstractC88412b, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final AbstractC88986z<? super Long> f201375a;

        static {
            Covode.recordClassIndex(104773);
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
                this.f201375a.onNext(0L);
                lazySet(EnumC88442c.INSTANCE);
                this.f201375a.onComplete();
            }
        }

        RunnableC88731a(AbstractC88986z<? super Long> zVar) {
            this.f201375a = zVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super Long> zVar) {
        RunnableC88731a aVar = new RunnableC88731a(zVar);
        zVar.onSubscribe(aVar);
        EnumC88441b.trySet(aVar, this.f201372a.mo20705a(aVar, this.f201373b, this.f201374c));
    }

    public C88730bl(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        this.f201373b = j;
        this.f201374c = timeUnit;
        this.f201372a = aaVar;
    }
}
