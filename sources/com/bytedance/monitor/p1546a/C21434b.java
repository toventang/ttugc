package com.bytedance.monitor.p1546a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.monitor.a.b */
public final class C21434b {

    /* renamed from: a */
    private static final Map<String, Field> f50821a = new HashMap();

    static {
        Covode.recordClassIndex(25057);
    }

    /* renamed from: a */
    public static Object m40240a(Field field, Object obj) {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        return field.get(obj);
    }

    /* renamed from: a */
    public static Object m40239a(Object obj, String str) {
        Field a = m40241a(obj.getClass(), str);
        if (a != null) {
            return m40240a(a, obj);
        }
        return null;
    }

    /* renamed from: a */
    public static Field m40241a(Class<?> cls, String str) {
        Field field;
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString()).append("#").append(str);
        String sb2 = sb.toString();
        Map<String, Field> map = f50821a;
        synchronized (map) {
            field = map.get(sb2);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Map<String, Field> map2 = f50821a;
                synchronized (map2) {
                    map2.put(sb2, declaredField);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }
}
