package com.p2082ss.android.http.p2146a.p2151d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.http.a.d.c */
public final class C29943c {
    static {
        Covode.recordClassIndex(36355);
    }

    /* renamed from: a */
    public static int m60342a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static boolean m60343a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }
}
