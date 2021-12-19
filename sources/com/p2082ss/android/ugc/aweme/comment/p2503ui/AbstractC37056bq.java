package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bq */
public abstract class AbstractC37056bq extends AbstractView$OnTouchListenerC39094b {
    static {
        Covode.recordClassIndex(44410);
    }

    /* renamed from: a */
    public abstract void mo63391a(View view);

    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
    /* renamed from: b */
    public final Animator mo64559b(View view) {
        C89219l.m154721d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.75f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
    /* renamed from: c */
    public final Animator mo64560c(View view) {
        C89219l.m154721d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.75f, 1.0f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractView$OnTouchListenerC39094b
    /* renamed from: a */
    public final void mo64558a(View view, MotionEvent motionEvent) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(motionEvent, "");
        mo63391a(view);
    }
}
