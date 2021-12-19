package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.ba */
public final class C88701ba<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88984x<? extends T> f201279a;

    /* renamed from: b */
    final T f201280b = null;

    static {
        Covode.recordClassIndex(104743);
    }

    /* renamed from: f.a.e.e.e.ba$a */
    static final class C88702a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201281a;

        /* renamed from: b */
        final T f201282b;

        /* renamed from: c */
        AbstractC88412b f201283c;

        /* renamed from: d */
        T f201284d;

        /* renamed from: e */
        boolean f201285e;

        static {
            Covode.recordClassIndex(104744);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201283c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201283c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201285e) {
                this.f201285e = true;
                T t = this.f201284d;
                this.f201284d = null;
                if (t == null && (t = this.f201282b) == null) {
                    this.f201281a.onError(new NoSuchElementException());
                } else {
                    this.f201281a.onSuccess(t);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201283c, bVar)) {
                this.f201283c = bVar;
                this.f201281a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201285e) {
                C88925a.m154178a(th);
                return;
            }
            this.f201285e = true;
            this.f201281a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201285e) {
                if (this.f201284d != null) {
                    this.f201285e = true;
                    this.f201283c.dispose();
                    this.f201281a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f201284d = t;
            }
        }

        C88702a(AbstractC88406ae<? super T> aeVar, T t) {
            this.f201281a = aeVar;
            this.f201282b = t;
        }
    }

    public C88701ba(AbstractC88984x<? extends T> xVar) {
        this.f201279a = xVar;
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201279a.mo143062b(new C88702a(aeVar, this.f201280b));
    }
}
