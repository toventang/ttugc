package com.p2082ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.af */
public final class C41986af extends Visibility {
    static {
        Covode.recordClassIndex(49916);
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(transitionValues, "");
        C89219l.m154721d(transitionValues2, "");
        return null;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(transitionValues, "");
        C89219l.m154721d(transitionValues2, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", (float) C34728n.m70946a(20.0d), 0.0f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }
}
