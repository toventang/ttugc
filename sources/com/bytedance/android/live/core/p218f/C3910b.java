package com.bytedance.android.live.core.p218f;

import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.b */
public final class C3910b {
    static {
        Covode.recordClassIndex(4439);
    }

    /* renamed from: c */
    public static boolean m9545c(long j) {
        return j >= 1000;
    }

    /* renamed from: b */
    public static String m9544b(long j) {
        if (j >= 1000000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            return sb.append(C11266h.m19968a("%.2f", Double.valueOf((d * 1.0d) / 1000000.0d))).append("m").toString();
        } else if (j < 1000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            return sb2.append(C11266h.m19968a("%.2f", Double.valueOf((d2 * 1.0d) / 1000.0d))).append("k").toString();
        }
    }

    /* renamed from: a */
    public static String m9543a(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            return sb.append(C11266h.m19968a("%.1f", Double.valueOf((d * 1.0d) / 1000.0d))).append("k").toString();
        } else if (j < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            return sb2.append(C11266h.m19968a("%.0f", Double.valueOf((d2 * 1.0d) / 1000.0d))).append("k").toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d3 = (double) j;
            Double.isNaN(d3);
            return sb3.append(C11266h.m19968a("%.1f", Double.valueOf((d3 * 1.0d) / 1000000.0d))).append("m").toString();
        }
    }
}
