package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ep */
public final class C71812ep {
    static {
        Covode.recordClassIndex(84357);
    }

    /* renamed from: a */
    public static int m126783a(double d, Context context) {
        if (context == null || context.getResources() == null || context.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        double d2 = (double) context.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }
}
