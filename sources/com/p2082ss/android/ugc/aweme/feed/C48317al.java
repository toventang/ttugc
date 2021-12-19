package com.p2082ss.android.ugc.aweme.feed;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.al */
public final class C48317al {

    /* renamed from: a */
    public static final C48317al f111967a = new C48317al();

    private C48317al() {
    }

    static {
        Covode.recordClassIndex(57059);
    }

    /* renamed from: b */
    public static final int m91756b() {
        return m91754a().getInt("diggUnloginCount", 0);
    }

    /* renamed from: d */
    public static final boolean m91758d() {
        return m91754a().getBoolean("deviceHasDigged", false);
    }

    /* renamed from: a */
    public static SharedPreferences m91754a() {
        SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "MainTabPreferences", 0);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: c */
    public static final void m91757c() {
        m91754a().edit().putBoolean("deviceHasDigged", true).apply();
    }

    /* renamed from: a */
    public static final void m91755a(int i) {
        m91754a().edit().putInt("diggUnloginCount", i).apply();
    }
}
