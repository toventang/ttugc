package com.p2082ss.android.medialib.util;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.medialib.util.a */
public final class C30058a {

    /* renamed from: a */
    public static Method f71741a;

    /* renamed from: b */
    private static Method f71742b;

    /* renamed from: c */
    private static Method f71743c;

    /* renamed from: d */
    private static Method f71744d;

    static {
        Covode.recordClassIndex(36551);
        try {
            f71742b = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            f71741a = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f71743c = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            f71744d = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }
}
