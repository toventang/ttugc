package com.p2082ss.android.ugc.aweme.base.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;

/* renamed from: com.ss.android.ugc.aweme.base.utils.n */
public final class C34728n {
    static {
        Covode.recordClassIndex(41720);
    }

    /* renamed from: b */
    public static int m70948b(double d) {
        double d2 = (double) C17867d.m33078a().getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d / d2) + 0.5d);
    }

    /* renamed from: c */
    public static int m70949c(double d) {
        double d2 = (double) C17867d.m33078a().getResources().getDisplayMetrics().scaledDensity;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }

    /* renamed from: a */
    public static int m70946a(double d) {
        Context a = C17867d.m33078a();
        if (a == null || a.getResources() == null || a.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        double d2 = (double) a.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }

    /* renamed from: a */
    public static int m70947a(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) / 2.0f);
    }
}
