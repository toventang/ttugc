package com.p2082ss.android.ugc.aweme.commerce.p2505a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.k */
public final class C37475k {
    static {
        Covode.recordClassIndex(44860);
    }

    /* renamed from: a */
    public static boolean m75565a(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        if (aweme.getAwemeRawAd().getPivOption() == 1 || aweme.getAwemeRawAd().getPivOption() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m75566b(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        if (aweme.getAwemeRawAd().getPivOption() == 0 || aweme.getAwemeRawAd().getPivOption() == 2) {
            return true;
        }
        return false;
    }
}
