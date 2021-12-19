package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59218am;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.aa */
public final /* synthetic */ class RunnableC50036aa implements Runnable {

    /* renamed from: a */
    private final AbstractC50477z f115498a;

    /* renamed from: b */
    private final long f115499b;

    static {
        Covode.recordClassIndex(59162);
    }

    RunnableC50036aa(AbstractC50477z zVar, long j) {
        this.f115498a = zVar;
        this.f115499b = j;
    }

    public final void run() {
        AbstractC50477z zVar = this.f115498a;
        long j = this.f115499b;
        zVar.getContext();
        C39162r.m79454a("stay_time", zVar.f116585t, j);
        C59218am amVar = new C59218am();
        amVar.f134899a = String.valueOf(j);
        amVar.mo96758a(zVar.f116585t).mo96792f();
    }
}
