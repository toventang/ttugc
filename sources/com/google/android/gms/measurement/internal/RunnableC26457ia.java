package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC26221oy;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ia */
public final class RunnableC26457ia implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzn f62236a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC26221oy f62237b;

    /* renamed from: c */
    private final /* synthetic */ C26451hv f62238c;

    static {
        Covode.recordClassIndex(31879);
    }

    public final void run() {
        try {
            AbstractC26341dt dtVar = this.f62238c.f62222b;
            if (dtVar == null) {
                this.f62238c.mo43016q().f61827c.mo43169a("Failed to get app instance id");
                return;
            }
            String c = dtVar.mo43040c(this.f62236a);
            if (c != null) {
                this.f62238c.mo43004e().mo43302a(c);
                this.f62238c.mo43017r().f61911k.mo43214a(c);
            }
            this.f62238c.mo43382A();
            this.f62238c.mo43014o().mo43529a(this.f62237b, c);
        } catch (RemoteException e) {
            this.f62238c.mo43016q().f61827c.mo43170a("Failed to get app instance id", e);
        } finally {
            this.f62238c.mo43014o().mo43529a(this.f62237b, (String) null);
        }
    }

    RunnableC26457ia(C26451hv hvVar, zzn zzn, AbstractC26221oy oyVar) {
        this.f62238c = hvVar;
        this.f62236a = zzn;
        this.f62237b = oyVar;
    }
}
