package com.bytedance.android.livesdk.p562k;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.k.j */
final /* synthetic */ class C9157j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final int f22278a;

    /* renamed from: b */
    private final View f22279b;

    /* renamed from: c */
    private final boolean f22280c;

    static {
        Covode.recordClassIndex(10061);
    }

    C9157j(int i, View view, boolean z) {
        this.f22278a = i;
        this.f22279b = view;
        this.f22280c = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f22278a;
        View view = this.f22279b;
        boolean z = this.f22280c;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = (float) i;
        view.setTranslationY(z ? (float) ((int) (f - (f * animatedFraction))) : animatedFraction * ((float) (-i)));
    }
}
