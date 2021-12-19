package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.c.d */
public final class C88589d<T> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC88433f<? super T> f201004b;

    static {
        Covode.recordClassIndex(104631);
    }

    /* renamed from: f.a.e.e.c.d$a */
    static final class C88590a<T> implements AbstractC88412b, AbstractC88975p<T> {

        /* renamed from: a */
        final AbstractC88975p<? super T> f201005a;

        /* renamed from: b */
        final AbstractC88433f<? super T> f201006b;

        /* renamed from: c */
        AbstractC88412b f201007c;

        static {
            Covode.recordClassIndex(104632);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201007c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201007c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201005a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201005a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201007c, bVar)) {
                this.f201007c = bVar;
                this.f201005a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            this.f201005a.onSuccess(t);
            try {
                this.f201006b.accept(t);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(th);
            }
        }

        C88590a(AbstractC88975p<? super T> pVar, AbstractC88433f<? super T> fVar) {
            this.f201005a = pVar;
            this.f201006b = fVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f200998a.mo143239a(new C88590a(pVar, this.f201004b));
    }

    public C88589d(AbstractC88977r<T> rVar, AbstractC88433f<? super T> fVar) {
        super(rVar);
        this.f201004b = fVar;
    }
}
