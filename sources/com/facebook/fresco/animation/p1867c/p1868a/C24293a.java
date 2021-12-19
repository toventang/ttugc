package com.facebook.fresco.animation.p1867c.p1868a;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.p1867c.C24290a;

/* renamed from: com.facebook.fresco.animation.c.a.a */
public final class C24293a {
    static {
        Covode.recordClassIndex(28425);
    }

    /* renamed from: a */
    public static ValueAnimator m46220a(final C24290a aVar) {
        int a;
        if (aVar.f57587b) {
            a = aVar.f57586a;
        } else if (aVar.f57588d == null) {
            a = 0;
        } else {
            a = aVar.f57588d.mo9308a();
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, (int) aVar.mo40071b());
        valueAnimator.setDuration(aVar.mo40071b());
        if (a == 0) {
            a = -1;
        }
        valueAnimator.setRepeatCount(a);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(null);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.facebook.fresco.animation.p1867c.p1868a.C24293a.C242941 */

            static {
                Covode.recordClassIndex(28426);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        return valueAnimator;
    }
}
