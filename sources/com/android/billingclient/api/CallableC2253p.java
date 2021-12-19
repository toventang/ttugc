package com.android.billingclient.api;

import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.p */
final class CallableC2253p implements Callable<Purchase.C2218a> {

    /* renamed from: a */
    private final /* synthetic */ String f6752a;

    /* renamed from: b */
    private final /* synthetic */ C2237e f6753b;

    static {
        Covode.recordClassIndex(2458);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Purchase.C2218a call() {
        return this.f6753b.mo6202c(this.f6752a);
    }

    CallableC2253p(C2237e eVar, String str) {
        this.f6753b = eVar;
        this.f6752a = str;
    }
}
