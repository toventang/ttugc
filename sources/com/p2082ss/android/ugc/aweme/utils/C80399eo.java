package com.p2082ss.android.ugc.aweme.utils;

import android.util.Log;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.eo */
public final class C80399eo {

    /* renamed from: a */
    private static boolean f179957a;

    static {
        Covode.recordClassIndex(93667);
    }

    /* renamed from: a */
    public static void m139372a(String str) {
        if (f179957a && ((long) str.length()) > 4096) {
            while (str.length() > 4096) {
                str = str.replace(str.substring(0, 4096), "");
            }
        }
    }

    /* renamed from: b */
    private static void m139374b(String str) {
        if (f179957a && ((long) str.length()) > 4096) {
            while (str.length() > 4096) {
                str = str.replace(str.substring(0, 4096), "");
            }
        }
    }

    /* renamed from: a */
    public static void m139373a(Throwable th, String str) {
        if (f179957a) {
            m139374b(str + "  " + Log.getStackTraceString(th));
        }
    }
}
