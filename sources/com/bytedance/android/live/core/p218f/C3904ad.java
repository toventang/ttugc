package com.bytedance.android.live.core.p218f;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.ad */
public final class C3904ad {
    static {
        Covode.recordClassIndex(4433);
    }

    /* renamed from: b */
    public static int m9537b(String str) {
        try {
            return Integer.parseInt(m9536a(str).trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m9536a(String str) {
        Exception e;
        String str2 = "";
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            try {
                C3854a.m9453a(3, "SystemPropertiesUtil", "key is:" + str + " prop is: " + str3);
                return str3;
            } catch (Exception e2) {
                e = e2;
                str2 = str3;
            }
        } catch (Exception e3) {
            e = e3;
            C3854a.m9460b("SystemPropertiesUtil", "read the content of build.prop exception.", e);
            return str2;
        }
    }
}
