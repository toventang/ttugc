package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50266eg;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.es */
final /* synthetic */ class RunnableC50290es implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC50266eg.RunnableC502755 f116119a;

    static {
        Covode.recordClassIndex(59416);
    }

    RunnableC50290es(View$OnClickListenerC50266eg.RunnableC502755 r1) {
        this.f116119a = r1;
    }

    public final void run() {
        View$OnClickListenerC50266eg.RunnableC502755 r3 = this.f116119a;
        C34577e.m70591a(View$OnClickListenerC50266eg.this.f116067a, 2131231780);
        View$OnClickListenerC50266eg.this.f116069c.animate().scaleX(1.16f).scaleY(1.16f).setDuration(150).withEndAction(new RunnableC50291et(r3)).start();
    }
}
