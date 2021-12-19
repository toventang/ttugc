package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b */
public final class C55190b {

    /* renamed from: a */
    public static final C55190b f126261a = new C55190b();

    private C55190b() {
    }

    static {
        Covode.recordClassIndex(64935);
    }

    /* renamed from: a */
    public static final void m100903a(View view) {
        C89219l.m154721d(view, "");
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        view.clearAnimation();
    }

    /* renamed from: a */
    public static final TranslateAnimation m100902a(float f, float f2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setDuration(240);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setRepeatMode(1);
        return translateAnimation;
    }

    /* renamed from: a */
    public static final RotateAnimation m100901a(int i, Animation.AnimationListener animationListener) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration((long) i);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setAnimationListener(animationListener);
        return rotateAnimation;
    }
}
