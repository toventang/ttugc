package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50166cc;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cr */
final /* synthetic */ class RunnableC50184cr implements Runnable {

    /* renamed from: a */
    private final C50166cc.ViewTreeObserver$OnGlobalLayoutListenerC501671 f115862a;

    /* renamed from: b */
    private final int f115863b;

    /* renamed from: c */
    private final Aweme f115864c;

    static {
        Covode.recordClassIndex(59310);
    }

    RunnableC50184cr(C50166cc.ViewTreeObserver$OnGlobalLayoutListenerC501671 r1, int i, Aweme aweme) {
        this.f115862a = r1;
        this.f115863b = i;
        this.f115864c = aweme;
    }

    public final void run() {
        C50166cc.ViewTreeObserver$OnGlobalLayoutListenerC501671 r2 = this.f115862a;
        int i = this.f115863b;
        Aweme aweme = this.f115864c;
        C50166cc.this.f115822p = C50166cc.this.f115810d.getHeight();
        C50166cc.this.f115820n = (C50166cc.this.f115822p * i) / C50166cc.m94153c(aweme);
        if (C50166cc.f115801a && C50166cc.this.f113953L != null && C50166cc.this.f115812f != null && C50166cc.this.f115812f.getVisibility() == 0 && C50166cc.this.f115812f.getStatus() == 0) {
            C50166cc.this.f113953L.setDescLines(i);
            C50166cc.this.f113953L.setDescTruncatedTextHeight(C50166cc.this.f115822p);
            C50166cc.this.f113953L.setDescFullTextHeight(C50166cc.this.f115820n);
        }
        C50166cc.this.mo85321a(true);
    }
}
