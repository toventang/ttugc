package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.effectplatform.util.w */
public final class C87009w {

    /* renamed from: a */
    public static final C87009w f196179a = new C87009w();

    private C87009w() {
    }

    static {
        Covode.recordClassIndex(102775);
    }

    /* renamed from: a */
    public static long m150700a(String str) {
        long j = -1;
        if (str == null || str.length() == 0) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
            return j;
        } catch (Exception unused) {
            return j;
        }
    }
}
