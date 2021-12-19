package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.f.v */
public final class C88838v extends AbstractC88403ab<Long> {

    /* renamed from: a */
    final long f201734a = 8;

    /* renamed from: b */
    final TimeUnit f201735b;

    /* renamed from: c */
    final AbstractC88398aa f201736c;

    static {
        Covode.recordClassIndex(104880);
    }

    /* renamed from: f.a.e.e.f.v$a */
    static final class RunnableC88839a extends AtomicReference<AbstractC88412b> implements AbstractC88412b, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* renamed from: a */
        final AbstractC88406ae<? super Long> f201737a;

        static {
            Covode.recordClassIndex(104881);
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
            this.f201737a.onSuccess(0L);
        }

        RunnableC88839a(AbstractC88406ae<? super Long> aeVar) {
            this.f201737a = aeVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super Long> aeVar) {
        RunnableC88839a aVar = new RunnableC88839a(aeVar);
        aeVar.onSubscribe(aVar);
        EnumC88441b.replace(aVar, this.f201736c.mo20705a(aVar, this.f201734a, this.f201735b));
    }

    public C88838v(TimeUnit timeUnit, AbstractC88398aa aaVar) {
        this.f201735b = timeUnit;
        this.f201736c = aaVar;
    }
}
