package com.facebook.common.p1832d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.common.d.g */
public final class C24087g {
    static {
        Covode.recordClassIndex(28215);
    }

    /* renamed from: a */
    public static int m45609a(int... iArr) {
        int i = 1;
        C24091i.m45620a(true);
        int i2 = iArr[0];
        do {
            if (iArr[i] > i2) {
                i2 = iArr[i];
            }
            i++;
        } while (i < 8);
        return i2;
    }
}
