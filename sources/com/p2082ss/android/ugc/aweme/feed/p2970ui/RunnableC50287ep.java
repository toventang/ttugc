package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ep */
final /* synthetic */ class RunnableC50287ep implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC50266eg f116112a;

    static {
        Covode.recordClassIndex(59413);
    }

    RunnableC50287ep(View$OnClickListenerC50266eg egVar) {
        this.f116112a = egVar;
    }

    public final void run() {
        View$OnClickListenerC50266eg egVar = this.f116112a;
        if (egVar.f116069c != null && egVar.f116069c.getAnimation() != null) {
            egVar.f116069c.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new RunnableC50283el(egVar));
        }
    }
}
