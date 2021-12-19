package com.snapchat.kit.sdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import okhttp3.C90040c;

/* renamed from: com.snapchat.kit.sdk.o */
public final class C29086o implements AbstractC88078c<C90040c> {

    /* renamed from: a */
    private final C29085n f68756a;

    static {
        Covode.recordClassIndex(35435);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        Context context = this.f68756a.f68748a;
        if (C58016d.f132221b == null || !C58016d.f132224e) {
            C58016d.f132221b = context.getCacheDir();
        }
        return C88081f.m153153a(new C90040c(C58016d.f132221b), "Cannot return null from a non-@Nullable @Provides method");
    }

    C29086o(C29085n nVar) {
        this.f68756a = nVar;
    }
}
