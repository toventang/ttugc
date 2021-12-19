package com.p2082ss.android.ugc.aweme.common.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.common.widget.o */
public final /* synthetic */ class RunnableC39203o implements Runnable {

    /* renamed from: a */
    private final VerticalViewPager f92537a;

    /* renamed from: b */
    private final int f92538b;

    /* renamed from: c */
    private final boolean f92539c;

    static {
        Covode.recordClassIndex(46834);
    }

    RunnableC39203o(VerticalViewPager verticalViewPager, int i, boolean z) {
        this.f92537a = verticalViewPager;
        this.f92538b = i;
        this.f92539c = z;
    }

    public final void run() {
        this.f92537a.mo67980b(this.f92538b, this.f92539c);
    }
}
