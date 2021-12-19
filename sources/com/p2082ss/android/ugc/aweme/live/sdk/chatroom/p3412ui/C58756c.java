package com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.c */
public final /* synthetic */ class C58756c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C58754b f133722a;

    static {
        Covode.recordClassIndex(69062);
    }

    C58756c(C58754b bVar) {
        this.f133722a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C58754b bVar = this.f133722a;
        bVar.f133716b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (bVar.f133715a != 0) {
            bVar.mo96154a((1.0f - bVar.f133716b) / 0.5f);
            bVar.f133718d.setAlpha(1.0f - ((1.0f - bVar.f133716b) / 0.5f));
        }
    }
}
