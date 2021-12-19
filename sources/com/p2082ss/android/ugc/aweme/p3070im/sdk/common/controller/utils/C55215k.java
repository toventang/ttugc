package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.k */
public final class C55215k {

    /* renamed from: a */
    public static final C55215k f126289a = new C55215k();

    private C55215k() {
    }

    static {
        Covode.recordClassIndex(64962);
    }

    /* renamed from: a */
    public static String m100959a(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return m100960a(j, 1000, "k");
        }
        if (j < 1000000000) {
            return m100960a(j, 1000000, "m");
        }
        return m100960a(j, 1000000000, "b");
    }

    /* renamed from: a */
    private static String m100960a(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        C89219l.m154716b(bigDecimal, "");
        if ('0' != bigDecimal.charAt(bigDecimal.length() - 1)) {
            return bigDecimal + str;
        }
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(bigDecimal, "null cannot be cast to non-null type java.lang.String");
        String substring = bigDecimal.substring(0, bigDecimal.length() - 2);
        C89219l.m154716b(substring, "");
        return sb.append(substring).append(str).toString();
    }
}
