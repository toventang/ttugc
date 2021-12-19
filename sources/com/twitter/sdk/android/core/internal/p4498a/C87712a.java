package com.twitter.sdk.android.core.internal.p4498a;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.C87684d;
import com.twitter.sdk.android.core.C87686e;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;

/* renamed from: com.twitter.sdk.android.core.internal.a.a */
public final class C87712a implements AbstractC90202u {

    /* renamed from: a */
    final C87686e f199230a;

    static {
        Covode.recordClassIndex(103701);
    }

    public C87712a(C87686e eVar) {
        this.f199230a = eVar;
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        GuestAuthToken guestAuthToken;
        Request a = aVar.mo144856a();
        C87684d a2 = this.f199230a.mo142119a();
        if (a2 == null || (guestAuthToken = (GuestAuthToken) a2.f199192a) == null) {
            return aVar.mo144857a(a);
        }
        Request.C90016a newBuilder = a.newBuilder();
        m152641a(newBuilder, guestAuthToken);
        return aVar.mo144857a(newBuilder.mo144698a());
    }

    /* renamed from: a */
    static void m152641a(Request.C90016a aVar, GuestAuthToken guestAuthToken) {
        aVar.mo144692a("Authorization", guestAuthToken.f199284c + " " + guestAuthToken.f199285d);
        aVar.mo144692a("x-guest-token", guestAuthToken.f199275b);
    }
}
