package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.f.b */
public final class C88801b<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201653a;

    /* renamed from: b */
    final AbstractC88433f<? super T> f201654b;

    static {
        Covode.recordClassIndex(104843);
    }

    /* renamed from: f.a.e.e.f.b$a */
    static final class C88802a<T> implements AbstractC88406ae<T>, AbstractC88412b {

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201655a;

        /* renamed from: b */
        final AbstractC88433f<? super T> f201656b;

        /* renamed from: c */
        AbstractC88412b f201657c;

        static {
            Covode.recordClassIndex(104844);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201657c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201657c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201655a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201657c, bVar)) {
                this.f201657c = bVar;
                this.f201655a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            this.f201655a.onSuccess(t);
            try {
                this.f201656b.accept(t);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(th);
            }
        }

        C88802a(AbstractC88406ae<? super T> aeVar, AbstractC88433f<? super T> fVar) {
            this.f201655a = aeVar;
            this.f201656b = fVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201653a.mo116431a_(new C88802a(aeVar, this.f201654b));
    }

    public C88801b(AbstractC88408ag<T> agVar, AbstractC88433f<? super T> fVar) {
        this.f201653a = agVar;
        this.f201654b = fVar;
    }
}
