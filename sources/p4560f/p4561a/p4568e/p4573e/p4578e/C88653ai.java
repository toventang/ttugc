package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88470c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.ai */
public final class C88653ai<T> extends AbstractC88410b implements AbstractC88470c<T> {

    /* renamed from: a */
    final AbstractC88984x<T> f201141a;

    static {
        Covode.recordClassIndex(104695);
    }

    /* renamed from: f.a.e.e.e.ai$a */
    static final class C88654a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88427d f201142a;

        /* renamed from: b */
        AbstractC88412b f201143b;

        static {
            Covode.recordClassIndex(104696);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201143b.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201143b.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201142a.onComplete();
        }

        C88654a(AbstractC88427d dVar) {
            this.f201142a = dVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201142a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201143b = bVar;
            this.f201142a.onSubscribe(this);
        }
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88470c
    /* renamed from: a */
    public final AbstractC88979t<T> mo142983a() {
        return C88925a.m154171a(new C88651ah(this.f201141a));
    }

    public C88653ai(AbstractC88984x<T> xVar) {
        this.f201141a = xVar;
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        this.f201141a.mo143062b(new C88654a(dVar));
    }
}
