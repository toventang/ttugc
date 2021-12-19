package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.service.C38488a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38747h;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.m */
final /* synthetic */ class RunnableC38904m implements Runnable {

    /* renamed from: a */
    private final C38888e f91880a;

    static {
        Covode.recordClassIndex(46491);
    }

    RunnableC38904m(C38888e eVar) {
        this.f91880a = eVar;
    }

    public final void run() {
        C38888e eVar = this.f91880a;
        if (!eVar.f91854s) {
            eVar.f91838c.mo67314a(C38748i.m78601f(eVar.f91837b) || eVar.f91842g == 2);
            int e = C38748i.m78600e(eVar.f91837b);
            if (e > 0) {
                eVar.f91850o = new RunnableC38899h(eVar);
                eVar.f91852q = System.currentTimeMillis();
                eVar.f91851p = (long) (e * 1000);
                eVar.f91849n.postDelayed(eVar.f91850o, eVar.f91851p);
            }
            eVar.f91856u = true;
            if (C37699a.m76199B(eVar.f91837b) && !C37699a.m76307l(eVar.f91837b)) {
                C37699a.m76310o(eVar.f91837b);
            }
            eVar.f91848m.mo60191a("ON_AD_HALF_WEB_PAGE_SHOW", (Object) null);
            C38488a.f90908a.mo67045a().mo66461b(eVar.f91837b, 0);
            C38747h.m78587a(eVar.f91837b, false);
            if (eVar.f91857v != null) {
                eVar.f91857v.mo65444b().mo67550e(eVar.f91837b);
            }
            if (eVar.f91845j.intValue() != -100 || eVar.f91846k.intValue() != -100) {
                C39162r.m79460a("ad_ui_adjust", new C33744d().mo59982a("original_time", eVar.f91845j).mo59982a("real_time", eVar.f91846k).mo59980a("tag", 3).mo59982a("is_adjusted", eVar.f91847l).f79943a);
            }
        }
    }
}
