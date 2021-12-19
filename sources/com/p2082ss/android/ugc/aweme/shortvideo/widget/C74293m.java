package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.m */
public final /* synthetic */ class C74293m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final TabHost f167060a;

    static {
        Covode.recordClassIndex(87065);
    }

    C74293m(TabHost tabHost) {
        this.f167060a = tabHost;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f167060a.f166969g.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
