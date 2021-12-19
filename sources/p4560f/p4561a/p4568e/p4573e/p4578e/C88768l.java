package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4586g.C88923c;

/* renamed from: f.a.e.e.e.l */
public final class C88768l<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final long f201544b;

    /* renamed from: c */
    final TimeUnit f201545c;

    /* renamed from: d */
    final AbstractC88398aa f201546d;

    /* renamed from: e */
    final boolean f201547e = false;

    static {
        Covode.recordClassIndex(104810);
    }

    /* renamed from: f.a.e.e.e.l$a */
    static final class C88769a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201548a;

        /* renamed from: b */
        final long f201549b;

        /* renamed from: c */
        final TimeUnit f201550c;

        /* renamed from: d */
        final AbstractC88398aa.AbstractC88401c f201551d;

        /* renamed from: e */
        final boolean f201552e;

        /* renamed from: f */
        AbstractC88412b f201553f;

        static {
            Covode.recordClassIndex(104811);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201551d.isDisposed();
        }

        /* renamed from: f.a.e.e.e.l$a$c */
        final class RunnableC88772c implements Runnable {

            /* renamed from: b */
            private final T f201558b;

            static {
                Covode.recordClassIndex(104814);
            }

            public final void run() {
                C88769a.this.f201548a.onNext(this.f201558b);
            }

            RunnableC88772c(T t) {
                this.f201558b = t;
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201553f.dispose();
            this.f201551d.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201551d.mo20706a(new RunnableC88770a(), this.f201549b, this.f201550c);
        }

        /* renamed from: f.a.e.e.e.l$a$a */
        final class RunnableC88770a implements Runnable {
            static {
                Covode.recordClassIndex(104812);
            }

            public final void run() {
                try {
                    C88769a.this.f201548a.onComplete();
                } finally {
                    C88769a.this.f201551d.dispose();
                }
            }

            RunnableC88770a() {
            }
        }

        /* renamed from: f.a.e.e.e.l$a$b */
        final class RunnableC88771b implements Runnable {

            /* renamed from: b */
            private final Throwable f201556b;

            static {
                Covode.recordClassIndex(104813);
            }

            public final void run() {
                try {
                    C88769a.this.f201548a.onError(this.f201556b);
                } finally {
                    C88769a.this.f201551d.dispose();
                }
            }

            RunnableC88771b(Throwable th) {
                this.f201556b = th;
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201551d.mo20706a(new RunnableC88772c(t), this.f201549b, this.f201550c);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201553f, bVar)) {
                this.f201553f = bVar;
                this.f201548a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            long j;
            AbstractC88398aa.AbstractC88401c cVar = this.f201551d;
            RunnableC88771b bVar = new RunnableC88771b(th);
            if (this.f201552e) {
                j = this.f201549b;
            } else {
                j = 0;
            }
            cVar.mo20706a(bVar, j, this.f201550c);
        }

        C88769a(AbstractC88986z<? super T> zVar, long j, TimeUnit timeUnit, AbstractC88398aa.AbstractC88401c cVar, boolean z) {
            this.f201548a = zVar;
            this.f201549b = j;
            this.f201550c = timeUnit;
            this.f201551d = cVar;
            this.f201552e = z;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        AbstractC88986z<? super T> zVar2;
        if (!this.f201547e) {
            zVar2 = new C88923c<>(zVar);
        } else {
            zVar2 = zVar;
        }
        this.f201095a.mo143062b(new C88769a(zVar2, this.f201544b, this.f201545c, this.f201546d.mo20704a(), this.f201547e));
    }

    public C88768l(AbstractC88984x<T> xVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        super(xVar);
        this.f201544b = j;
        this.f201545c = timeUnit;
        this.f201546d = aaVar;
    }
}
