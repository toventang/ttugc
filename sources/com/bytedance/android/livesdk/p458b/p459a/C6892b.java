package com.bytedance.android.livesdk.p458b.p459a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.b.a.b */
public final class C6892b {

    /* renamed from: a */
    private static Object[] f17249a = new Object[0];

    /* renamed from: b */
    private static Object[] f17250b = new Object[73];

    static {
        Covode.recordClassIndex(7630);
    }

    /* renamed from: a */
    public static int m14751a(int i) {
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (i2 > i4) {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            } else {
                i2 = i4;
                break;
            }
        }
        return i2 / 8;
    }
}
