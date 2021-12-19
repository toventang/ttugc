package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cy */
final /* synthetic */ class RunnableC50194cy implements Runnable {

    /* renamed from: a */
    private final C50188cv f115902a;

    /* renamed from: b */
    private final boolean f115903b;

    /* renamed from: c */
    private final long f115904c;

    /* renamed from: d */
    private final Aweme f115905d;

    static {
        Covode.recordClassIndex(59320);
    }

    RunnableC50194cy(C50188cv cvVar, boolean z, long j, Aweme aweme) {
        this.f115902a = cvVar;
        this.f115903b = z;
        this.f115904c = j;
        this.f115905d = aweme;
    }

    public final void run() {
        C50188cv cvVar = this.f115902a;
        boolean z = this.f115903b;
        long j = this.f115904c;
        Aweme aweme = this.f115905d;
        cvVar.f115869a.setSelected(z);
        cvVar.f115870b.setText(C50188cv.m94186a(j, aweme));
    }
}
