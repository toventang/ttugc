package com.p2082ss.android.ugc.aweme.live;

import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.live.ak */
public final /* synthetic */ class RunnableC58502ak implements Runnable {

    /* renamed from: a */
    static final Runnable f133177a = new RunnableC58502ak();

    static {
        Covode.recordClassIndex(68793);
    }

    private RunnableC58502ak() {
    }

    public final void run() {
        LivePerformanceManager.getInstance().initStartValue();
    }
}
