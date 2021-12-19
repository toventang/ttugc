package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50166cc;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cs */
final /* synthetic */ class RunnableC50185cs implements Runnable {

    /* renamed from: a */
    private final C50166cc.ViewTreeObserver$OnGlobalLayoutListenerC501671 f115865a;

    static {
        Covode.recordClassIndex(59311);
    }

    RunnableC50185cs(C50166cc.ViewTreeObserver$OnGlobalLayoutListenerC501671 r1) {
        this.f115865a = r1;
    }

    public final void run() {
        C50166cc.ViewTreeObserver$OnGlobalLayoutListenerC501671 r2 = this.f115865a;
        if (C50166cc.this.f115810d.getLineCount() != 0) {
            C50166cc.this.f115810d.setLines(C50166cc.this.f115810d.getLineCount());
            C50166cc.this.mo85321a(false);
        }
    }
}
