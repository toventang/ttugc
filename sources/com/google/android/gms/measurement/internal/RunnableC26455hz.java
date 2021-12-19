package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.hz */
public final class RunnableC26455hz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzn f62234a;

    /* renamed from: b */
    private final /* synthetic */ C26451hv f62235b;

    static {
        Covode.recordClassIndex(31877);
    }

    public final void run() {
        AbstractC26341dt dtVar = this.f62235b.f62222b;
        if (dtVar == null) {
            this.f62235b.mo43016q().f61827c.mo43169a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            dtVar.mo43041d(this.f62234a);
        } catch (RemoteException e) {
            this.f62235b.mo43016q().f61827c.mo43170a("Failed to reset data on the service: remote exception", e);
        }
        this.f62235b.mo43382A();
    }

    RunnableC26455hz(C26451hv hvVar, zzn zzn) {
        this.f62235b = hvVar;
        this.f62234a = zzn;
    }
}
