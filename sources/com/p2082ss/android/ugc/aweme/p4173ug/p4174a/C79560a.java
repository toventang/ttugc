package com.p2082ss.android.ugc.aweme.p4173ug.p4174a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.ug.a.a */
public final class C79560a {
    static {
        Covode.recordClassIndex(92766);
    }

    /* renamed from: a */
    static SharedPreferences m138311a() {
        return C34822d.m71158a(C17867d.m33078a(), "apps_flyer_cache", 0);
    }

    /* renamed from: b */
    static SharedPreferences.Editor m138313b() {
        return m138311a().edit();
    }

    /* renamed from: c */
    public static long m138314c() {
        return m138311a().getLong("active_time", 0);
    }

    /* renamed from: a */
    static void m138312a(String str, boolean z) {
        m138313b().putBoolean(str, z).apply();
    }
}
