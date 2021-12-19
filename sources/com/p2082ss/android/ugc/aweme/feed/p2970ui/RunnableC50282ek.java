package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ek */
final /* synthetic */ class RunnableC50282ek implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC50266eg f116103a;

    /* renamed from: b */
    private final float f116104b;

    /* renamed from: c */
    private final float f116105c;

    static {
        Covode.recordClassIndex(59408);
    }

    RunnableC50282ek(View$OnClickListenerC50266eg egVar, float f, float f2) {
        this.f116103a = egVar;
        this.f116104b = f;
        this.f116105c = f2;
    }

    public final void run() {
        View$OnClickListenerC50266eg egVar = this.f116103a;
        float f = this.f116104b;
        float f2 = this.f116105c;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        egVar.f116069c.startAnimation(scaleAnimation);
    }
}
