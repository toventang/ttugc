package com.snapchat.kit.sdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.networking.C29025a;
import com.snapchat.kit.sdk.core.networking.FirebaseExtensionClient;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.r */
public final class C29089r implements AbstractC88078c<FirebaseExtensionClient> {

    /* renamed from: a */
    private final C29085n f68759a;

    /* renamed from: b */
    private final AbstractC89405a<C29025a> f68760b;

    static {
        Covode.recordClassIndex(35438);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        Object a;
        C29085n nVar = this.f68759a;
        this.f68760b.get();
        if (!TextUtils.isEmpty(nVar.f68755h)) {
            if (nVar.f68755h.endsWith("/")) {
                a = C29025a.m58019a(nVar.f68755h, FirebaseExtensionClient.class);
            } else {
                a = C29025a.m58019a(nVar.f68755h.concat("/"), FirebaseExtensionClient.class);
            }
            return C88081f.m153153a(a, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw new IllegalStateException("Firebase Extension custom token url must be set!");
    }

    C29089r(C29085n nVar, AbstractC89405a<C29025a> aVar) {
        this.f68759a = nVar;
        this.f68760b = aVar;
    }
}
