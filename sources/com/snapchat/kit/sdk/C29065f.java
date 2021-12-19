package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;

/* renamed from: com.snapchat.kit.sdk.f */
public final class C29065f implements AbstractC88078c<SnapKitInitType> {

    /* renamed from: a */
    private final C29085n f68655a;

    static {
        Covode.recordClassIndex(35414);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return C88081f.m153153a(this.f68655a.f68752e, "Cannot return null from a non-@Nullable @Provides method");
    }

    C29065f(C29085n nVar) {
        this.f68655a = nVar;
    }
}
