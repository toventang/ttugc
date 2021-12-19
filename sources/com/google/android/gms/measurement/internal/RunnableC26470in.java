package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC26221oy;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.in */
public final class RunnableC26470in implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f62283a;

    /* renamed from: b */
    private final /* synthetic */ String f62284b;

    /* renamed from: c */
    private final /* synthetic */ boolean f62285c;

    /* renamed from: d */
    private final /* synthetic */ zzn f62286d;

    /* renamed from: e */
    private final /* synthetic */ AbstractC26221oy f62287e;

    /* renamed from: f */
    private final /* synthetic */ C26451hv f62288f;

    static {
        Covode.recordClassIndex(31892);
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            AbstractC26341dt dtVar = this.f62288f.f62222b;
            if (dtVar == null) {
                this.f62288f.mo43016q().f61827c.mo43171a("Failed to get user properties; not connected to service", this.f62283a, this.f62284b);
                return;
            }
            Bundle a = C26510jz.m52384a(dtVar.mo43029a(this.f62283a, this.f62284b, this.f62285c, this.f62286d));
            this.f62288f.mo43382A();
            this.f62288f.mo43014o().mo43528a(this.f62287e, a);
        } catch (RemoteException e) {
            this.f62288f.mo43016q().f61827c.mo43171a("Failed to get user properties; remote exception", this.f62283a, e);
        } finally {
            this.f62288f.mo43014o().mo43528a(this.f62287e, bundle);
        }
    }

    RunnableC26470in(C26451hv hvVar, String str, String str2, boolean z, zzn zzn, AbstractC26221oy oyVar) {
        this.f62288f = hvVar;
        this.f62283a = str;
        this.f62284b = str2;
        this.f62285c = z;
        this.f62286d = zzn;
        this.f62287e = oyVar;
    }
}
