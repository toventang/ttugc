package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.e.ag */
public final class C88649ag<T> extends AbstractC88637a<T, T> {
    static {
        Covode.recordClassIndex(104691);
    }

    /* renamed from: f.a.e.e.e.ag$a */
    static final class C88650a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201137a;

        /* renamed from: b */
        AbstractC88412b f201138b;

        static {
            Covode.recordClassIndex(104692);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201138b.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201138b.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201137a.onComplete();
        }

        C88650a(AbstractC88986z<? super T> zVar) {
            this.f201137a = zVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201137a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201137a.onNext(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201138b, bVar)) {
                this.f201138b = bVar;
                this.f201137a.onSubscribe(this);
            }
        }
    }

    public C88649ag(AbstractC88984x<T> xVar) {
        super(xVar);
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88650a(zVar));
    }
}
