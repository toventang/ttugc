package com.p2082ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.utils.ba */
public final /* synthetic */ class C80237ba implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ViewGroup f179714a;

    /* renamed from: b */
    private final boolean f179715b;

    static {
        Covode.recordClassIndex(93505);
    }

    C80237ba(ViewGroup viewGroup, boolean z) {
        this.f179714a = viewGroup;
        this.f179715b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup = this.f179714a;
        boolean z = this.f179715b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        if (z) {
            marginLayoutParams.bottomMargin = intValue;
        } else {
            marginLayoutParams.topMargin = intValue;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}
