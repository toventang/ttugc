package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88470c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.u */
public final class C88788u<T> extends AbstractC88403ab<T> implements AbstractC88470c<T> {

    /* renamed from: a */
    final AbstractC88984x<T> f201607a;

    /* renamed from: b */
    final long f201608b = 0;

    /* renamed from: c */
    final T f201609c = null;

    static {
        Covode.recordClassIndex(104830);
    }

    /* renamed from: f.a.e.e.e.u$a */
    static final class C88789a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201610a;

        /* renamed from: b */
        final long f201611b;

        /* renamed from: c */
        final T f201612c;

        /* renamed from: d */
        AbstractC88412b f201613d;

        /* renamed from: e */
        long f201614e;

        /* renamed from: f */
        boolean f201615f;

        static {
            Covode.recordClassIndex(104831);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201613d.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201613d.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201615f) {
                this.f201615f = true;
                T t = this.f201612c;
                if (t != null) {
                    this.f201610a.onSuccess(t);
                } else {
                    this.f201610a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201613d, bVar)) {
                this.f201613d = bVar;
                this.f201610a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201615f) {
                C88925a.m154178a(th);
                return;
            }
            this.f201615f = true;
            this.f201610a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201615f) {
                long j = this.f201614e;
                if (j == this.f201611b) {
                    this.f201615f = true;
                    this.f201613d.dispose();
                    this.f201610a.onSuccess(t);
                    return;
                }
                this.f201614e = j + 1;
            }
        }

        C88789a(AbstractC88406ae<? super T> aeVar, long j, T t) {
            this.f201610a = aeVar;
            this.f201611b = j;
            this.f201612c = t;
        }
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88470c
    /* renamed from: a */
    public final AbstractC88979t<T> mo142983a() {
        return C88925a.m154171a(new C88784s(this.f201607a, this.f201608b, this.f201609c, true));
    }

    public C88788u(AbstractC88984x<T> xVar) {
        this.f201607a = xVar;
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201607a.mo143062b(new C88789a(aeVar, this.f201608b, this.f201609c));
    }
}
