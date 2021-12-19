package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gz */
final class RunnableC26428gz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62151a;

    /* renamed from: b */
    private final /* synthetic */ C26413gk f62152b;

    static {
        Covode.recordClassIndex(31850);
    }

    public final void run() {
        MethodCollector.m26663i(5904);
        synchronized (this.f62151a) {
            try {
                this.f62151a.set(Integer.valueOf(this.f62152b.mo43018s().mo43636b(this.f62152b.mo43005f().mo43047w(), C26530p.f62475N)));
                try {
                    this.f62151a.notify();
                } finally {
                    MethodCollector.m26664o(5904);
                }
            } catch (Throwable th) {
                this.f62151a.notify();
                MethodCollector.m26664o(5904);
                throw th;
            }
        }
    }

    RunnableC26428gz(C26413gk gkVar, AtomicReference atomicReference) {
        this.f62152b = gkVar;
        this.f62151a = atomicReference;
    }
}
