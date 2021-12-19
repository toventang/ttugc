package com.p2082ss.android.ugc.aweme.follow.p3000d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.follow.d.a */
public final class C51076a {
    static {
        Covode.recordClassIndex(60264);
    }

    /* renamed from: a */
    public static boolean m95487a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 13 || aweme.getAwemeType() == 0 || aweme.getAwemeType() == 2 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 61 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56) {
            return true;
        }
        return false;
    }
}
