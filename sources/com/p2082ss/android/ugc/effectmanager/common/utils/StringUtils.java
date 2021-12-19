package com.p2082ss.android.ugc.effectmanager.common.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.StringUtils */
public class StringUtils {
    static {
        Covode.recordClassIndex(95525);
    }

    public static boolean substringSafetyCheck(String str, int i, int i2) {
        if (!TextUtils.isEmpty(str) && i >= 0 && i2 >= 0 && i < i2 && i < str.length() && i2 <= str.length()) {
            return true;
        }
        return false;
    }
}
