package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.service.C49912a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ae */
final /* synthetic */ class RunnableC50040ae implements Runnable {

    /* renamed from: a */
    private final C50037ab f115506a;

    /* renamed from: b */
    private final UrlModel f115507b;

    static {
        Covode.recordClassIndex(59166);
    }

    RunnableC50040ae(C50037ab abVar, UrlModel urlModel) {
        this.f115506a = abVar;
        this.f115507b = urlModel;
    }

    public final void run() {
        C50037ab abVar = this.f115506a;
        UrlModel urlModel = this.f115507b;
        if (abVar.f115500l.getWidth() != 0) {
            C34577e.m70594a(abVar.f115500l, urlModel, abVar.f115500l.getWidth(), abVar.f115500l.getHeight(), C49912a.m93712a((((float) abVar.f115500l.getWidth()) * 1.0f) / ((float) abVar.f115500l.getWidth())));
        }
    }
}
