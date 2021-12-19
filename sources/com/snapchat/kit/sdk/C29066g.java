package com.snapchat.kit.sdk;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;

/* renamed from: com.snapchat.kit.sdk.g */
public final class C29066g implements AbstractC88078c<Handler> {

    /* renamed from: a */
    private final C29085n f68656a;

    static {
        Covode.recordClassIndex(35415);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return C88081f.m153153a(new Handler(Looper.getMainLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }

    C29066g(C29085n nVar) {
        this.f68656a = nVar;
    }
}
