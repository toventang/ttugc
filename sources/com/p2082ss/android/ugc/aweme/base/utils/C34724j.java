package com.p2082ss.android.ugc.aweme.base.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.utils.j */
public final class C34724j {
    static {
        Covode.recordClassIndex(41716);
    }

    /* renamed from: a */
    public static boolean m70936a(String str) {
        int length;
        if (!(str == null || (length = str.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
