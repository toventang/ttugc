package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bs */
final /* synthetic */ class RunnableC69897bs implements Runnable {

    /* renamed from: a */
    private final C69893bo f156179a;

    /* renamed from: b */
    private final String f156180b;

    static {
        Covode.recordClassIndex(82306);
    }

    RunnableC69897bs(C69893bo boVar, String str) {
        this.f156179a = boVar;
        this.f156180b = str;
    }

    public final void run() {
        C69893bo boVar = this.f156179a;
        boVar.f156169a.onSynthetiseSuccess(this.f156180b);
    }
}
