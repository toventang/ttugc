package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.q */
final /* synthetic */ class C72249q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C72235n f161979a;

    /* renamed from: b */
    private final float f161980b;

    static {
        Covode.recordClassIndex(84914);
    }

    C72249q(C72235n nVar, float f) {
        this.f161979a = nVar;
        this.f161980b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C72235n nVar = this.f161979a;
        float f = this.f161980b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        nVar.f161962t = floatValue;
        C72235n.m127435a(nVar.f161944b, floatValue);
        if (nVar.f161959q) {
            nVar.f161946d.setTranslationX(floatValue - f);
        } else {
            nVar.f161946d.setTranslationX(f - floatValue);
        }
    }
}
