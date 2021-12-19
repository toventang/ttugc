package com.google.android.gms.common.util;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.util.r */
public final class C25616r {
    static {
        Covode.recordClassIndex(31026);
    }

    /* renamed from: a */
    public static boolean m49450a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
