package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.ha */
final class RunnableC26430ha implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f62157a;

    /* renamed from: b */
    private final /* synthetic */ C26413gk f62158b;

    static {
        Covode.recordClassIndex(31852);
    }

    public final void run() {
        boolean r = this.f62158b.f62077z.mo43265r();
        boolean o = this.f62158b.f62077z.mo43264o();
        this.f62158b.f62077z.mo43252a(this.f62157a);
        if (o == this.f62157a) {
            this.f62158b.f62077z.mo43016q().f61835k.mo43170a("Default data collection state already set to", Boolean.valueOf(this.f62157a));
        }
        if (this.f62158b.f62077z.mo43265r() == r || this.f62158b.f62077z.mo43265r() != this.f62158b.f62077z.mo43264o()) {
            this.f62158b.f62077z.mo43016q().f61832h.mo43171a("Default data collection is different than actual status", Boolean.valueOf(this.f62157a), Boolean.valueOf(r));
        }
        this.f62158b.m51985G();
    }

    RunnableC26430ha(C26413gk gkVar, boolean z) {
        this.f62158b = gkVar;
        this.f62157a = z;
    }
}
