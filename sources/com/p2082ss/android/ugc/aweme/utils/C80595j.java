package com.p2082ss.android.ugc.aweme.utils;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.j */
public final class C80595j {
    static {
        Covode.recordClassIndex(93868);
    }

    /* renamed from: a */
    public static void m139739a(View view) {
        if (view != null) {
            view.setOnTouchListener(new View$OnTouchListenerC80598k(view, view.getAlpha()));
        }
    }

    /* renamed from: a */
    public static Drawable m139738a(Drawable drawable, int i) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        }
        C0705a.m2494a(drawable, i);
        return drawable;
    }

    /* renamed from: a */
    public static ValueAnimator m139737a(final View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80595j.C805961 */

            static {
                Covode.recordClassIndex(93869);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.bottomMargin = intValue;
                view.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.setDuration((long) i3);
        ofInt.setTarget(view);
        return ofInt;
    }

    /* renamed from: a */
    public static void m139740a(final View view, Drawable drawable, int i, int i2, long j, Animator.AnimatorListener animatorListener) {
        if (i != i2) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
            final Drawable mutate = C0705a.m2506e(drawable).mutate();
            if (mutate instanceof GradientDrawable) {
                ((GradientDrawable) mutate).setColor(i2);
            }
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.utils.C80595j.C805972 */

                static {
                    Covode.recordClassIndex(93870);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    View view = view;
                    if (view != null) {
                        view.setBackground(C80595j.m139738a(mutate, intValue));
                    }
                }
            });
            if (animatorListener != null) {
                ofObject.addListener(animatorListener);
            }
            ofObject.setDuration(j);
            ofObject.start();
        }
    }
}
