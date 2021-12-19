package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4572d.AbstractC88477a;

/* renamed from: f.a.e.e.e.o */
public final class C88777o<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88433f<? super T> f201569b;

    static {
        Covode.recordClassIndex(104819);
    }

    /* renamed from: f.a.e.e.e.o$a */
    static final class C88778a<T> extends AbstractC88477a<T, T> {

        /* renamed from: f */
        final AbstractC88433f<? super T> f201570f;

        static {
            Covode.recordClassIndex(104820);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            T t = (T) this.f200718c.poll();
            if (t != null) {
                this.f201570f.accept(t);
            }
            return t;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo142985a(i);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f200716a.onNext(t);
            if (this.f200720e == 0) {
                try {
                    this.f201570f.accept(t);
                } catch (Throwable th) {
                    mo142986a(th);
                }
            }
        }

        C88778a(AbstractC88986z<? super T> zVar, AbstractC88433f<? super T> fVar) {
            super(zVar);
            this.f201570f = fVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88778a(zVar, this.f201569b));
    }

    public C88777o(AbstractC88984x<T> xVar, AbstractC88433f<? super T> fVar) {
        super(xVar);
        this.f201569b = fVar;
    }
}
