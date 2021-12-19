package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k */
public final class RunnableC26511k implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC26404gb f62403a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC26429h f62404b;

    static {
        Covode.recordClassIndex(31933);
    }

    public final void run() {
        this.f62403a.mo43019t();
        if (C26523kl.m52495a()) {
            this.f62403a.mo43015p().mo43220a(this);
            return;
        }
        boolean b = this.f62404b.mo43337b();
        this.f62404b.f62154a = 0;
        if (b) {
            this.f62404b.mo43335a();
        }
    }

    RunnableC26511k(AbstractC26429h hVar, AbstractC26404gb gbVar) {
        this.f62404b = hVar;
        this.f62403a = gbVar;
    }
}
