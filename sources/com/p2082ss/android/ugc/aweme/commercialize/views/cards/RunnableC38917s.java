package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.s */
final /* synthetic */ class RunnableC38917s implements Runnable {

    /* renamed from: a */
    private final C38907p f91920a;

    static {
        Covode.recordClassIndex(46504);
    }

    RunnableC38917s(C38907p pVar) {
        this.f91920a = pVar;
    }

    public final void run() {
        boolean z;
        C38907p pVar = this.f91920a;
        if (!pVar.f91901s) {
            pVar.f91896n = -1;
            pVar.f91895m = -1;
            boolean z2 = pVar.f91888f != null && pVar.f91888f.mo67494i();
            if (pVar.f91890h == null || !pVar.f91890h.mo67494i()) {
                z = false;
            } else {
                z = true;
            }
            if (!z2 && !z && C34729o.m70960b(pVar.f91885c)) {
                pVar.f91892j.mo60191a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
            }
        }
    }
}
