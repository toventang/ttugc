package com.bytedance.android.livesdk.feed.p539o;

import com.bytedance.android.live.core.p218f.C3934g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.o.a */
public final class C8653a {
    static {
        Covode.recordClassIndex(9517);
    }

    /* renamed from: a */
    public static String m16920a(long j) {
        if (j >= 1000000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            return sb.append(C3934g.m9583a("%.1f", Double.valueOf((d * 1.0d) / 1000000.0d))).append("m").toString();
        } else if (j < 1000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            return sb2.append(C3934g.m9583a("%.1f", Double.valueOf((d2 * 1.0d) / 1000.0d))).append("k").toString();
        }
    }
}
