package com.p2082ss.android.ugc.aweme.util.p4199a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.util.a.a */
public final class C80122a {
    static {
        Covode.recordClassIndex(93366);
    }

    /* renamed from: a */
    public static SharedPreferences m138887a() {
        return C34822d.m71158a(C17867d.m33078a(), "video_view_count_sp", 0);
    }

    /* renamed from: b */
    public static SharedPreferences.Editor m138889b() {
        return m138887a().edit();
    }

    /* renamed from: c */
    public static boolean m138890c() {
        return m138887a().getBoolean("has_reported_viewed_50_many_days", false);
    }

    /* renamed from: a */
    public static void m138888a(int i) {
        m138889b().putInt("one_day_viewed_count", i).apply();
    }
}
