package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49525p;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.cg */
public final /* synthetic */ class C50173cg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C50166cc f115847a;

    /* renamed from: b */
    private final boolean f115848b;

    static {
        Covode.recordClassIndex(59299);
    }

    C50173cg(C50166cc ccVar, boolean z) {
        this.f115847a = ccVar;
        this.f115848b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C50166cc ccVar = this.f115847a;
        boolean z = this.f115848b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue > 0) {
            ccVar.f115810d.setHeight(intValue);
            if (C50166cc.f115801a) {
                if (z) {
                    ccVar.f115814h.getLayoutParams().height = intValue + ccVar.f115823q;
                } else {
                    ccVar.f115814h.getLayoutParams().height = intValue;
                }
            }
            if (C49525p.m92763c()) {
                ccVar.f115816j.mo80221h(z);
            }
        }
    }
}
