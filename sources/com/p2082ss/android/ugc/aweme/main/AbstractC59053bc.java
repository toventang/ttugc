package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.main.bc */
public abstract /* synthetic */ class AbstractC59053bc {
    static {
        Covode.recordClassIndex(69398);
    }

    /* renamed from: a */
    public static String m108536a(String str) {
        try {
            return m108535a(Integer.valueOf(str));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m108535a(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return "HOME";
        }
        if (intValue == 1) {
            return "DISCOVER";
        }
        if (intValue == 2) {
            return "PUBLISH";
        }
        if (intValue == 3) {
            return "NOTIFICATION";
        }
        if (intValue != 4) {
            return intValue != 5 ? "" : "DISCOVER";
        }
        return "USER";
    }
}
