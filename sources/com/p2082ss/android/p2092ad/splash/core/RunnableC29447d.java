package com.p2082ss.android.p2092ad.splash.core;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ad.splash.core.d */
public final /* synthetic */ class RunnableC29447d implements Runnable {

    /* renamed from: a */
    private final C29411c f69960a;

    /* renamed from: b */
    private final long f69961b;

    static {
        Covode.recordClassIndex(35841);
    }

    RunnableC29447d(C29411c cVar, long j) {
        this.f69960a = cVar;
        this.f69961b = j;
    }

    public final void run() {
        C29411c cVar = this.f69960a;
        cVar.mo51460b(Math.min(cVar.f69899y.mo51536c(), this.f69961b));
    }
}
