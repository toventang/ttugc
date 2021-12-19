package com.bytedance.android.livesdk.userinfowidget;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.o */
final /* synthetic */ class C11039o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26582a;

    /* renamed from: b */
    private final int f26583b;

    /* renamed from: c */
    private final int f26584c;

    /* renamed from: d */
    private final GradientDrawable f26585d;

    static {
        Covode.recordClassIndex(12657);
    }

    C11039o(LiveRoomUserInfoWidget liveRoomUserInfoWidget, int i, int i2, GradientDrawable gradientDrawable) {
        this.f26582a = liveRoomUserInfoWidget;
        this.f26583b = i;
        this.f26584c = i2;
        this.f26585d = gradientDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f26582a;
        int i = this.f26583b;
        int i2 = this.f26584c;
        GradientDrawable gradientDrawable = this.f26585d;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = liveRoomUserInfoWidget.f26530k.getLayoutParams();
        layoutParams.width = (int) (floatValue * ((float) i));
        if (layoutParams.width <= i2) {
            layoutParams.height = layoutParams.width;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius((float) (layoutParams.height >> 1));
            }
        }
        liveRoomUserInfoWidget.f26530k.setLayoutParams(layoutParams);
    }
}
