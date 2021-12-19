package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.az */
public final class C59041az {

    /* renamed from: a */
    public static final C59041az f134413a = new C59041az();

    private C59041az() {
    }

    static {
        Covode.recordClassIndex(69386);
    }

    /* renamed from: a */
    public static final void m108523a() {
        Keva repoFromSp = Keva.getRepoFromSp(C17867d.m33078a(), "NotificationSharePreferences", 0);
        C89219l.m154716b(repoFromSp, "");
        repoFromSp.storeBoolean("noticeGuideShown", true);
    }
}
