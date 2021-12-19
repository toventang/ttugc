package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.id */
public final class RunnableC26460id implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C26443hn f62246a;

    /* renamed from: b */
    private final /* synthetic */ C26451hv f62247b;

    static {
        Covode.recordClassIndex(31882);
    }

    public final void run() {
        AbstractC26341dt dtVar = this.f62247b.f62222b;
        if (dtVar == null) {
            this.f62247b.mo43016q().f61827c.mo43169a("Failed to send current screen to service");
            return;
        }
        try {
            C26443hn hnVar = this.f62246a;
            if (hnVar == null) {
                dtVar.mo43030a(0, (String) null, (String) null, this.f62247b.mo43012m().getPackageName());
            } else {
                dtVar.mo43030a(hnVar.f62189c, this.f62246a.f62187a, this.f62246a.f62188b, this.f62247b.mo43012m().getPackageName());
            }
            this.f62247b.mo43382A();
        } catch (RemoteException e) {
            this.f62247b.mo43016q().f61827c.mo43170a("Failed to send current screen to the service", e);
        }
    }

    RunnableC26460id(C26451hv hvVar, C26443hn hnVar) {
        this.f62247b = hvVar;
        this.f62246a = hnVar;
    }
}
