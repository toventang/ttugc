package com.google.android.gms.common.util;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25560p;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.util.b */
public final class C25600b {
    static {
        Covode.recordClassIndex(31010);
    }

    /* renamed from: a */
    public static <T> T[] m49404a(T[]... tArr) {
        int i = 0;
        int i2 = 0;
        do {
            i2 += tArr[i].length;
            i++;
        } while (i < 2);
        T[] tArr2 = (T[]) Arrays.copyOf(tArr[0], i2);
        int length = tArr[0].length;
        int i3 = 1;
        do {
            T[] tArr3 = tArr[1];
            System.arraycopy(tArr3, 0, tArr2, length, tArr3.length);
            i3++;
        } while (i3 < 2);
        return tArr2;
    }

    /* renamed from: a */
    public static <T> boolean m49403a(T[] tArr, T t) {
        if (tArr != null) {
            int length = tArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (!C25560p.m49308a(tArr[i], t)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
