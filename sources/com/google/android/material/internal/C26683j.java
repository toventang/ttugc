package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.p060l.AbstractC1134m;
import androidx.p060l.C1150s;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.google.android.material.internal.j */
public final class C26683j extends AbstractC1134m {
    static {
        Covode.recordClassIndex(32139);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final void mo3859a(C1150s sVar) {
        m52972d(sVar);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: b */
    public final void mo3862b(C1150s sVar) {
        m52972d(sVar);
    }

    /* renamed from: d */
    private static void m52972d(C1150s sVar) {
        if (sVar.f3900b instanceof TextView) {
            sVar.f3899a.put("android:textscale:scale", Float.valueOf(((TextView) sVar.f3900b).getScaleX()));
        }
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final Animator mo3858a(ViewGroup viewGroup, C1150s sVar, C1150s sVar2) {
        float f;
        if (sVar == null || sVar2 == null || !(sVar.f3900b instanceof TextView) || !(sVar2.f3900b instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) sVar2.f3900b;
        Map<String, Object> map = sVar.f3899a;
        Map<String, Object> map2 = sVar2.f3899a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.internal.C26683j.C266841 */

            static {
                Covode.recordClassIndex(32140);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
