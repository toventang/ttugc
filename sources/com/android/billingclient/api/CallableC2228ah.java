package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1949h.AbstractC25755a;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.ah */
public final class CallableC2228ah implements Callable<Integer> {

    /* renamed from: a */
    private final /* synthetic */ String f6676a;

    /* renamed from: b */
    private final /* synthetic */ C2237e f6677b;

    static {
        Covode.recordClassIndex(2433);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() {
        AbstractC25755a aVar = this.f6677b.f6697e;
        String packageName = this.f6677b.f6696d.getPackageName();
        String str = this.f6676a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("vr", true);
        return Integer.valueOf(aVar.mo41992b(packageName, str, bundle));
    }

    CallableC2228ah(C2237e eVar, String str) {
        this.f6677b = eVar;
        this.f6676a = str;
    }
}
