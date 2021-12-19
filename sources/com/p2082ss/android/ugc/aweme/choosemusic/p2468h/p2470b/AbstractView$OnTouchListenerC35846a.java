package com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2470b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.b.a */
public abstract class AbstractView$OnTouchListenerC35846a implements View.OnTouchListener {
    static {
        Covode.recordClassIndex(43085);
    }

    /* renamed from: a */
    public abstract void mo62955a(View view);

    /* renamed from: b */
    private static Animator m73241b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 1.0f);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
            ofFloat.setDuration(150L);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2470b.AbstractView$OnTouchListenerC35846a.C358471 */

                static {
                    Covode.recordClassIndex(43086);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.start();
            return true;
        } else if (motionEvent.getAction() == 1) {
            Animator b = m73241b(view);
            b.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2470b.AbstractView$OnTouchListenerC35846a.C358482 */

                static {
                    Covode.recordClassIndex(43087);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    AbstractView$OnTouchListenerC35846a.this.mo62955a(view);
                }
            });
            b.start();
            return true;
        } else {
            if (motionEvent.getAction() == 3) {
                m73241b(view).start();
            }
            return false;
        }
    }
}
