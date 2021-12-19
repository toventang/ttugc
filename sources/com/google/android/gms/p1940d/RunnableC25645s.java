package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.d.s */
final class RunnableC25645s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25631h f60775a;

    /* renamed from: b */
    private final /* synthetic */ C25644r f60776b;

    static {
        Covode.recordClassIndex(31056);
    }

    RunnableC25645s(C25644r rVar, AbstractC25631h hVar) {
        this.f60776b = rVar;
        this.f60775a = hVar;
    }

    public final void run() {
        MethodCollector.m26663i(1638);
        synchronized (this.f60776b.f60772a) {
            try {
                if (this.f60776b.f60773b != null) {
                    this.f60776b.f60773b.mo36732a(this.f60775a);
                }
            } finally {
                MethodCollector.m26664o(1638);
            }
        }
    }
}
