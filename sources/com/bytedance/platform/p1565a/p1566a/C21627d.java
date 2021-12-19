package com.bytedance.platform.p1565a.p1566a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.a.a.d */
public final class C21627d {

    /* renamed from: a */
    private static final Map<String, Field> f51315a = new HashMap();

    static {
        Covode.recordClassIndex(25268);
    }

    /* renamed from: a */
    public static Field m40579a(Class<?> cls, String str) {
        Field field;
        Field field2;
        MethodCollector.m26663i(7472);
        Class cls2 = (Class) C21635j.m40588a(cls, "The class must not be null");
        C21635j.m40589a(!TextUtils.isEmpty(str), "The field name must not be blank");
        StringBuilder sb = new StringBuilder();
        sb.append(cls2.toString()).append("#").append(str);
        String sb2 = sb.toString();
        Map<String, Field> map = f51315a;
        synchronized (map) {
            try {
                field = map.get(sb2);
            } finally {
                MethodCollector.m26664o(7472);
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
                if (!C21634i.m40587a() || (field2 = C21625b.m40575a(cls2, str)) == null) {
                    field2 = cls2.getDeclaredField(str);
                }
                if (!field2.isAccessible()) {
                    field2.setAccessible(true);
                }
                Map<String, Field> map2 = f51315a;
                synchronized (map2) {
                    try {
                        map2.put(sb2, field2);
                    } finally {
                        MethodCollector.m26664o(7472);
                    }
                }
                return field2;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        MethodCollector.m26664o(7472);
        return null;
    }
}
