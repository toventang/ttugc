package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.C88445f;

/* renamed from: f.a.e.e.e.be */
public final class C88710be<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88984x<? extends T> f201300b;

    static {
        Covode.recordClassIndex(104752);
    }

    /* renamed from: f.a.e.e.e.be$a */
    static final class C88711a<T> implements AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201301a;

        /* renamed from: b */
        final AbstractC88984x<? extends T> f201302b;

        /* renamed from: c */
        final C88445f f201303c = new C88445f();

        /* renamed from: d */
        boolean f201304d = true;

        static {
            Covode.recordClassIndex(104753);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (this.f201304d) {
                this.f201304d = false;
                this.f201302b.mo143062b(this);
                return;
            }
            this.f201301a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201301a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201303c.update(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (this.f201304d) {
                this.f201304d = false;
            }
            this.f201301a.onNext(t);
        }

        C88711a(AbstractC88986z<? super T> zVar, AbstractC88984x<? extends T> xVar) {
            this.f201301a = zVar;
            this.f201302b = xVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88711a aVar = new C88711a(zVar, this.f201300b);
        zVar.onSubscribe(aVar.f201303c);
        this.f201095a.mo143062b(aVar);
    }

    public C88710be(AbstractC88984x<T> xVar, AbstractC88984x<? extends T> xVar2) {
        super(xVar);
        this.f201300b = xVar2;
    }
}
