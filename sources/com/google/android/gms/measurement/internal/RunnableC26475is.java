package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.is */
final class RunnableC26475is implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f62303a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnectionC26473iq f62304b;

    static {
        Covode.recordClassIndex(31897);
    }

    public final void run() {
        C26451hv.m52118a(this.f62304b.f62300c, this.f62303a);
    }

    RunnableC26475is(ServiceConnectionC26473iq iqVar, ComponentName componentName) {
        this.f62304b = iqVar;
        this.f62303a = componentName;
    }
}
