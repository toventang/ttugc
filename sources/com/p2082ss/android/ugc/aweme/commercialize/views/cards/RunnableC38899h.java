package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.h */
final /* synthetic */ class RunnableC38899h implements Runnable {

    /* renamed from: a */
    private final C38888e f91875a;

    static {
        Covode.recordClassIndex(46486);
    }

    RunnableC38899h(C38888e eVar) {
        this.f91875a = eVar;
    }

    public final void run() {
        boolean z;
        C38888e eVar = this.f91875a;
        if (!eVar.f91854s) {
            eVar.f91852q = -1;
            eVar.f91851p = -1;
            boolean z2 = eVar.f91841f != null && eVar.f91841f.mo67494i();
            if (eVar.f91843h == null || !eVar.f91843h.mo67494i()) {
                z = false;
            } else {
                z = true;
            }
            if (!z2 && !z && C34729o.m70960b(eVar.f91838c)) {
                eVar.f91848m.mo60191a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
            }
        }
    }
}
