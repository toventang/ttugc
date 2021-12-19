package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;
import p4560f.p4561a.p4568e.p4572d.AbstractC88478b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.p */
public final class C88779p<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88428a f201571b;

    static {
        Covode.recordClassIndex(104821);
    }

    /* renamed from: f.a.e.e.e.p$a */
    static final class C88780a<T> extends AbstractC88478b<T> implements AbstractC88986z<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201572a;

        /* renamed from: b */
        final AbstractC88428a f201573b;

        /* renamed from: c */
        AbstractC88412b f201574c;

        /* renamed from: d */
        AbstractC88471d<T> f201575d;

        /* renamed from: e */
        boolean f201576e;

        static {
            Covode.recordClassIndex(104822);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            this.f201575d.clear();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201574c.isDisposed();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            return this.f201575d.isEmpty();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201574c.dispose();
            m153984a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201572a.onComplete();
            m153984a();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            T poll = this.f201575d.poll();
            if (poll == null && this.f201576e) {
                m153984a();
            }
            return poll;
        }

        /* renamed from: a */
        private void m153984a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f201573b.mo8579a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    C88925a.m154178a(th);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201572a.onNext(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201572a.onError(th);
            m153984a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201574c, bVar)) {
                this.f201574c = bVar;
                if (bVar instanceof AbstractC88471d) {
                    this.f201575d = (AbstractC88471d) bVar;
                }
                this.f201572a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            AbstractC88471d<T> dVar = this.f201575d;
            boolean z = false;
            if (dVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = dVar.requestFusion(i);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.f201576e = z;
            }
            return requestFusion;
        }

        C88780a(AbstractC88986z<? super T> zVar, AbstractC88428a aVar) {
            this.f201572a = zVar;
            this.f201573b = aVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88780a(zVar, this.f201571b));
    }

    public C88779p(AbstractC88984x<T> xVar, AbstractC88428a aVar) {
        super(xVar);
        this.f201571b = aVar;
    }
}
