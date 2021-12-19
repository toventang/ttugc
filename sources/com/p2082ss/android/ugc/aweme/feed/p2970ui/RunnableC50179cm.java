package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cm */
final /* synthetic */ class RunnableC50179cm implements Runnable {

    /* renamed from: a */
    private final C50166cc f115854a;

    static {
        Covode.recordClassIndex(59305);
    }

    RunnableC50179cm(C50166cc ccVar) {
        this.f115854a = ccVar;
    }

    public final void run() {
        C50166cc ccVar = this.f115854a;
        if (ccVar.f115813g != null) {
            ccVar.f115813g.invalidate();
        }
    }
}
