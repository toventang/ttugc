package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.ad */
public final class C70067ad {
    static {
        Covode.recordClassIndex(82487);
    }

    /* renamed from: a */
    public static final void m123689a(View view) {
        C89219l.m154721d(view, "");
        view.setPivotX(((float) view.getWidth()) / 2.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofFloat2, ofFloat);
        animatorSet.start();
    }
}
