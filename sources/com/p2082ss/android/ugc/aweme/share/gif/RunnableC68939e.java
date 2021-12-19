package com.p2082ss.android.ugc.aweme.share.gif;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.share.gif.e */
final /* synthetic */ class RunnableC68939e implements Runnable {

    /* renamed from: a */
    private final C68935b f154235a;

    /* renamed from: b */
    private final int f154236b;

    static {
        Covode.recordClassIndex(81249);
    }

    RunnableC68939e(C68935b bVar, int i) {
        this.f154235a = bVar;
        this.f154236b = i;
    }

    public final void run() {
        C68935b bVar = this.f154235a;
        int i = this.f154236b;
        if (bVar.f154220b != null) {
            bVar.f154220b.setProgress(i);
        }
    }
}
