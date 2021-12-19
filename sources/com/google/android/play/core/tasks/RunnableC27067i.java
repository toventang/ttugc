package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.play.core.tasks.i */
final class RunnableC27067i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC27062d f64047a;

    /* renamed from: b */
    final /* synthetic */ C27068j f64048b;

    static {
        Covode.recordClassIndex(32547);
    }

    RunnableC27067i(C27068j jVar, AbstractC27062d dVar) {
        this.f64048b = jVar;
        this.f64047a = dVar;
    }

    public final void run() {
        MethodCollector.m26663i(12814);
        synchronized (this.f64048b.f64049a) {
            try {
                if (this.f64048b.f64050b != null) {
                    this.f64048b.f64050b.mo35009a((Object) this.f64047a.mo44775c());
                }
            } finally {
                MethodCollector.m26664o(12814);
            }
        }
    }
}
