package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.p2016a.AbstractC27825d;

/* renamed from: com.google.firebase.installations.d */
final /* synthetic */ class RunnableC27842d implements Runnable {

    /* renamed from: a */
    private final C27839c f65415a;

    /* renamed from: b */
    private final boolean f65416b = false;

    static {
        Covode.recordClassIndex(33431);
    }

    RunnableC27842d(C27839c cVar) {
        this.f65415a = cVar;
    }

    public final void run() {
        C27839c cVar = this.f65415a;
        boolean z = this.f65416b;
        AbstractC27825d c = cVar.mo46543c();
        if (z) {
            c = c.mo46492h().mo46500b((String) null).mo46498a();
        }
        cVar.mo46540a(c);
        cVar.f65401a.execute(new RunnableC27844f(cVar, z));
    }
}
