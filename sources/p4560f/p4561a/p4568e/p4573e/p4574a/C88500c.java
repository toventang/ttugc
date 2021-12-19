package p4560f.p4561a.p4568e.p4573e.p4574a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.a.c */
public final class C88500c extends AbstractC88410b {

    /* renamed from: a */
    final AbstractC88917f f200760a;

    /* renamed from: b */
    final long f200761b;

    /* renamed from: c */
    final TimeUnit f200762c;

    /* renamed from: d */
    final AbstractC88398aa f200763d;

    /* renamed from: e */
    final boolean f200764e = false;

    static {
        Covode.recordClassIndex(104542);
    }

    /* renamed from: f.a.e.e.a.c$a */
    static final class RunnableC88501a extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88427d, Runnable {
        private static final long serialVersionUID = 465972761105851022L;

        /* renamed from: a */
        final AbstractC88427d f200765a;

        /* renamed from: b */
        final long f200766b;

        /* renamed from: c */
        final TimeUnit f200767c;

        /* renamed from: d */
        final AbstractC88398aa f200768d;

        /* renamed from: e */
        final boolean f200769e;

        /* renamed from: f */
        Throwable f200770f;

        static {
            Covode.recordClassIndex(104543);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onComplete() {
            EnumC88441b.replace(this, this.f200768d.mo20705a(this, this.f200766b, this.f200767c));
        }

        public final void run() {
            Throwable th = this.f200770f;
            this.f200770f = null;
            if (th != null) {
                this.f200765a.onError(th);
            } else {
                this.f200765a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar)) {
                this.f200765a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onError(Throwable th) {
            long j;
            this.f200770f = th;
            AbstractC88398aa aaVar = this.f200768d;
            if (this.f200769e) {
                j = this.f200766b;
            } else {
                j = 0;
            }
            EnumC88441b.replace(this, aaVar.mo20705a(this, j, this.f200767c));
        }

        RunnableC88501a(AbstractC88427d dVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar, boolean z) {
            this.f200765a = dVar;
            this.f200766b = j;
            this.f200767c = timeUnit;
            this.f200768d = aaVar;
            this.f200769e = z;
        }
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        this.f200760a.mo17931a(new RunnableC88501a(dVar, this.f200761b, this.f200762c, this.f200763d, this.f200764e));
    }

    public C88500c(AbstractC88917f fVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        this.f200760a = fVar;
        this.f200761b = j;
        this.f200762c = timeUnit;
        this.f200763d = aaVar;
    }
}
