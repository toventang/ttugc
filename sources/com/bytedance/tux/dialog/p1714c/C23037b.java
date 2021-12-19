package com.bytedance.tux.dialog.p1714c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.c.b */
public final class C23037b extends AbstractC23036a {
    static {
        Covode.recordClassIndex(26957);
    }

    /* renamed from: com.bytedance.tux.dialog.c.b$a */
    static final class C23038a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ Interpolator f54534a;

        /* renamed from: b */
        final /* synthetic */ View f54535b;

        static {
            Covode.recordClassIndex(26958);
        }

        C23038a(Interpolator interpolator, View view) {
            this.f54534a = interpolator;
            this.f54535b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f54535b;
            C89219l.m154709a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setScaleX(((Float) animatedValue).floatValue());
                View view2 = this.f54535b;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    view2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.tux.dialog.p1714c.AbstractC23036a
    /* renamed from: b */
    public final Animator mo37432b(View view) {
        C89219l.m154719c(view, "");
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator b = C22971a.m43306b();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(view);
        objectAnimator.setPropertyName("alpha");
        objectAnimator.setFloatValues(0.0f, 1.0f);
        objectAnimator.setDuration(300L);
        objectAnimator.setInterpolator(new LinearInterpolator());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.2f, 1.0f);
        ofFloat.setInterpolator(b);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C23038a(b, view));
        animatorSet.playTogether(objectAnimator, ofFloat);
        return animatorSet;
    }
}
