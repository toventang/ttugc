package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4583i.C88893b;

/* renamed from: f.a.e.e.c.x */
public final class C88632x<T> extends AbstractC88924h<T> {

    /* renamed from: b */
    final AbstractC88977r<T> f201089b;

    static {
        Covode.recordClassIndex(104674);
    }

    /* renamed from: f.a.e.e.c.x$a */
    static final class C88633a<T> extends C88893b<T> implements AbstractC88975p<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: a */
        AbstractC88412b f201090a;

        static {
            Covode.recordClassIndex(104675);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201893e.onComplete();
        }

        @Override // org.p4663a.AbstractC90215d, p4560f.p4561a.p4568e.p4583i.C88893b
        public final void cancel() {
            super.cancel();
            this.f201090a.dispose();
        }

        C88633a(AbstractC90214c<? super T> cVar) {
            super(cVar);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201893e.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201090a, bVar)) {
                this.f201090a = bVar;
                this.f201893e.onSubscribe(this);
            }
        }
    }

    public C88632x(AbstractC88977r<T> rVar) {
        this.f201089b = rVar;
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f201089b.mo143239a(new C88633a(cVar));
    }
}
