package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4586g.C88923c;

/* renamed from: f.a.e.e.e.ax */
public final class C88691ax<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final long f201255b;

    /* renamed from: c */
    final TimeUnit f201256c;

    /* renamed from: d */
    final AbstractC88398aa f201257d;

    /* renamed from: e */
    final boolean f201258e = false;

    static {
        Covode.recordClassIndex(104733);
    }

    /* renamed from: f.a.e.e.e.ax$b */
    static final class C88693b<T> extends AbstractRunnableC88694c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        static {
            Covode.recordClassIndex(104735);
        }

        public final void run() {
            mo143083b();
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4578e.C88691ax.AbstractRunnableC88694c
        /* renamed from: a */
        public final void mo143080a() {
            this.f201260b.onComplete();
        }

        C88693b(AbstractC88986z<? super T> zVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
            super(zVar, j, timeUnit, aaVar);
        }
    }

    /* renamed from: f.a.e.e.e.ax$c */
    static abstract class AbstractRunnableC88694c<T> extends AtomicReference<T> implements AbstractC88412b, AbstractC88986z<T>, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b */
        final AbstractC88986z<? super T> f201260b;

        /* renamed from: c */
        final long f201261c;

        /* renamed from: d */
        final TimeUnit f201262d;

        /* renamed from: e */
        final AbstractC88398aa f201263e;

        /* renamed from: f */
        final AtomicReference<AbstractC88412b> f201264f = new AtomicReference<>();

        /* renamed from: g */
        AbstractC88412b f201265g;

        static {
            Covode.recordClassIndex(104736);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo143080a();

        /* renamed from: c */
        private void m153915c() {
            EnumC88441b.dispose(this.f201264f);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public boolean isDisposed() {
            return this.f201265g.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public void onComplete() {
            m153915c();
            mo143080a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo143083b() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f201260b.onNext(andSet);
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public void dispose() {
            m153915c();
            this.f201265g.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public void onError(Throwable th) {
            m153915c();
            this.f201260b.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201265g, bVar)) {
                this.f201265g = bVar;
                this.f201260b.onSubscribe(this);
                AbstractC88398aa aaVar = this.f201263e;
                long j = this.f201261c;
                EnumC88441b.replace(this.f201264f, aaVar.mo142901a(this, j, j, this.f201262d));
            }
        }

        AbstractRunnableC88694c(AbstractC88986z<? super T> zVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
            this.f201260b = zVar;
            this.f201261c = j;
            this.f201262d = timeUnit;
            this.f201263e = aaVar;
        }
    }

    /* renamed from: f.a.e.e.e.ax$a */
    static final class C88692a<T> extends AbstractRunnableC88694c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: a */
        final AtomicInteger f201259a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(104734);
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4578e.C88691ax.AbstractRunnableC88694c
        /* renamed from: a */
        public final void mo143080a() {
            mo143083b();
            if (this.f201259a.decrementAndGet() == 0) {
                this.f201260b.onComplete();
            }
        }

        public final void run() {
            if (this.f201259a.incrementAndGet() == 2) {
                mo143083b();
                if (this.f201259a.decrementAndGet() == 0) {
                    this.f201260b.onComplete();
                }
            }
        }

        C88692a(AbstractC88986z<? super T> zVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
            super(zVar, j, timeUnit, aaVar);
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88923c cVar = new C88923c(zVar);
        if (this.f201258e) {
            this.f201095a.mo143062b(new C88692a(cVar, this.f201255b, this.f201256c, this.f201257d));
        } else {
            this.f201095a.mo143062b(new C88693b(cVar, this.f201255b, this.f201256c, this.f201257d));
        }
    }

    public C88691ax(AbstractC88984x<T> xVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        super(xVar);
        this.f201255b = j;
        this.f201256c = timeUnit;
        this.f201257d = aaVar;
    }
}
