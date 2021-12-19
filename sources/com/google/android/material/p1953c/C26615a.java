package com.google.android.material.p1953c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.material.p1953c.AbstractC26621d;

/* renamed from: com.google.android.material.c.a */
public final class C26615a {
    static {
        Covode.recordClassIndex(32063);
    }

    /* renamed from: a */
    public static Animator m52791a(AbstractC26621d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, AbstractC26621d.C26623b.f62945a, AbstractC26621d.C26622a.f62943a, new AbstractC26621d.C26625d(f, f2, f3));
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        AbstractC26621d.C26625d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f62949c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
