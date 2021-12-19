package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.f.g */
public final class C88811g<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201675a;

    /* renamed from: b */
    final AbstractC88433f<? super AbstractC88412b> f201676b;

    static {
        Covode.recordClassIndex(104853);
    }

    /* renamed from: f.a.e.e.f.g$a */
    static final class C88812a<T> implements AbstractC88406ae<T> {

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201677a;

        /* renamed from: b */
        final AbstractC88433f<? super AbstractC88412b> f201678b;

        /* renamed from: c */
        boolean f201679c;

        static {
            Covode.recordClassIndex(104854);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            if (this.f201679c) {
                C88925a.m154178a(th);
            } else {
                this.f201677a.onError(th);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            if (!this.f201679c) {
                this.f201677a.onSuccess(t);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            try {
                this.f201678b.accept(bVar);
                this.f201677a.onSubscribe(bVar);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201679c = true;
                bVar.dispose();
                EnumC88442c.error(th, this.f201677a);
            }
        }

        C88812a(AbstractC88406ae<? super T> aeVar, AbstractC88433f<? super AbstractC88412b> fVar) {
            this.f201677a = aeVar;
            this.f201678b = fVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201675a.mo116431a_(new C88812a(aeVar, this.f201676b));
    }

    public C88811g(AbstractC88408ag<T> agVar, AbstractC88433f<? super AbstractC88412b> fVar) {
        this.f201675a = agVar;
        this.f201676b = fVar;
    }
}
