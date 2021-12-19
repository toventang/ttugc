package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC26221oy;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.if */
public final class RunnableC26462if implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzao f62250a;

    /* renamed from: b */
    private final /* synthetic */ String f62251b;

    /* renamed from: c */
    private final /* synthetic */ AbstractC26221oy f62252c;

    /* renamed from: d */
    private final /* synthetic */ C26451hv f62253d;

    static {
        Covode.recordClassIndex(31884);
    }

    public final void run() {
        try {
            AbstractC26341dt dtVar = this.f62253d.f62222b;
            if (dtVar == null) {
                this.f62253d.mo43016q().f61827c.mo43169a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] a = dtVar.mo43038a(this.f62250a, this.f62251b);
            this.f62253d.mo43382A();
            this.f62253d.mo43014o().mo43532a(this.f62252c, a);
        } catch (RemoteException e) {
            this.f62253d.mo43016q().f61827c.mo43170a("Failed to send event to the service to bundle", e);
        } finally {
            this.f62253d.mo43014o().mo43532a(this.f62252c, (byte[]) null);
        }
    }

    RunnableC26462if(C26451hv hvVar, zzao zzao, String str, AbstractC26221oy oyVar) {
        this.f62253d = hvVar;
        this.f62250a = zzao;
        this.f62251b = str;
        this.f62252c = oyVar;
    }
}
