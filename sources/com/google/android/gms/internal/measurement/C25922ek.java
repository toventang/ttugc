package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.ek */
public final class C25922ek extends C25921ej {
    static {
        Covode.recordClassIndex(31337);
    }

    /* renamed from: a */
    public static int m50163a(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(C25868ck.m50073a("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
    }
}
