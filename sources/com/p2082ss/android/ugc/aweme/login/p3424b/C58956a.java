package com.p2082ss.android.ugc.aweme.login.p3424b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;

/* renamed from: com.ss.android.ugc.aweme.login.b.a */
public final class C58956a {
    static {
        Covode.recordClassIndex(69283);
    }

    /* renamed from: a */
    public static boolean m108315a(Aweme aweme) {
        if (aweme == null || aweme.getTakeDownReason() != 6) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m108316b(Aweme aweme) {
        if (!m108315a(aweme) || !C50545m.m94762a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m108314a(Aweme aweme, int i) {
        if (aweme == null || TextUtils.isEmpty(aweme.getTakeDownDesc()) || !m108315a(aweme)) {
            return C17867d.m33078a().getString(i);
        }
        return aweme.getTakeDownDesc();
    }
}
