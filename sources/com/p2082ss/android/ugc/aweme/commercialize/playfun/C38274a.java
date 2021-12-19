package com.p2082ss.android.ugc.aweme.commercialize.playfun;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a */
public final class C38274a {

    /* renamed from: a */
    public static final C38274a f90467a = new C38274a();

    private C38274a() {
    }

    static {
        Covode.recordClassIndex(45761);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a$a */
    static final class C38275a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PathMeasure f90468a;

        /* renamed from: b */
        final /* synthetic */ float[] f90469b;

        /* renamed from: c */
        final /* synthetic */ View f90470c;

        static {
            Covode.recordClassIndex(45762);
        }

        C38275a(PathMeasure pathMeasure, float[] fArr, View view) {
            this.f90468a = pathMeasure;
            this.f90469b = fArr;
            this.f90470c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                PathMeasure pathMeasure = this.f90468a;
                pathMeasure.getPosTan(pathMeasure.getLength() * valueAnimator.getAnimatedFraction(), this.f90469b, null);
                this.f90470c.setTranslationX(this.f90469b[0]);
                this.f90470c.setTranslationY(this.f90469b[1]);
            }
        }
    }

    /* renamed from: a */
    public static Animator m77637a(View view, float f) {
        C89219l.m154721d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m77639a(View view, Path path) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(path, "");
        if (Build.VERSION.SDK_INT >= 21) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", "translationY", path);
            C89219l.m154716b(ofFloat, "");
            return ofFloat;
        }
        C38275a aVar = new C38275a(new PathMeasure(path, false), new float[2], view);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(aVar);
        C89219l.m154716b(ofFloat2, "");
        return ofFloat2;
    }

    /* renamed from: a */
    public static Animator m77638a(View view, float f, float f2, int i) {
        C89219l.m154721d(view, "");
        float f3 = ((float) i) / 2.0f;
        view.setPivotX(f3);
        view.setPivotY(f3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f2);
        C89219l.m154716b(ofFloat, "");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", view.getScaleY(), f2);
        C89219l.m154716b(ofFloat2, "");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.play(ofFloat3).with(ofFloat).with(ofFloat2);
        return animatorSet;
    }
}
