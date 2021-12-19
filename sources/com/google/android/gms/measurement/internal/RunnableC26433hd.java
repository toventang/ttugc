package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.hd */
final class RunnableC26433hd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f62166a;

    /* renamed from: b */
    private final /* synthetic */ C26413gk f62167b;

    static {
        Covode.recordClassIndex(31855);
    }

    public final void run() {
        this.f62167b.mo43017r().f61912l.mo43210a(this.f62166a);
        this.f62167b.mo43016q().f61834j.mo43170a("Minimum session duration set", Long.valueOf(this.f62166a));
    }

    RunnableC26433hd(C26413gk gkVar, long j) {
        this.f62167b = gkVar;
        this.f62166a = j;
    }
}
