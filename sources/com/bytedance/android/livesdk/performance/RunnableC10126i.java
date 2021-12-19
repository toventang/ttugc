package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.performance.i */
public final /* synthetic */ class RunnableC10126i implements Runnable {

    /* renamed from: a */
    private final LivePerformanceManager f24565a;

    static {
        Covode.recordClassIndex(11689);
    }

    RunnableC10126i(LivePerformanceManager livePerformanceManager) {
        this.f24565a = livePerformanceManager;
    }

    public final void run() {
        this.f24565a.lambda$startTimerMonitor$0$LivePerformanceManager();
    }
}
