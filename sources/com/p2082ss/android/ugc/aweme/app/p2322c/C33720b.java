package com.p2082ss.android.ugc.aweme.app.p2322c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;

/* renamed from: com.ss.android.ugc.aweme.app.c.b */
final class C33720b {
    static {
        Covode.recordClassIndex(40615);
    }

    /* renamed from: a */
    static int m69040a() {
        Long.valueOf(C17867d.m33087h()).intValue();
        int i = 0;
        try {
            String[] split = C17867d.m33088i().split("\\.");
            int length = split.length;
            int i2 = 0;
            while (i < length) {
                try {
                    i2 = Integer.valueOf(split[i]).intValue() + (i2 * 100);
                    i++;
                } catch (Throwable unused) {
                    i = i2;
                    return i;
                }
            }
            return i2;
        } catch (Throwable unused2) {
            return i;
        }
    }
}
