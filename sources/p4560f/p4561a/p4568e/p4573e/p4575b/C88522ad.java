package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88423c;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;

/* renamed from: f.a.e.e.b.ad */
public final class C88522ad extends AbstractC88924h<Long> {

    /* renamed from: b */
    final AbstractC88398aa f200822b;

    /* renamed from: c */
    final long f200823c;

    /* renamed from: d */
    final TimeUnit f200824d;

    static {
        Covode.recordClassIndex(104564);
    }

    /* renamed from: f.a.e.e.b.ad$a */
    static final class RunnableC88523a extends AtomicReference<AbstractC88412b> implements Runnable, AbstractC90215d {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final AbstractC90214c<? super Long> f200825a;

        /* renamed from: b */
        volatile boolean f200826b;

        static {
            Covode.recordClassIndex(104565);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            EnumC88441b.dispose(this);
        }

        public final void run() {
            if (get() == EnumC88441b.DISPOSED) {
                return;
            }
            if (this.f200826b) {
                this.f200825a.onNext(0L);
                lazySet(EnumC88442c.INSTANCE);
                this.f200825a.onComplete();
                return;
            }
            lazySet(EnumC88442c.INSTANCE);
            this.f200825a.onError(new C88423c("Can't deliver value due to lack of requests"));
        }

        RunnableC88523a(AbstractC90214c<? super Long> cVar) {
            this.f200825a = cVar;
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                this.f200826b = true;
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super Long> cVar) {
        RunnableC88523a aVar = new RunnableC88523a(cVar);
        cVar.onSubscribe(aVar);
        EnumC88441b.trySet(aVar, this.f200822b.mo20705a(aVar, this.f200823c, this.f200824d));
    }

    public C88522ad(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        this.f200823c = j;
        this.f200824d = timeUnit;
        this.f200822b = aaVar;
    }
}
