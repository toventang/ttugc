package p4560f.p4561a.p4568e.p4573e.p4574a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.C88445f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.a.k */
public final class C88512k extends AbstractC88410b {

    /* renamed from: a */
    final AbstractC88917f f200794a;

    /* renamed from: b */
    final AbstractC88398aa f200795b;

    static {
        Covode.recordClassIndex(104554);
    }

    /* renamed from: f.a.e.e.a.k$a */
    static final class RunnableC88513a extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88427d, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: a */
        final AbstractC88427d f200796a;

        /* renamed from: b */
        final C88445f f200797b = new C88445f();

        /* renamed from: c */
        final AbstractC88917f f200798c;

        static {
            Covode.recordClassIndex(104555);
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onComplete() {
            this.f200796a.onComplete();
        }

        public final void run() {
            this.f200798c.mo17931a(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
            this.f200797b.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onError(Throwable th) {
            this.f200796a.onError(th);
        }

        RunnableC88513a(AbstractC88427d dVar, AbstractC88917f fVar) {
            this.f200796a = dVar;
            this.f200798c = fVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        RunnableC88513a aVar = new RunnableC88513a(dVar, this.f200794a);
        dVar.onSubscribe(aVar);
        aVar.f200797b.replace(this.f200795b.mo142900a(aVar));
    }

    public C88512k(AbstractC88917f fVar, AbstractC88398aa aaVar) {
        this.f200794a = fVar;
        this.f200795b = aaVar;
    }
}
