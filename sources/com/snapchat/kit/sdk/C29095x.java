package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import java.util.Random;

/* renamed from: com.snapchat.kit.sdk.x */
public final class C29095x implements AbstractC88078c<Random> {

    /* renamed from: a */
    private final C29085n f68777a;

    static {
        Covode.recordClassIndex(35444);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return C88081f.m153153a(new Random(), "Cannot return null from a non-@Nullable @Provides method");
    }

    C29095x(C29085n nVar) {
        this.f68777a = nVar;
    }
}
