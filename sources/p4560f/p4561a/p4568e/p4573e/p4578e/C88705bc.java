package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.e.bc */
public final class C88705bc<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88438k<? super T> f201290b;

    static {
        Covode.recordClassIndex(104747);
    }

    /* renamed from: f.a.e.e.e.bc$a */
    static final class C88706a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201291a;

        /* renamed from: b */
        final AbstractC88438k<? super T> f201292b;

        /* renamed from: c */
        AbstractC88412b f201293c;

        /* renamed from: d */
        boolean f201294d;

        static {
            Covode.recordClassIndex(104748);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201293c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201293c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201291a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201291a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201293c, bVar)) {
                this.f201293c = bVar;
                this.f201291a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (this.f201294d) {
                this.f201291a.onNext(t);
                return;
            }
            try {
                if (!this.f201292b.mo7718a(t)) {
                    this.f201294d = true;
                    this.f201291a.onNext(t);
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201293c.dispose();
                this.f201291a.onError(th);
            }
        }

        C88706a(AbstractC88986z<? super T> zVar, AbstractC88438k<? super T> kVar) {
            this.f201291a = zVar;
            this.f201292b = kVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88706a(zVar, this.f201290b));
    }

    public C88705bc(AbstractC88984x<T> xVar, AbstractC88438k<? super T> kVar) {
        super(xVar);
        this.f201290b = kVar;
    }
}
