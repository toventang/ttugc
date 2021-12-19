package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.p1951a.C26555a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: a */
    public ViewPropertyAnimator f62788a;

    /* renamed from: b */
    private int f62789b;

    /* renamed from: c */
    private int f62790c = 2;

    static {
        Covode.recordClassIndex(32022);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2523a(int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: b */
    public void mo43865b(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f62788a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f62790c = 1;
        m52698a(v, this.f62789b, 175, C26555a.f62657c);
    }

    /* renamed from: a */
    public void mo43864a(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f62788a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f62790c = 2;
        m52698a(v, 0, 225, C26555a.f62658d);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2515a(V v, int i) {
        int i2 = this.f62790c;
        if (i2 != 1) {
            if (i > 0) {
                mo43865b(v);
                return;
            } else if (i2 == 2) {
                return;
            }
        }
        if (i < 0) {
            mo43864a(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public boolean mo2524a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f62789b = v.getMeasuredHeight();
        return super.mo2524a(coordinatorLayout, v, i);
    }

    /* renamed from: a */
    private void m52698a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f62788a = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.behavior.HideBottomViewOnScrollBehavior.C265851 */

            static {
                Covode.recordClassIndex(32023);
            }

            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.f62788a = null;
            }
        });
    }
}
