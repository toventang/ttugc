package com.bytedance.android.live.design.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.design.view.i */
public final class C4096i extends Transition {

    /* renamed from: a */
    private final long f11360a;

    /* renamed from: b */
    private final long f11361b;

    /* renamed from: c */
    private final float f11362c;

    /* renamed from: d */
    private final float f11363d;

    /* renamed from: e */
    private final boolean f11364e;

    static {
        Covode.recordClassIndex(4641);
    }

    @Override // android.transition.Transition
    public final Transition addTarget(View view) {
        view.setPivotX(this.f11362c);
        view.setPivotY(this.f11363d);
        return super.addTarget(view);
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        if (this.f11364e) {
            transitionValues.values.put("ttlive:scaleX", Float.valueOf(1.0f));
            transitionValues.values.put("ttlive:scaleY", Float.valueOf(1.0f));
            transitionValues.values.put("ttlive:alpha", Float.valueOf(1.0f));
            return;
        }
        transitionValues.values.put("ttlive:scaleX", Float.valueOf(0.0f));
        transitionValues.values.put("ttlive:scaleY", Float.valueOf(0.0f));
        transitionValues.values.put("ttlive:alpha", Float.valueOf(0.0f));
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        if (this.f11364e) {
            transitionValues.values.put("ttlive:scaleX", Float.valueOf(0.0f));
            transitionValues.values.put("ttlive:scaleY", Float.valueOf(0.0f));
            transitionValues.values.put("ttlive:alpha", Float.valueOf(0.0f));
            return;
        }
        transitionValues.values.put("ttlive:scaleX", Float.valueOf(1.0f));
        transitionValues.values.put("ttlive:scaleY", Float.valueOf(1.0f));
        transitionValues.values.put("ttlive:alpha", Float.valueOf(1.0f));
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || transitionValues.view != transitionValues2.view) {
            return null;
        }
        float floatValue = ((Float) transitionValues.values.get("ttlive:scaleX")).floatValue();
        float floatValue2 = ((Float) transitionValues.values.get("ttlive:scaleY")).floatValue();
        float floatValue3 = ((Float) transitionValues2.values.get("ttlive:scaleX")).floatValue();
        float floatValue4 = ((Float) transitionValues2.values.get("ttlive:scaleY")).floatValue();
        float floatValue5 = ((Float) transitionValues.values.get("ttlive:alpha")).floatValue();
        float floatValue6 = ((Float) transitionValues2.values.get("ttlive:alpha")).floatValue();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(transitionValues.view, "alpha", floatValue5, floatValue6);
        ofFloat.setDuration(this.f11360a);
        ofFloat.setInterpolator(new LinearInterpolator());
        if (!this.f11364e) {
            ofFloat.setStartDelay(this.f11361b - this.f11360a);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(transitionValues.view, "scaleX", floatValue, floatValue3);
        ofFloat2.setDuration(this.f11361b);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(transitionValues.view, "scaleY", floatValue2, floatValue4);
        ofFloat3.setDuration(this.f11361b);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat);
        return animatorSet;
    }

    public C4096i(long j, long j2, float f, float f2, boolean z) {
        this.f11360a = j;
        this.f11361b = j2;
        this.f11362c = f;
        this.f11363d = f2;
        this.f11364e = z;
    }
}
