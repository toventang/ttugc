package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.widget.y */
public final /* synthetic */ class C8199y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final View f20324a;

    static {
        Covode.recordClassIndex(9022);
    }

    C8199y(View view) {
        this.f20324a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C13628n.m24512a(this.f20324a, -3, ((Integer) valueAnimator.getAnimatedValue()).intValue(), -3);
    }
}
