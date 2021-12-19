package com.bytedance.common.utility.reflect;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.bytedance.common.utility.reflect.a */
public final class C13635a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f33126a;

    /* renamed from: com.bytedance.common.utility.reflect.a$a */
    public static class C13636a<T> {

        /* renamed from: a */
        public final Class<? extends T> f33127a;

        /* renamed from: b */
        public final T f33128b;

        static {
            Covode.recordClassIndex(15664);
        }
    }

    /* renamed from: a */
    private static Object m24538a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_utility_reflect_JavaCalls_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_utility_reflect_JavaCalls_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    private static Class<?>[] m24542a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj != null ? obj instanceof C13636a ? ((C13636a) obj).f33127a : obj.getClass() : null;
        }
        return clsArr;
    }

    static {
        Covode.recordClassIndex(15663);
        HashMap hashMap = new HashMap();
        f33126a = hashMap;
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

    /* renamed from: b */
    private static Object[] m24544b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C13636a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C13636a) obj).f33128b;
            }
        }
        return objArr2;
    }

    /* renamed from: a */
    public static <T> T m24534a(Object obj, String str) {
        try {
            return (T) m24543b(obj, str);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static <T> T m24543b(Object obj, String str) {
        Class<?> cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
                continue;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    /* renamed from: a */
    public static Object m24537a(String str, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Object[] b = m24544b(objArr);
            return cls.getConstructor(m24542a(b)).newInstance(m24544b(b));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m24541a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            if (clsArr2 == null || clsArr2.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr2 == null) {
            if (clsArr.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (!clsArr[i].isAssignableFrom(clsArr2[i])) {
                    Map<Class<?>, Class<?>> map = f33126a;
                    if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static <T> T m24535a(Object obj, String str, Object... objArr) {
        try {
            return (T) m24538a(m24539a(obj.getClass(), str, m24542a(objArr)), obj, m24544b(objArr));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m24536a(String str, String str2, Object... objArr) {
        try {
            return (T) m24538a(m24539a(Class.forName(str), str2, m24542a(objArr)), (Object) null, m24544b(objArr));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m24539a(Class<?> cls, String str, Class<?>... clsArr) {
        while (true) {
            Method a = m24540a(cls.getDeclaredMethods(), str, clsArr);
            if (a != null) {
                a.setAccessible(true);
                return a;
            } else if (cls.getSuperclass() != null) {
                cls = cls.getSuperclass();
            } else {
                throw new NoSuchMethodException();
            }
        }
    }

    /* renamed from: a */
    private static Method m24540a(Method[] methodArr, String str, Class<?>[] clsArr) {
        Objects.requireNonNull(str, "Method name must not be null.");
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m24541a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }
}
