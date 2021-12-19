package com.bytedance.ies.dmt.p1194ui.p1200f;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.f.d */
public final class C17238d {
    static {
        Covode.recordClassIndex(19699);
    }

    /* renamed from: a */
    public static void m31812a(View view, float f, float f2) {
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f2);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
