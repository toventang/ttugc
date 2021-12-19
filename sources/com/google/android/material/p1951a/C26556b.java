package com.google.android.material.p1951a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.google.android.material.a.b */
public final class C26556b {
    static {
        Covode.recordClassIndex(31987);
    }

    /* renamed from: a */
    public static void m52580a(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
