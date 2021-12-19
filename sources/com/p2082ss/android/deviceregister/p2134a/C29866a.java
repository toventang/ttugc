package com.p2082ss.android.deviceregister.p2134a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.C29879c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.deviceregister.a.a */
public final class C29866a {

    /* renamed from: a */
    public static volatile String f71244a = "applog_stats";

    /* renamed from: b */
    public static boolean f71245b;

    /* renamed from: c */
    private static String f71246c;

    static {
        Covode.recordClassIndex(36276);
    }

    /* renamed from: a */
    public static String m60187a() {
        if (TextUtils.isEmpty(f71246c)) {
            f71246c = C29879c.m60222a("c25zc2RrX29wZW51ZGlk");
        }
        return f71246c;
    }

    /* renamed from: a */
    public static SharedPreferences m60186a(Context context) {
        return C34822d.m71158a(context, f71244a, 0);
    }
}
