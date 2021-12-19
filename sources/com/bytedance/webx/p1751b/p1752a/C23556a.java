package com.bytedance.webx.p1751b.p1752a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.webx.b.a.a */
public final class C23556a {
    static {
        Covode.recordClassIndex(27654);
    }

    /* renamed from: a */
    public static String m44304a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "webx";
        }
        if (!str.startsWith("webx_")) {
            return "webx_".concat(String.valueOf(str));
        }
        return str;
    }
}
