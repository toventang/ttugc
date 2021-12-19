package com.bytedance.common.utility.p908c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.utility.c.c */
public final class C13601c {

    /* renamed from: a */
    public static volatile boolean f33078a = true;

    /* renamed from: b */
    private static C13600b f33079b = new C13600b();

    static {
        Covode.recordClassIndex(15626);
    }

    /* renamed from: a */
    public static String m24432a(String str) {
        if (f33078a) {
            try {
                return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            } catch (Throwable unused) {
            }
        }
        return C13599a.m24431a(str);
    }
}
