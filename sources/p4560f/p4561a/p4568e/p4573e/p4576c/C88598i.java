package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.c.i */
public final class C88598i<T> extends AbstractC88410b {

    /* renamed from: a */
    final AbstractC88977r<T> f201022a;

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends AbstractC88917f> f201023b;

    static {
        Covode.recordClassIndex(104640);
    }

    /* renamed from: f.a.e.e.c.i$a */
    static final class C88599a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88427d, AbstractC88975p<T> {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: a */
        final AbstractC88427d f201024a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88917f> f201025b;

        static {
            Covode.recordClassIndex(104641);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.AbstractC88975p, p4560f.p4561a.AbstractC88427d
        public final void onComplete() {
            this.f201024a.onComplete();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88975p, p4560f.p4561a.AbstractC88427d
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.replace(this, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88975p, p4560f.p4561a.AbstractC88427d
        public final void onError(Throwable th) {
            this.f201024a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            try {
                AbstractC88917f fVar = (AbstractC88917f) C88466b.m153697a(this.f201025b.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    fVar.mo17931a(this);
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                onError(th);
            }
        }

        C88599a(AbstractC88427d dVar, AbstractC88434g<? super T, ? extends AbstractC88917f> gVar) {
            this.f201024a = dVar;
            this.f201025b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        C88599a aVar = new C88599a(dVar, this.f201023b);
        dVar.onSubscribe(aVar);
        this.f201022a.mo143239a(aVar);
    }

    public C88598i(AbstractC88977r<T> rVar, AbstractC88434g<? super T, ? extends AbstractC88917f> gVar) {
        this.f201022a = rVar;
        this.f201023b = gVar;
    }
}
