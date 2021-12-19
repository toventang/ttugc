package com.bytedance.android.livesdk.chatroom.p499ui;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.C10609s;
import com.bytedance.android.livesdk.C6807ap;
import com.bytedance.android.livesdk.chatroom.model.C7691k;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ce */
public final /* synthetic */ class C7856ce implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C7822br f19576a;

    static {
        Covode.recordClassIndex(8651);
    }

    C7856ce(C7822br brVar) {
        this.f19576a = brVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C7822br brVar = this.f19576a;
        C13628n.m24512a(brVar.f19407F, -3, ((Integer) valueAnimator.getAnimatedValue()).intValue(), -3);
        C7691k kVar = new C7691k();
        int[] iArr = new int[4];
        int[] iArr2 = new int[2];
        if (brVar.f19514v != null) {
            brVar.f19514v.getVideoSize(iArr2);
        }
        brVar.f19403B = kVar.f19064a;
        brVar.mo14109a(iArr, iArr2[0], iArr2[1]);
        if (brVar.f19423V != null) {
            C6807ap apVar = new C6807ap();
            apVar.f17079a = iArr[0];
            apVar.f17080b = iArr[1];
            apVar.f17081c = iArr[2];
            apVar.f17082d = iArr[3];
            brVar.f19423V.mo28315b(C10609s.class, apVar);
        }
    }
}
