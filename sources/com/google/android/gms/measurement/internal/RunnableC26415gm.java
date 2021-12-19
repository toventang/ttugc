package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.gm */
public final /* synthetic */ class RunnableC26415gm implements Runnable {

    /* renamed from: a */
    private final C26413gk f62109a;

    static {
        Covode.recordClassIndex(31837);
    }

    RunnableC26415gm(C26413gk gkVar) {
        this.f62109a = gkVar;
    }

    public final void run() {
        C26413gk gkVar = this.f62109a;
        gkVar.mo43002c();
        if (gkVar.mo43017r().f61920t.mo43206a()) {
            gkVar.mo43016q().f61834j.mo43169a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = gkVar.mo43017r().f61921u.mo43209a();
        gkVar.mo43017r().f61921u.mo43210a(1 + a);
        if (a >= 5) {
            gkVar.mo43016q().f61830f.mo43169a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            gkVar.mo43017r().f61920t.mo43205a(true);
            return;
        }
        gkVar.f62077z.mo43269x();
    }
}
