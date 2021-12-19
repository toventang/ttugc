package com.twitter.sdk.android.core.internal.p4498a;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;

/* renamed from: com.twitter.sdk.android.core.internal.a.b */
public final class C87713b implements AbstractC90202u {
    static {
        Covode.recordClassIndex(103702);
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        C90029ac a = aVar.mo144857a(aVar.mo144856a());
        if (a.f204107c != 403) {
            return a;
        }
        C90029ac.C90030a b = a.mo144722b();
        b.f204120c = 401;
        b.f204121d = "Unauthorized";
        return b.mo144729a();
    }
}
