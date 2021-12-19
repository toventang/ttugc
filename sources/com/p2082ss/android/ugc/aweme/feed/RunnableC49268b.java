package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.b */
public final /* synthetic */ class RunnableC49268b implements Runnable {

    /* renamed from: a */
    static final Runnable f113254a = new RunnableC49268b();

    static {
        Covode.recordClassIndex(58065);
    }

    private RunnableC49268b() {
    }

    public final void run() {
        LivePerformanceManager.getInstance().initStartValue();
    }
}
