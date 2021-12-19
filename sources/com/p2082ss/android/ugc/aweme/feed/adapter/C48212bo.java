package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bo */
final /* synthetic */ class C48212bo implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final VideoViewCell f111695a;

    static {
        Covode.recordClassIndex(56954);
    }

    C48212bo(VideoViewCell videoViewCell) {
        this.f111695a = videoViewCell;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f111695a.f111476v.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
