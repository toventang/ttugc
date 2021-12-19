package com.android.billingclient.api;

import com.android.billingclient.api.C2242h;
import com.bytedance.covode.number.Covode;

/* renamed from: com.android.billingclient.api.ad */
final class RunnableC2224ad implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f6668a;

    /* renamed from: b */
    private final /* synthetic */ String f6669b;

    /* renamed from: c */
    private final /* synthetic */ CallableC2223ac f6670c;

    static {
        Covode.recordClassIndex(2429);
    }

    public final void run() {
        AbstractC2234c cVar = this.f6670c.f6665a;
        C2242h.C2243a a = C2242h.m6864a();
        a.f6734a = this.f6668a;
        a.f6735b = this.f6669b;
        cVar.mo6189a(a.mo6211a());
    }

    RunnableC2224ad(CallableC2223ac acVar, int i, String str) {
        this.f6670c = acVar;
        this.f6668a = i;
        this.f6669b = str;
    }
}
