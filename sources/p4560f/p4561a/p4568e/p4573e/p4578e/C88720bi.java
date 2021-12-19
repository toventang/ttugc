package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.bi */
public final class C88720bi<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88438k<? super T> f201335b;

    static {
        Covode.recordClassIndex(104762);
    }

    /* renamed from: f.a.e.e.e.bi$a */
    static final class C88721a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201336a;

        /* renamed from: b */
        final AbstractC88438k<? super T> f201337b;

        /* renamed from: c */
        AbstractC88412b f201338c;

        /* renamed from: d */
        boolean f201339d;

        static {
            Covode.recordClassIndex(104763);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201338c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201338c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201339d) {
                this.f201339d = true;
                this.f201336a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201338c, bVar)) {
                this.f201338c = bVar;
                this.f201336a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (!this.f201339d) {
                this.f201339d = true;
                this.f201336a.onError(th);
                return;
            }
            C88925a.m154178a(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201339d) {
                this.f201336a.onNext(t);
                try {
                    if (this.f201337b.mo7718a(t)) {
                        this.f201339d = true;
                        this.f201338c.dispose();
                        this.f201336a.onComplete();
                    }
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    this.f201338c.dispose();
                    onError(th);
                }
            }
        }

        C88721a(AbstractC88986z<? super T> zVar, AbstractC88438k<? super T> kVar) {
            this.f201336a = zVar;
            this.f201337b = kVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88721a(zVar, this.f201335b));
    }

    public C88720bi(AbstractC88984x<T> xVar, AbstractC88438k<? super T> kVar) {
        super(xVar);
        this.f201335b = kVar;
    }
}
