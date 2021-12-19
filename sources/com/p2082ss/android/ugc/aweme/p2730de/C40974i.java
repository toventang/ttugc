package com.p2082ss.android.ugc.aweme.p2730de;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.ss.android.ugc.aweme.de.i */
public final class C40974i {
    static {
        Covode.recordClassIndex(48826);
    }

    /* renamed from: a */
    public static String m82496a(long j, long j2, String str) {
        return new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString() + str;
    }

    /* renamed from: a */
    public static String m82497a(long j, long j2, String str, String str2, String str3) {
        String a = m82496a(j, j2, "");
        if (a.equals(str2)) {
            return str3;
        }
        return a + str;
    }
}
