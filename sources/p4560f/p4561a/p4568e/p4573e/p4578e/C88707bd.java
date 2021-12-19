package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.e.bd */
public final class C88707bd<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88398aa f201295b;

    static {
        Covode.recordClassIndex(104749);
    }

    /* renamed from: f.a.e.e.e.bd$a */
    static final class C88708a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88986z<T> {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201296a;

        /* renamed from: b */
        final AtomicReference<AbstractC88412b> f201297b = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104750);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201296a.onComplete();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this.f201297b);
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201296a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201296a.onNext(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this.f201297b, bVar);
        }

        C88708a(AbstractC88986z<? super T> zVar) {
            this.f201296a = zVar;
        }
    }

    /* renamed from: f.a.e.e.e.bd$b */
    final class RunnableC88709b implements Runnable {

        /* renamed from: b */
        private final C88708a<T> f201299b;

        static {
            Covode.recordClassIndex(104751);
        }

        public final void run() {
            C88707bd.this.f201095a.mo143062b(this.f201299b);
        }

        RunnableC88709b(C88708a<T> aVar) {
            this.f201299b = aVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88708a aVar = new C88708a(zVar);
        zVar.onSubscribe(aVar);
        EnumC88441b.setOnce(aVar, this.f201295b.mo142900a(new RunnableC88709b(aVar)));
    }

    public C88707bd(AbstractC88984x<T> xVar, AbstractC88398aa aaVar) {
        super(xVar);
        this.f201295b = aaVar;
    }
}
