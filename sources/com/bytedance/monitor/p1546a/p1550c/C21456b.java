package com.bytedance.monitor.p1546a.p1550c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.monitor.a.c.b */
public final class C21456b {

    /* renamed from: a */
    public static Class f50860a;

    /* renamed from: b */
    public static Object f50861b;

    /* renamed from: c */
    private static C21455a f50862c;

    static {
        Covode.recordClassIndex(25079);
        try {
            if (C21455a.f50859a == null) {
                C21455a.f50859a = new C21455a();
            }
            f50862c = C21455a.f50859a;
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f50860a = cls;
            f50861b = C21455a.m40297a(C21455a.m40298a(cls, "getUnsafe", new Class[0]), (Object) null, new Object[0]);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
