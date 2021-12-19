package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.aj */
public abstract class AbstractC42662aj extends AbstractView$OnTouchListenerC39094b {

    /* renamed from: f */
    public boolean f99489f = true;

    static {
        Covode.recordClassIndex(50766);
    }

    /* renamed from: a */
    public abstract void mo70824a(View view);

    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
    /* renamed from: b */
    public final Animator mo64559b(View view) {
        if (!this.f99489f) {
            return ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
    /* renamed from: c */
    public final Animator mo64560c(View view) {
        if (!this.f99489f) {
            return ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 1.0f);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
    /* renamed from: a */
    public final void mo64558a(View view, MotionEvent motionEvent) {
        mo70824a(view);
    }
}
