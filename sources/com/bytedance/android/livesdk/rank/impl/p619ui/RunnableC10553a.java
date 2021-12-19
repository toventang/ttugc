package com.bytedance.android.livesdk.rank.impl.p619ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.rank.impl.ui.a */
public final /* synthetic */ class RunnableC10553a implements Runnable {

    /* renamed from: a */
    private final MarqueeTextView f25400a;

    /* renamed from: b */
    private final MarqueeTextView f25401b;

    static {
        Covode.recordClassIndex(12131);
    }

    RunnableC10553a(MarqueeTextView marqueeTextView, MarqueeTextView marqueeTextView2) {
        this.f25400a = marqueeTextView;
        this.f25401b = marqueeTextView2;
    }

    public final void run() {
        MarqueeTextView marqueeTextView = this.f25400a;
        MarqueeTextView marqueeTextView2 = this.f25401b;
        marqueeTextView.setAlpha(0.0f);
        marqueeTextView.setEllipsize(null);
        marqueeTextView.mo17391b();
        marqueeTextView2.setAlpha(1.0f);
        marqueeTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        marqueeTextView2.setMarqueeRepeatLimit(-1);
        marqueeTextView2.mo796a();
    }
}
