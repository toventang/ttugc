package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;

/* renamed from: com.snapchat.kit.sdk.u */
public final class C29092u implements AbstractC88078c<KitPluginType> {

    /* renamed from: a */
    private final C29085n f68765a;

    static {
        Covode.recordClassIndex(35441);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return C88081f.m153153a(this.f68765a.f68753f, "Cannot return null from a non-@Nullable @Provides method");
    }

    C29092u(C29085n nVar) {
        this.f68765a = nVar;
    }
}
