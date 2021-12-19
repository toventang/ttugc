package com.google.firebase.iid;

import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.iid.C27809x;

/* renamed from: com.google.firebase.iid.aa */
final /* synthetic */ class RunnableC27756aa implements Runnable {

    /* renamed from: a */
    private final C27809x.ServiceConnectionC27810a f65218a;

    /* renamed from: b */
    private final IBinder f65219b;

    static {
        Covode.recordClassIndex(33344);
    }

    RunnableC27756aa(C27809x.ServiceConnectionC27810a aVar, IBinder iBinder) {
        this.f65218a = aVar;
        this.f65219b = iBinder;
    }

    public final void run() {
        MethodCollector.m26663i(10149);
        C27809x.ServiceConnectionC27810a aVar = this.f65218a;
        IBinder iBinder = this.f65219b;
        synchronized (aVar) {
            if (iBinder == null) {
                try {
                    aVar.mo46459a(0, "Null service connection");
                } finally {
                    MethodCollector.m26664o(10149);
                }
            } else {
                try {
                    aVar.f65332c = new C27809x.C27811b(iBinder);
                    aVar.f65330a = 2;
                    aVar.mo46457a();
                    MethodCollector.m26664o(10149);
                } catch (RemoteException e) {
                    aVar.mo46459a(0, e.getMessage());
                    MethodCollector.m26664o(10149);
                }
            }
        }
    }
}
