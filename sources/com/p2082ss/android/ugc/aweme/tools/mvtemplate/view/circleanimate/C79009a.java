package com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.a */
public final class C79009a {

    /* renamed from: a */
    public int f177563a;

    /* renamed from: b */
    public int f177564b;

    /* renamed from: c */
    public int f177565c;

    /* renamed from: d */
    public int f177566d;

    /* renamed from: e */
    public int f177567e;

    /* renamed from: f */
    public int f177568f;

    /* renamed from: g */
    public int f177569g;

    /* renamed from: h */
    public float f177570h;

    /* renamed from: i */
    public float f177571i;

    /* renamed from: j */
    public float f177572j;

    /* renamed from: k */
    public TextView f177573k;

    /* renamed from: l */
    private C79012b f177574l;

    static {
        Covode.recordClassIndex(92172);
    }

    /* renamed from: a */
    public final void mo122823a() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f177564b, this.f177565c);
        final GradientDrawable gradientDrawable = this.f177574l.f177580c;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.C79009a.C790101 */

            static {
                Covode.recordClassIndex(92173);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue;
                int i;
                float animatedFraction;
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                if (C79009a.this.f177564b > C79009a.this.f177565c) {
                    intValue = (C79009a.this.f177564b - num.intValue()) / 2;
                    i = C79009a.this.f177564b - intValue;
                    animatedFraction = C79009a.this.f177572j * valueAnimator.getAnimatedFraction();
                } else {
                    intValue = (C79009a.this.f177565c - num.intValue()) / 2;
                    i = C79009a.this.f177565c - intValue;
                    animatedFraction = C79009a.this.f177572j - (C79009a.this.f177572j * valueAnimator.getAnimatedFraction());
                }
                int i2 = (int) animatedFraction;
                gradientDrawable.setBounds(intValue + i2, i2, i - i2, C79009a.this.f177573k.getHeight() - i2);
            }
        });
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(gradientDrawable, C19386b.f45894a, this.f177566d, this.f177567e);
        ofInt2.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(this.f177574l, "strokeColor", this.f177568f, this.f177569g);
        ofInt3.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gradientDrawable, "cornerRadius", this.f177570h, this.f177571i);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration((long) this.f177563a);
        animatorSet.playTogether(ofInt, ofInt2, ofInt3, ofFloat);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.C79009a.C790112 */

            static {
                Covode.recordClassIndex(92174);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        animatorSet.start();
    }

    C79009a(TextView textView, C79012b bVar) {
        this.f177573k = textView;
        this.f177574l = bVar;
    }
}
