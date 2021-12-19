package com.bytedance.android.live.design.widget;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.design.widget.b */
public final /* synthetic */ class C4122b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveButton f11523a;

    static {
        Covode.recordClassIndex(4681);
    }

    C4122b(LiveButton liveButton) {
        this.f11523a = liveButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11523a.invalidate();
    }
}
