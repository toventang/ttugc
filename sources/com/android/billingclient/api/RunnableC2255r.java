package com.android.billingclient.api;

import com.android.billingclient.api.C2237e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.r */
public final class RunnableC2255r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2242h f6757a;

    /* renamed from: b */
    private final /* synthetic */ C2237e.ServiceConnectionC2238a f6758b;

    static {
        Covode.recordClassIndex(2460);
    }

    public final void run() {
        MethodCollector.m26663i(8274);
        synchronized (this.f6758b.f6713a) {
            try {
                if (this.f6758b.f6715c != null) {
                    this.f6758b.f6715c.mo6207b(this.f6757a);
                }
            } finally {
                MethodCollector.m26664o(8274);
            }
        }
    }

    RunnableC2255r(C2237e.ServiceConnectionC2238a aVar, C2242h hVar) {
        this.f6758b = aVar;
        this.f6757a = hVar;
    }
}
