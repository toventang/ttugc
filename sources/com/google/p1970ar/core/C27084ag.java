package com.google.p1970ar.core;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.ag */
final class C27084ag implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ int f64081a;

    /* renamed from: b */
    final /* synthetic */ int f64082b;

    /* renamed from: c */
    final /* synthetic */ int f64083c;

    /* renamed from: d */
    final /* synthetic */ InstallActivity f64084d;

    static {
        Covode.recordClassIndex(32633);
    }

    C27084ag(InstallActivity installActivity, int i, int i2, int i3) {
        this.f64084d = installActivity;
        this.f64081a = i;
        this.f64082b = i2;
        this.f64083c = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        int i = this.f64081a;
        float f = ((float) this.f64082b) * animatedFraction2;
        this.f64084d.getWindow().setLayout((int) ((((float) i) * animatedFraction) + f), (int) ((((float) this.f64083c) * animatedFraction) + f));
        this.f64084d.getWindow().getDecorView().refreshDrawableState();
    }
}
