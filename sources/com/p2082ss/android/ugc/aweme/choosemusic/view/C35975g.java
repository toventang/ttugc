package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.g */
public final /* synthetic */ class C35975g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final AbstractC35966c f84943a;

    /* renamed from: b */
    private final int f84944b;

    /* renamed from: c */
    private final ViewGroup.LayoutParams f84945c;

    static {
        Covode.recordClassIndex(43221);
    }

    public C35975g(AbstractC35966c cVar, int i, ViewGroup.LayoutParams layoutParams) {
        this.f84943a = cVar;
        this.f84944b = i;
        this.f84945c = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC35966c cVar = this.f84943a;
        int i = this.f84944b;
        ViewGroup.LayoutParams layoutParams = this.f84945c;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (C80471gb.m139483a(cVar.f84907a.getContext())) {
            cVar.f84919m.setTranslationX(((float) (-i)) * floatValue);
        } else {
            cVar.f84919m.setTranslationX(((float) i) * floatValue);
        }
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) (cVar.f84929w - (C34728n.m70946a(16.0d) * 2))) - (((float) i) * (1.0f - floatValue)));
            cVar.f84915i.setLayoutParams(layoutParams);
        }
        if (floatValue == 1.0f) {
            cVar.f84910d.setVisibility(8);
            cVar.f84920n.setVisibility(0);
        }
    }
}
