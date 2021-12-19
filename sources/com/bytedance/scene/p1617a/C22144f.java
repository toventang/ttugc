package com.bytedance.scene.p1617a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.scene.a.f */
public final class C22144f {
    static {
        Covode.recordClassIndex(25948);
    }

    /* renamed from: a */
    public static Animator m41623a(Animator... animatorArr) {
        List asList = Arrays.asList(animatorArr);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(asList);
        return animatorSet;
    }
}
