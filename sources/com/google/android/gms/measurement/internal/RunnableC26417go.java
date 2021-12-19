package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.go */
final class RunnableC26417go implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f62119a;

    /* renamed from: b */
    private final /* synthetic */ C26413gk f62120b;

    static {
        Covode.recordClassIndex(31839);
    }

    public final void run() {
        this.f62120b.mo43017r().f61913m.mo43210a(this.f62119a);
        this.f62120b.mo43016q().f61834j.mo43170a("Session timeout duration set", Long.valueOf(this.f62119a));
    }

    RunnableC26417go(C26413gk gkVar, long j) {
        this.f62120b = gkVar;
        this.f62119a = j;
    }
}
