package com.bytedance.android.livesdk.service.animation.p622a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.core.p037h.p039b.C0767b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.service.animation.a.a */
public final class C10645a {
    static {
        Covode.recordClassIndex(12235);
    }

    /* renamed from: a */
    public static AnimatorSet m19201a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        ofFloat.setDuration(1L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        ofFloat2.setDuration(1L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 0.7f);
        ofFloat3.setDuration(100L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 0.7f);
        ofFloat4.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        return animatorSet3;
    }

    /* renamed from: b */
    public static AnimatorSet m19202b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        ofFloat.setDuration(100L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        ofFloat2.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 1.08f);
        ofFloat3.setDuration(100L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 1.08f);
        ofFloat4.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        ofFloat5.setDuration(100L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        ofFloat6.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ofFloat5, ofFloat6);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        return animatorSet4;
    }

    /* renamed from: c */
    public static AnimatorSet m19203c(View view) {
        float a = (float) C3966y.m9653a(16.0f);
        float a2 = (float) C3966y.m9653a(8.0f);
        float f = -a;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f);
        ofFloat.setInterpolator(C0767b.m2680a(0.4f, 0.64f, 0.74f, 1.0f));
        ofFloat.setDuration(250L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", f, 0.0f);
        ofFloat2.setInterpolator(C0767b.m2680a(0.26f, 0.0f, 0.6f, 0.36f));
        ofFloat.setDuration(250L);
        float f2 = -a2;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f2);
        ofFloat3.setInterpolator(C0767b.m2680a(0.4f, 0.64f, 0.74f, 1.0f));
        ofFloat3.setDuration(200L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationY", f2, 0.0f);
        ofFloat4.setInterpolator(C0767b.m2680a(0.26f, 0.0f, 0.6f, 0.36f));
        ofFloat3.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        return animatorSet;
    }
}
