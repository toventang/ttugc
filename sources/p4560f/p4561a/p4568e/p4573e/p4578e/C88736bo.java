package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4586g.C88923c;

/* renamed from: f.a.e.e.e.bo */
public final class C88736bo<T, U, R> extends AbstractC88637a<T, R> {

    /* renamed from: b */
    final AbstractC88430c<? super T, ? super U, ? extends R> f201385b;

    /* renamed from: c */
    final AbstractC88984x<? extends U> f201386c;

    static {
        Covode.recordClassIndex(104778);
    }

    /* renamed from: f.a.e.e.e.bo$a */
    static final class C88737a<T, U, R> extends AtomicReference<U> implements AbstractC88412b, AbstractC88986z<T> {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: a */
        final AbstractC88986z<? super R> f201387a;

        /* renamed from: b */
        final AbstractC88430c<? super T, ? super U, ? extends R> f201388b;

        /* renamed from: c */
        final AtomicReference<AbstractC88412b> f201389c = new AtomicReference<>();

        /* renamed from: d */
        final AtomicReference<AbstractC88412b> f201390d = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104779);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this.f201389c);
            EnumC88441b.dispose(this.f201390d);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed(this.f201389c.get());
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            EnumC88441b.dispose(this.f201390d);
            this.f201387a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this.f201389c, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            EnumC88441b.dispose(this.f201390d);
            this.f201387a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.f201387a.onNext(C88466b.m153697a(this.f201388b.mo9210a(t, obj), "The combiner returned a null value"));
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    dispose();
                    this.f201387a.onError(th);
                }
            }
        }

        C88737a(AbstractC88986z<? super R> zVar, AbstractC88430c<? super T, ? super U, ? extends R> cVar) {
            this.f201387a = zVar;
            this.f201388b = cVar;
        }
    }

    /* renamed from: f.a.e.e.e.bo$b */
    final class C88738b implements AbstractC88986z<U> {

        /* renamed from: b */
        private final C88737a<T, U, R> f201392b;

        static {
            Covode.recordClassIndex(104780);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(U u) {
            this.f201392b.lazySet(u);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this.f201392b.f201390d, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C88737a<T, U, R> aVar = this.f201392b;
            EnumC88441b.dispose(aVar.f201389c);
            aVar.f201387a.onError(th);
        }

        C88738b(C88737a<T, U, R> aVar) {
            this.f201392b = aVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super R> zVar) {
        C88923c cVar = new C88923c(zVar);
        C88737a aVar = new C88737a(cVar, this.f201385b);
        cVar.onSubscribe(aVar);
        this.f201386c.mo143062b(new C88738b(aVar));
        this.f201095a.mo143062b(aVar);
    }

    public C88736bo(AbstractC88984x<T> xVar, AbstractC88430c<? super T, ? super U, ? extends R> cVar, AbstractC88984x<? extends U> xVar2) {
        super(xVar);
        this.f201385b = cVar;
        this.f201386c = xVar2;
    }
}
