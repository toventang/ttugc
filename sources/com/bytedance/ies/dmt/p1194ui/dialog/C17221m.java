package com.bytedance.ies.dmt.p1194ui.dialog;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.m */
final /* synthetic */ class C17221m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final int f41132a;

    /* renamed from: b */
    private final View f41133b;

    /* renamed from: c */
    private final boolean f41134c;

    static {
        Covode.recordClassIndex(19682);
    }

    C17221m(int i, View view, boolean z) {
        this.f41132a = i;
        this.f41133b = view;
        this.f41134c = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f41132a;
        View view = this.f41133b;
        boolean z = this.f41134c;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = (float) i;
        view.setTranslationY(z ? (float) ((int) (f - (f * animatedFraction))) : animatedFraction * ((float) (-i)));
    }
}
