package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.d.m */
final class RunnableC25639m implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25631h f60761a;

    /* renamed from: b */
    private final /* synthetic */ C25638l f60762b;

    static {
        Covode.recordClassIndex(31050);
    }

    RunnableC25639m(C25638l lVar, AbstractC25631h hVar) {
        this.f60762b = lVar;
        this.f60761a = hVar;
    }

    public final void run() {
        if (this.f60761a.mo41885c()) {
            this.f60762b.f60759b.mo41888f();
            return;
        }
        try {
            this.f60762b.f60759b.mo41879a(this.f60762b.f60758a.mo41863a(this.f60761a));
        } catch (C25629f e) {
            if (e.getCause() instanceof Exception) {
                this.f60762b.f60759b.mo41878a((Exception) e.getCause());
            } else {
                this.f60762b.f60759b.mo41878a(e);
            }
        } catch (Exception e2) {
            this.f60762b.f60759b.mo41878a(e2);
        }
    }
}
