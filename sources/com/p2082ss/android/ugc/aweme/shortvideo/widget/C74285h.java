package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.h */
public final /* synthetic */ class C74285h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ProgressSegmentView f167033a;

    static {
        Covode.recordClassIndex(87057);
    }

    C74285h(ProgressSegmentView progressSegmentView) {
        this.f167033a = progressSegmentView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f167033a.mo116783a(valueAnimator);
    }
}
