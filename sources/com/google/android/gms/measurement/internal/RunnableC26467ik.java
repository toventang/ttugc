package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ik */
public final class RunnableC26467ik implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f62266a = true;

    /* renamed from: b */
    private final /* synthetic */ boolean f62267b;

    /* renamed from: c */
    private final /* synthetic */ zzao f62268c;

    /* renamed from: d */
    private final /* synthetic */ zzn f62269d;

    /* renamed from: e */
    private final /* synthetic */ String f62270e;

    /* renamed from: f */
    private final /* synthetic */ C26451hv f62271f;

    static {
        Covode.recordClassIndex(31889);
    }

    public final void run() {
        zzao zzao;
        AbstractC26341dt dtVar = this.f62271f.f62222b;
        if (dtVar == null) {
            this.f62271f.mo43016q().f61827c.mo43169a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f62266a) {
            C26451hv hvVar = this.f62271f;
            if (this.f62267b) {
                zzao = null;
            } else {
                zzao = this.f62268c;
            }
            hvVar.mo43393a(dtVar, zzao, this.f62269d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f62270e)) {
                    dtVar.mo43032a(this.f62268c, this.f62269d);
                } else {
                    dtVar.mo43033a(this.f62268c, this.f62270e, this.f62271f.mo43016q().mo43118e());
                }
            } catch (RemoteException e) {
                this.f62271f.mo43016q().f61827c.mo43170a("Failed to send event to the service", e);
            }
        }
        this.f62271f.mo43382A();
    }

    RunnableC26467ik(C26451hv hvVar, boolean z, zzao zzao, zzn zzn, String str) {
        this.f62271f = hvVar;
        this.f62267b = z;
        this.f62268c = zzao;
        this.f62269d = zzn;
        this.f62270e = str;
    }
}
