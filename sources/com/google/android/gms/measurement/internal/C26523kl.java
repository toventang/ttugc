package com.google.android.gms.measurement.internal;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.kl */
public final class C26523kl {
    static {
        Covode.recordClassIndex(31945);
    }

    C26523kl() {
    }

    /* renamed from: a */
    public static boolean m52495a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
