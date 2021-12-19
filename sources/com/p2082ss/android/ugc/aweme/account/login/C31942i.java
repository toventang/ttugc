package com.p2082ss.android.ugc.aweme.account.login;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32856f;
import com.p2082ss.android.ugc.aweme.account.util.C33049r;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;

/* renamed from: com.ss.android.ugc.aweme.account.login.i */
public final class C31942i {
    static {
        Covode.recordClassIndex(38686);
    }

    /* renamed from: b */
    private static boolean m66315b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m66314a() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean b = m66315b();
        C58029j.f132253e = b;
        return b;
    }

    /* renamed from: a */
    public static C33743c m66310a(String str) {
        boolean z;
        C33743c cVar = new C33743c();
        if (TextUtils.equals(str, "google")) {
            PackageInfo a = C33049r.m67696a(C31291a.f74991a, "com.google.android.gms");
            if (a != null) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo59976a("google_isAvaliable", String.valueOf(z));
            if (a != null) {
                cVar.mo59976a("google_versionName", a.versionName);
                cVar.mo59976a("google_versionCode", String.valueOf(a.versionCode));
            }
            cVar.mo59976a("eligible", String.valueOf(C32856f.m67455a(C31291a.f74991a)));
        }
        return cVar;
    }

    /* renamed from: a */
    public static void m66311a(int i, int i2, String str) {
        C32837b.m67403a("aweme_agegate_rate", i, new C33743c().mo59976a("eligible", String.valueOf(i2)).mo59976a("errorDesc", str).mo59977a());
    }

    /* renamed from: a */
    public static void m66313a(String str, String str2, String str3) {
        if (m66314a()) {
            C32837b.m67403a("aweme_thirdparty_login_error_rate", 0, m66310a(str3).mo59976a("app_language", ((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a()).mo59976a("platform", str3).mo59976a("errorDesc", String.valueOf(str2)).mo59976a("errorUrl", str).mo59977a());
        }
    }

    /* renamed from: a */
    public static void m66312a(int i, String str, String str2) {
        if (m66314a()) {
            C32837b.m67403a("aweme_thirdparty_login_error_rate", 0, m66310a(str2).mo59976a("app_language", ((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a()).mo59976a("platform", str2).mo59976a("errorCode", String.valueOf(i)).mo59976a("errorDesc", String.valueOf(str)).mo59977a());
        }
    }
}
