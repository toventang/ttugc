package com.bytedance.platform.godzilla.p1586d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.godzilla.d.a */
public final class C21722a {

    /* renamed from: a */
    private static final Map<String, Field> f51491a = new HashMap();

    static {
        Covode.recordClassIndex(25363);
    }

    /* renamed from: a */
    private static Object m40679a(Field field) {
        return m40680a((Field) C21727f.m40691a(field, "The field must not be null"), (Object) null);
    }

    /* renamed from: b */
    public static Object m40684b(Class<?> cls, String str) {
        Field a = m40681a(cls, str);
        if (a != null) {
            return m40679a(a);
        }
        return null;
    }

    /* renamed from: a */
    public static Object m40678a(Object obj, String str) {
        Object a = C21727f.m40691a(obj, "target object must not be null");
        Field a2 = m40681a(a.getClass(), str);
        if (a2 != null) {
            return m40680a(a2, a);
        }
        return null;
    }

    /* renamed from: a */
    private static Object m40680a(Field field, Object obj) {
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    /* renamed from: a */
    public static Field m40681a(Class<?> cls, String str) {
        Field field;
        Field field2;
        MethodCollector.m26663i(6615);
        Class cls2 = (Class) C21727f.m40691a(cls, "The class must not be null");
        C21727f.m40692a(!TextUtils.isEmpty(str), "The field name must not be blank");
        StringBuilder sb = new StringBuilder();
        sb.append(cls2.toString()).append("#").append(str);
        String sb2 = sb.toString();
        Map<String, Field> map = f51491a;
        synchronized (map) {
            try {
                field = map.get(sb2);
            } finally {
                MethodCollector.m26664o(6615);
            }
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls2 != null) {
            try {
                if (!C21726e.m40690a() || C21724c.f51495a == null || (field2 = C21724c.f51495a.mo35343a()) == null) {
                    field2 = cls2.getDeclaredField(str);
                }
                if (field2 != null) {
                    if (!field2.isAccessible()) {
                        field2.setAccessible(true);
                    }
                    Map<String, Field> map2 = f51491a;
                    synchronized (map2) {
                        try {
                            map2.put(sb2, field2);
                        } finally {
                            MethodCollector.m26664o(6615);
                        }
                    }
                }
                return field2;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        MethodCollector.m26664o(6615);
        return null;
    }

    /* renamed from: a */
    public static void m40682a(Object obj, String str, Object obj2) {
        Object a = C21727f.m40691a(obj, "target object must not be null");
        Field a2 = m40681a(a.getClass(), str);
        if (a2 != null) {
            m40683a(a2, a, obj2);
        }
    }

    /* renamed from: a */
    private static void m40683a(Field field, Object obj, Object obj2) {
        Field field2 = (Field) C21727f.m40691a(field, "The field must not be null");
        if (!field2.isAccessible()) {
            field2.setAccessible(true);
        }
        field2.set(obj, obj2);
    }
}
