package com.bytedance.tiktok.homepage.mainactivity;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.k */
final /* synthetic */ class RunnableC22755k implements Runnable {

    /* renamed from: a */
    private final PerformanceActivityObserver f53744a;

    /* renamed from: b */
    private final ActivityC0945e f53745b;

    static {
        Covode.recordClassIndex(26648);
    }

    RunnableC22755k(PerformanceActivityObserver performanceActivityObserver, ActivityC0945e eVar) {
        this.f53744a = performanceActivityObserver;
        this.f53745b = eVar;
    }

    public final void run() {
        PerformanceActivityObserver.m42873a(this.f53745b);
    }
}
