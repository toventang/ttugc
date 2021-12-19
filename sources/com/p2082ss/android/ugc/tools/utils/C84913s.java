package com.p2082ss.android.ugc.tools.utils;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.utils.s */
public final class C84913s {
    static {
        Covode.recordClassIndex(98907);
    }

    /* renamed from: a */
    public static void m145936a(View view, float f) {
        if (view != null) {
            view.setOnTouchListener(new View$OnTouchListenerC84914t(view, f));
        }
    }

    /* renamed from: a */
    static void m145937a(View view, float f, float f2) {
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f2);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
