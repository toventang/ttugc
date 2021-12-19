package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.internal.oauth.e */
public final /* synthetic */ class C87748e implements AbstractC90202u {

    /* renamed from: a */
    private final AbstractC87747d f199301a;

    static {
        Covode.recordClassIndex(103744);
    }

    C87748e(AbstractC87747d dVar) {
        this.f199301a = dVar;
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        return aVar.mo144857a(aVar.mo144856a().newBuilder().mo144692a("User-Agent", this.f199301a.f199299d).mo144698a());
    }
}
