package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4572d.C88486j;

/* renamed from: f.a.e.e.f.x */
public final class C88842x<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    final AbstractC88408ag<? extends T> f201740a;

    static {
        Covode.recordClassIndex(104884);
    }

    /* renamed from: f.a.e.e.f.x$a */
    static final class C88843a<T> extends C88486j<T> implements AbstractC88406ae<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: c */
        AbstractC88412b f201741c;

        static {
            Covode.recordClassIndex(104885);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b, p4560f.p4561a.p4568e.p4572d.C88486j
        public final void dispose() {
            super.dispose();
            this.f201741c.dispose();
        }

        C88843a(AbstractC88986z<? super T> zVar) {
            super(zVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            error(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201741c, bVar)) {
                this.f201741c = bVar;
                this.f200734a.onSubscribe(this);
            }
        }
    }

    public C88842x(AbstractC88408ag<? extends T> agVar) {
        this.f201740a = agVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201740a.mo116431a_(new C88843a(zVar));
    }
}
