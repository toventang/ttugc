package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.q.ab */
final /* synthetic */ class RunnableC49838ab implements Runnable {

    /* renamed from: a */
    private final C49888x f114913a;

    static {
        Covode.recordClassIndex(58945);
    }

    RunnableC49838ab(C49888x xVar) {
        this.f114913a = xVar;
    }

    public final void run() {
        C49888x xVar = this.f114913a;
        if (xVar.f115005i != null && xVar.f115005i.isShowing()) {
            xVar.f115005i.dismiss();
        }
        xVar.f115005i = null;
    }
}
