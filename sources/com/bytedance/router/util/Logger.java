package com.bytedance.router.util;

import com.bytedance.covode.number.Covode;

public final class Logger {
    private static boolean sDebug;

    static {
        Covode.recordClassIndex(25910);
    }

    /* renamed from: com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m41571x763a42bd(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m41572x763a42be(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m41573x763a42c2(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_v */
    public static int m41574x763a42cf(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m41575x763a42d0(String str, String str2) {
        return 0;
    }

    public static boolean isDebug() {
        return sDebug;
    }

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    /* renamed from: d */
    public static void m41576d(String str) {
        m41577d("SmartRouter", str);
    }

    /* renamed from: e */
    public static void m41578e(String str) {
        m41579e("SmartRouter", str);
    }

    /* renamed from: i */
    public static void m41580i(String str) {
        m41581i("SmartRouter", str);
    }

    /* renamed from: v */
    public static void m41582v(String str) {
        m41583v("SmartRouter", str);
    }

    /* renamed from: w */
    public static void m41584w(String str) {
        m41585w("SmartRouter", str);
    }

    /* renamed from: e */
    public static void m41579e(String str, String str2) {
        m41572x763a42be(str, str2);
    }

    /* renamed from: w */
    public static void m41585w(String str, String str2) {
        m41575x763a42d0(str, str2);
    }

    /* renamed from: d */
    public static void m41577d(String str, String str2) {
        if (sDebug) {
            m41571x763a42bd(str, str2);
        }
    }

    /* renamed from: i */
    public static void m41581i(String str, String str2) {
        if (sDebug) {
            m41573x763a42c2(str, str2);
        }
    }

    /* renamed from: v */
    public static void m41583v(String str, String str2) {
        if (sDebug) {
            m41574x763a42cf(str, str2);
        }
    }
}
