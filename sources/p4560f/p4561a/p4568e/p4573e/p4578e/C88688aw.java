package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4584j.C88901c;
import p4560f.p4561a.p4568e.p4584j.C88908i;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: f.a.e.e.e.aw */
public final class C88688aw<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88434g<? super AbstractC88979t<Throwable>, ? extends AbstractC88984x<?>> f201245b;

    static {
        Covode.recordClassIndex(104730);
    }

    /* renamed from: f.a.e.e.e.aw$a */
    static final class C88689a<T> extends AtomicInteger implements AbstractC88412b, AbstractC88986z<T> {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201246a;

        /* renamed from: b */
        final AtomicInteger f201247b = new AtomicInteger();

        /* renamed from: c */
        final C88901c f201248c = new C88901c();

        /* renamed from: d */
        final AbstractC88969g<Throwable> f201249d;

        /* renamed from: e */
        final C88689a<T>.C88690a f201250e = new C88690a();

        /* renamed from: f */
        final AtomicReference<AbstractC88412b> f201251f = new AtomicReference<>();

        /* renamed from: g */
        final AbstractC88984x<T> f201252g;

        /* renamed from: h */
        volatile boolean f201253h;

        static {
            Covode.recordClassIndex(104731);
        }

        /* renamed from: f.a.e.e.e.aw$a$a */
        final class C88690a extends AtomicReference<AbstractC88412b> implements AbstractC88986z<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            static {
                Covode.recordClassIndex(104732);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
                C88689a aVar = C88689a.this;
                EnumC88441b.dispose(aVar.f201251f);
                C88908i.m154109a(aVar.f201246a, aVar, aVar.f201248c);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
                EnumC88441b.setOnce(this, bVar);
            }

            C88690a() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onNext(Object obj) {
                C88689a.this.mo143079a();
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
                C88689a aVar = C88689a.this;
                EnumC88441b.dispose(aVar.f201251f);
                C88908i.m154108a((AbstractC88986z<?>) aVar.f201246a, th, (AtomicInteger) aVar, aVar.f201248c);
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this.f201251f);
            EnumC88441b.dispose(this.f201250e);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed(this.f201251f.get());
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            EnumC88441b.dispose(this.f201250e);
            C88908i.m154109a(this.f201246a, this, this.f201248c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143079a() {
            if (this.f201247b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f201253h) {
                        this.f201253h = true;
                        this.f201252g.mo143062b(this);
                    }
                    if (this.f201247b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            C88908i.m154107a((AbstractC88986z) this.f201246a, (Object) t, (AtomicInteger) this, this.f201248c);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.replace(this.f201251f, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            EnumC88441b.replace(this.f201251f, null);
            this.f201253h = false;
            this.f201249d.onNext(th);
        }

        C88689a(AbstractC88986z<? super T> zVar, AbstractC88969g<Throwable> gVar, AbstractC88984x<T> xVar) {
            this.f201246a = zVar;
            this.f201249d = gVar;
            this.f201252g = xVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        AbstractC88969g<T> j = new C88960c().mo143230j();
        try {
            AbstractC88984x xVar = (AbstractC88984x) C88466b.m153697a(this.f201245b.apply(j), "The handler returned a null ObservableSource");
            C88689a aVar = new C88689a(zVar, j, this.f201095a);
            zVar.onSubscribe(aVar);
            xVar.mo143062b(aVar.f201250e);
            aVar.mo143079a();
        } catch (Throwable th) {
            C88422b.m153670a(th);
            EnumC88442c.error(th, zVar);
        }
    }

    public C88688aw(AbstractC88984x<T> xVar, AbstractC88434g<? super AbstractC88979t<Throwable>, ? extends AbstractC88984x<?>> gVar) {
        super(xVar);
        this.f201245b = gVar;
    }
}
