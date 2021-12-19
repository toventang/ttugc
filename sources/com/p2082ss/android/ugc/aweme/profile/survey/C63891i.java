package com.p2082ss.android.ugc.aweme.profile.survey;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.survey.i */
public final /* synthetic */ class C63891i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final AbstractView$OnClickListenerC63887g f144841a;

    static {
        Covode.recordClassIndex(75319);
    }

    C63891i(AbstractView$OnClickListenerC63887g gVar) {
        this.f144841a = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractView$OnClickListenerC63887g gVar = this.f144841a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.0f) {
            gVar.f144823c.setAlpha(Math.abs(floatValue));
            return;
        }
        if (gVar.f144823c.getAlpha() > 0.0f) {
            gVar.f144823c.setAlpha(0.0f);
        }
        gVar.f144826f.setAlpha(floatValue);
    }
}
