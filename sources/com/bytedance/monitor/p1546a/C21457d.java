package com.bytedance.monitor.p1546a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.monitor.a.d */
public final class C21457d {

    /* renamed from: a */
    private static final Class<?>[] f50863a = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f50864b;

    /* renamed from: c */
    private static final Map<Class<?>, Class<?>> f50865c = new HashMap();

    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: java.util.Map<java.lang.Class<?>, java.lang.Class<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        Covode.recordClassIndex(25080);
        HashMap hashMap = new HashMap();
        f50864b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        Class cls = Void.TYPE;
        hashMap.put(cls, cls);
        for (Object obj : hashMap.keySet()) {
            Class<?> cls2 = f50864b.get(obj);
            if (!obj.equals(cls2)) {
                f50865c.put(cls2, obj);
            }
        }
    }

    /* renamed from: a */
    private static Class<?> m40300a(Class<?> cls) {
        return f50865c.get(cls);
    }

    /* renamed from: a */
    static boolean m40302a(AccessibleObject accessibleObject) {
        if (accessibleObject != null && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && (member.getDeclaringClass().getModifiers() & 7) == 0) {
                try {
                    accessibleObject.setAccessible(true);
                    return true;
                } catch (SecurityException unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static float m40299a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f;
        float f2 = 0.0f;
        for (int i = 0; i < clsArr.length; i++) {
            Class<?> cls = clsArr[i];
            Class<?> cls2 = clsArr2[i];
            if (!cls2.isPrimitive()) {
                f = 0.0f;
                while (true) {
                    if (cls != null) {
                        if (cls2.equals(cls)) {
                            break;
                        }
                        if (cls2.isInterface() && m40301a(cls, cls2)) {
                            f += 0.25f;
                            break;
                        }
                        f += 1.0f;
                        cls = cls.getSuperclass();
                    } else {
                        f += 1.5f;
                        break;
                    }
                }
            } else {
                if (!cls.isPrimitive()) {
                    cls = m40300a(cls);
                    f = 0.1f;
                } else {
                    f = 0.0f;
                }
                int i2 = 0;
                while (cls != cls2) {
                    Class<?>[] clsArr3 = f50863a;
                    if (i2 >= clsArr3.length) {
                        break;
                    }
                    if (cls == clsArr3[i2]) {
                        f += 0.1f;
                        if (i2 < clsArr3.length - 1) {
                            cls = clsArr3[i2 + 1];
                        }
                    }
                    i2++;
                }
            }
            f2 += f;
        }
        return f2;
    }

    /* renamed from: a */
    static boolean m40301a(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            if (!cls2.isPrimitive()) {
                return true;
            }
            return false;
        } else if (cls.isPrimitive() && !cls2.isPrimitive() && cls.isPrimitive() && (cls = f50864b.get(cls)) == null) {
            return false;
        } else {
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = m40300a(cls)) == null) {
                return false;
            }
            if (cls.equals(cls2)) {
                return true;
            }
            if (!cls.isPrimitive()) {
                return cls2.isAssignableFrom(cls);
            }
            if (!cls2.isPrimitive()) {
                return false;
            }
            if (Integer.TYPE.equals(cls)) {
                if (Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (Long.TYPE.equals(cls)) {
                if (Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
                return false;
            } else {
                if (Float.TYPE.equals(cls)) {
                    return Double.TYPE.equals(cls2);
                }
                if (Character.TYPE.equals(cls)) {
                    if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                        return true;
                    }
                    return false;
                } else if (Short.TYPE.equals(cls)) {
                    if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                        return true;
                    }
                    return false;
                } else if (!Byte.TYPE.equals(cls)) {
                    return false;
                } else {
                    if (Short.TYPE.equals(cls2) || Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                        return true;
                    }
                    return false;
                }
            }
        }
    }
}
