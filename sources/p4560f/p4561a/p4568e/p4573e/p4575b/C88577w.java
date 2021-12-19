package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4583i.C88896e;

/* renamed from: f.a.e.e.b.w */
public final class C88577w<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final AbstractC88438k<? super Throwable> f200981c;

    /* renamed from: d */
    final long f200982d;

    static {
        Covode.recordClassIndex(104619);
    }

    /* renamed from: f.a.e.e.b.w$a */
    static final class C88578a<T> extends AtomicInteger implements AbstractC88955l<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: a */
        final AbstractC90214c<? super T> f200983a;

        /* renamed from: b */
        final C88896e f200984b;

        /* renamed from: c */
        final AbstractC90213b<? extends T> f200985c;

        /* renamed from: d */
        final AbstractC88438k<? super Throwable> f200986d;

        /* renamed from: e */
        long f200987e;

        /* renamed from: f */
        long f200988f;

        static {
            Covode.recordClassIndex(104620);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            this.f200983a.onComplete();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143046a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f200984b.isCancelled()) {
                    long j = this.f200988f;
                    if (j != 0) {
                        this.f200988f = 0;
                        this.f200984b.produced(j);
                    }
                    this.f200985c.mo57509a_(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            this.f200984b.setSubscription(dVar);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            this.f200988f++;
            this.f200983a.onNext(t);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            long j = this.f200987e;
            if (j != Long.MAX_VALUE) {
                this.f200987e = j - 1;
            }
            if (j == 0) {
                this.f200983a.onError(th);
                return;
            }
            try {
                if (!this.f200986d.mo7718a(th)) {
                    this.f200983a.onError(th);
                } else {
                    mo143046a();
                }
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f200983a.onError(new C88417a(th, th2));
            }
        }

        C88578a(AbstractC90214c<? super T> cVar, long j, AbstractC88438k<? super Throwable> kVar, C88896e eVar, AbstractC90213b<? extends T> bVar) {
            this.f200983a = cVar;
            this.f200984b = eVar;
            this.f200985c = bVar;
            this.f200986d = kVar;
            this.f200987e = j;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        C88896e eVar = new C88896e(false);
        cVar.onSubscribe(eVar);
        new C88578a(cVar, this.f200982d, this.f200981c, eVar, this.f200799b).mo143046a();
    }

    public C88577w(AbstractC88924h<T> hVar, long j, AbstractC88438k<? super Throwable> kVar) {
        super(hVar);
        this.f200981c = kVar;
        this.f200982d = j;
    }
}
