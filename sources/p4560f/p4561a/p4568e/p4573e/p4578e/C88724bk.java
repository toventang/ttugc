package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.C88445f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.bk */
public final class C88724bk<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final long f201350b;

    /* renamed from: c */
    final TimeUnit f201351c;

    /* renamed from: d */
    final AbstractC88398aa f201352d;

    /* renamed from: e */
    final AbstractC88984x<? extends T> f201353e;

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.bk$d */
    public interface AbstractC88728d {
        static {
            Covode.recordClassIndex(104770);
        }

        /* renamed from: b */
        void mo143091b(long j);
    }

    static {
        Covode.recordClassIndex(104766);
    }

    /* renamed from: f.a.e.e.e.bk$a */
    static final class C88725a<T> implements AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201354a;

        /* renamed from: b */
        final AtomicReference<AbstractC88412b> f201355b;

        static {
            Covode.recordClassIndex(104767);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201354a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201354a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201354a.onNext(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.replace(this.f201355b, bVar);
        }

        C88725a(AbstractC88986z<? super T> zVar, AtomicReference<AbstractC88412b> atomicReference) {
            this.f201354a = zVar;
            this.f201355b = atomicReference;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.bk$e */
    public static final class RunnableC88729e implements Runnable {

        /* renamed from: a */
        final AbstractC88728d f201370a;

        /* renamed from: b */
        final long f201371b;

        static {
            Covode.recordClassIndex(104771);
        }

        public final void run() {
            this.f201370a.mo143091b(this.f201371b);
        }

        RunnableC88729e(long j, AbstractC88728d dVar) {
            this.f201371b = j;
            this.f201370a = dVar;
        }
    }

    /* renamed from: f.a.e.e.e.bk$b */
    static final class C88726b<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88728d, AbstractC88986z<T> {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201356a;

        /* renamed from: b */
        final long f201357b;

        /* renamed from: c */
        final TimeUnit f201358c;

        /* renamed from: d */
        final AbstractC88398aa.AbstractC88401c f201359d;

        /* renamed from: e */
        final C88445f f201360e = new C88445f();

        /* renamed from: f */
        final AtomicLong f201361f = new AtomicLong();

        /* renamed from: g */
        final AtomicReference<AbstractC88412b> f201362g = new AtomicReference<>();

        /* renamed from: h */
        AbstractC88984x<? extends T> f201363h;

        static {
            Covode.recordClassIndex(104768);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this.f201362g);
            EnumC88441b.dispose(this);
            this.f201359d.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (this.f201361f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f201360e.dispose();
                this.f201356a.onComplete();
                this.f201359d.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this.f201362g, bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143090a(long j) {
            this.f201360e.replace(this.f201359d.mo20706a(new RunnableC88729e(j, this), this.f201357b, this.f201358c));
        }

        @Override // p4560f.p4561a.p4568e.p4573e.p4578e.C88724bk.AbstractC88728d
        /* renamed from: b */
        public final void mo143091b(long j) {
            if (this.f201361f.compareAndSet(j, Long.MAX_VALUE)) {
                EnumC88441b.dispose(this.f201362g);
                AbstractC88984x<? extends T> xVar = this.f201363h;
                this.f201363h = null;
                xVar.mo143062b(new C88725a(this.f201356a, this));
                this.f201359d.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201361f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f201360e.dispose();
                this.f201356a.onError(th);
                this.f201359d.dispose();
                return;
            }
            C88925a.m154178a(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            long j = this.f201361f.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f201361f.compareAndSet(j, j2)) {
                    ((AbstractC88412b) this.f201360e.get()).dispose();
                    this.f201356a.onNext(t);
                    mo143090a(j2);
                }
            }
        }

        C88726b(AbstractC88986z<? super T> zVar, long j, TimeUnit timeUnit, AbstractC88398aa.AbstractC88401c cVar, AbstractC88984x<? extends T> xVar) {
            this.f201356a = zVar;
            this.f201357b = j;
            this.f201358c = timeUnit;
            this.f201359d = cVar;
            this.f201363h = xVar;
        }
    }

    /* renamed from: f.a.e.e.e.bk$c */
    static final class C88727c<T> extends AtomicLong implements AbstractC88412b, AbstractC88728d, AbstractC88986z<T> {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201364a;

        /* renamed from: b */
        final long f201365b;

        /* renamed from: c */
        final TimeUnit f201366c;

        /* renamed from: d */
        final AbstractC88398aa.AbstractC88401c f201367d;

        /* renamed from: e */
        final C88445f f201368e = new C88445f();

        /* renamed from: f */
        final AtomicReference<AbstractC88412b> f201369f = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104769);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this.f201369f);
            this.f201367d.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed(this.f201369f.get());
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f201368e.dispose();
                this.f201364a.onComplete();
                this.f201367d.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this.f201369f, bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143092a(long j) {
            this.f201368e.replace(this.f201367d.mo20706a(new RunnableC88729e(j, this), this.f201365b, this.f201366c));
        }

        @Override // p4560f.p4561a.p4568e.p4573e.p4578e.C88724bk.AbstractC88728d
        /* renamed from: b */
        public final void mo143091b(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                EnumC88441b.dispose(this.f201369f);
                this.f201364a.onError(new TimeoutException(C88906h.m154105a(this.f201365b, this.f201366c)));
                this.f201367d.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f201368e.dispose();
                this.f201364a.onError(th);
                this.f201367d.dispose();
                return;
            }
            C88925a.m154178a(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((AbstractC88412b) this.f201368e.get()).dispose();
                    this.f201364a.onNext(t);
                    mo143092a(j2);
                }
            }
        }

        C88727c(AbstractC88986z<? super T> zVar, long j, TimeUnit timeUnit, AbstractC88398aa.AbstractC88401c cVar) {
            this.f201364a = zVar;
            this.f201365b = j;
            this.f201366c = timeUnit;
            this.f201367d = cVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        if (this.f201353e == null) {
            C88727c cVar = new C88727c(zVar, this.f201350b, this.f201351c, this.f201352d.mo20704a());
            zVar.onSubscribe(cVar);
            cVar.mo143092a(0);
            this.f201095a.mo143062b(cVar);
            return;
        }
        C88726b bVar = new C88726b(zVar, this.f201350b, this.f201351c, this.f201352d.mo20704a(), this.f201353e);
        zVar.onSubscribe(bVar);
        bVar.mo143090a(0);
        this.f201095a.mo143062b(bVar);
    }

    public C88724bk(AbstractC88979t<T> tVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar, AbstractC88984x<? extends T> xVar) {
        super(tVar);
        this.f201350b = j;
        this.f201351c = timeUnit;
        this.f201352d = aaVar;
        this.f201353e = xVar;
    }
}
