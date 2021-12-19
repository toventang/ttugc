package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.C2242h;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1949h.C25756b;
import java.util.List;

/* access modifiers changed from: package-private */
public final class zzh extends ResultReceiver {

    /* renamed from: a */
    private final /* synthetic */ C2237e f6796a;

    static {
        Covode.recordClassIndex(2470);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzh(C2237e eVar, Handler handler) {
        super(handler);
        this.f6796a = eVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        AbstractC2247k kVar = this.f6796a.f6695c.f6783b.f6784a;
        if (kVar != null) {
            List<Purchase> c = C25756b.m49719c(bundle);
            C2242h.C2243a a = C2242h.m6864a();
            a.f6734a = i;
            a.f6735b = C25756b.m49718b(bundle);
            kVar.mo6213a(a.mo6211a(), c);
        }
    }
}
