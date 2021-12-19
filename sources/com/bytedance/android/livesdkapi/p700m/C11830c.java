package com.bytedance.android.livesdkapi.p700m;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.m.c */
public final class C11830c {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f28189a;

    static {
        Covode.recordClassIndex(13528);
        HashMap hashMap = new HashMap();
        f28189a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        hashMap.put(Integer.class, Integer.TYPE);
        hashMap.put(Float.class, Float.TYPE);
        hashMap.put(Long.class, Long.TYPE);
        hashMap.put(Double.class, Double.TYPE);
        Class cls = Boolean.TYPE;
        hashMap.put(cls, cls);
        Class cls2 = Byte.TYPE;
        hashMap.put(cls2, cls2);
        Class cls3 = Character.TYPE;
        hashMap.put(cls3, cls3);
        Class cls4 = Short.TYPE;
        hashMap.put(cls4, cls4);
        Class cls5 = Integer.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Float.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Long.TYPE;
        hashMap.put(cls7, cls7);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x002c A[EDGE_INSN: B:36:0x002c->B:17:0x002c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x002f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m20832a(java.lang.Object r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.p700m.C11830c.m20832a(java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    public static void m20833a(Object obj, String str, Object obj2) {
        try {
            m20834b(obj, str, obj2);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m20834b(Object obj, String str, Object obj2) {
        Class<?> cls = obj.getClass();
        Field field = null;
        do {
            try {
                field = cls.getDeclaredField(str);
                continue;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    throw new NoSuchFieldException();
                }
            }
        } while (field == null);
        field.setAccessible(true);
        field.set(obj, obj2);
    }
}
