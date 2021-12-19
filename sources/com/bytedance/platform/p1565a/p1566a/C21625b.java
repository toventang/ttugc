package com.bytedance.platform.p1565a.p1566a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.a.a.b */
public final class C21625b {
    static {
        Covode.recordClassIndex(25266);
    }

    /* renamed from: a */
    public static Field m40575a(Class<?> cls, String str) {
        if (!C21634i.m40587a()) {
            return C21627d.m40579a(cls, str);
        }
        try {
            return C21626c.m40577a(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m40576a(Class<?> cls, String str, Class<?>... clsArr) {
        if (!C21634i.m40587a()) {
            return C21633h.m40586a(cls, str, (Class[]) clsArr);
        }
        try {
            return C21626c.m40578a(cls, str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
