package com.bytedance.ies.ugc.aweme.commercialize.splash.show;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.b */
final /* synthetic */ class RunnableC18007b implements Runnable {

    /* renamed from: a */
    private final NormalSplashAdActivity f42875a;

    static {
        Covode.recordClassIndex(20629);
    }

    RunnableC18007b(NormalSplashAdActivity normalSplashAdActivity) {
        this.f42875a = normalSplashAdActivity;
    }

    public final void run() {
        NormalSplashAdActivity normalSplashAdActivity = this.f42875a;
        normalSplashAdActivity.finish();
        normalSplashAdActivity.overridePendingTransition(0, 0);
    }
}
