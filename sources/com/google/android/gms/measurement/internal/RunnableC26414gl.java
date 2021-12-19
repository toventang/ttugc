package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gl */
final class RunnableC26414gl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62107a;

    /* renamed from: b */
    private final /* synthetic */ C26413gk f62108b;

    static {
        Covode.recordClassIndex(31836);
    }

    public final void run() {
        MethodCollector.m26663i(4480);
        synchronized (this.f62107a) {
            try {
                this.f62107a.set(Boolean.valueOf(this.f62108b.mo43018s().mo43641d(this.f62108b.mo43005f().mo43047w(), C26530p.f62472K)));
                try {
                    this.f62107a.notify();
                } finally {
                    MethodCollector.m26664o(4480);
                }
            } catch (Throwable th) {
                this.f62107a.notify();
                MethodCollector.m26664o(4480);
                throw th;
            }
        }
    }

    RunnableC26414gl(C26413gk gkVar, AtomicReference atomicReference) {
        this.f62108b = gkVar;
        this.f62107a = atomicReference;
    }
}
