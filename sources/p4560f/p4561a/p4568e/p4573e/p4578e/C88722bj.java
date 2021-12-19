package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4586g.C88923c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.bj */
public final class C88722bj<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final long f201340b;

    /* renamed from: c */
    final TimeUnit f201341c;

    /* renamed from: d */
    final AbstractC88398aa f201342d;

    static {
        Covode.recordClassIndex(104764);
    }

    /* renamed from: f.a.e.e.e.bj$a */
    static final class RunnableC88723a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88986z<T>, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201343a;

        /* renamed from: b */
        final long f201344b;

        /* renamed from: c */
        final TimeUnit f201345c;

        /* renamed from: d */
        final AbstractC88398aa.AbstractC88401c f201346d;

        /* renamed from: e */
        AbstractC88412b f201347e;

        /* renamed from: f */
        volatile boolean f201348f;

        /* renamed from: g */
        boolean f201349g;

        static {
            Covode.recordClassIndex(104765);
        }

        public final void run() {
            this.f201348f = false;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201346d.isDisposed();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201347e.dispose();
            this.f201346d.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201349g) {
                this.f201349g = true;
                this.f201343a.onComplete();
                this.f201346d.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201347e, bVar)) {
                this.f201347e = bVar;
                this.f201343a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201349g) {
                C88925a.m154178a(th);
                return;
            }
            this.f201349g = true;
            this.f201343a.onError(th);
            this.f201346d.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201348f && !this.f201349g) {
                this.f201348f = true;
                this.f201343a.onNext(t);
                AbstractC88412b bVar = (AbstractC88412b) get();
                if (bVar != null) {
                    bVar.dispose();
                }
                EnumC88441b.replace(this, this.f201346d.mo20706a(this, this.f201344b, this.f201345c));
            }
        }

        RunnableC88723a(AbstractC88986z<? super T> zVar, long j, TimeUnit timeUnit, AbstractC88398aa.AbstractC88401c cVar) {
            this.f201343a = zVar;
            this.f201344b = j;
            this.f201345c = timeUnit;
            this.f201346d = cVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new RunnableC88723a(new C88923c(zVar), this.f201340b, this.f201341c, this.f201342d.mo20704a()));
    }

    public C88722bj(AbstractC88984x<T> xVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        super(xVar);
        this.f201340b = j;
        this.f201341c = timeUnit;
        this.f201342d = aaVar;
    }
}
