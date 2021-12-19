package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aj */
public final /* synthetic */ class C72066aj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C72060ae f161535a;

    /* renamed from: b */
    private final int f161536b;

    static {
        Covode.recordClassIndex(84731);
    }

    C72066aj(C72060ae aeVar, int i) {
        this.f161535a = aeVar;
        this.f161536b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f161535a.f161519f.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.f161536b));
    }
}
