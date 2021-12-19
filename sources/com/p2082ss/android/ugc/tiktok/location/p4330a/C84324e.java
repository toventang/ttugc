package com.p2082ss.android.ugc.tiktok.location.p4330a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.tiktok.location.a.e */
public final class C84324e {

    /* renamed from: a */
    public static final C84324e f188554a = new C84324e();

    private C84324e() {
    }

    static {
        Covode.recordClassIndex(98254);
    }

    /* renamed from: a */
    public static void m145022a(boolean z) {
        String str;
        C33744d dVar = new C33744d();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C39162r.m79460a("system_location_permission_result", dVar.mo59983a("is_allow", str).f79943a);
    }
}
