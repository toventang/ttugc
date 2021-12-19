package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ig */
public final class RunnableC26463ig implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bundle f62254a;

    /* renamed from: b */
    private final /* synthetic */ zzn f62255b;

    /* renamed from: c */
    private final /* synthetic */ C26451hv f62256c;

    static {
        Covode.recordClassIndex(31885);
    }

    public final void run() {
        AbstractC26341dt dtVar = this.f62256c.f62222b;
        if (dtVar == null) {
            this.f62256c.mo43016q().f61827c.mo43169a("Failed to send default event parameters to service");
            return;
        }
        try {
            dtVar.mo43031a(this.f62254a, this.f62255b);
        } catch (RemoteException e) {
            this.f62256c.mo43016q().f61827c.mo43170a("Failed to send default event parameters to service", e);
        }
    }

    RunnableC26463ig(C26451hv hvVar, Bundle bundle, zzn zzn) {
        this.f62256c = hvVar;
        this.f62254a = bundle;
        this.f62255b = zzn;
    }
}
