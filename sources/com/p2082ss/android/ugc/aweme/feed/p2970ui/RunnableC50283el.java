package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.el */
final /* synthetic */ class RunnableC50283el implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC50266eg f116106a;

    static {
        Covode.recordClassIndex(59409);
    }

    RunnableC50283el(View$OnClickListenerC50266eg egVar) {
        this.f116106a = egVar;
    }

    public final void run() {
        View$OnClickListenerC50266eg egVar = this.f116106a;
        C34577e.m70591a(egVar.f116067a, 2131233153);
        egVar.f116069c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).withEndAction(new RunnableC50284em(egVar));
    }
}
