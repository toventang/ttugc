package com.p2082ss.android.deviceregister.p2139d;

import android.os.Build;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.p3488a.C61304a;

/* renamed from: com.ss.android.deviceregister.d.d */
public final class C29897d {

    /* renamed from: a */
    public static final CharSequence f71332a = "amigo";

    /* renamed from: b */
    private static final CharSequence f71333b = "sony";

    /* renamed from: c */
    private static final CharSequence f71334c = "funtouch";

    static {
        Covode.recordClassIndex(36307);
    }

    /* renamed from: a */
    public static boolean m60265a() {
        String a = C61304a.m110982a().mo98933a("ro.vivo.os.build.display.id");
        if (C13627m.m24498a(a) || !a.toLowerCase().contains(f71334c)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m60266b() {
        String str = Build.MANUFACTURER;
        if (!C13627m.m24498a(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }
}
