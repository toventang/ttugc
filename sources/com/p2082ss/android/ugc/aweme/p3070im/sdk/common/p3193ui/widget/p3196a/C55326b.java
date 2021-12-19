package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3196a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.b */
public final class C55326b {

    /* renamed from: a */
    public static final C55326b f126511a = new C55326b();

    private C55326b() {
    }

    static {
        Covode.recordClassIndex(65091);
    }

    /* renamed from: a */
    public static void m101137a(View view) {
        C89219l.m154721d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(700L);
        animatorSet.setInterpolator(new animationInterpolatorC55325a());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }
}
