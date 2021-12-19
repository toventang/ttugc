package com.bytedance.android.livesdk.model.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.utils.a */
public final class C9906a {
    static {
        Covode.recordClassIndex(11452);
    }

    /* renamed from: a */
    public static int m18207a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static boolean m18208a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }
}
