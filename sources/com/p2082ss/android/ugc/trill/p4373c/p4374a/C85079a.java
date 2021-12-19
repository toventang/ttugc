package com.p2082ss.android.ugc.trill.p4373c.p4374a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.trill.c.a.a */
public final class C85079a {

    /* renamed from: a */
    private static final boolean f190361a = false;

    static {
        Covode.recordClassIndex(99102);
    }

    /* renamed from: a */
    public static SharedPreferences m146281a() {
        return C34822d.m71158a(C17867d.m33078a(), "aweme_friends", 0);
    }

    /* renamed from: b */
    public static String m146283b(String str, String str2) {
        return m146281a().getString(str, str2);
    }

    /* renamed from: c */
    public static void m146284c(String str, String str2) {
        m146282a("twitter_access_token", str);
        m146282a("twitter_access_token_secret", str2);
    }

    /* renamed from: a */
    public static void m146282a(String str, String str2) {
        m146281a().edit().putString(str, str2).apply();
    }
}
