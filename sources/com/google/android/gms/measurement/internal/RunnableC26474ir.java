package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.measurement.internal.ir */
final class RunnableC26474ir implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC26341dt f62301a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnectionC26473iq f62302b;

    static {
        Covode.recordClassIndex(31896);
    }

    public final void run() {
        MethodCollector.m26663i(3955);
        synchronized (this.f62302b) {
            try {
                this.f62302b.f62298a = false;
                if (!this.f62302b.f62300c.mo43401w()) {
                    this.f62302b.f62300c.mo43016q().f61834j.mo43169a("Connected to remote service");
                    this.f62302b.f62300c.mo43392a(this.f62301a);
                }
            } finally {
                MethodCollector.m26664o(3955);
            }
        }
    }

    RunnableC26474ir(ServiceConnectionC26473iq iqVar, AbstractC26341dt dtVar) {
        this.f62302b = iqVar;
        this.f62301a = dtVar;
    }
}
