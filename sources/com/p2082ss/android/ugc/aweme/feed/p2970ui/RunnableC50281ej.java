package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ej */
final /* synthetic */ class RunnableC50281ej implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC50266eg f116100a;

    /* renamed from: b */
    private final float f116101b;

    /* renamed from: c */
    private final float f116102c;

    static {
        Covode.recordClassIndex(59407);
    }

    RunnableC50281ej(View$OnClickListenerC50266eg egVar, float f, float f2) {
        this.f116100a = egVar;
        this.f116101b = f;
        this.f116102c = f2;
    }

    public final void run() {
        View$OnClickListenerC50266eg egVar = this.f116100a;
        float f = this.f116101b;
        egVar.f116069c.animate().scaleX(f).scaleY(f).setDuration(150).withEndAction(new RunnableC50282ek(egVar, f, this.f116102c)).start();
    }
}
