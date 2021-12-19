package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50153bv;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ca */
final /* synthetic */ class C50164ca implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C50153bv.C501563 f115799a;

    static {
        Covode.recordClassIndex(59290);
    }

    C50164ca(C50153bv.C501563 r1) {
        this.f115799a = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C50153bv.C501563 r2 = this.f115799a;
        C50153bv.this.f115769k.setVisibility(0);
        C50153bv.this.f115769k.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
