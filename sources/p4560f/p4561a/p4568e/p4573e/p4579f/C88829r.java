package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: f.a.e.e.f.r */
public final class C88829r<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<? extends T> f201708a;

    /* renamed from: b */
    final AbstractC88434g<? super Throwable, ? extends T> f201709b = null;

    /* renamed from: c */
    final T f201710c;

    static {
        Covode.recordClassIndex(104871);
    }

    /* renamed from: f.a.e.e.f.r$a */
    final class C88830a implements AbstractC88406ae<T> {

        /* renamed from: b */
        private final AbstractC88406ae<? super T> f201712b;

        static {
            Covode.recordClassIndex(104872);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201712b.onSubscribe(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            this.f201712b.onSuccess(t);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            T t;
            if (C88829r.this.f201709b != null) {
                try {
                    t = (Object) C88829r.this.f201709b.apply(th);
                } catch (Throwable th2) {
                    C88422b.m153670a(th2);
                    this.f201712b.onError(new C88417a(th, th2));
                    return;
                }
            } else {
                t = C88829r.this.f201710c;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f201712b.onError(nullPointerException);
                return;
            }
            this.f201712b.onSuccess(t);
        }

        C88830a(AbstractC88406ae<? super T> aeVar) {
            this.f201712b = aeVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201708a.mo116431a_(new C88830a(aeVar));
    }

    public C88829r(AbstractC88408ag<? extends T> agVar, T t) {
        this.f201708a = agVar;
        this.f201710c = t;
    }
}
