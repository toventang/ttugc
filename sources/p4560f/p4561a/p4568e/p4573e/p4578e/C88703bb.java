package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.e.bb */
public final class C88703bb<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final long f201286b = 1;

    static {
        Covode.recordClassIndex(104745);
    }

    /* renamed from: f.a.e.e.e.bb$a */
    static final class C88704a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201287a;

        /* renamed from: b */
        long f201288b;

        /* renamed from: c */
        AbstractC88412b f201289c;

        static {
            Covode.recordClassIndex(104746);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201289c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201289c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201287a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201287a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201289c, bVar)) {
                this.f201289c = bVar;
                this.f201287a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            long j = this.f201288b;
            if (j != 0) {
                this.f201288b = j - 1;
            } else {
                this.f201287a.onNext(t);
            }
        }

        C88704a(AbstractC88986z<? super T> zVar, long j) {
            this.f201287a = zVar;
            this.f201288b = j;
        }
    }

    public C88703bb(AbstractC88984x<T> xVar) {
        super(xVar);
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88704a(zVar, this.f201286b));
    }
}
