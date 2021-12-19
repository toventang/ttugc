package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ih */
public final class RunnableC26464ih implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzn f62257a;

    /* renamed from: b */
    private final /* synthetic */ C26451hv f62258b;

    static {
        Covode.recordClassIndex(31886);
    }

    public final void run() {
        AbstractC26341dt dtVar = this.f62258b.f62222b;
        if (dtVar == null) {
            this.f62258b.mo43016q().f61827c.mo43169a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            dtVar.mo43039b(this.f62257a);
            this.f62258b.mo43382A();
        } catch (RemoteException e) {
            this.f62258b.mo43016q().f61827c.mo43170a("Failed to send measurementEnabled to the service", e);
        }
    }

    RunnableC26464ih(C26451hv hvVar, zzn zzn) {
        this.f62258b = hvVar;
        this.f62257a = zzn;
    }
}
