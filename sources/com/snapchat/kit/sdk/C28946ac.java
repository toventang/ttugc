package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.skate.C29021c;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.ac */
public final class C28946ac implements AbstractC88078c<SnapKitAppLifecycleObserver> {

    /* renamed from: a */
    private final C29085n f68390a;

    /* renamed from: b */
    private final AbstractC89405a<C29021c> f68391b;

    static {
        Covode.recordClassIndex(35130);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return C88081f.m153153a(new SnapKitAppLifecycleObserver(this.f68391b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    C28946ac(C29085n nVar, AbstractC89405a<C29021c> aVar) {
        this.f68390a = nVar;
        this.f68391b = aVar;
    }
}
