package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.c.g */
public final class C88594g<T> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC88438k<? super T> f201013b;

    static {
        Covode.recordClassIndex(104636);
    }

    /* renamed from: f.a.e.e.c.g$a */
    static final class C88595a<T> implements AbstractC88412b, AbstractC88975p<T> {

        /* renamed from: a */
        final AbstractC88975p<? super T> f201014a;

        /* renamed from: b */
        final AbstractC88438k<? super T> f201015b;

        /* renamed from: c */
        AbstractC88412b f201016c;

        static {
            Covode.recordClassIndex(104637);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201016c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201014a.onComplete();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            AbstractC88412b bVar = this.f201016c;
            this.f201016c = EnumC88441b.DISPOSED;
            bVar.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201014a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201016c, bVar)) {
                this.f201016c = bVar;
                this.f201014a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            try {
                if (this.f201015b.mo7718a(t)) {
                    this.f201014a.onSuccess(t);
                } else {
                    this.f201014a.onComplete();
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201014a.onError(th);
            }
        }

        C88595a(AbstractC88975p<? super T> pVar, AbstractC88438k<? super T> kVar) {
            this.f201014a = pVar;
            this.f201015b = kVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f200998a.mo143239a(new C88595a(pVar, this.f201013b));
    }

    public C88594g(AbstractC88977r<T> rVar, AbstractC88438k<? super T> kVar) {
        super(rVar);
        this.f201013b = kVar;
    }
}
