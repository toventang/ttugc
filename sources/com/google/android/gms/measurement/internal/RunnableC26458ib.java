package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ib */
public final class RunnableC26458ib implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62239a;

    /* renamed from: b */
    private final /* synthetic */ zzn f62240b;

    /* renamed from: c */
    private final /* synthetic */ C26451hv f62241c;

    static {
        Covode.recordClassIndex(31880);
    }

    public final void run() {
        MethodCollector.m26663i(4200);
        synchronized (this.f62239a) {
            try {
                AbstractC26341dt dtVar = this.f62241c.f62222b;
                if (dtVar == null) {
                    this.f62241c.mo43016q().f61827c.mo43169a("Failed to get app instance id");
                    try {
                        this.f62239a.notify();
                    } finally {
                        MethodCollector.m26664o(4200);
                    }
                } else {
                    this.f62239a.set(dtVar.mo43040c(this.f62240b));
                    String str = (String) this.f62239a.get();
                    if (str != null) {
                        this.f62241c.mo43004e().mo43302a(str);
                        this.f62241c.mo43017r().f61911k.mo43214a(str);
                    }
                    this.f62241c.mo43382A();
                    this.f62239a.notify();
                    MethodCollector.m26664o(4200);
                }
            } catch (RemoteException e) {
                this.f62241c.mo43016q().f61827c.mo43170a("Failed to get app instance id", e);
                this.f62239a.notify();
            } catch (Throwable th) {
                this.f62239a.notify();
                MethodCollector.m26664o(4200);
                throw th;
            }
        }
    }

    RunnableC26458ib(C26451hv hvVar, AtomicReference atomicReference, zzn zzn) {
        this.f62241c = hvVar;
        this.f62239a = atomicReference;
        this.f62240b = zzn;
    }
}
