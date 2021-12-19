package com.google.p1970ar.core;

import android.content.Context;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.ArCoreApk;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.an */
public final class RunnableC27091an implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f64103a;

    /* renamed from: b */
    final /* synthetic */ AbstractC27115x f64104b;

    /* renamed from: c */
    final /* synthetic */ C27088ak f64105c;

    static {
        Covode.recordClassIndex(32640);
    }

    RunnableC27091an(C27088ak akVar, Context context, AbstractC27115x xVar) {
        this.f64105c = akVar;
        this.f64103a = context;
        this.f64104b = xVar;
    }

    public final void run() {
        try {
            this.f64105c.f64092a.mo40972a(this.f64103a.getApplicationInfo().packageName, C27088ak.m53853c(), new BinderC27090am(this));
        } catch (RemoteException unused) {
            this.f64104b.mo45119a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
