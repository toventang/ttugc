package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4583i.C88893b;

/* renamed from: f.a.e.e.f.w */
public final class C88840w<T> extends AbstractC88924h<T> {

    /* renamed from: b */
    final AbstractC88408ag<? extends T> f201738b;

    static {
        Covode.recordClassIndex(104882);
    }

    /* renamed from: f.a.e.e.f.w$a */
    static final class C88841a<T> extends C88893b<T> implements AbstractC88406ae<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: a */
        AbstractC88412b f201739a;

        static {
            Covode.recordClassIndex(104883);
        }

        @Override // org.p4663a.AbstractC90215d, p4560f.p4561a.p4568e.p4583i.C88893b
        public final void cancel() {
            super.cancel();
            this.f201739a.dispose();
        }

        C88841a(AbstractC90214c<? super T> cVar) {
            super(cVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201893e.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201739a, bVar)) {
                this.f201739a = bVar;
                this.f201893e.onSubscribe(this);
            }
        }
    }

    public C88840w(AbstractC88408ag<? extends T> agVar) {
        this.f201738b = agVar;
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f201738b.mo116431a_(new C88841a(cVar));
    }
}
