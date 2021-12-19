package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38177d;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38236f;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38239h;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.r */
final /* synthetic */ class RunnableC38916r implements Runnable {

    /* renamed from: a */
    private final C38907p f91918a;

    /* renamed from: b */
    private final C38239h f91919b;

    static {
        Covode.recordClassIndex(46503);
    }

    RunnableC38916r(C38907p pVar, C38239h hVar) {
        this.f91918a = pVar;
        this.f91919b = hVar;
    }

    public final void run() {
        C38907p pVar = this.f91918a;
        C38239h hVar = this.f91919b;
        if (!pVar.f91901s) {
            String str = hVar.f90350b;
            if (C37663b.f89031b.mo65688a() != null && !C37663b.f89031b.mo65688a().mo65684p(pVar.f91884b)) {
                pVar.mo67585a("not satisfied");
            } else if (C37663b.f89031b.mo65688a() != null && C37663b.f89031b.mo65688a().mo65669d()) {
                pVar.mo67585a("has shown once");
            } else if (C34729o.m70960b(pVar.f91885c) || pVar.f91903u) {
                pVar.mo67585a("already shown once");
            } else if (pVar.f91890h == null || !pVar.f91890h.mo67494i()) {
                String b = pVar.mo67586b(false);
                if (TextUtils.isEmpty(b) || !TextUtils.equals(str, "passive_show") || C37663b.f89031b.mo65688a() == null || !C37663b.f89031b.mo65688a().mo65671e()) {
                    if (b == null) {
                        b = pVar.f91902t;
                    }
                    if (!TextUtils.isEmpty(b)) {
                        pVar.f91892j.mo60191a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", b);
                        if (C37663b.f89031b.mo65688a() != null) {
                            C38177d.f90185a.mo66461b(pVar.f91884b, 0);
                            C37663b.f89031b.mo65688a().mo65654a(pVar.f91884b, false, b);
                        }
                        C38875ac.f91817a.mo67547b(pVar.f91884b, b);
                        return;
                    }
                    pVar.f91892j.mo60191a("AD_ACTION_MOVE_OUT_DESC", Boolean.valueOf(C38748i.m78601f(pVar.f91884b)));
                    pVar.f91892j.mo60191a("ON_AD_HALF_WEB_PAGE_SHOW_START", (Object) new C38236f.C38237a().mo67169a(new C38922x(pVar)).f91182a);
                    pVar.f91893k.postDelayed(new RunnableC38923y(pVar), 200);
                    return;
                }
                pVar.mo67585a("search: just enter");
            } else {
                pVar.mo67585a("top page is showing");
            }
        }
    }
}
