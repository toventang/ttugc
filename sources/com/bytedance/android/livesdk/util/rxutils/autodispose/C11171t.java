package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.android.livesdk.util.rxutils.autodispose.p650c.AbstractC11148a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4586g.AbstractC88921a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.t */
final class C11171t<T> extends AtomicInteger implements AbstractC11148a<T> {

    /* renamed from: a */
    final AtomicReference<AbstractC88412b> f26787a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<AbstractC88412b> f26788b = new AtomicReference<>();

    /* renamed from: c */
    private final C11147c f26789c = new C11147c();

    /* renamed from: d */
    private final AbstractC88917f f26790d;

    /* renamed from: e */
    private final AbstractC88986z<? super T> f26791e;

    static {
        Covode.recordClassIndex(12798);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC11151d.m19787a(this.f26788b);
        EnumC11151d.m19787a(this.f26787a);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (this.f26787a.get() == EnumC11151d.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        if (!isDisposed()) {
            this.f26787a.lazySet(EnumC11151d.DISPOSED);
            EnumC11151d.m19787a(this.f26788b);
            AbstractC88986z<? super T> zVar = this.f26791e;
            C11147c cVar = this.f26789c;
            if (getAndIncrement() == 0) {
                Throwable a = cVar.mo17940a();
                if (a != null) {
                    zVar.onError(a);
                } else {
                    zVar.onComplete();
                }
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f26787a.lazySet(EnumC11151d.DISPOSED);
            EnumC11151d.m19787a(this.f26788b);
            AbstractC88986z<? super T> zVar = this.f26791e;
            C11147c cVar = this.f26789c;
            if (!cVar.mo17941a(th)) {
                C88925a.m154178a(th);
            } else if (getAndIncrement() == 0) {
                zVar.onError(cVar.mo17940a());
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        if (!isDisposed()) {
            AbstractC88986z<? super T> zVar = this.f26791e;
            C11147c cVar = this.f26789c;
            if (get() == 0 && compareAndSet(0, 1)) {
                zVar.onNext(t);
                if (decrementAndGet() != 0) {
                    Throwable a = cVar.mo17940a();
                    if (a != null) {
                        zVar.onError(a);
                    } else {
                        zVar.onComplete();
                    }
                    this.f26787a.lazySet(EnumC11151d.DISPOSED);
                    EnumC11151d.m19787a(this.f26788b);
                }
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        C111721 r2 = new AbstractC88921a() {
            /* class com.bytedance.android.livesdk.util.rxutils.autodispose.C11171t.C111721 */

            static {
                Covode.recordClassIndex(12799);
            }

            @Override // p4560f.p4561a.AbstractC88427d
            public final void onComplete() {
                C11171t.this.f26788b.lazySet(EnumC11151d.DISPOSED);
                EnumC11151d.m19787a(C11171t.this.f26787a);
            }

            @Override // p4560f.p4561a.AbstractC88427d
            public final void onError(Throwable th) {
                C11171t.this.f26788b.lazySet(EnumC11151d.DISPOSED);
                C11171t.this.onError(th);
            }
        };
        if (C11165n.m19815a(this.f26788b, r2, getClass())) {
            this.f26791e.onSubscribe(this);
            this.f26790d.mo17931a(r2);
            C11165n.m19815a(this.f26787a, bVar, getClass());
        }
    }

    C11171t(AbstractC88917f fVar, AbstractC88986z<? super T> zVar) {
        this.f26790d = fVar;
        this.f26791e = zVar;
    }
}
