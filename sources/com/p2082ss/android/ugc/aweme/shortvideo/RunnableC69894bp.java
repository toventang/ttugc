package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bp */
final /* synthetic */ class RunnableC69894bp implements Runnable {

    /* renamed from: a */
    private final C69893bo f156171a;

    /* renamed from: b */
    private final int f156172b;

    /* renamed from: c */
    private final boolean f156173c;

    static {
        Covode.recordClassIndex(82303);
    }

    RunnableC69894bp(C69893bo boVar, int i, boolean z) {
        this.f156171a = boVar;
        this.f156172b = i;
        this.f156173c = z;
    }

    public final void run() {
        C69893bo boVar = this.f156171a;
        boVar.f156169a.onProgressUpdate(this.f156172b, this.f156173c);
    }
}
