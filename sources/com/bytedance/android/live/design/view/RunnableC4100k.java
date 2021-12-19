package com.bytedance.android.live.design.view;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.design.view.k */
public final /* synthetic */ class RunnableC4100k implements Runnable {

    /* renamed from: a */
    private final C4086d f11367a;

    static {
        Covode.recordClassIndex(4645);
    }

    RunnableC4100k(C4086d dVar) {
        this.f11367a = dVar;
    }

    public final void run() {
        C4086d dVar = this.f11367a;
        dVar.f11292a = 1;
        dVar.dismiss();
    }
}
