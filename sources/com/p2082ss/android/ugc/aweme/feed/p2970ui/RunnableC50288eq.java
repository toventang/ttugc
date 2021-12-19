package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.eq */
public final /* synthetic */ class RunnableC50288eq implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC50266eg f116113a;

    /* renamed from: b */
    private final float f116114b;

    /* renamed from: c */
    private final float f116115c;

    static {
        Covode.recordClassIndex(59414);
    }

    RunnableC50288eq(View$OnClickListenerC50266eg egVar, float f, float f2) {
        this.f116113a = egVar;
        this.f116114b = f;
        this.f116115c = f2;
    }

    public final void run() {
        View$OnClickListenerC50266eg egVar = this.f116113a;
        egVar.f116069c.animate().scaleX(1.08f).scaleY(1.08f).setDuration(150).withEndAction(new RunnableC50281ej(egVar, this.f116114b, this.f116115c)).start();
    }
}
