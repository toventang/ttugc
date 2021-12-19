package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.c.u */
public final class C88623u<T, U> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC90213b<U> f201073b;

    static {
        Covode.recordClassIndex(104665);
    }

    /* renamed from: f.a.e.e.c.u$a */
    static final class C88624a<T, U> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88975p<T> {
        private static final long serialVersionUID = -2187421758664251153L;

        /* renamed from: a */
        final AbstractC88975p<? super T> f201074a;

        /* renamed from: b */
        final C88625a<U> f201075b = new C88625a<>(this);

        static {
            Covode.recordClassIndex(104666);
        }

        /* renamed from: f.a.e.e.c.u$a$a */
        static final class C88625a<U> extends AtomicReference<AbstractC90215d> implements AbstractC88955l<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* renamed from: a */
            final C88624a<?, U> f201076a;

            static {
                Covode.recordClassIndex(104667);
            }

            @Override // org.p4663a.AbstractC90214c
            public final void onComplete() {
                this.f201076a.mo143056a();
            }

            C88625a(C88624a<?, U> aVar) {
                this.f201076a = aVar;
            }

            @Override // org.p4663a.AbstractC90214c
            public final void onNext(Object obj) {
                EnumC88897f.cancel(this);
                this.f201076a.mo143056a();
            }

            @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
            public final void onSubscribe(AbstractC90215d dVar) {
                EnumC88897f.setOnce(this, dVar, Long.MAX_VALUE);
            }

            @Override // org.p4663a.AbstractC90214c
            public final void onError(Throwable th) {
                C88624a<?, U> aVar = this.f201076a;
                if (EnumC88441b.dispose(aVar)) {
                    aVar.f201074a.onError(th);
                } else {
                    C88925a.m154178a(th);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143056a() {
            if (EnumC88441b.dispose(this)) {
                this.f201074a.onComplete();
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
            EnumC88897f.cancel(this.f201075b);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            EnumC88897f.cancel(this.f201075b);
            if (getAndSet(EnumC88441b.DISPOSED) != EnumC88441b.DISPOSED) {
                this.f201074a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this, bVar);
        }

        C88624a(AbstractC88975p<? super T> pVar) {
            this.f201074a = pVar;
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            EnumC88897f.cancel(this.f201075b);
            if (getAndSet(EnumC88441b.DISPOSED) != EnumC88441b.DISPOSED) {
                this.f201074a.onError(th);
            } else {
                C88925a.m154178a(th);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            EnumC88897f.cancel(this.f201075b);
            if (getAndSet(EnumC88441b.DISPOSED) != EnumC88441b.DISPOSED) {
                this.f201074a.onSuccess(t);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        C88624a aVar = new C88624a(pVar);
        pVar.onSubscribe(aVar);
        this.f201073b.mo57509a_(aVar.f201075b);
        this.f200998a.mo143239a(aVar);
    }

    public C88623u(AbstractC88977r<T> rVar, AbstractC90213b<U> bVar) {
        super(rVar);
        this.f201073b = bVar;
    }
}
