package com.bytedance.monitor.collector.p1551a;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.C21434b;
import com.bytedance.monitor.p1546a.C21458e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.monitor.collector.a.a */
public final class C21471a {
    static {
        Covode.recordClassIndex(25098);
    }

    /* renamed from: a */
    private static boolean m40332a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 27 || Build.VERSION.PREVIEW_SDK_INT <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Object m40329a(Object obj, String str) {
        try {
            return m40330a(obj.getClass(), str).get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static Field m40333b(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Field m40330a(Class<?> cls, String str) {
        if (!m40332a()) {
            return C21434b.m40241a(cls, str);
        }
        try {
            return m40333b(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Method m40334b(Class<?> cls, String str, Class... clsArr) {
        if (m40332a()) {
            try {
                return m40331a(cls, str, clsArr);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            try {
                return C21458e.m40305a(cls, str, (Class<?>[]) clsArr);
            } catch (Throwable unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Method m40331a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable unused) {
            return null;
        }
    }
}
