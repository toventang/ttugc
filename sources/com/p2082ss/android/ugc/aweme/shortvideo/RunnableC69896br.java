package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.br */
final /* synthetic */ class RunnableC69896br implements Runnable {

    /* renamed from: a */
    private final C69893bo f156177a;

    /* renamed from: b */
    private final C71818ev f156178b;

    static {
        Covode.recordClassIndex(82305);
    }

    RunnableC69896br(C69893bo boVar, C71818ev evVar) {
        this.f156177a = boVar;
        this.f156178b = evVar;
    }

    public final void run() {
        C69893bo boVar = this.f156177a;
        boVar.f156169a.onError(this.f156178b);
    }
}
