package com.bytedance.ies.uikit.p1282d;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.uikit.d.d */
public final class C18253d {
    static {
        Covode.recordClassIndex(20912);
    }

    /* renamed from: a */
    public static AnimatorSet m33966a(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    /* renamed from: b */
    public static AnimatorSet m33967b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }
}
