package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC26221oy;

/* renamed from: com.google.android.gms.measurement.internal.ic */
final class RunnableC26459ic implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC26221oy f62242a;

    /* renamed from: b */
    private final /* synthetic */ zzao f62243b;

    /* renamed from: c */
    private final /* synthetic */ String f62244c;

    /* renamed from: d */
    private final /* synthetic */ AppMeasurementDynamiteService f62245d;

    static {
        Covode.recordClassIndex(31881);
    }

    public final void run() {
        this.f62245d.f61672a.mo43260i().mo43389a(this.f62242a, this.f62243b, this.f62244c);
    }

    RunnableC26459ic(AppMeasurementDynamiteService appMeasurementDynamiteService, AbstractC26221oy oyVar, zzao zzao, String str) {
        this.f62245d = appMeasurementDynamiteService;
        this.f62242a = oyVar;
        this.f62243b = zzao;
        this.f62244c = str;
    }
}
