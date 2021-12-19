package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4569a.C88445f;

/* renamed from: f.a.e.e.e.av */
public final class C88686av<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88438k<? super Throwable> f201238b;

    /* renamed from: c */
    final long f201239c;

    static {
        Covode.recordClassIndex(104728);
    }

    /* renamed from: f.a.e.e.e.av$a */
    static final class C88687a<T> extends AtomicInteger implements AbstractC88986z<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201240a;

        /* renamed from: b */
        final C88445f f201241b;

        /* renamed from: c */
        final AbstractC88984x<? extends T> f201242c;

        /* renamed from: d */
        final AbstractC88438k<? super Throwable> f201243d;

        /* renamed from: e */
        long f201244e;

        static {
            Covode.recordClassIndex(104729);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201240a.onComplete();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143078a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f201241b.isDisposed()) {
                    this.f201242c.mo143062b(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201240a.onNext(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201241b.replace(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            long j = this.f201244e;
            if (j != Long.MAX_VALUE) {
                this.f201244e = j - 1;
            }
            if (j == 0) {
                this.f201240a.onError(th);
                return;
            }
            try {
                if (!this.f201243d.mo7718a(th)) {
                    this.f201240a.onError(th);
                } else {
                    mo143078a();
                }
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f201240a.onError(new C88417a(th, th2));
            }
        }

        C88687a(AbstractC88986z<? super T> zVar, long j, AbstractC88438k<? super Throwable> kVar, C88445f fVar, AbstractC88984x<? extends T> xVar) {
            this.f201240a = zVar;
            this.f201241b = fVar;
            this.f201242c = xVar;
            this.f201243d = kVar;
            this.f201244e = j;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88445f fVar = new C88445f();
        zVar.onSubscribe(fVar);
        new C88687a(zVar, this.f201239c, this.f201238b, fVar, this.f201095a).mo143078a();
    }

    public C88686av(AbstractC88979t<T> tVar, long j, AbstractC88438k<? super Throwable> kVar) {
        super(tVar);
        this.f201238b = kVar;
        this.f201239c = j;
    }
}
