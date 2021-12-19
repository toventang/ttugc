package com.bytedance.android.livesdk.p605r;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.r.i */
public final /* synthetic */ class C10327i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C10319h f24960a;

    static {
        Covode.recordClassIndex(11893);
    }

    C10327i(C10319h hVar) {
        this.f24960a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C10319h hVar = this.f24960a;
        hVar.f24929a.mo17078a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
