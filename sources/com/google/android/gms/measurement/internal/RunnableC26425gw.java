package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gw */
final class RunnableC26425gw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62141a;

    /* renamed from: b */
    private final /* synthetic */ C26413gk f62142b;

    static {
        Covode.recordClassIndex(31847);
    }

    public final void run() {
        MethodCollector.m26663i(4376);
        synchronized (this.f62141a) {
            try {
                this.f62141a.set(Long.valueOf(this.f62142b.mo43018s().mo43632a(this.f62142b.mo43005f().mo43047w(), C26530p.f62474M)));
                try {
                    this.f62141a.notify();
                } finally {
                    MethodCollector.m26664o(4376);
                }
            } catch (Throwable th) {
                this.f62141a.notify();
                MethodCollector.m26664o(4376);
                throw th;
            }
        }
    }

    RunnableC26425gw(C26413gk gkVar, AtomicReference atomicReference) {
        this.f62142b = gkVar;
        this.f62141a = atomicReference;
    }
}
