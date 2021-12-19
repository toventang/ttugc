package com.p2082ss.android.ugc.aweme.effect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.effect.s */
public final class C46371s {
    static {
        Covode.recordClassIndex(54948);
    }

    /* renamed from: a */
    public static void m89465a(final View view, boolean z) {
        float f;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.effect.C46371s.C463732 */

            /* renamed from: a */
            final /* synthetic */ View f108079a = null;

            /* renamed from: b */
            final /* synthetic */ boolean f108080b = false;

            /* renamed from: c */
            final /* synthetic */ boolean f108081c = false;

            static {
                Covode.recordClassIndex(54950);
            }

            public final void onAnimationEnd(Animator animator) {
                int i;
                View view = this.f108079a;
                if (view != null) {
                    if (this.f108080b) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
                if (this.f108081c) {
                    view.setVisibility(4);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m89467a(View view, boolean z, int i, View view2, AbstractC0688a<Void> aVar) {
        m89466a(view, z, i, view2, 300, aVar);
    }

    /* renamed from: a */
    public static void m89466a(final View view, final boolean z, int i, final View view2, int i2, final AbstractC0688a<Void> aVar) {
        float f;
        float f2;
        float f3;
        if (z) {
            view2.setVisibility(0);
        }
        view2.bringToFront();
        float[] fArr = new float[2];
        float f4 = 0.0f;
        if (!z) {
            f = 0.0f;
        } else {
            f = (float) i;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = (float) i;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", fArr);
        long j = (long) i2;
        ofFloat.setDuration(j);
        float[] fArr2 = new float[2];
        if (!z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", fArr2);
        ofFloat2.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.effect.C46371s.C463721 */

            static {
                Covode.recordClassIndex(54949);
            }

            public final void onAnimationStart(Animator animator) {
                view.setVisibility(0);
            }

            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                }
                AbstractC0688a aVar = aVar;
                if (aVar != null) {
                    aVar.mo2720a(null);
                }
            }
        });
        animatorSet.start();
    }
}
