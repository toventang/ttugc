package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;

/* renamed from: f.a.e.e.b.ac */
public final class C88519ac<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final AbstractC88398aa f200812c;

    /* renamed from: d */
    final boolean f200813d;

    static {
        Covode.recordClassIndex(104561);
    }

    /* renamed from: f.a.e.e.b.ac$a */
    static final class RunnableC88520a<T> extends AtomicReference<Thread> implements AbstractC88955l<T>, Runnable, AbstractC90215d {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: a */
        final AbstractC90214c<? super T> f200814a;

        /* renamed from: b */
        final AbstractC88398aa.AbstractC88401c f200815b;

        /* renamed from: c */
        final AtomicReference<AbstractC90215d> f200816c = new AtomicReference<>();

        /* renamed from: d */
        final AtomicLong f200817d = new AtomicLong();

        /* renamed from: e */
        final boolean f200818e;

        /* renamed from: f */
        AbstractC90213b<T> f200819f;

        static {
            Covode.recordClassIndex(104562);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f.a.e.e.b.ac$a$a */
        public static final class RunnableC88521a implements Runnable {

            /* renamed from: a */
            final AbstractC90215d f200820a;

            /* renamed from: b */
            final long f200821b;

            static {
                Covode.recordClassIndex(104563);
            }

            public final void run() {
                this.f200820a.request(this.f200821b);
            }

            RunnableC88521a(AbstractC90215d dVar, long j) {
                this.f200820a = dVar;
                this.f200821b = j;
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            EnumC88897f.cancel(this.f200816c);
            this.f200815b.dispose();
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            this.f200814a.onComplete();
            this.f200815b.dispose();
        }

        public final void run() {
            lazySet(Thread.currentThread());
            AbstractC90213b<T> bVar = this.f200819f;
            this.f200819f = null;
            bVar.mo57509a_(this);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            this.f200814a.onNext(t);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            this.f200814a.onError(th);
            this.f200815b.dispose();
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.setOnce(this.f200816c, dVar)) {
                long andSet = this.f200817d.getAndSet(0);
                if (andSet != 0) {
                    m153739a(andSet, dVar);
                }
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                AbstractC90215d dVar = this.f200816c.get();
                if (dVar != null) {
                    m153739a(j, dVar);
                    return;
                }
                C88902d.m154098a(this.f200817d, j);
                AbstractC90215d dVar2 = this.f200816c.get();
                if (dVar2 != null) {
                    long andSet = this.f200817d.getAndSet(0);
                    if (andSet != 0) {
                        m153739a(andSet, dVar2);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m153739a(long j, AbstractC90215d dVar) {
            if (this.f200818e || Thread.currentThread() == get()) {
                dVar.request(j);
            } else {
                this.f200815b.mo101910a(new RunnableC88521a(dVar, j));
            }
        }

        RunnableC88520a(AbstractC90214c<? super T> cVar, AbstractC88398aa.AbstractC88401c cVar2, AbstractC90213b<T> bVar, boolean z) {
            this.f200814a = cVar;
            this.f200815b = cVar2;
            this.f200819f = bVar;
            this.f200818e = !z;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        AbstractC88398aa.AbstractC88401c a = this.f200812c.mo20704a();
        RunnableC88520a aVar = new RunnableC88520a(cVar, a, this.f200799b, this.f200813d);
        cVar.onSubscribe(aVar);
        a.mo101910a(aVar);
    }

    public C88519ac(AbstractC88924h<T> hVar, AbstractC88398aa aaVar, boolean z) {
        super(hVar);
        this.f200812c = aaVar;
        this.f200813d = z;
    }
}
