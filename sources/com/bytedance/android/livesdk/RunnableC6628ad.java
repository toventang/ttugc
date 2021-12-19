package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ad */
public final /* synthetic */ class RunnableC6628ad implements Runnable {

    /* renamed from: a */
    public static final Runnable f16525a = new RunnableC6628ad();

    static {
        Covode.recordClassIndex(7366);
    }

    private RunnableC6628ad() {
    }

    public final void run() {
        LivePerformanceManager.getInstance().startTimerMonitor();
        LivePerformanceManager.getInstance().onEnterRoom();
    }
}
