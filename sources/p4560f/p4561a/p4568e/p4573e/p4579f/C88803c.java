package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.f.c */
public final class C88803c<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201658a;

    /* renamed from: b */
    final AbstractC88428a f201659b;

    static {
        Covode.recordClassIndex(104845);
    }

    /* renamed from: f.a.e.e.f.c$a */
    static final class C88804a<T> extends AtomicInteger implements AbstractC88406ae<T>, AbstractC88412b {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201660a;

        /* renamed from: b */
        final AbstractC88428a f201661b;

        /* renamed from: c */
        AbstractC88412b f201662c;

        static {
            Covode.recordClassIndex(104846);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201662c.isDisposed();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201662c.dispose();
            m154011a();
        }

        /* renamed from: a */
        private void m154011a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f201661b.mo8579a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    C88925a.m154178a(th);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201660a.onError(th);
            m154011a();
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201662c, bVar)) {
                this.f201662c = bVar;
                this.f201660a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            this.f201660a.onSuccess(t);
            m154011a();
        }

        C88804a(AbstractC88406ae<? super T> aeVar, AbstractC88428a aVar) {
            this.f201660a = aeVar;
            this.f201661b = aVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        this.f201658a.mo116431a_(new C88804a(aeVar, this.f201659b));
    }

    public C88803c(AbstractC88408ag<T> agVar, AbstractC88428a aVar) {
        this.f201658a = agVar;
        this.f201659b = aVar;
    }
}
