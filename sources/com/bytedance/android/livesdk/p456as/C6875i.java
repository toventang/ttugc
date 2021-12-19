package com.bytedance.android.livesdk.p456as;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.android.livesdk.as.i */
public final class C6875i {

    /* renamed from: a */
    private final String f17225a = "low_age_storage";

    static {
        Covode.recordClassIndex(7613);
    }

    /* renamed from: a */
    private static long m14729a(Context context, String str) {
        return C34822d.m71158a(context, "low_age_storage", 0).getLong(str, 0);
    }

    /* renamed from: b */
    public static boolean m14731b(Context context, String str, long j) {
        if (j == m14729a(context, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m14730a(Context context, String str, long j) {
        SharedPreferences.Editor edit = C34822d.m71158a(context, "low_age_storage", 0).edit();
        edit.putLong(str, j);
        edit.commit();
    }
}
