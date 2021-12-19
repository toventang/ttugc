package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.hx */
public final class RunnableC26453hx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f62229a;

    /* renamed from: b */
    private final /* synthetic */ zzkr f62230b;

    /* renamed from: c */
    private final /* synthetic */ zzn f62231c;

    /* renamed from: d */
    private final /* synthetic */ C26451hv f62232d;

    static {
        Covode.recordClassIndex(31875);
    }

    public final void run() {
        zzkr zzkr;
        AbstractC26341dt dtVar = this.f62232d.f62222b;
        if (dtVar == null) {
            this.f62232d.mo43016q().f61827c.mo43169a("Discarding data. Failed to set user property");
            return;
        }
        C26451hv hvVar = this.f62232d;
        if (this.f62229a) {
            zzkr = null;
        } else {
            zzkr = this.f62230b;
        }
        hvVar.mo43393a(dtVar, zzkr, this.f62231c);
        this.f62232d.mo43382A();
    }

    RunnableC26453hx(C26451hv hvVar, boolean z, zzkr zzkr, zzn zzn) {
        this.f62232d = hvVar;
        this.f62229a = z;
        this.f62230b = zzkr;
        this.f62231c = zzn;
    }
}
