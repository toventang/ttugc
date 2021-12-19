package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC26221oy;

/* renamed from: com.google.android.gms.measurement.internal.kb */
final class RunnableC26513kb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC26221oy f62406a;

    /* renamed from: b */
    private final /* synthetic */ String f62407b;

    /* renamed from: c */
    private final /* synthetic */ String f62408c;

    /* renamed from: d */
    private final /* synthetic */ AppMeasurementDynamiteService f62409d;

    static {
        Covode.recordClassIndex(31935);
    }

    public final void run() {
        this.f62409d.f61672a.mo43260i().mo43390a(this.f62406a, this.f62407b, this.f62408c);
    }

    RunnableC26513kb(AppMeasurementDynamiteService appMeasurementDynamiteService, AbstractC26221oy oyVar, String str, String str2) {
        this.f62409d = appMeasurementDynamiteService;
        this.f62406a = oyVar;
        this.f62407b = str;
        this.f62408c = str2;
    }
}
