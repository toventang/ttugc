package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.o */
final class CallableC2252o implements Callable<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ int f6746a;

    /* renamed from: b */
    private final /* synthetic */ SkuDetails f6747b;

    /* renamed from: c */
    private final /* synthetic */ String f6748c;

    /* renamed from: d */
    private final /* synthetic */ C2240g f6749d;

    /* renamed from: e */
    private final /* synthetic */ Bundle f6750e;

    /* renamed from: f */
    private final /* synthetic */ C2237e f6751f;

    static {
        Covode.recordClassIndex(2457);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f6751f.f6697e.mo41986a(this.f6746a, this.f6751f.f6696d.getPackageName(), this.f6747b.mo6171a(), this.f6748c, this.f6749d.f6717a, this.f6750e);
    }

    CallableC2252o(C2237e eVar, int i, SkuDetails skuDetails, String str, C2240g gVar, Bundle bundle) {
        this.f6751f = eVar;
        this.f6746a = i;
        this.f6747b = skuDetails;
        this.f6748c = str;
        this.f6749d = gVar;
        this.f6750e = bundle;
    }
}
