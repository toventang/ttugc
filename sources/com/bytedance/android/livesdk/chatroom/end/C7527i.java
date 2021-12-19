package com.bytedance.android.livesdk.chatroom.end;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.i */
final /* synthetic */ class C7527i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveRecommendBar.RunnableC7502a f18702a;

    static {
        Covode.recordClassIndex(8299);
    }

    C7527i(LiveRecommendBar.RunnableC7502a aVar) {
        this.f18702a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LiveRecommendBar.RunnableC7502a aVar = this.f18702a;
        C13628n.m24511a(LiveRecommendBar.this, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) LiveRecommendBar.this.f18626a)), -3);
    }
}
