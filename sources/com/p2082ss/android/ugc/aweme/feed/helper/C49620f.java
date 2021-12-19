package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.f */
public final class C49620f {
    static {
        Covode.recordClassIndex(58467);
    }

    /* renamed from: a */
    public static String m93062a(String str, boolean z) {
        if ("opus".equals(str)) {
            if (z) {
                return "personal_homepage";
            }
            return "others_homepage";
        } else if (!"collection".equals(str)) {
            return str;
        } else {
            if (z) {
                return "personal_collection";
            }
            return "others_collection";
        }
    }
}
