package com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.uikit.a.a */
public final class C38545a {
    static {
        Covode.recordClassIndex(46076);
    }

    /* renamed from: a */
    public static void m78162a(View view) {
        if (view != null) {
            view.setOnTouchListener(new View$OnTouchListenerC38548b(view, view.getAlpha()));
        }
    }

    /* renamed from: a */
    public static Drawable m78161a(Drawable drawable, int i) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        }
        C0705a.m2494a(drawable, i);
        return drawable;
    }

    /* renamed from: a */
    public static ValueAnimator m78160a(final View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a.C385461 */

            static {
                Covode.recordClassIndex(46077);
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
    public static void m78163a(View view, Drawable drawable, int i, int i2, long j) {
        m78164a(view, drawable, i, i2, j, null);
    }

    /* renamed from: a */
    public static void m78164a(final View view, Drawable drawable, int i, int i2, long j, Animator.AnimatorListener animatorListener) {
        if (i != i2 && drawable != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
            final Drawable mutate = C0705a.m2506e(drawable).mutate();
            if (mutate instanceof GradientDrawable) {
                ((GradientDrawable) mutate).setColor(i2);
            }
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a.C385472 */

                static {
                    Covode.recordClassIndex(46078);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    View view = view;
                    if (view != null) {
                        view.setBackground(C38545a.m78161a(mutate, intValue));
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
