package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.ch */
public final /* synthetic */ class C50174ch implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C50166cc f115849a;

    static {
        Covode.recordClassIndex(59300);
    }

    C50174ch(C50166cc ccVar) {
        this.f115849a = ccVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C50166cc ccVar = this.f115849a;
        ccVar.f115811e.setVisibility(0);
        ccVar.f115811e.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
