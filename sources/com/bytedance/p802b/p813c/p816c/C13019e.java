package com.bytedance.p802b.p813c.p816c;

import com.bytedance.apm.p789q.C12576b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.b.c.c.e */
public final class C13019e {
    static {
        Covode.recordClassIndex(14855);
    }

    /* renamed from: a */
    public static double m23375a() {
        long currentTimeMillis = System.currentTimeMillis();
        long c = C12576b.m22636c();
        try {
            Thread.sleep(360);
        } catch (InterruptedException unused) {
        }
        double c2 = (double) C12576b.m22636c();
        double d = (double) c;
        Double.isNaN(c2);
        Double.isNaN(d);
        double currentTimeMillis2 = (double) (System.currentTimeMillis() - currentTimeMillis);
        Double.isNaN(currentTimeMillis2);
        double d2 = ((c2 - d) * 1000.0d) / currentTimeMillis2;
        double g = (double) C12576b.m22640g();
        Double.isNaN(g);
        return d2 / g;
    }
}
