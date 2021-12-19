package com.p2082ss.android.ugc.aweme.detail.p2749h;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.detail.h.j */
final /* synthetic */ class RunnableC41202j implements Runnable {

    /* renamed from: a */
    private final C41178b f96299a;

    static {
        Covode.recordClassIndex(49085);
    }

    RunnableC41202j(C41178b bVar) {
        this.f96299a = bVar;
    }

    public final void run() {
        C41178b bVar = this.f96299a;
        if (bVar.f96240e != null && bVar.f96240e.isShowing()) {
            bVar.f96240e.dismiss();
        }
        bVar.f96240e = null;
    }
}
