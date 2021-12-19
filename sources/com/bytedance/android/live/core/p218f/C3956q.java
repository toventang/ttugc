package com.bytedance.android.live.core.p218f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.q */
public final class C3956q {
    static {
        Covode.recordClassIndex(4485);
    }

    /* renamed from: a */
    public static String m9643a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        if (str.contains("_")) {
            return str;
        }
        return TextUtils.concat(str, "_", "0").toString();
    }
}
