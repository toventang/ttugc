package com.p2082ss.android.ugc.aweme.utils;

import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.fx */
public final class C80465fx {
    static {
        Covode.recordClassIndex(93733);
    }

    /* renamed from: a */
    public static String m139468a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String b = m139469b(str.trim());
        if (TextUtils.isEmpty(b)) {
            return "";
        }
        return b;
    }

    /* renamed from: b */
    private static String m139469b(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PhoneNumberUtils.normalizeNumber(str);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (sb.length() == 0 && charAt == '+') {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
