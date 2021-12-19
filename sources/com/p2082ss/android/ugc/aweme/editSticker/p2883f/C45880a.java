package com.p2082ss.android.ugc.aweme.editSticker.p2883f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.f.a */
public final class C45880a {
    static {
        Covode.recordClassIndex(54404);
    }

    /* renamed from: a */
    public static void m88521a(final View view) {
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45880a.C458811 */

            /* renamed from: b */
            final /* synthetic */ Animator.AnimatorListener f106875b = null;

            static {
                Covode.recordClassIndex(54405);
            }

            public final void onAnimationEnd(Animator animator) {
                view.setVisibility(0);
                Animator.AnimatorListener animatorListener = this.f106875b;
                if (animatorListener != null) {
                    animatorListener.onAnimationEnd(animator);
                }
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    /* renamed from: b */
    public static void m88522b(final View view) {
        if (view.getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45880a.C458822 */

                /* renamed from: b */
                final /* synthetic */ Animator.AnimatorListener f106877b = null;

                static {
                    Covode.recordClassIndex(54406);
                }

                public final void onAnimationEnd(Animator animator) {
                    view.setVisibility(8);
                    Animator.AnimatorListener animatorListener = this.f106877b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationEnd(animator);
                    }
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.start();
        }
    }
}
