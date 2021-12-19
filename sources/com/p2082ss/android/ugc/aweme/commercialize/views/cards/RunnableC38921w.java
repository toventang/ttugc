package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.w */
final /* synthetic */ class RunnableC38921w implements Runnable {

    /* renamed from: a */
    private final C38907p f91924a;

    static {
        Covode.recordClassIndex(46508);
    }

    RunnableC38921w(C38907p pVar) {
        this.f91924a = pVar;
    }

    public final void run() {
        C38907p pVar = this.f91924a;
        if (pVar.f91890h != null && !pVar.f91890h.mo67519k()) {
            pVar.f91892j.mo60191a("AD_ACTION_MOVE_IN_DESC", Boolean.valueOf(C38748i.m78601f(pVar.f91884b)));
        }
    }
}
