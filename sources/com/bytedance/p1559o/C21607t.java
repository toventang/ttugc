package com.bytedance.p1559o;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.o.t */
public final class C21607t {

    /* renamed from: a */
    private static final Handler f51246a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(25248);
    }

    /* renamed from: a */
    public static boolean m40542a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
