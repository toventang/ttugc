package com.google.p1970ar.core;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.e */
public final class RunnableC27096e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f64114a;

    /* renamed from: b */
    final /* synthetic */ C27086ai f64115b;

    /* renamed from: c */
    final /* synthetic */ C27088ak f64116c;

    static {
        Covode.recordClassIndex(32648);
    }

    RunnableC27096e(C27088ak akVar, Activity activity, C27086ai aiVar) {
        this.f64116c = akVar;
        this.f64114a = activity;
        this.f64115b = aiVar;
    }

    public final void run() {
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f64116c.f64092a.mo40973a(this.f64114a.getApplicationInfo().packageName, Collections.singletonList(C27088ak.m53853c()), new Bundle(), new BinderC27094c(this, atomicBoolean));
            new Handler().postDelayed(new RunnableC27095d(this, atomicBoolean), 3000);
        } catch (RemoteException unused) {
            C27088ak.m53851a(this.f64114a, this.f64115b);
        }
    }
}
