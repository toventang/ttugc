package androidx.p060l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.l.u */
final class C1152u {
    static {
        Covode.recordClassIndex(1245);
    }

    /* renamed from: androidx.l.u$a */
    static class C1153a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f3906a;

        /* renamed from: b */
        private final View f3907b;

        /* renamed from: c */
        private final int f3908c;

        /* renamed from: d */
        private final int f3909d;

        /* renamed from: e */
        private int[] f3910e;

        /* renamed from: f */
        private float f3911f;

        /* renamed from: g */
        private float f3912g;

        /* renamed from: h */
        private final float f3913h;

        /* renamed from: i */
        private final float f3914i;

        static {
            Covode.recordClassIndex(1246);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f3907b.setTranslationX(this.f3913h);
            this.f3907b.setTranslationY(this.f3914i);
        }

        public final void onAnimationResume(Animator animator) {
            this.f3907b.setTranslationX(this.f3911f);
            this.f3907b.setTranslationY(this.f3912g);
        }

        public final void onAnimationPause(Animator animator) {
            this.f3911f = this.f3907b.getTranslationX();
            this.f3912g = this.f3907b.getTranslationY();
            this.f3907b.setTranslationX(this.f3913h);
            this.f3907b.setTranslationY(this.f3914i);
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f3910e == null) {
                this.f3910e = new int[2];
            }
            this.f3910e[0] = Math.round(((float) this.f3908c) + this.f3907b.getTranslationX());
            this.f3910e[1] = Math.round(((float) this.f3909d) + this.f3907b.getTranslationY());
            this.f3906a.setTag(R.id.en6, this.f3910e);
        }

        C1153a(View view, View view2, int i, int i2, float f, float f2) {
            this.f3907b = view;
            this.f3906a = view2;
            this.f3908c = i - Math.round(view.getTranslationX());
            this.f3909d = i2 - Math.round(view.getTranslationY());
            this.f3913h = f;
            this.f3914i = f2;
            int[] iArr = (int[]) view2.getTag(R.id.en6);
            this.f3910e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.en6, null);
            }
        }
    }

    /* renamed from: a */
    static Animator m3833a(View view, C1150s sVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5 = f;
        float f6 = f2;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) sVar.f3900b.getTag(R.id.en6);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        C1153a aVar = new C1153a(view, sVar.f3900b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(aVar);
        C1075a.m3633a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
