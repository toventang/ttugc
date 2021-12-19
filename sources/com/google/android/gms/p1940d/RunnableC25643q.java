package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.d.q */
final class RunnableC25643q implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C25642p f60771a;

    static {
        Covode.recordClassIndex(31054);
    }

    RunnableC25643q(C25642p pVar) {
        this.f60771a = pVar;
    }

    public final void run() {
        MethodCollector.m26663i(1647);
        synchronized (this.f60771a.f60768a) {
            try {
                if (this.f60771a.f60769b != null) {
                    this.f60771a.f60769b.mo41891a();
                }
            } finally {
                MethodCollector.m26664o(1647);
            }
        }
    }
}
