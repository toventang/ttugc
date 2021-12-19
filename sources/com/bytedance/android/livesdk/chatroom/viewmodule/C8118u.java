package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.chatroom.p499ui.SweepEffectFrameLayout;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.u */
final /* synthetic */ class C8118u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final SweepEffectFrameLayout f20130a;

    static {
        Covode.recordClassIndex(8925);
    }

    C8118u(SweepEffectFrameLayout sweepEffectFrameLayout) {
        this.f20130a = sweepEffectFrameLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f20130a.setSweepRatio(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
