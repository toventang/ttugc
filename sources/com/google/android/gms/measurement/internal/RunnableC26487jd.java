package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC26221oy;

/* renamed from: com.google.android.gms.measurement.internal.jd */
final class RunnableC26487jd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC26221oy f62331a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f62332b;

    static {
        Covode.recordClassIndex(31909);
    }

    public final void run() {
        this.f62332b.f61672a.mo43256e().mo43531a(this.f62331a, this.f62332b.f61672a.mo43264o());
    }

    RunnableC26487jd(AppMeasurementDynamiteService appMeasurementDynamiteService, AbstractC26221oy oyVar) {
        this.f62332b = appMeasurementDynamiteService;
        this.f62331a = oyVar;
    }
}
