package com.android.billingclient.api;

import com.android.billingclient.api.C2242h;
import com.android.billingclient.api.SkuDetails;
import com.bytedance.covode.number.Covode;

/* renamed from: com.android.billingclient.api.z */
final class RunnableC2263z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ SkuDetails.C2219a f6793a;

    /* renamed from: b */
    private final /* synthetic */ CallableC2261x f6794b;

    static {
        Covode.recordClassIndex(2468);
    }

    public final void run() {
        AbstractC2250m mVar = this.f6794b.f6787a;
        C2242h.C2243a a = C2242h.m6864a();
        a.f6734a = this.f6793a.f6656b;
        a.f6735b = this.f6793a.f6657c;
        mVar.mo6216b(a.mo6211a(), this.f6793a.f6655a);
    }

    RunnableC2263z(CallableC2261x xVar, SkuDetails.C2219a aVar) {
        this.f6794b = xVar;
        this.f6793a = aVar;
    }
}
