package com.p2082ss.android.ugc.aweme.tools.mvtemplate.view;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.a */
final /* synthetic */ class C79008a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final MvThemeListViewPager f177557a;

    static {
        Covode.recordClassIndex(92170);
    }

    C79008a(MvThemeListViewPager mvThemeListViewPager) {
        this.f177557a = mvThemeListViewPager;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f177557a.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
