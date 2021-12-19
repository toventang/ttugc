package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ci */
public final class C48243ci {
    static {
        Covode.recordClassIndex(56985);
    }

    /* renamed from: a */
    static boolean m91651a(int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i3;
        double d5 = (double) i4;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        try {
            double parseDouble = Double.parseDouble(C1764a.m5929a(Locale.US, "%.2f", new Object[]{Double.valueOf(d3)}));
            double parseDouble2 = Double.parseDouble(C1764a.m5929a(Locale.US, "%.2f", new Object[]{Double.valueOf(d6)}));
            if (parseDouble <= 0.0d || parseDouble2 <= 0.0d || parseDouble == parseDouble2) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C51423a.m95790a(th);
        }
    }
}
