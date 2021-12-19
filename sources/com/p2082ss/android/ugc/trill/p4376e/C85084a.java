package com.p2082ss.android.ugc.trill.p4376e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;

/* renamed from: com.ss.android.ugc.trill.e.a */
public final class C85084a {
    static {
        Covode.recordClassIndex(99107);
    }

    /* renamed from: a */
    private static boolean m146295a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m146296b() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean a = m146295a();
        C58029j.f132253e = a;
        return a;
    }

    /* renamed from: a */
    public static void m146294a(String str, String str2) {
        C17867d.m33078a();
        if (m146296b()) {
            C33830n.m70668a("aweme_change_user_profile", new C33743c().mo59976a("errorDesc", String.valueOf(str)).mo59976a("action", String.valueOf(str2)).mo59977a());
        }
    }
}
