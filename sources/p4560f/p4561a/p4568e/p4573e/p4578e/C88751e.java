package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.e */
public final class C88751e<T, U> extends AbstractC88637a<T, U> {

    /* renamed from: b */
    final Callable<? extends U> f201464b;

    /* renamed from: c */
    final AbstractC88429b<? super U, ? super T> f201465c;

    static {
        Covode.recordClassIndex(104793);
    }

    /* renamed from: f.a.e.e.e.e$a */
    static final class C88752a<T, U> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super U> f201466a;

        /* renamed from: b */
        final AbstractC88429b<? super U, ? super T> f201467b;

        /* renamed from: c */
        final U f201468c;

        /* renamed from: d */
        AbstractC88412b f201469d;

        /* renamed from: e */
        boolean f201470e;

        static {
            Covode.recordClassIndex(104794);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201469d.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201469d.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201470e) {
                this.f201470e = true;
                this.f201466a.onNext(this.f201468c);
                this.f201466a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201469d, bVar)) {
                this.f201469d = bVar;
                this.f201466a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201470e) {
                C88925a.m154178a(th);
                return;
            }
            this.f201470e = true;
            this.f201466a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201470e) {
                try {
                    this.f201467b.mo10350a(this.f201468c, t);
                } catch (Throwable th) {
                    this.f201469d.dispose();
                    onError(th);
                }
            }
        }

        C88752a(AbstractC88986z<? super U> zVar, U u, AbstractC88429b<? super U, ? super T> bVar) {
            this.f201466a = zVar;
            this.f201467b = bVar;
            this.f201468c = u;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super U> zVar) {
        try {
            this.f201095a.mo143062b(new C88752a(zVar, C88466b.m153697a(this.f201464b.call(), "The initialSupplier returned a null value"), this.f201465c));
        } catch (Throwable th) {
            EnumC88442c.error(th, zVar);
        }
    }

    public C88751e(AbstractC88984x<T> xVar, Callable<? extends U> callable, AbstractC88429b<? super U, ? super T> bVar) {
        super(xVar);
        this.f201464b = callable;
        this.f201465c = bVar;
    }
}
