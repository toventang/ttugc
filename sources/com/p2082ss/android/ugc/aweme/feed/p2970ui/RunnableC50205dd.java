package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dd */
final /* synthetic */ class RunnableC50205dd implements Runnable {

    /* renamed from: a */
    private final C50188cv f115937a;

    static {
        Covode.recordClassIndex(59331);
    }

    RunnableC50205dd(C50188cv cvVar) {
        this.f115937a = cvVar;
    }

    public final void run() {
        C50188cv cvVar = this.f115937a;
        if (cvVar.f115878j != null) {
            cvVar.f115878j.mo63460a().removeObserver(cvVar.f115880l);
        }
    }
}
