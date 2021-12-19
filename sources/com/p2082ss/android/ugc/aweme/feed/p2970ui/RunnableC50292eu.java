package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.eu */
final /* synthetic */ class RunnableC50292eu implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC50266eg.RunnableC502755 f116121a;

    static {
        Covode.recordClassIndex(59418);
    }

    RunnableC50292eu(View$OnClickListenerC50266eg.RunnableC502755 r1) {
        this.f116121a = r1;
    }

    public final void run() {
        View$OnClickListenerC50266eg.RunnableC502755 r2 = this.f116121a;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.16f, 0.8f, 1.16f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        View$OnClickListenerC50266eg.this.f116069c.startAnimation(scaleAnimation);
    }
}
