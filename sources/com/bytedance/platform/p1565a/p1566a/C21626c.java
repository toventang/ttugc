package com.bytedance.platform.p1565a.p1566a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.a.a.c */
public final class C21626c {
    static {
        Covode.recordClassIndex(25267);
    }

    /* renamed from: a */
    public static Field m40577a(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m40578a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable unused) {
            return null;
        }
    }
}
