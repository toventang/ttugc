package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.f.u */
public final class C88835u<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final AbstractC88408ag<T> f201722a;

    /* renamed from: b */
    final long f201723b;

    /* renamed from: c */
    final TimeUnit f201724c;

    /* renamed from: d */
    final AbstractC88398aa f201725d;

    /* renamed from: e */
    final AbstractC88408ag<? extends T> f201726e;

    static {
        Covode.recordClassIndex(104877);
    }

    /* renamed from: f.a.e.e.f.u$a */
    static final class RunnableC88836a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T>, AbstractC88412b, Runnable {
        private static final long serialVersionUID = 37497744973048446L;

        /* renamed from: a */
        final AbstractC88406ae<? super T> f201727a;

        /* renamed from: b */
        final AtomicReference<AbstractC88412b> f201728b = new AtomicReference<>();

        /* renamed from: c */
        final C88837a<T> f201729c;

        /* renamed from: d */
        AbstractC88408ag<? extends T> f201730d;

        /* renamed from: e */
        final long f201731e;

        /* renamed from: f */
        final TimeUnit f201732f;

        static {
            Covode.recordClassIndex(104878);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
            EnumC88441b.dispose(this.f201728b);
            C88837a<T> aVar = this.f201729c;
            if (aVar != null) {
                EnumC88441b.dispose(aVar);
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        public final void run() {
            AbstractC88412b bVar = (AbstractC88412b) get();
            if (bVar != EnumC88441b.DISPOSED && compareAndSet(bVar, EnumC88441b.DISPOSED)) {
                if (bVar != null) {
                    bVar.dispose();
                }
                AbstractC88408ag<? extends T> agVar = this.f201730d;
                if (agVar == null) {
                    this.f201727a.onError(new TimeoutException(C88906h.m154105a(this.f201731e, this.f201732f)));
                    return;
                }
                this.f201730d = null;
                agVar.mo116431a_(this.f201729c);
            }
        }

        /* renamed from: f.a.e.e.f.u$a$a */
        static final class C88837a<T> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T> {
            private static final long serialVersionUID = 2071387740092105509L;

            /* renamed from: a */
            final AbstractC88406ae<? super T> f201733a;

            static {
                Covode.recordClassIndex(104879);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                EnumC88441b.setOnce(this, bVar);
            }

            C88837a(AbstractC88406ae<? super T> aeVar) {
                this.f201733a = aeVar;
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                this.f201733a.onError(th);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSuccess(T t) {
                this.f201733a.onSuccess(t);
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            Object obj = get();
            if (obj == EnumC88441b.DISPOSED || !compareAndSet(obj, EnumC88441b.DISPOSED)) {
                C88925a.m154178a(th);
                return;
            }
            EnumC88441b.dispose(this.f201728b);
            this.f201727a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            Object obj = get();
            if (obj != EnumC88441b.DISPOSED && compareAndSet(obj, EnumC88441b.DISPOSED)) {
                EnumC88441b.dispose(this.f201728b);
                this.f201727a.onSuccess(t);
            }
        }

        RunnableC88836a(AbstractC88406ae<? super T> aeVar, AbstractC88408ag<? extends T> agVar, long j, TimeUnit timeUnit) {
            this.f201727a = aeVar;
            this.f201730d = agVar;
            this.f201731e = j;
            this.f201732f = timeUnit;
            if (agVar != null) {
                this.f201729c = new C88837a<>(aeVar);
            } else {
                this.f201729c = null;
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        RunnableC88836a aVar = new RunnableC88836a(aeVar, this.f201726e, this.f201723b, this.f201724c);
        aeVar.onSubscribe(aVar);
        EnumC88441b.replace(aVar.f201728b, this.f201725d.mo20705a(aVar, this.f201723b, this.f201724c));
        this.f201722a.mo116431a_(aVar);
    }

    public C88835u(AbstractC88408ag<T> agVar, long j, TimeUnit timeUnit, AbstractC88398aa aaVar, AbstractC88408ag<? extends T> agVar2) {
        this.f201722a = agVar;
        this.f201723b = j;
        this.f201724c = timeUnit;
        this.f201725d = aaVar;
        this.f201726e = agVar2;
    }
}
