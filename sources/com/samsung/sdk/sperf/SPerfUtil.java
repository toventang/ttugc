package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SPerfUtil {
    private static boolean DEBUG;

    static {
        Covode.recordClassIndex(35080);
    }

    SPerfUtil() {
    }

    /* renamed from: com_samsung_sdk_sperf_SPerfUtil_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m57960x394349ec(String str, String str2) {
        return 0;
    }

    public static void log(String str) {
        if (DEBUG) {
            m57960x394349ec("PERFSDK", str);
        }
    }

    public static void logAlways(String str) {
        m57960x394349ec("PERFSDK", str);
    }

    public static void setDebug(boolean z) {
        DEBUG = z;
    }
}
