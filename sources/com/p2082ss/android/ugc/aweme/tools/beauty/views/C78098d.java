package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.d */
final /* synthetic */ class C78098d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final SwitchButton f175369a;

    static {
        Covode.recordClassIndex(91196);
    }

    C78098d(SwitchButton switchButton) {
        this.f175369a = switchButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f175369a.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
