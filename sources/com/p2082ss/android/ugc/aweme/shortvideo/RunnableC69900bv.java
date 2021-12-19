package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bv */
final /* synthetic */ class RunnableC69900bv implements Runnable {

    /* renamed from: a */
    private final C69893bo f156183a;

    static {
        Covode.recordClassIndex(82309);
    }

    RunnableC69900bv(C69893bo boVar) {
        this.f156183a = boVar;
    }

    public final void run() {
        this.f156183a.f156169a.onParallelPublishCancel();
    }
}
