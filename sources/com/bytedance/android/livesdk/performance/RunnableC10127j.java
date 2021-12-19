package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.performance.j */
public final /* synthetic */ class RunnableC10127j implements Runnable {

    /* renamed from: a */
    private final LivePerformanceManager f24566a;

    static {
        Covode.recordClassIndex(11690);
    }

    RunnableC10127j(LivePerformanceManager livePerformanceManager) {
        this.f24566a = livePerformanceManager;
    }

    public final void run() {
        this.f24566a.lambda$initStartValue$1$LivePerformanceManager();
    }
}
