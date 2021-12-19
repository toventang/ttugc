package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.hw */
public final class C80557hw {
    static {
        Covode.recordClassIndex(93830);
    }

    /* renamed from: a */
    public static boolean m139640a(Context context, String str) {
        try {
            return m139641b(context, str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m139641b(Context context, String str) {
        if (context == null || C13627m.m24498a(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 64) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
