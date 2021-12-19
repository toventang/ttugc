package com.bytedance.p1734ug.sdk.region.data.p1740e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.ug.sdk.region.data.e.a */
public final class C23472a {
    static {
        Covode.recordClassIndex(27473);
    }

    /* renamed from: a */
    public static String m44163a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return C34822d.m71158a(context, "bd_region_data_sdk", 0).getString(str, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m44164a(Context context, String str, String str2) {
        if (context == null) {
            return false;
        }
        try {
            C34822d.m71158a(context, "bd_region_data_sdk", 0).edit().putString(str, str2).apply();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
