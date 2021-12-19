package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.n */
final class CallableC2251n implements Callable<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ C2240g f6743a;

    /* renamed from: b */
    private final /* synthetic */ SkuDetails f6744b;

    /* renamed from: c */
    private final /* synthetic */ C2237e f6745c;

    static {
        Covode.recordClassIndex(2456);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f6745c.f6697e.mo41991a(this.f6745c.f6696d.getPackageName(), Arrays.asList(this.f6743a.f6719c), this.f6744b.mo6171a(), "subs");
    }

    CallableC2251n(C2237e eVar, C2240g gVar, SkuDetails skuDetails) {
        this.f6745c = eVar;
        this.f6743a = gVar;
        this.f6744b = skuDetails;
    }
}
