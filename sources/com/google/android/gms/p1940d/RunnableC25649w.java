package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.d.w */
final class RunnableC25649w implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25631h f60785a;

    /* renamed from: b */
    private final /* synthetic */ C25648v f60786b;

    static {
        Covode.recordClassIndex(31060);
    }

    RunnableC25649w(C25648v vVar, AbstractC25631h hVar) {
        this.f60786b = vVar;
        this.f60785a = hVar;
    }

    public final void run() {
        MethodCollector.m26663i(3481);
        synchronized (this.f60786b.f60782a) {
            try {
                if (this.f60786b.f60783b != null) {
                    this.f60786b.f60783b.mo34354a((Object) this.f60785a.mo41886d());
                }
            } finally {
                MethodCollector.m26664o(3481);
            }
        }
    }
}
