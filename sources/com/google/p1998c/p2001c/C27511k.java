package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.c.c.k */
public final class C27511k {
    static {
        Covode.recordClassIndex(33091);
    }

    /* renamed from: a */
    public static int m54993a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: b */
    static void m54995b(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(str + " must be positive but was: " + i);
        }
    }

    /* renamed from: a */
    static void m54994a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
