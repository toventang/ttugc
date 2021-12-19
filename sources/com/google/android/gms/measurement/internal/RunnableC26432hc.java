package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC26221oy;

/* renamed from: com.google.android.gms.measurement.internal.hc */
final class RunnableC26432hc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC26221oy f62161a;

    /* renamed from: b */
    private final /* synthetic */ String f62162b;

    /* renamed from: c */
    private final /* synthetic */ String f62163c;

    /* renamed from: d */
    private final /* synthetic */ boolean f62164d;

    /* renamed from: e */
    private final /* synthetic */ AppMeasurementDynamiteService f62165e;

    static {
        Covode.recordClassIndex(31854);
    }

    public final void run() {
        this.f62165e.f61672a.mo43260i().mo43391a(this.f62161a, this.f62162b, this.f62163c, this.f62164d);
    }

    RunnableC26432hc(AppMeasurementDynamiteService appMeasurementDynamiteService, AbstractC26221oy oyVar, String str, String str2, boolean z) {
        this.f62165e = appMeasurementDynamiteService;
        this.f62161a = oyVar;
        this.f62162b = str;
        this.f62163c = str2;
        this.f62164d = z;
    }
}
