package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.ValueConvertUtil */
public class ValueConvertUtil {
    static {
        Covode.recordClassIndex(95528);
    }

    public static long ConvertStringToLong(String str, long j) {
        if (str == null || str.isEmpty()) {
            return j;
        }
        try {
            j = Long.valueOf(str).longValue();
            return j;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }
}
