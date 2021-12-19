package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ij */
public final class RunnableC26466ij implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f62260a = true;

    /* renamed from: b */
    private final /* synthetic */ boolean f62261b;

    /* renamed from: c */
    private final /* synthetic */ zzw f62262c;

    /* renamed from: d */
    private final /* synthetic */ zzn f62263d;

    /* renamed from: e */
    private final /* synthetic */ zzw f62264e;

    /* renamed from: f */
    private final /* synthetic */ C26451hv f62265f;

    static {
        Covode.recordClassIndex(31888);
    }

    public final void run() {
        zzw zzw;
        AbstractC26341dt dtVar = this.f62265f.f62222b;
        if (dtVar == null) {
            this.f62265f.mo43016q().f61827c.mo43169a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f62260a) {
            C26451hv hvVar = this.f62265f;
            if (this.f62261b) {
                zzw = null;
            } else {
                zzw = this.f62262c;
            }
            hvVar.mo43393a(dtVar, zzw, this.f62263d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f62264e.f62612a)) {
                    dtVar.mo43037a(this.f62262c, this.f62263d);
                } else {
                    dtVar.mo43036a(this.f62262c);
                }
            } catch (RemoteException e) {
                this.f62265f.mo43016q().f61827c.mo43170a("Failed to send conditional user property to the service", e);
            }
        }
        this.f62265f.mo43382A();
    }

    RunnableC26466ij(C26451hv hvVar, boolean z, zzw zzw, zzn zzn, zzw zzw2) {
        this.f62265f = hvVar;
        this.f62261b = z;
        this.f62262c = zzw;
        this.f62263d = zzn;
        this.f62264e = zzw2;
    }
}
