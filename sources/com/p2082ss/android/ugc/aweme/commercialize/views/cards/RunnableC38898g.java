package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38236f;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38239h;
import com.p2082ss.android.ugc.aweme.commercialize.service.C38488a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38747h;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.utils.C80631v;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.g */
final /* synthetic */ class RunnableC38898g implements Runnable {

    /* renamed from: a */
    private final C38888e f91873a;

    /* renamed from: b */
    private final C38239h f91874b;

    static {
        Covode.recordClassIndex(46485);
    }

    RunnableC38898g(C38888e eVar, C38239h hVar) {
        this.f91873a = eVar;
        this.f91874b = hVar;
    }

    public final void run() {
        C38888e eVar = this.f91873a;
        C38239h hVar = this.f91874b;
        if (!eVar.f91854s) {
            String str = hVar.f90350b;
            if (!C80631v.m139799b(eVar.f91837b)) {
                eVar.mo67574a("not satisfied");
            } else if (C49625h.m93072a().f114194f) {
                eVar.mo67574a("has shown once");
            } else if (eVar.f91837b != null && eVar.f91837b.getAwemeRawAd() != null && eVar.f91837b.getAwemeRawAd().canShowLynxBtn2CardAnim()) {
                eVar.mo67574a("lynx card not satisfied");
            } else if (C34729o.m70960b(eVar.f91838c) || eVar.f91856u) {
                eVar.mo67574a("already shown once");
            } else if (eVar.f91843h == null || !eVar.f91843h.mo67494i()) {
                String b = eVar.mo67575b(false);
                if (TextUtils.isEmpty(b) || !TextUtils.equals(str, "passive_show") || !C49625h.m93072a().f114195g) {
                    if (b == null) {
                        b = eVar.f91855t;
                    }
                    if (!TextUtils.isEmpty(b)) {
                        eVar.f91848m.mo60191a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", b);
                        C38488a.f90908a.mo67045a().mo66461b(eVar.f91837b, 1);
                        C38747h.m78588a(eVar.f91837b, b, false);
                        if (eVar.f91857v != null) {
                            eVar.f91857v.mo65444b().mo67547b(eVar.f91837b, b);
                            return;
                        }
                        return;
                    }
                    eVar.f91848m.mo60191a("AD_ACTION_MOVE_OUT_DESC", Boolean.valueOf(C38748i.m78601f(eVar.f91837b)));
                    eVar.f91848m.mo60191a("ON_AD_HALF_WEB_PAGE_SHOW_START", (Object) new C38236f.C38237a().mo67169a(new C38903l(eVar)).f91182a);
                    eVar.f91849n.postDelayed(new RunnableC38904m(eVar), 200);
                    return;
                }
                eVar.mo67574a("search: just enter");
            } else {
                eVar.mo67574a("top page is showing");
            }
        }
    }
}
