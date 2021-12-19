package com.twitter.sdk.android.core.internal.p4498a;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.C87684d;
import com.twitter.sdk.android.core.C87686e;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import okhttp3.AbstractC90038b;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.Request;

/* renamed from: com.twitter.sdk.android.core.internal.a.c */
public final class C87714c implements AbstractC90038b {

    /* renamed from: a */
    final C87686e f199231a;

    static {
        Covode.recordClassIndex(103703);
    }

    public C87714c(C87686e eVar) {
        this.f199231a = eVar;
    }

    @Override // okhttp3.AbstractC90038b
    /* renamed from: a */
    public final Request mo142165a(C90029ac acVar) {
        C87684d dVar;
        GuestAuthToken guestAuthToken;
        boolean z = true;
        C90029ac acVar2 = acVar;
        int i = 1;
        while (true) {
            acVar2 = acVar2.f204114j;
            if (acVar2 == null) {
                break;
            }
            i++;
        }
        if (i >= 2) {
            z = false;
        }
        if (z) {
            C87686e eVar = this.f199231a;
            C90198s headers = acVar.f204105a.headers();
            String a = headers.mo145028a("Authorization");
            String a2 = headers.mo145028a("x-guest-token");
            if (a == null || a2 == null) {
                dVar = null;
            } else {
                dVar = new C87684d(new GuestAuthToken("bearer", a.replace("bearer ", ""), a2));
            }
            C87684d a3 = eVar.mo142120a(dVar);
            if (!(a3 == null || (guestAuthToken = (GuestAuthToken) a3.f199192a) == null)) {
                Request.C90016a newBuilder = acVar.f204105a.newBuilder();
                C87712a.m152641a(newBuilder, guestAuthToken);
                return newBuilder.mo144698a();
            }
        }
        return null;
    }
}
