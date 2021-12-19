package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.metrics.aa */
public final class C59205aa {
    static {
        Covode.recordClassIndex(69568);
    }

    /* renamed from: a */
    public static String m108754a(Aweme aweme) {
        if (C31575b.m65865g().isLogin() && aweme != null && aweme.getAuthor() != null && !C80580in.m139694g(aweme.getAuthor())) {
            return String.valueOf(aweme.getFollowStatus());
        }
        return "";
    }
}
