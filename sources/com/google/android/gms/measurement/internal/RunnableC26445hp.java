package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.hp */
public final class RunnableC26445hp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bundle f62193a;

    /* renamed from: b */
    private final /* synthetic */ C26443hn f62194b;

    /* renamed from: c */
    private final /* synthetic */ C26443hn f62195c;

    /* renamed from: d */
    private final /* synthetic */ long f62196d;

    /* renamed from: e */
    private final /* synthetic */ C26446hq f62197e;

    static {
        Covode.recordClassIndex(31867);
    }

    public final void run() {
        C26446hq hqVar = this.f62197e;
        Bundle bundle = this.f62193a;
        C26443hn hnVar = this.f62194b;
        C26443hn hnVar2 = this.f62195c;
        long j = this.f62196d;
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        hqVar.mo43375a(hnVar, hnVar2, j, true, hqVar.mo43014o().mo43518a((String) null, "screen_view", bundle, (List<String>) null, true, true));
    }

    RunnableC26445hp(C26446hq hqVar, Bundle bundle, C26443hn hnVar, C26443hn hnVar2, long j) {
        this.f62197e = hqVar;
        this.f62193a = bundle;
        this.f62194b = hnVar;
        this.f62195c = hnVar2;
        this.f62196d = j;
    }
}
