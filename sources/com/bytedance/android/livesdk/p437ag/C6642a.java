package com.bytedance.android.livesdk.p437ag;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ag.a */
final class C6642a {
    static {
        Covode.recordClassIndex(7380);
    }

    /* renamed from: a */
    public static <T> int m14122a(T... tArr) {
        int hashCode;
        if (tArr == null) {
            return 0;
        }
        int i = 1;
        for (T t : tArr) {
            if (t == null) {
                hashCode = 0;
            } else {
                hashCode = t.hashCode();
            }
            i = ((i << 5) - i) ^ hashCode;
        }
        return i;
    }
}
