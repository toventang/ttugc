package com.p2082ss.android.ugc.trill.main.login;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.utils.C80539hm;
import com.p2082ss.android.ugc.trill.p4379h.C85089a;

/* renamed from: com.ss.android.ugc.trill.main.login.a */
public final class C85097a {
    static {
        Covode.recordClassIndex(99121);
    }

    /* renamed from: b */
    private static boolean m146319b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m146318a() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean b = m146319b();
        C58029j.f132253e = b;
        return b;
    }

    /* renamed from: a */
    public static C33743c m146317a(String str) {
        boolean z;
        C33743c cVar = new C33743c();
        if (TextUtils.equals(str, "google")) {
            PackageInfo a = C80539hm.m139615a(C17867d.m33078a(), "com.google.android.gms");
            if (a != null) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo59976a("google_isInstalled", String.valueOf(z));
            if (a != null) {
                cVar.mo59976a("google_versionName", a.versionName);
                cVar.mo59976a("google_versionCode", String.valueOf(a.versionCode));
            }
            cVar.mo59976a("eligible", String.valueOf(C85089a.m146303a(C17867d.m33078a())));
        }
        return cVar;
    }
}
