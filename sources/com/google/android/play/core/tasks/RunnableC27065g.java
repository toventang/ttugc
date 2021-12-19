package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.play.core.tasks.g */
final class RunnableC27065g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC27062d f64042a;

    /* renamed from: b */
    final /* synthetic */ C27066h f64043b;

    static {
        Covode.recordClassIndex(32545);
    }

    RunnableC27065g(C27066h hVar, AbstractC27062d dVar) {
        this.f64043b = hVar;
        this.f64042a = dVar;
    }

    public final void run() {
        MethodCollector.m26663i(11741);
        synchronized (this.f64043b.f64044a) {
            try {
                if (this.f64043b.f64045b != null) {
                    this.f64043b.f64045b.mo35008a(this.f64042a.mo44776d());
                }
            } finally {
                MethodCollector.m26664o(11741);
            }
        }
    }
}
