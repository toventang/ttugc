package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4572d.AbstractC88477a;

/* renamed from: f.a.e.e.e.x */
public final class C88792x<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88438k<? super T> f201618b;

    static {
        Covode.recordClassIndex(104834);
    }

    /* renamed from: f.a.e.e.e.x$a */
    static final class C88793a<T> extends AbstractC88477a<T, T> {

        /* renamed from: f */
        final AbstractC88438k<? super T> f201619f;

        static {
            Covode.recordClassIndex(104835);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            T t;
            do {
                t = (T) this.f200718c.poll();
                if (t == null) {
                    break;
                }
            } while (!this.f201619f.mo7718a(t));
            return t;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo142985a(i);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (this.f200720e == 0) {
                try {
                    if (this.f201619f.mo7718a(t)) {
                        this.f200716a.onNext(t);
                    }
                } catch (Throwable th) {
                    mo142986a(th);
                }
            } else {
                this.f200716a.onNext(null);
            }
        }

        C88793a(AbstractC88986z<? super T> zVar, AbstractC88438k<? super T> kVar) {
            super(zVar);
            this.f201619f = kVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88793a(zVar, this.f201618b));
    }

    public C88792x(AbstractC88984x<T> xVar, AbstractC88438k<? super T> kVar) {
        super(xVar);
        this.f201618b = kVar;
    }
}
