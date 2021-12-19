package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50153bv;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bz */
final /* synthetic */ class C50161bz implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C50153bv.C501563 f115795a;

    /* renamed from: b */
    private final boolean f115796b;

    static {
        Covode.recordClassIndex(59287);
    }

    C50161bz(C50153bv.C501563 r1, boolean z) {
        this.f115795a = r1;
        this.f115796b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C50153bv.C501563 r3 = this.f115795a;
        boolean z = this.f115796b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue > 0) {
            C50153bv.this.f115761c.setHeight(intValue);
            if (!C50153bv.f115758a) {
                return;
            }
            if (z) {
                C50153bv.this.f115762d.getLayoutParams().height = intValue + C50153bv.this.f115763e;
                return;
            }
            C50153bv.this.f115762d.getLayoutParams().height = intValue;
        }
    }
}
