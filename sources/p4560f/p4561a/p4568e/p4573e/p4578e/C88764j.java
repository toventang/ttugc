package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4586g.C88923c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.j */
public final class C88764j<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final long f201528b;

    /* renamed from: c */
    final TimeUnit f201529c;

    /* renamed from: d */
    final AbstractC88398aa f201530d;

    static {
        Covode.recordClassIndex(104806);
    }

    /* renamed from: f.a.e.e.e.j$a */
    static final class RunnableC88765a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: a */
        final T f201531a;

        /* renamed from: b */
        final long f201532b;

        /* renamed from: c */
        final C88766b<T> f201533c;

        /* renamed from: d */
        final AtomicBoolean f201534d = new AtomicBoolean();

        static {
            Covode.recordClassIndex(104807);
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
            if (this.f201534d.compareAndSet(false, true)) {
                C88766b<T> bVar = this.f201533c;
                long j = this.f201532b;
                T t = this.f201531a;
                if (j == bVar.f201541g) {
                    bVar.f201535a.onNext(t);
                    dispose();
                }
            }
        }

        RunnableC88765a(T t, long j, C88766b<T> bVar) {
            this.f201531a = t;
            this.f201532b = j;
            this.f201533c = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.j$b */
    public static final class C88766b<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201535a;

        /* renamed from: b */
        final long f201536b;

        /* renamed from: c */
        final TimeUnit f201537c;

        /* renamed from: d */
        final AbstractC88398aa.AbstractC88401c f201538d;

        /* renamed from: e */
        AbstractC88412b f201539e;

        /* renamed from: f */
        AbstractC88412b f201540f;

        /* renamed from: g */
        volatile long f201541g;

        /* renamed from: h */
        boolean f201542h;

        static {
            Covode.recordClassIndex(104808);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201538d.isDisposed();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201539e.dispose();
            this.f201538d.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201542h) {
                this.f201542h = true;
                AbstractC88412b bVar = this.f201540f;
                if (bVar != null) {
                    bVar.dispose();
                }
                RunnableC88765a aVar = (RunnableC88765a) bVar;
                if (aVar != null) {
                    aVar.run();
                }
                this.f201535a.onComplete();
                this.f201538d.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201539e, bVar)) {
                this.f201539e = bVar;
                this.f201535a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201542h) {
                C88925a.m154178a(th);
                return;
            }
            AbstractC88412b bVar = this.f201540f;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f201542h = true;
            this.f201535a.onError(th);
            this.f201538d.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201542h) {
                long j = this.f201541g + 1;
                this.f201541g = j;
                AbstractC88412b bVar = this.f201540f;
                if (bVar != null) {
                    bVar.dispose();
                }
                RunnableC88765a aVar = new RunnableC88765a(t, j, this);
                this.f201540f = aVar;
                EnumC88441b.replace(aVar, this.f201538d.mo20706a(aVar, this.f201536b, this.f201537c));
            }
        }

        C88766b(AbstractC88986z<? super T> zVar, long j, TimeUnit timeUnit, AbstractC88398aa.AbstractC88401c cVar) {
            this.f201535a = zVar;
            this.f201536b = j;
            this.f201537c = timeUnit;
            this.f201538d = cVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88766b(new C88923c(zVar), this.f201528b, this.f201529c, this.f201530d.mo20704a()));
    }

    public C88764j(AbstractC88984x<T> xVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        super(xVar);
        this.f201528b = j;
        this.f201529c = timeUnit;
        this.f201530d = aaVar;
    }
}
