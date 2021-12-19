package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.performance.k */
public final /* synthetic */ class RunnableC10128k implements Runnable {

    /* renamed from: a */
    private final LivePerformanceManager f24567a;

    static {
        Covode.recordClassIndex(11691);
    }

    RunnableC10128k(LivePerformanceManager livePerformanceManager) {
        this.f24567a = livePerformanceManager;
    }

    public final void run() {
        this.f24567a.lambda$stopTimerMonitor$2$LivePerformanceManager();
    }
}
