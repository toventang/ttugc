package com.p2082ss.android.ugc.aweme.net;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.net.h */
public final class C61362h {
    static {
        Covode.recordClassIndex(71995);
    }

    /* renamed from: a */
    public static boolean m111100a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, str2) || str.endsWith(".".concat(String.valueOf(str2)))) {
            return true;
        }
        return false;
    }
}
