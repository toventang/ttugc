package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.q */
final class CallableC2254q implements Callable<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ SkuDetails f6754a;

    /* renamed from: b */
    private final /* synthetic */ String f6755b;

    /* renamed from: c */
    private final /* synthetic */ C2237e f6756c;

    static {
        Covode.recordClassIndex(2459);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f6756c.f6697e.mo41989a(this.f6756c.f6696d.getPackageName(), this.f6754a.mo6171a(), this.f6755b);
    }

    CallableC2254q(C2237e eVar, SkuDetails skuDetails, String str) {
        this.f6756c = eVar;
        this.f6754a = skuDetails;
        this.f6755b = str;
    }
}
