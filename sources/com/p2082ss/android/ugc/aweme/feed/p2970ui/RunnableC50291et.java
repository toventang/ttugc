package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.et */
final /* synthetic */ class RunnableC50291et implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC50266eg.RunnableC502755 f116120a;

    static {
        Covode.recordClassIndex(59417);
    }

    RunnableC50291et(View$OnClickListenerC50266eg.RunnableC502755 r1) {
        this.f116120a = r1;
    }

    public final void run() {
        View$OnClickListenerC50266eg.RunnableC502755 r3 = this.f116120a;
        View$OnClickListenerC50266eg.this.f116069c.animate().scaleX(0.8f).scaleY(0.8f).setDuration(150).withEndAction(new RunnableC50292eu(r3)).start();
    }
}
