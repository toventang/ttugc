package com.p2082ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.util.f */
public final class C33036f {
    static {
        Covode.recordClassIndex(39843);
    }

    /* renamed from: a */
    public static String m67670a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C13607d.m24440a(bytes, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }
}
