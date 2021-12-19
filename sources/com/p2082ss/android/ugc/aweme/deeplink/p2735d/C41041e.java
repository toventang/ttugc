package com.p2082ss.android.ugc.aweme.deeplink.p2735d;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;

/* renamed from: com.ss.android.ugc.aweme.deeplink.d.e */
public final class C41041e {
    static {
        Covode.recordClassIndex(48911);
    }

    /* renamed from: a */
    public static void m82679a(String str, boolean z, String str2) {
        C33743c a = new C33743c().mo59976a("url", str).mo59976a("errorDesc", str2);
        if (z) {
            C12290b.m22060a("aweme_open_schema_rate", 0, a.mo59977a());
        } else {
            C12290b.m22060a("aweme_open_schema_rate", 1, a.mo59977a());
        }
    }
}
