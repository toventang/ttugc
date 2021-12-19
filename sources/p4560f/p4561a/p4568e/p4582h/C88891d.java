package p4560f.p4561a.p4568e.p4582h;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88901c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.h.d */
public final class C88891d<T> extends AtomicInteger implements AbstractC88955l<T>, AbstractC90215d {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: a */
    final AbstractC90214c<? super T> f201887a;

    /* renamed from: b */
    final C88901c f201888b = new C88901c();

    /* renamed from: c */
    final AtomicLong f201889c = new AtomicLong();

    /* renamed from: d */
    final AtomicReference<AbstractC90215d> f201890d = new AtomicReference<>();

    /* renamed from: e */
    final AtomicBoolean f201891e = new AtomicBoolean();

    /* renamed from: f */
    volatile boolean f201892f;

    static {
        Covode.recordClassIndex(104933);
    }

    @Override // org.p4663a.AbstractC90215d
    public final void cancel() {
        if (!this.f201892f) {
            EnumC88897f.cancel(this.f201890d);
        }
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onComplete() {
        this.f201892f = true;
        AbstractC90214c<? super T> cVar = this.f201887a;
        C88901c cVar2 = this.f201888b;
        if (getAndIncrement() == 0) {
            Throwable terminate = cVar2.terminate();
            if (terminate != null) {
                cVar.onError(terminate);
            } else {
                cVar.onComplete();
            }
        }
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onError(Throwable th) {
        this.f201892f = true;
        AbstractC90214c<? super T> cVar = this.f201887a;
        C88901c cVar2 = this.f201888b;
        if (!cVar2.addThrowable(th)) {
            C88925a.m154178a(th);
        } else if (getAndIncrement() == 0) {
            cVar.onError(cVar2.terminate());
        }
    }

    public C88891d(AbstractC90214c<? super T> cVar) {
        this.f201887a = cVar;
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onNext(T t) {
        AbstractC90214c<? super T> cVar = this.f201887a;
        C88901c cVar2 = this.f201888b;
        if (get() == 0 && compareAndSet(0, 1)) {
            cVar.onNext(t);
            if (decrementAndGet() != 0) {
                Throwable terminate = cVar2.terminate();
                if (terminate != null) {
                    cVar.onError(terminate);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }

    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    public final void onSubscribe(AbstractC90215d dVar) {
        if (this.f201891e.compareAndSet(false, true)) {
            this.f201887a.onSubscribe(this);
            EnumC88897f.deferredSetOnce(this.f201890d, this.f201889c, dVar);
            return;
        }
        dVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was ".concat(String.valueOf(j))));
            return;
        }
        EnumC88897f.deferredRequest(this.f201890d, this.f201889c, j);
    }
}
