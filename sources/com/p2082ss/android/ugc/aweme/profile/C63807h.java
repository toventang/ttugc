package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.h */
public final class C63807h {

    /* renamed from: a */
    public static final C63807h f144628a = new C63807h();

    private C63807h() {
    }

    static {
        Covode.recordClassIndex(75135);
    }

    /* renamed from: a */
    public static String m115405a(String str) {
        StringBuilder append = new StringBuilder().append(str).append('_');
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return append.append(g.getCurUserId()).toString();
    }
}
