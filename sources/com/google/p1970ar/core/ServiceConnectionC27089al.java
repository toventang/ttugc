package com.google.p1970ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.al */
final class ServiceConnectionC27089al implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C27088ak f64101a;

    static {
        Covode.recordClassIndex(32638);
    }

    ServiceConnectionC27089al(C27088ak akVar) {
        this.f64101a = akVar;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f64101a.mo45130b();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f64101a.mo45128a(iBinder);
    }
}
