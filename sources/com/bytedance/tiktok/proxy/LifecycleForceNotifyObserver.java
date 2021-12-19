package com.bytedance.tiktok.proxy;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class LifecycleForceNotifyObserver<T> implements AbstractC1202k, AbstractC1214u<T> {

    /* renamed from: a */
    private final AtomicBoolean f54020a;

    /* renamed from: b */
    private T f54021b;

    /* renamed from: c */
    private final AbstractC22873a<?, ?> f54022c;

    /* renamed from: d */
    private final AbstractC89172b<T, C89391z> f54023d;

    static {
        Covode.recordClassIndex(26776);
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(T t) {
        this.f54023d.invoke(t);
        this.f54021b = t;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        AbstractC1196i lifecycle = this.f54022c.getLifecycle();
        C89219l.m154709a((Object) lifecycle, "");
        if (!lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
            this.f54020a.set(false);
        } else if (!this.f54020a.getAndSet(true)) {
            T t = this.f54021b;
            if (t != null && (!this.f54022c.mo20487h())) {
                onChanged(t);
            }
        } else {
            return;
        }
        if (C22877e.f54024a[aVar.ordinal()] == 1) {
            this.f54022c.getLifecycle().mo4013b(this);
        }
    }
}
