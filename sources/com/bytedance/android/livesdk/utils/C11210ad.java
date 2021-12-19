package com.bytedance.android.livesdk.utils;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.utils.ad */
public final class C11210ad {

    /* renamed from: a */
    public static final C11210ad f26851a = new C11210ad();

    private C11210ad() {
    }

    static {
        Covode.recordClassIndex(12838);
    }

    /* renamed from: a */
    public static final String m19867a(long j) {
        if (10000 <= j && 999999 >= j) {
            double d = (double) j;
            Double.isNaN(d);
            StringBuilder sb = new StringBuilder();
            String a = C1764a.m5929a(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000.0d)}, 1));
            C89219l.m154716b(a, "");
            return sb.append(a).append("K").toString();
        } else if (j >= 1000000) {
            double d2 = (double) j;
            Double.isNaN(d2);
            StringBuilder sb2 = new StringBuilder();
            String a2 = C1764a.m5929a(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1000000.0d)}, 1));
            C89219l.m154716b(a2, "");
            return sb2.append(a2).append("M").toString();
        } else if (j >= 1000) {
            return new StringBuffer(String.valueOf(j)).insert(1, ',').toString();
        } else {
            return String.valueOf(j);
        }
    }
}
