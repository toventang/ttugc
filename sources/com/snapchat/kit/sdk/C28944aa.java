package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;

/* renamed from: com.snapchat.kit.sdk.aa */
public final class C28944aa implements AbstractC88078c<SharedPreferences> {

    /* renamed from: a */
    private final C29085n f68383a;

    static {
        Covode.recordClassIndex(35128);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return C88081f.m153153a(C34822d.m71158a(this.f68383a.f68748a, "com.snapchat.connect.sdk.sharedPreferences", 0), "Cannot return null from a non-@Nullable @Provides method");
    }

    C28944aa(C29085n nVar) {
        this.f68383a = nVar;
    }
}
