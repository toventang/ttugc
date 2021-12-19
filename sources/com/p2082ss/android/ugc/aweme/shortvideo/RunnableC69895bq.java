package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bq */
final /* synthetic */ class RunnableC69895bq implements Runnable {

    /* renamed from: a */
    private final C69893bo f156174a;

    /* renamed from: b */
    private final C69831ai f156175b;

    /* renamed from: c */
    private final boolean f156176c;

    static {
        Covode.recordClassIndex(82304);
    }

    RunnableC69895bq(C69893bo boVar, C69831ai aiVar, boolean z) {
        this.f156174a = boVar;
        this.f156175b = aiVar;
        this.f156176c = z;
    }

    public final void run() {
        C69893bo boVar = this.f156174a;
        boVar.f156169a.onSuccess(this.f156175b, this.f156176c);
    }
}
