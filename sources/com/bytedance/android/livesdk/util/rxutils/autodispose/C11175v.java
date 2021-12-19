package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.android.livesdk.util.rxutils.autodispose.p650c.AbstractC11150c;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4586g.AbstractC88921a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.v */
final class C11175v<T> extends AtomicInteger implements AbstractC11150c<T> {

    /* renamed from: a */
    final AtomicReference<AbstractC90215d> f26798a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<AbstractC88412b> f26799b = new AtomicReference<>();

    /* renamed from: c */
    private final C11147c f26800c = new C11147c();

    /* renamed from: d */
    private final AtomicReference<AbstractC90215d> f26801d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicLong f26802e = new AtomicLong();

    /* renamed from: f */
    private final AbstractC88917f f26803f;

    /* renamed from: g */
    private final AbstractC90214c<? super T> f26804g;

    static {
        Covode.recordClassIndex(12802);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        cancel();
    }

    @Override // org.p4663a.AbstractC90215d
    public final void cancel() {
        EnumC11151d.m19787a(this.f26799b);
        EnumC11177w.m19820a(this.f26798a);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (this.f26798a.get() == EnumC11177w.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onComplete() {
        if (!isDisposed()) {
            this.f26798a.lazySet(EnumC11177w.CANCELLED);
            EnumC11151d.m19787a(this.f26799b);
            AbstractC90214c<? super T> cVar = this.f26804g;
            C11147c cVar2 = this.f26800c;
            if (getAndIncrement() == 0) {
                Throwable a = cVar2.mo17940a();
                if (a != null) {
                    cVar.onError(a);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f26798a.lazySet(EnumC11177w.CANCELLED);
            EnumC11151d.m19787a(this.f26799b);
            AbstractC90214c<? super T> cVar = this.f26804g;
            C11147c cVar2 = this.f26800c;
            if (!cVar2.mo17941a(th)) {
                C88925a.m154178a(th);
            } else if (getAndIncrement() == 0) {
                cVar.onError(cVar2.mo17940a());
            }
        }
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onNext(T t) {
        if (!isDisposed()) {
            AbstractC90214c<? super T> cVar = this.f26804g;
            C11147c cVar2 = this.f26800c;
            if (get() == 0 && compareAndSet(0, 1)) {
                cVar.onNext(t);
                if (decrementAndGet() != 0) {
                    Throwable a = cVar2.mo17940a();
                    if (a != null) {
                        cVar.onError(a);
                    } else {
                        cVar.onComplete();
                    }
                    this.f26798a.lazySet(EnumC11177w.CANCELLED);
                    EnumC11151d.m19787a(this.f26799b);
                }
            }
        }
    }

    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    public final void onSubscribe(AbstractC90215d dVar) {
        C111761 r2 = new AbstractC88921a() {
            /* class com.bytedance.android.livesdk.util.rxutils.autodispose.C11175v.C111761 */

            static {
                Covode.recordClassIndex(12803);
            }

            @Override // p4560f.p4561a.AbstractC88427d
            public final void onComplete() {
                C11175v.this.f26799b.lazySet(EnumC11151d.DISPOSED);
                EnumC11177w.m19820a(C11175v.this.f26798a);
            }

            @Override // p4560f.p4561a.AbstractC88427d
            public final void onError(Throwable th) {
                C11175v.this.f26799b.lazySet(EnumC11151d.DISPOSED);
                C11175v.this.onError(th);
            }
        };
        if (C11165n.m19815a(this.f26799b, r2, getClass())) {
            this.f26804g.onSubscribe(this);
            this.f26803f.mo17931a(r2);
            AtomicReference<AbstractC90215d> atomicReference = this.f26798a;
            Class<?> cls = getClass();
            C11170s.m19819a(dVar, "next is null");
            if (!atomicReference.compareAndSet(null, dVar)) {
                dVar.cancel();
                if (atomicReference.get() != EnumC11177w.CANCELLED) {
                    C11165n.m19814a(cls);
                    return;
                }
                return;
            }
            AtomicReference<AbstractC90215d> atomicReference2 = this.f26801d;
            AtomicLong atomicLong = this.f26802e;
            C11170s.m19819a(dVar, "s is null");
            if (!atomicReference2.compareAndSet(null, dVar)) {
                dVar.cancel();
                if (atomicReference2.get() != EnumC11177w.CANCELLED) {
                    C88925a.m154178a(new IllegalStateException("Subscription already set!"));
                    return;
                }
                return;
            }
            long andSet = atomicLong.getAndSet(0);
            if (andSet != 0) {
                dVar.request(andSet);
            }
        }
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
        AtomicReference<AbstractC90215d> atomicReference = this.f26801d;
        AtomicLong atomicLong = this.f26802e;
        AbstractC90215d dVar = atomicReference.get();
        if (dVar != null) {
            dVar.request(j);
        } else if (j <= 0) {
            C88925a.m154178a(new IllegalArgumentException("n > 0 required but it was ".concat(String.valueOf(j))));
        } else {
            C11163l.m19812a(atomicLong, j);
            AbstractC90215d dVar2 = atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }

    C11175v(AbstractC88917f fVar, AbstractC90214c<? super T> cVar) {
        this.f26803f = fVar;
        this.f26804g = cVar;
    }
}
