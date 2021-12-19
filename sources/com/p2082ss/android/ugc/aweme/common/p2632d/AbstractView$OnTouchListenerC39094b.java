package com.p2082ss.android.ugc.aweme.common.p2632d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.common.d.b */
public abstract class AbstractView$OnTouchListenerC39094b implements View.OnTouchListener {
    static {
        Covode.recordClassIndex(46710);
    }

    /* renamed from: a */
    public abstract void mo64558a(View view, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Animator mo64559b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Animator mo64560c(View view);

    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Animator b = mo64559b(view);
            b.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b.C390951 */

                static {
                    Covode.recordClassIndex(46711);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            b.start();
            return true;
        } else if (motionEvent.getAction() == 1) {
            Animator c = mo64560c(view);
            c.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b.C390962 */

                static {
                    Covode.recordClassIndex(46712);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    AbstractView$OnTouchListenerC39094b.this.mo64558a(view, motionEvent);
                }
            });
            c.start();
            return true;
        } else {
            if (motionEvent.getAction() == 3) {
                mo64560c(view).start();
            }
            return false;
        }
    }
}
