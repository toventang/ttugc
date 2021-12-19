package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: f.a.e.e.e.ah */
public final class C88651ah<T> extends AbstractC88637a<T, T> {
    static {
        Covode.recordClassIndex(104693);
    }

    /* renamed from: f.a.e.e.e.ah$a */
    static final class C88652a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201139a;

        /* renamed from: b */
        AbstractC88412b f201140b;

        static {
            Covode.recordClassIndex(104694);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201140b.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201140b.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201139a.onComplete();
        }

        C88652a(AbstractC88986z<? super T> zVar) {
            this.f201139a = zVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201139a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201140b = bVar;
            this.f201139a.onSubscribe(this);
        }
    }

    public C88651ah(AbstractC88984x<T> xVar) {
        super(xVar);
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88652a(zVar));
    }
}
