package com.p2082ss.android.ugc.aweme.commercialize;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e */
public final class C37698e {
    static {
        Covode.recordClassIndex(45133);
    }

    /* renamed from: a */
    public static String m76197a(String str, String str2) {
        if (str.contains("{UID}") || str.contains("__UID__")) {
            return str.replace("{UID}", str2).replace("__UID__", str2);
        }
        return str;
    }
}
