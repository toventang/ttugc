package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bt */
public final /* synthetic */ class C73536bt implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f165213a;

    static {
        Covode.recordClassIndex(86273);
    }

    C73536bt(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f165213a = vEVideoPublishPreviewActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f165213a.f164720g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
