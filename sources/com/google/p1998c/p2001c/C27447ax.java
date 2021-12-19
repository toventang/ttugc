package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.c.c.ax */
public final class C27447ax {
    static {
        Covode.recordClassIndex(33027);
    }

    /* renamed from: a */
    static Object[] m54860a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m54859a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: a */
    static Object m54859a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index ".concat(String.valueOf(i)));
    }
}
