package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.br */
public final class C74003br {
    static {
        Covode.recordClassIndex(86753);
    }

    /* renamed from: a */
    public static int m130148a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return -(iArr[0] + view.getWidth());
    }

    /* renamed from: a */
    public static void m130149a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", f, f2);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
