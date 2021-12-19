package com.p2082ss.android.deviceregister.p2139d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.deviceregister.d.b */
public final class C29895b {
    static {
        Covode.recordClassIndex(36305);
    }

    /* renamed from: a */
    public static boolean m60262a(String str) {
        int length;
        if (str == null || (length = str.length()) < 13 || length > 160) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }
}
