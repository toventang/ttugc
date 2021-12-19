package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.utils.aa */
public final class C11207aa {
    static {
        Covode.recordClassIndex(12835);
    }

    /* renamed from: a */
    public static String m19863a(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            return sb.append(C11266h.m19968a("%.1f", Double.valueOf((d * 1.0d) / 1000.0d))).append("K").toString();
        } else if (j < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            return sb2.append(C11266h.m19968a("%.0f", Double.valueOf((d2 * 1.0d) / 1000.0d))).append("K").toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d3 = (double) j;
            Double.isNaN(d3);
            return sb3.append(C11266h.m19968a("%.1f", Double.valueOf((d3 * 1.0d) / 1000000.0d))).append("M").toString();
        }
    }

    /* renamed from: b */
    public static String m19864b(long j) {
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            return sb.append(C11266h.m19968a("%.1f", Double.valueOf((d * 1.0d) / 1000.0d))).append("K").toString();
        } else if (j < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            return sb2.append(C11266h.m19968a("%.0f", Double.valueOf((d2 * 1.0d) / 1000.0d))).append("K").toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d3 = (double) j;
            Double.isNaN(d3);
            return sb3.append(C11266h.m19968a("%.1f", Double.valueOf((d3 * 1.0d) / 1000000.0d))).append("M").toString();
        }
    }
}
