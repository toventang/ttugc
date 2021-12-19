package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.k */
final /* synthetic */ class RunnableC38902k implements Runnable {

    /* renamed from: a */
    private final C38888e f91878a;

    static {
        Covode.recordClassIndex(46489);
    }

    RunnableC38902k(C38888e eVar) {
        this.f91878a = eVar;
    }

    public final void run() {
        C38888e eVar = this.f91878a;
        if (eVar.f91843h != null && !eVar.f91843h.mo67516k()) {
            eVar.f91848m.mo60191a("AD_ACTION_MOVE_IN_DESC", Boolean.valueOf(C38748i.m78601f(eVar.f91837b)));
        }
    }
}
