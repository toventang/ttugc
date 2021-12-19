package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ie */
public final class RunnableC26461ie implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzn f62248a;

    /* renamed from: b */
    private final /* synthetic */ C26451hv f62249b;

    static {
        Covode.recordClassIndex(31883);
    }

    public final void run() {
        AbstractC26341dt dtVar = this.f62249b.f62222b;
        if (dtVar == null) {
            this.f62249b.mo43016q().f61827c.mo43169a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            dtVar.mo43035a(this.f62248a);
            this.f62249b.mo43008i().mo43059y();
            this.f62249b.mo43393a(dtVar, (AbstractSafeParcelable) null, this.f62248a);
            this.f62249b.mo43382A();
        } catch (RemoteException e) {
            this.f62249b.mo43016q().f61827c.mo43170a("Failed to send app launch to the service", e);
        }
    }

    RunnableC26461ie(C26451hv hvVar, zzn zzn) {
        this.f62249b = hvVar;
        this.f62248a = zzn;
    }
}
