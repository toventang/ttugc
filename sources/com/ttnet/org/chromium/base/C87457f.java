package com.ttnet.org.chromium.base;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: com.ttnet.org.chromium.base.f */
public final class C87457f {
    static {
        Covode.recordClassIndex(103392);
    }

    /* renamed from: a */
    private static Throwable m151786a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (!(obj instanceof Throwable)) {
            return null;
        }
        return (Throwable) obj;
    }

    /* renamed from: a */
    private static String m151784a(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        return "cr_" + str.substring(i, str.length());
    }

    /* renamed from: a */
    private static String m151785a(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return C1764a.m5929a(Locale.US, str, objArr);
    }

    /* renamed from: b */
    public static void m151788b(String str, String str2, Object... objArr) {
        m151785a(str2, objArr);
        if (m151786a(objArr) != null) {
            m151784a(str);
        } else {
            m151784a(str);
        }
    }

    /* renamed from: c */
    public static void m151789c(String str, String str2, Object... objArr) {
        m151785a(str2, objArr);
        if (m151786a(objArr) != null) {
            m151784a(str);
        } else {
            m151784a(str);
        }
    }

    /* renamed from: a */
    public static void m151787a(String str, String str2, Object... objArr) {
        m151785a(str2, objArr);
        if (m151786a(objArr) != null) {
            m151784a(str);
        } else {
            m151784a(str);
        }
    }
}
