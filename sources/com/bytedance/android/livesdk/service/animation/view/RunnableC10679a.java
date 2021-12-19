package com.bytedance.android.livesdk.service.animation.view;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.service.animation.view.a */
public final /* synthetic */ class RunnableC10679a implements Runnable {

    /* renamed from: a */
    private final LiveNewSendGiftAnimationForWishListView f25725a;

    /* renamed from: b */
    private final Runnable f25726b;

    static {
        Covode.recordClassIndex(12275);
    }

    public RunnableC10679a(LiveNewSendGiftAnimationForWishListView liveNewSendGiftAnimationForWishListView, Runnable runnable) {
        this.f25725a = liveNewSendGiftAnimationForWishListView;
        this.f25726b = runnable;
    }

    public final void run() {
        LiveNewSendGiftAnimationForWishListView liveNewSendGiftAnimationForWishListView = this.f25725a;
        Runnable runnable = this.f25726b;
        liveNewSendGiftAnimationForWishListView.f25684d = 2;
        liveNewSendGiftAnimationForWishListView.mo17587a(runnable);
    }
}
