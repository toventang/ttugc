package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.m */
public final /* synthetic */ class C70573m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final AbstractView$OnTouchListenerC70571l f157905a;

    /* renamed from: b */
    private final boolean f157906b;

    static {
        Covode.recordClassIndex(83036);
    }

    C70573m(AbstractView$OnTouchListenerC70571l lVar, boolean z) {
        this.f157905a = lVar;
        this.f157906b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f157905a.mo111317a(this.f157906b, valueAnimator);
    }
}
