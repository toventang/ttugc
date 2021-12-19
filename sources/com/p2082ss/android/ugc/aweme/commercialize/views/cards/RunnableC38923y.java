package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38177d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.y */
final /* synthetic */ class RunnableC38923y implements Runnable {

    /* renamed from: a */
    private final C38907p f91926a;

    static {
        Covode.recordClassIndex(46510);
    }

    RunnableC38923y(C38907p pVar) {
        this.f91926a = pVar;
    }

    public final void run() {
        C38907p pVar = this.f91926a;
        if (!pVar.f91901s) {
            pVar.f91885c.mo67314a(C38748i.m78601f(pVar.f91884b) || pVar.f91889g == 2);
            int e = C38748i.m78600e(pVar.f91884b);
            if (e > 0) {
                pVar.f91894l = new RunnableC38917s(pVar);
                pVar.f91896n = System.currentTimeMillis();
                pVar.f91895m = (long) (e * 1000);
                pVar.f91893k.postDelayed(pVar.f91894l, pVar.f91895m);
            }
            pVar.f91903u = true;
            if (C37663b.f89031b.mo65688a() != null && C37663b.f89031b.mo65688a().mo65685q(pVar.f91884b) && !C37663b.f89031b.mo65688a().mo65686r(pVar.f91884b)) {
                C37663b.f89031b.mo65688a().mo65687s(pVar.f91884b);
            }
            pVar.f91892j.mo60191a("ON_AD_HALF_WEB_PAGE_SHOW", (Object) null);
            if (C37663b.f89031b.mo65688a() != null) {
                C38177d.f90185a.mo66461b(pVar.f91884b, 1);
                C37663b.f89031b.mo65688a().mo65654a(pVar.f91884b, true, "");
            }
            C38875ac.f91817a.mo67550e(pVar.f91884b);
            if (pVar.f91897o.intValue() != -100 || pVar.f91898p.intValue() != -100) {
                C39162r.m79460a("ad_ui_adjust", new C33744d().mo59982a("original_time", pVar.f91897o).mo59982a("real_time", pVar.f91898p).mo59980a("tag", 3).mo59982a("is_adjusted", pVar.f91899q).f79943a);
            }
        }
    }
}
