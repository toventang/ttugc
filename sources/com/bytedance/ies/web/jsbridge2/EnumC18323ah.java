package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.web.jsbridge2.ah */
public enum EnumC18323ah {
    PUBLIC,
    PROTECTED,
    PRIVATE,
    SECURE;

    public final String toString() {
        if (this == PRIVATE) {
            return "private";
        }
        if (this == PROTECTED) {
            return "protected";
        }
        if (this == SECURE) {
            return "secure";
        }
        return "public";
    }

    static {
        Covode.recordClassIndex(20995);
    }

    public static EnumC18323ah from(String str) {
        if (TextUtils.isEmpty(str)) {
            return PUBLIC;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals("protected", lowerCase)) {
            return PROTECTED;
        }
        if (TextUtils.equals("private", lowerCase)) {
            return PRIVATE;
        }
        if (TextUtils.equals("secure", lowerCase)) {
            return SECURE;
        }
        return PUBLIC;
    }
}
