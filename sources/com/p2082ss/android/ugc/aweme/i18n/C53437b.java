package com.p2082ss.android.ugc.aweme.i18n;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.ss.android.ugc.aweme.i18n.b */
public final class C53437b {
    static {
        Covode.recordClassIndex(63006);
    }

    /* renamed from: a */
    public static String m98615a(long j) {
        if (j < 0) {
            return "0";
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return m98617a(j, 1000, "K", "1000.0", "1.0M");
        }
        if (j < 1000000000) {
            return m98617a(j, 1000000, "M", "1000.0", "1.0B");
        }
        return m98616a(j, 1000000000, "B");
    }

    /* renamed from: a */
    private static String m98616a(long j, long j2, String str) {
        return new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString() + str;
    }

    /* renamed from: a */
    private static String m98617a(long j, long j2, String str, String str2, String str3) {
        String a = m98616a(j, j2, "");
        if (a.equals(str2)) {
            return str3;
        }
        return a + str;
    }
}
