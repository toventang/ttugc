package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88429b;

/* renamed from: f.a.e.e.f.f */
public final class C88809f<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201671a;

    /* renamed from: b */
    final AbstractC88429b<? super T, ? super Throwable> f201672b;

    static {
        Covode.recordClassIndex(104851);
    }

    /* renamed from: f.a.e.e.f.f$a */
    final class C88810a implements AbstractC88406ae<T> {

        /* renamed from: b */
        private final AbstractC88406ae<? super T> f201674b;

        static {
            Covode.recordClassIndex(104852);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201674b.onSubscribe(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            try {
                C88809f.this.f201672b.mo10350a(t, null);
                this.f201674b.onSuccess(t);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201674b.onError(th);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            try {
                C88809f.this.f201672b.mo10350a(null, th);
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                th = new C88417a(th, th2);
            }
            this.f201674b.onError(th);
        }

        C88810a(AbstractC88406ae<? super T> aeVar) {
            this.f201674b = aeVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201671a.mo116431a_(new C88810a(aeVar));
    }

    public C88809f(AbstractC88408ag<T> agVar, AbstractC88429b<? super T, ? super Throwable> bVar) {
        this.f201671a = agVar;
        this.f201672b = bVar;
    }
}
