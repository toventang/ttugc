package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC26221oy;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.il */
public final class RunnableC26468il implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f62272a;

    /* renamed from: b */
    private final /* synthetic */ String f62273b;

    /* renamed from: c */
    private final /* synthetic */ zzn f62274c;

    /* renamed from: d */
    private final /* synthetic */ AbstractC26221oy f62275d;

    /* renamed from: e */
    private final /* synthetic */ C26451hv f62276e;

    static {
        Covode.recordClassIndex(31890);
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            AbstractC26341dt dtVar = this.f62276e.f62222b;
            if (dtVar == null) {
                this.f62276e.mo43016q().f61827c.mo43171a("Failed to get conditional properties; not connected to service", this.f62272a, this.f62273b);
                return;
            }
            ArrayList<Bundle> b = C26510jz.m52399b(dtVar.mo43026a(this.f62272a, this.f62273b, this.f62274c));
            this.f62276e.mo43382A();
            this.f62276e.mo43014o().mo43530a(this.f62275d, b);
        } catch (RemoteException e) {
            this.f62276e.mo43016q().f61827c.mo43172a("Failed to get conditional properties; remote exception", this.f62272a, this.f62273b, e);
        } finally {
            this.f62276e.mo43014o().mo43530a(this.f62275d, arrayList);
        }
    }

    RunnableC26468il(C26451hv hvVar, String str, String str2, zzn zzn, AbstractC26221oy oyVar) {
        this.f62276e = hvVar;
        this.f62272a = str;
        this.f62273b = str2;
        this.f62274c = zzn;
        this.f62275d = oyVar;
    }
}
