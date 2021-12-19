package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88423c;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4581g.C88883p;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;

/* renamed from: f.a.e.e.b.n */
public final class C88555n extends AbstractC88924h<Long> {

    /* renamed from: b */
    final AbstractC88398aa f200913b;

    /* renamed from: c */
    final long f200914c;

    /* renamed from: d */
    final long f200915d;

    /* renamed from: e */
    final TimeUnit f200916e;

    static {
        Covode.recordClassIndex(104597);
    }

    /* renamed from: f.a.e.e.b.n$a */
    static final class RunnableC88556a extends AtomicLong implements Runnable, AbstractC90215d {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: a */
        final AbstractC90214c<? super Long> f200917a;

        /* renamed from: b */
        long f200918b;

        /* renamed from: c */
        final AtomicReference<AbstractC88412b> f200919c = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104598);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            EnumC88441b.dispose(this.f200919c);
        }

        public final void run() {
            if (this.f200919c.get() == EnumC88441b.DISPOSED) {
                return;
            }
            if (get() != 0) {
                AbstractC90214c<? super Long> cVar = this.f200917a;
                long j = this.f200918b;
                this.f200918b = j + 1;
                cVar.onNext(Long.valueOf(j));
                C88902d.m154099b(this, 1);
                return;
            }
            this.f200917a.onError(new C88423c("Can't deliver value " + this.f200918b + " due to lack of requests"));
            EnumC88441b.dispose(this.f200919c);
        }

        /* renamed from: a */
        public final void mo143038a(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this.f200919c, bVar);
        }

        RunnableC88556a(AbstractC90214c<? super Long> cVar) {
            this.f200917a = cVar;
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                C88902d.m154098a(this, j);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super Long> cVar) {
        RunnableC88556a aVar = new RunnableC88556a(cVar);
        cVar.onSubscribe(aVar);
        AbstractC88398aa aaVar = this.f200913b;
        if (aaVar instanceof C88883p) {
            AbstractC88398aa.AbstractC88401c a = aaVar.mo20704a();
            aVar.mo143038a(a);
            a.mo142905a(aVar, this.f200914c, this.f200915d, this.f200916e);
            return;
        }
        aVar.mo143038a(aaVar.mo142901a(aVar, this.f200914c, this.f200915d, this.f200916e));
    }

    public C88555n(long j, long j2, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        this.f200914c = j;
        this.f200915d = j2;
        this.f200916e = timeUnit;
        this.f200913b = aaVar;
    }
}
