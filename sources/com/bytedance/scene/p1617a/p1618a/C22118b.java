package com.bytedance.scene.p1617a.p1618a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.p1617a.AbstractC22139e;
import com.bytedance.scene.p1617a.C22116a;

/* renamed from: com.bytedance.scene.a.a.b */
public class C22118b extends AbstractC22139e {
    static {
        Covode.recordClassIndex(25922);
    }

    @Override // com.bytedance.scene.p1617a.AbstractC22139e
    /* renamed from: a */
    public final boolean mo36307a() {
        return true;
    }

    @Override // com.bytedance.scene.p1617a.AbstractC22139e
    /* renamed from: a */
    public final Animator mo36306a(C22116a aVar, C22116a aVar2) {
        final View view = aVar2.f52296b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, view.getAlpha());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.scene.p1617a.p1618a.C22118b.C221191 */

            static {
                Covode.recordClassIndex(25923);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.bytedance.scene.p1617a.AbstractC22139e
    /* renamed from: b */
    public Animator mo36308b(final C22116a aVar, C22116a aVar2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(aVar.f52296b.getAlpha(), 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.scene.p1617a.p1618a.C22118b.C221202 */

            static {
                Covode.recordClassIndex(25924);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.f52296b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150L);
        return ofFloat;
    }
}
