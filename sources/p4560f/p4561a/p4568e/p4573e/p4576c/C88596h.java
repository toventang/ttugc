package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.c.h */
public final class C88596h<T> extends AbstractC88973n<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201017a;

    /* renamed from: b */
    final AbstractC88438k<? super T> f201018b;

    static {
        Covode.recordClassIndex(104638);
    }

    /* renamed from: f.a.e.e.c.h$a */
    static final class C88597a<T> implements AbstractC88406ae<T>, AbstractC88412b {

        /* renamed from: a */
        final AbstractC88975p<? super T> f201019a;

        /* renamed from: b */
        final AbstractC88438k<? super T> f201020b;

        /* renamed from: c */
        AbstractC88412b f201021c;

        static {
            Covode.recordClassIndex(104639);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201021c.isDisposed();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            AbstractC88412b bVar = this.f201021c;
            this.f201021c = EnumC88441b.DISPOSED;
            bVar.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201019a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201021c, bVar)) {
                this.f201021c = bVar;
                this.f201019a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            try {
                if (this.f201020b.mo7718a(t)) {
                    this.f201019a.onSuccess(t);
                } else {
                    this.f201019a.onComplete();
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201019a.onError(th);
            }
        }

        C88597a(AbstractC88975p<? super T> pVar, AbstractC88438k<? super T> kVar) {
            this.f201019a = pVar;
            this.f201020b = kVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f201017a.mo116431a_(new C88597a(pVar, this.f201018b));
    }

    public C88596h(AbstractC88408ag<T> agVar, AbstractC88438k<? super T> kVar) {
        this.f201017a = agVar;
        this.f201018b = kVar;
    }
}
