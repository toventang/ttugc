package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.g */
public final /* synthetic */ class C74284g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ProgressSegmentView f167032a;

    static {
        Covode.recordClassIndex(87056);
    }

    C74284g(ProgressSegmentView progressSegmentView) {
        this.f167032a = progressSegmentView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f167032a.mo116788b(valueAnimator);
    }
}
