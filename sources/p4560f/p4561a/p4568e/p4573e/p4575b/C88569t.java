package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88423c;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.t */
public final class C88569t<T> extends AbstractC88514a<T, T> {
    static {
        Covode.recordClassIndex(104611);
    }

    /* renamed from: f.a.e.e.b.t$a */
    static final class C88570a<T> extends AtomicLong implements AbstractC88955l<T>, AbstractC90215d {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: a */
        final AbstractC90214c<? super T> f200962a;

        /* renamed from: b */
        AbstractC90215d f200963b;

        /* renamed from: c */
        boolean f200964c;

        static {
            Covode.recordClassIndex(104612);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            this.f200963b.cancel();
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            if (!this.f200964c) {
                this.f200964c = true;
                this.f200962a.onComplete();
            }
        }

        C88570a(AbstractC90214c<? super T> cVar) {
            this.f200962a = cVar;
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                C88902d.m154098a(this, j);
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            if (this.f200964c) {
                C88925a.m154178a(th);
                return;
            }
            this.f200964c = true;
            this.f200962a.onError(th);
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200963b, dVar)) {
                this.f200963b = dVar;
                this.f200962a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f200964c) {
                if (get() != 0) {
                    this.f200962a.onNext(t);
                    C88902d.m154099b(this, 1);
                    return;
                }
                onError(new C88423c("could not emit value due to lack of requests"));
            }
        }
    }

    public C88569t(AbstractC88924h<T> hVar) {
        super(hVar);
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f200799b.mo143201a((AbstractC88955l) new C88570a(cVar));
    }
}
