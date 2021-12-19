package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4584j.C88901c;
import p4560f.p4561a.p4568e.p4584j.C88908i;

/* renamed from: f.a.e.e.e.bh */
public final class C88717bh<T, U> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88984x<? extends U> f201329b;

    static {
        Covode.recordClassIndex(104759);
    }

    /* renamed from: f.a.e.e.e.bh$a */
    static final class C88718a<T, U> extends AtomicInteger implements AbstractC88412b, AbstractC88986z<T> {
        private static final long serialVersionUID = 1418547743690811973L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201330a;

        /* renamed from: b */
        final AtomicReference<AbstractC88412b> f201331b = new AtomicReference<>();

        /* renamed from: c */
        final C88718a<T, U>.C88719a f201332c = new C88719a();

        /* renamed from: d */
        final C88901c f201333d = new C88901c();

        static {
            Covode.recordClassIndex(104760);
        }

        /* renamed from: f.a.e.e.e.bh$a$a */
        final class C88719a extends AtomicReference<AbstractC88412b> implements AbstractC88986z<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            static {
                Covode.recordClassIndex(104761);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
                C88718a.this.mo143088a();
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
                EnumC88441b.setOnce(this, bVar);
            }

            C88719a() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
                C88718a aVar = C88718a.this;
                EnumC88441b.dispose(aVar.f201331b);
                C88908i.m154108a((AbstractC88986z<?>) aVar.f201330a, th, (AtomicInteger) aVar, aVar.f201333d);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onNext(U u) {
                EnumC88441b.dispose(this);
                C88718a.this.mo143088a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143088a() {
            EnumC88441b.dispose(this.f201331b);
            C88908i.m154109a(this.f201330a, this, this.f201333d);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this.f201331b);
            EnumC88441b.dispose(this.f201332c);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed(this.f201331b.get());
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            EnumC88441b.dispose(this.f201332c);
            C88908i.m154109a(this.f201330a, this, this.f201333d);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            C88908i.m154107a((AbstractC88986z) this.f201330a, (Object) t, (AtomicInteger) this, this.f201333d);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this.f201331b, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            EnumC88441b.dispose(this.f201332c);
            C88908i.m154108a((AbstractC88986z<?>) this.f201330a, th, (AtomicInteger) this, this.f201333d);
        }

        C88718a(AbstractC88986z<? super T> zVar) {
            this.f201330a = zVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88718a aVar = new C88718a(zVar);
        zVar.onSubscribe(aVar);
        this.f201329b.mo143062b(aVar.f201332c);
        this.f201095a.mo143062b(aVar);
    }

    public C88717bh(AbstractC88984x<T> xVar, AbstractC88984x<? extends U> xVar2) {
        super(xVar);
        this.f201329b = xVar2;
    }
}
