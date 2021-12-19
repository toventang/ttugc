package com.bytedance.android.livesdk.utils;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.utils.t */
public final /* synthetic */ class RunnableC11285t implements Runnable {

    /* renamed from: a */
    private final String f26992a;

    /* renamed from: b */
    private final long f26993b;

    static {
        Covode.recordClassIndex(12917);
    }

    RunnableC11285t(String str, long j) {
        this.f26992a = str;
        this.f26993b = j;
    }

    public final void run() {
        LiveAppBundleUtils.monitorLoadSuccess(this.f26992a, SystemClock.uptimeMillis() - this.f26993b);
    }
}
