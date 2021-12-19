package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.measurement.internal.ip */
final class RunnableC26472ip implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC26341dt f62296a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnectionC26473iq f62297b;

    static {
        Covode.recordClassIndex(31894);
    }

    public final void run() {
        MethodCollector.m26663i(4072);
        synchronized (this.f62297b) {
            try {
                this.f62297b.f62298a = false;
                if (!this.f62297b.f62300c.mo43401w()) {
                    this.f62297b.f62300c.mo43016q().f61835k.mo43169a("Connected to service");
                    this.f62297b.f62300c.mo43392a(this.f62296a);
                }
            } finally {
                MethodCollector.m26664o(4072);
            }
        }
    }

    RunnableC26472ip(ServiceConnectionC26473iq iqVar, AbstractC26341dt dtVar) {
        this.f62297b = iqVar;
        this.f62296a = dtVar;
    }
}
