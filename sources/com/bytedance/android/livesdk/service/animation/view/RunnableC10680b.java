package com.bytedance.android.livesdk.service.animation.view;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.service.animation.view.b */
public final /* synthetic */ class RunnableC10680b implements Runnable {

    /* renamed from: a */
    private final LiveNewSendGiftAnimationView f25727a;

    /* renamed from: b */
    private final Runnable f25728b;

    static {
        Covode.recordClassIndex(12276);
    }

    RunnableC10680b(LiveNewSendGiftAnimationView liveNewSendGiftAnimationView, Runnable runnable) {
        this.f25727a = liveNewSendGiftAnimationView;
        this.f25728b = runnable;
    }

    public final void run() {
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = this.f25727a;
        Runnable runnable = this.f25728b;
        liveNewSendGiftAnimationView.f25700a = 2;
        liveNewSendGiftAnimationView.mo17592b(runnable);
    }
}
