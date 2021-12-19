package com.p2082ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.p */
public final class C65083p {

    /* renamed from: a */
    static final Keva f146933a;

    /* renamed from: b */
    public static final C65083p f146934b = new C65083p();

    private C65083p() {
    }

    /* renamed from: b */
    static String m116810b() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return g.getCurUserId();
    }

    static {
        Covode.recordClassIndex(76551);
        Keva repo = Keva.getRepo("profile_private_account_guide");
        C89219l.m154716b(repo, "");
        f146933a = repo;
    }

    /* renamed from: a */
    public static void m116809a() {
        f146933a.storeBoolean(m116810b() + "-guide_disabled", true);
    }
}
