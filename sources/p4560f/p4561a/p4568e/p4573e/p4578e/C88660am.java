package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.AbstractC88477a;

/* renamed from: f.a.e.e.e.am */
public final class C88660am<T, U> extends AbstractC88637a<T, U> {

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends U> f201160b;

    static {
        Covode.recordClassIndex(104702);
    }

    /* renamed from: f.a.e.e.e.am$a */
    static final class C88661a<T, U> extends AbstractC88477a<T, U> {

        /* renamed from: f */
        final AbstractC88434g<? super T, ? extends U> f201161f;

        static {
            Covode.recordClassIndex(104703);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final U poll() {
            Object poll = this.f200718c.poll();
            if (poll != null) {
                return (U) C88466b.m153697a(this.f201161f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo142985a(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: f.a.z */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f200719d) {
                if (this.f200720e != 0) {
                    this.f200716a.onNext(null);
                    return;
                }
                try {
                    this.f200716a.onNext(C88466b.m153697a(this.f201161f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo142986a(th);
                }
            }
        }

        C88661a(AbstractC88986z<? super U> zVar, AbstractC88434g<? super T, ? extends U> gVar) {
            super(zVar);
            this.f201161f = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super U> zVar) {
        this.f201095a.mo143062b(new C88661a(zVar, this.f201160b));
    }

    public C88660am(AbstractC88984x<T> xVar, AbstractC88434g<? super T, ? extends U> gVar) {
        super(xVar);
        this.f201160b = gVar;
    }
}
