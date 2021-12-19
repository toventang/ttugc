package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.iu */
final class RunnableC26477iu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ServiceConnectionC26473iq f62306a;

    static {
        Covode.recordClassIndex(31899);
    }

    public final void run() {
        C26451hv hvVar = this.f62306a.f62300c;
        Context m = this.f62306a.f62300c.mo43012m();
        this.f62306a.f62300c.mo43019t();
        C26451hv.m52118a(hvVar, new ComponentName(m, "com.google.android.gms.measurement.AppMeasurementService"));
    }

    RunnableC26477iu(ServiceConnectionC26473iq iqVar) {
        this.f62306a = iqVar;
    }
}
