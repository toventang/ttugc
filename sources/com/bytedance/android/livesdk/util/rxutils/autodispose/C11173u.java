package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.android.livesdk.util.rxutils.autodispose.p650c.AbstractC11149b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4586g.AbstractC88921a;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.u */
final class C11173u<T> implements AbstractC11149b<T> {

    /* renamed from: a */
    final AtomicReference<AbstractC88412b> f26793a = new AtomicReference<>();

    /* renamed from: b */
    final AtomicReference<AbstractC88412b> f26794b = new AtomicReference<>();

    /* renamed from: c */
    private final AbstractC88917f f26795c;

    /* renamed from: d */
    private final AbstractC88406ae<? super T> f26796d;

    static {
        Covode.recordClassIndex(12800);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC11151d.m19787a(this.f26794b);
        EnumC11151d.m19787a(this.f26793a);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (this.f26793a.get() == EnumC11151d.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.f26793a.lazySet(EnumC11151d.DISPOSED);
            EnumC11151d.m19787a(this.f26794b);
            this.f26796d.onError(th);
        }
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSuccess(T t) {
        if (!isDisposed()) {
            this.f26793a.lazySet(EnumC11151d.DISPOSED);
            EnumC11151d.m19787a(this.f26794b);
            this.f26796d.onSuccess(t);
        }
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSubscribe(AbstractC88412b bVar) {
        C111741 r2 = new AbstractC88921a() {
            /* class com.bytedance.android.livesdk.util.rxutils.autodispose.C11173u.C111741 */

            static {
                Covode.recordClassIndex(12801);
            }

            @Override // p4560f.p4561a.AbstractC88427d
            public final void onComplete() {
                C11173u.this.f26794b.lazySet(EnumC11151d.DISPOSED);
                EnumC11151d.m19787a(C11173u.this.f26793a);
            }

            @Override // p4560f.p4561a.AbstractC88427d
            public final void onError(Throwable th) {
                C11173u.this.f26794b.lazySet(EnumC11151d.DISPOSED);
                C11173u.this.onError(th);
            }
        };
        if (C11165n.m19815a(this.f26794b, r2, getClass())) {
            this.f26796d.onSubscribe(this);
            this.f26795c.mo17931a(r2);
            C11165n.m19815a(this.f26793a, bVar, getClass());
        }
    }

    C11173u(AbstractC88917f fVar, AbstractC88406ae<? super T> aeVar) {
        this.f26795c = fVar;
        this.f26796d = aeVar;
    }
}
