package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VEVideoPublishPreviewActivity;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bx */
final /* synthetic */ class C73540bx implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity.C733352 f165220a;

    static {
        Covode.recordClassIndex(86277);
    }

    C73540bx(VEVideoPublishPreviewActivity.C733352 r1) {
        this.f165220a = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        VEVideoPublishPreviewActivity.this.f164718e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
