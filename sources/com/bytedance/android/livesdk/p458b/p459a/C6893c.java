package com.bytedance.android.livesdk.p458b.p459a;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.b.a.c */
public final class C6893c {

    /* renamed from: a */
    static final boolean[] f17251a = new boolean[0];

    /* renamed from: b */
    static final int[] f17252b = new int[0];

    /* renamed from: c */
    static final long[] f17253c = new long[0];

    /* renamed from: d */
    static final Object[] f17254d = new Object[0];

    static {
        Covode.recordClassIndex(7631);
    }

    /* renamed from: a */
    static int m14752a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }
}
