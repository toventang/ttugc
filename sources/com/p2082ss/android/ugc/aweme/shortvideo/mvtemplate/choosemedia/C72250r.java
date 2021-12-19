package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.r */
final /* synthetic */ class C72250r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C72235n f161981a;

    /* renamed from: b */
    private final float f161982b;

    static {
        Covode.recordClassIndex(84915);
    }

    C72250r(C72235n nVar, float f) {
        this.f161981a = nVar;
        this.f161982b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C72235n nVar = this.f161981a;
        float f = this.f161982b;
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
