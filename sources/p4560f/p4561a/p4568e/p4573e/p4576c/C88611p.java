package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.c.p */
public final class C88611p<T> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC88438k<? super Throwable> f201045b;

    static {
        Covode.recordClassIndex(104653);
    }

    /* renamed from: f.a.e.e.c.p$a */
    static final class C88612a<T> implements AbstractC88412b, AbstractC88975p<T> {

        /* renamed from: a */
        final AbstractC88975p<? super T> f201046a;

        /* renamed from: b */
        final AbstractC88438k<? super Throwable> f201047b;

        /* renamed from: c */
        AbstractC88412b f201048c;

        static {
            Covode.recordClassIndex(104654);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201048c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201048c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201046a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            this.f201046a.onSuccess(t);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201048c, bVar)) {
                this.f201048c = bVar;
                this.f201046a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            try {
                if (this.f201047b.mo7718a(th)) {
                    this.f201046a.onComplete();
                } else {
                    this.f201046a.onError(th);
                }
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f201046a.onError(new C88417a(th, th2));
            }
        }

        C88612a(AbstractC88975p<? super T> pVar, AbstractC88438k<? super Throwable> kVar) {
            this.f201046a = pVar;
            this.f201047b = kVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f200998a.mo143239a(new C88612a(pVar, this.f201045b));
    }

    public C88611p(AbstractC88977r<T> rVar, AbstractC88438k<? super Throwable> kVar) {
        super(rVar);
        this.f201045b = kVar;
    }
}
