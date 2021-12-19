package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25849bs;
import com.google.android.gms.internal.measurement.C25903ds;

/* renamed from: com.google.android.gms.measurement.internal.eu */
public final class ServiceConnectionC26369eu implements ServiceConnection {

    /* renamed from: a */
    final String f61955a;

    /* renamed from: b */
    final /* synthetic */ C26366er f61956b;

    static {
        Covode.recordClassIndex(31791);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f61956b.f61946a.mo43016q().f61835k.mo43169a("Install Referrer Service disconnected");
    }

    ServiceConnectionC26369eu(C26366er erVar, String str) {
        this.f61956b = erVar;
        this.f61955a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC25849bs bsVar;
        if (iBinder == null) {
            this.f61956b.f61946a.mo43016q().f61830f.mo43169a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof AbstractC25849bs) {
                bsVar = (AbstractC25849bs) queryLocalInterface;
                if (bsVar == null) {
                    this.f61956b.f61946a.mo43016q().f61830f.mo43169a("Install Referrer Service implementation was not found");
                    return;
                }
            } else {
                bsVar = new C25903ds(iBinder);
            }
            this.f61956b.f61946a.mo43016q().f61835k.mo43169a("Install Referrer Service connected");
            this.f61956b.f61946a.mo43015p().mo43220a(new RunnableC26368et(this, bsVar, this));
        } catch (Exception e) {
            this.f61956b.f61946a.mo43016q().f61830f.mo43170a("Exception occurred while calling Install Referrer API", e);
        }
    }
}
