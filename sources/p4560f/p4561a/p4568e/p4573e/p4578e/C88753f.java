package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88470c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.f */
public final class C88753f<T, U> extends AbstractC88403ab<U> implements AbstractC88470c<U> {

    /* renamed from: a */
    final AbstractC88984x<T> f201471a;

    /* renamed from: b */
    final Callable<? extends U> f201472b;

    /* renamed from: c */
    final AbstractC88429b<? super U, ? super T> f201473c;

    static {
        Covode.recordClassIndex(104795);
    }

    /* renamed from: f.a.e.e.e.f$a */
    static final class C88754a<T, U> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88406ae<? super U> f201474a;

        /* renamed from: b */
        final AbstractC88429b<? super U, ? super T> f201475b;

        /* renamed from: c */
        final U f201476c;

        /* renamed from: d */
        AbstractC88412b f201477d;

        /* renamed from: e */
        boolean f201478e;

        static {
            Covode.recordClassIndex(104796);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201477d.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201477d.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201478e) {
                this.f201478e = true;
                this.f201474a.onSuccess(this.f201476c);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201477d, bVar)) {
                this.f201477d = bVar;
                this.f201474a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201478e) {
                C88925a.m154178a(th);
                return;
            }
            this.f201478e = true;
            this.f201474a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201478e) {
                try {
                    this.f201475b.mo10350a(this.f201476c, t);
                } catch (Throwable th) {
                    this.f201477d.dispose();
                    onError(th);
                }
            }
        }

        C88754a(AbstractC88406ae<? super U> aeVar, U u, AbstractC88429b<? super U, ? super T> bVar) {
            this.f201474a = aeVar;
            this.f201475b = bVar;
            this.f201476c = u;
        }
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88470c
    /* renamed from: a */
    public final AbstractC88979t<U> mo142983a() {
        return C88925a.m154171a(new C88751e(this.f201471a, this.f201472b, this.f201473c));
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super U> aeVar) {
        try {
            this.f201471a.mo143062b(new C88754a(aeVar, C88466b.m153697a(this.f201472b.call(), "The initialSupplier returned a null value"), this.f201473c));
        } catch (Throwable th) {
            EnumC88442c.error(th, aeVar);
        }
    }

    public C88753f(AbstractC88984x<T> xVar, Callable<? extends U> callable, AbstractC88429b<? super U, ? super T> bVar) {
        this.f201471a = xVar;
        this.f201472b = callable;
        this.f201473c = bVar;
    }
}
