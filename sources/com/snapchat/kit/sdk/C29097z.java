package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.z */
public final class C29097z implements AbstractC88078c<SecureSharedPreferences> {

    /* renamed from: a */
    private final C29085n f68779a;

    /* renamed from: b */
    private final AbstractC89405a<C27910f> f68780b;

    /* renamed from: c */
    private final AbstractC89405a<SharedPreferences> f68781c;

    static {
        Covode.recordClassIndex(35446);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return this.f68779a.mo50751a(this.f68780b.get(), this.f68781c.get());
    }

    C29097z(C29085n nVar, AbstractC89405a<C27910f> aVar, AbstractC89405a<SharedPreferences> aVar2) {
        this.f68779a = nVar;
        this.f68780b = aVar;
        this.f68781c = aVar2;
    }
}
