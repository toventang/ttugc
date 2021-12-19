package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC26221oy;

/* renamed from: com.google.android.gms.measurement.internal.gc */
final class RunnableC26405gc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC26221oy f62078a;

    /* renamed from: b */
    private final /* synthetic */ AppMeasurementDynamiteService f62079b;

    static {
        Covode.recordClassIndex(31827);
    }

    public final void run() {
        this.f62079b.f61672a.mo43260i().mo43388a(this.f62078a);
    }

    RunnableC26405gc(AppMeasurementDynamiteService appMeasurementDynamiteService, AbstractC26221oy oyVar) {
        this.f62079b = appMeasurementDynamiteService;
        this.f62078a = oyVar;
    }
}
