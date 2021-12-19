package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.f */
public final /* synthetic */ class C35974f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final AbstractC35966c f84940a;

    /* renamed from: b */
    private final int f84941b;

    /* renamed from: c */
    private final ViewGroup.LayoutParams f84942c;

    static {
        Covode.recordClassIndex(43220);
    }

    public C35974f(AbstractC35966c cVar, int i, ViewGroup.LayoutParams layoutParams) {
        this.f84940a = cVar;
        this.f84941b = i;
        this.f84942c = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC35966c cVar = this.f84940a;
        int i = this.f84941b;
        ViewGroup.LayoutParams layoutParams = this.f84942c;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (C80471gb.m139483a(cVar.f84907a.getContext())) {
            cVar.f84919m.setTranslationX(((float) i) * (floatValue - 1.0f));
        } else {
            cVar.f84919m.setTranslationX(((float) i) * (1.0f - floatValue));
        }
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) (cVar.f84929w - C34728n.m70946a(16.0d))) - (((float) i) * floatValue));
            cVar.f84915i.setLayoutParams(layoutParams);
        }
    }
}
