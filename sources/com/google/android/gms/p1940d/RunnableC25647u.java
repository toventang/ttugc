package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.d.u */
final class RunnableC25647u implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25631h f60780a;

    /* renamed from: b */
    private final /* synthetic */ C25646t f60781b;

    static {
        Covode.recordClassIndex(31058);
    }

    RunnableC25647u(C25646t tVar, AbstractC25631h hVar) {
        this.f60781b = tVar;
        this.f60780a = hVar;
    }

    public final void run() {
        MethodCollector.m26663i(1534);
        synchronized (this.f60781b.f60777a) {
            try {
                if (this.f60781b.f60778b != null) {
                    this.f60781b.f60778b.mo34353a(this.f60780a.mo41887e());
                }
            } finally {
                MethodCollector.m26664o(1534);
            }
        }
    }
}
