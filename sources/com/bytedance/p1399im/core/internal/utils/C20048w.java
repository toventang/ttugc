package com.bytedance.p1399im.core.internal.utils;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.im.core.internal.utils.w */
public final class C20048w {
    static {
        Covode.recordClassIndex(22893);
    }

    /* renamed from: a */
    public static long m37936a() {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }
}
