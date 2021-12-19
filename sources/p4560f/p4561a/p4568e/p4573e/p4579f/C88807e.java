package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: f.a.e.e.f.e */
public final class C88807e<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201667a;

    /* renamed from: b */
    final AbstractC88433f<? super Throwable> f201668b;

    static {
        Covode.recordClassIndex(104849);
    }

    /* renamed from: f.a.e.e.f.e$a */
    final class C88808a implements AbstractC88406ae<T> {

        /* renamed from: b */
        private final AbstractC88406ae<? super T> f201670b;

        static {
            Covode.recordClassIndex(104850);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201670b.onSubscribe(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            this.f201670b.onSuccess(t);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            try {
                C88807e.this.f201668b.accept(th);
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                th = new C88417a(th, th2);
            }
            this.f201670b.onError(th);
        }

        C88808a(AbstractC88406ae<? super T> aeVar) {
            this.f201670b = aeVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201667a.mo116431a_(new C88808a(aeVar));
    }

    public C88807e(AbstractC88408ag<T> agVar, AbstractC88433f<? super Throwable> fVar) {
        this.f201667a = agVar;
        this.f201668b = fVar;
    }
}
