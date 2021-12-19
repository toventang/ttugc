package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gv */
final class RunnableC26424gv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62139a;

    /* renamed from: b */
    private final /* synthetic */ C26413gk f62140b;

    static {
        Covode.recordClassIndex(31846);
    }

    public final void run() {
        String a;
        MethodCollector.m26663i(6170);
        synchronized (this.f62139a) {
            try {
                AtomicReference atomicReference = this.f62139a;
                C26524km s = this.f62140b.mo43018s();
                String w = this.f62140b.mo43005f().mo43047w();
                C26338dq<String> dqVar = C26530p.f62473L;
                if (w == null) {
                    a = dqVar.mo43024a(null);
                } else {
                    a = dqVar.mo43024a(s.f62440a.mo43021a(w, dqVar.f61783a));
                }
                atomicReference.set(a);
                try {
                    this.f62139a.notify();
                } finally {
                    MethodCollector.m26664o(6170);
                }
            } catch (Throwable th) {
                this.f62139a.notify();
                MethodCollector.m26664o(6170);
                throw th;
            }
        }
    }

    RunnableC26424gv(C26413gk gkVar, AtomicReference atomicReference) {
        this.f62140b = gkVar;
        this.f62139a = atomicReference;
    }
}
