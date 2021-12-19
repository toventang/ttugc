package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.c.v */
public final class C88626v<T, U> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC88977r<U> f201077b;

    /* renamed from: c */
    final AbstractC88977r<? extends T> f201078c = null;

    static {
        Covode.recordClassIndex(104668);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.c.v$a */
    public static final class C88627a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88975p<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final AbstractC88975p<? super T> f201079a;

        static {
            Covode.recordClassIndex(104669);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201079a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this, bVar);
        }

        C88627a(AbstractC88975p<? super T> pVar) {
            this.f201079a = pVar;
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201079a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            this.f201079a.onSuccess(t);
        }
    }

    /* renamed from: f.a.e.e.c.v$c */
    static final class C88629c<T, U> extends AtomicReference<AbstractC88412b> implements AbstractC88975p<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: a */
        final C88628b<T, U> f201084a;

        static {
            Covode.recordClassIndex(104671);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201084a.mo143057a();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this, bVar);
        }

        C88629c(C88628b<T, U> bVar) {
            this.f201084a = bVar;
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(Object obj) {
            this.f201084a.mo143057a();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            C88628b<T, U> bVar = this.f201084a;
            if (EnumC88441b.dispose(bVar)) {
                bVar.f201080a.onError(th);
            } else {
                C88925a.m154178a(th);
            }
        }
    }

    /* renamed from: f.a.e.e.c.v$b */
    static final class C88628b<T, U> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88975p<T> {
        private static final long serialVersionUID = -5955289211445418871L;

        /* renamed from: a */
        final AbstractC88975p<? super T> f201080a;

        /* renamed from: b */
        final C88629c<T, U> f201081b = new C88629c<>(this);

        /* renamed from: c */
        final AbstractC88977r<? extends T> f201082c;

        /* renamed from: d */
        final C88627a<T> f201083d;

        static {
            Covode.recordClassIndex(104670);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
            EnumC88441b.dispose(this.f201081b);
            C88627a<T> aVar = this.f201083d;
            if (aVar != null) {
                EnumC88441b.dispose(aVar);
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        /* renamed from: a */
        public final void mo143057a() {
            if (EnumC88441b.dispose(this)) {
                AbstractC88977r<? extends T> rVar = this.f201082c;
                if (rVar == null) {
                    this.f201080a.onError(new TimeoutException());
                } else {
                    rVar.mo143239a(this.f201083d);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            EnumC88441b.dispose(this.f201081b);
            if (getAndSet(EnumC88441b.DISPOSED) != EnumC88441b.DISPOSED) {
                this.f201080a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            EnumC88441b.dispose(this.f201081b);
            if (getAndSet(EnumC88441b.DISPOSED) != EnumC88441b.DISPOSED) {
                this.f201080a.onError(th);
            } else {
                C88925a.m154178a(th);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            EnumC88441b.dispose(this.f201081b);
            if (getAndSet(EnumC88441b.DISPOSED) != EnumC88441b.DISPOSED) {
                this.f201080a.onSuccess(t);
            }
        }

        C88628b(AbstractC88975p<? super T> pVar, AbstractC88977r<? extends T> rVar) {
            C88627a<T> aVar;
            this.f201080a = pVar;
            this.f201082c = rVar;
            if (rVar != null) {
                aVar = new C88627a<>(pVar);
            } else {
                aVar = null;
            }
            this.f201083d = aVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        C88628b bVar = new C88628b(pVar, this.f201078c);
        pVar.onSubscribe(bVar);
        this.f201077b.mo143239a(bVar.f201081b);
        this.f200998a.mo143239a(bVar);
    }

    public C88626v(AbstractC88977r<T> rVar, AbstractC88977r<U> rVar2) {
        super(rVar);
        this.f201077b = rVar2;
    }
}
