package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.v */
public final class C80631v {

    /* renamed from: a */
    public static final C80631v f180282a = new C80631v();

    private C80631v() {
    }

    static {
        Covode.recordClassIndex(93905);
    }

    /* renamed from: b */
    public static final boolean m139799b(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (C37699a.m76269ao(aweme) || C37699a.m76290d(aweme) || m139798a(aweme) || C37699a.m76272ar(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m139798a(Aweme aweme) {
        C33842s sVar = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar, "");
        C33594aj<Boolean> p = sVar.mo60072p();
        C89219l.m154716b(p, "");
        Boolean c = p.mo59941c();
        C89219l.m154716b(c, "");
        if (!c.booleanValue() || aweme == null || aweme.getStatus() == null || aweme.getPromotions().size() <= 0 || !C38000g.m77051b().shouldShowCard() || !C38000g.m77055f().mo66303a(aweme)) {
            return false;
        }
        return true;
    }
}
