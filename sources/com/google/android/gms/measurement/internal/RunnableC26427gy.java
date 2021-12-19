package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gy */
final class RunnableC26427gy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62149a;

    /* renamed from: b */
    private final /* synthetic */ C26413gk f62150b;

    static {
        Covode.recordClassIndex(31849);
    }

    public final void run() {
        MethodCollector.m26663i(6164);
        synchronized (this.f62149a) {
            try {
                this.f62149a.set(Double.valueOf(this.f62150b.mo43018s().mo43637c(this.f62150b.mo43005f().mo43047w(), C26530p.f62476O)));
                try {
                    this.f62149a.notify();
                } finally {
                    MethodCollector.m26664o(6164);
                }
            } catch (Throwable th) {
                this.f62149a.notify();
                MethodCollector.m26664o(6164);
                throw th;
            }
        }
    }

    RunnableC26427gy(C26413gk gkVar, AtomicReference atomicReference) {
        this.f62150b = gkVar;
        this.f62149a = atomicReference;
    }
}
