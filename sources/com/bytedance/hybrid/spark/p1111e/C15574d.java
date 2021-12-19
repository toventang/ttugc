package com.bytedance.hybrid.spark.p1111e;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.e.d */
public final class C15574d {

    /* renamed from: a */
    public static final C15574d f37957a = new C15574d();

    private C15574d() {
    }

    static {
        Covode.recordClassIndex(17836);
    }

    /* renamed from: a */
    public static int m28692a(Context context, double d) {
        C89219l.m154719c(context, "");
        if (context.getResources() == null) {
            return 0;
        }
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        if (resources.getDisplayMetrics() == null) {
            return 0;
        }
        Resources resources2 = context.getResources();
        C89219l.m154709a((Object) resources2, "");
        double d2 = (double) resources2.getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }
}
