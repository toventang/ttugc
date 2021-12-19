package com.bytedance.common.wschannel.p921e;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.e.c */
public final class C13746c {
    static {
        Covode.recordClassIndex(15781);
    }

    /* renamed from: a */
    public static long m24777a() {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }
}
