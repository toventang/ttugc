package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dv */
public final class C70747dv {

    /* renamed from: a */
    public static String f158357a;

    /* renamed from: b */
    public static String f158358b;

    /* renamed from: c */
    public static String f158359c;

    /* renamed from: d */
    public static String f158360d;

    static {
        Covode.recordClassIndex(83218);
    }

    /* renamed from: a */
    public static String m124972a() {
        if (m124973a(f158357a)) {
            return f158357a;
        }
        return "";
    }

    /* renamed from: a */
    private static boolean m124973a(String str) {
        if (str == null) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
