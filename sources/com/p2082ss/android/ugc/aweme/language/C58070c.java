package com.p2082ss.android.ugc.aweme.language;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.services.C33850c;

/* renamed from: com.ss.android.ugc.aweme.language.c */
public final class C58070c {
    static {
        Covode.recordClassIndex(68113);
    }

    /* renamed from: a */
    public static boolean m104905a() {
        try {
            C33850c a = C33850c.m69286a(C17867d.m33078a());
            if (TextUtils.isEmpty("enable_region_swtich") || a.f80139a == null || a.f80139a.optInt("enable_region_swtich", 0) != 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }
}
