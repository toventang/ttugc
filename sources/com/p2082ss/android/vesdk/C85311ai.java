package com.p2082ss.android.vesdk;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.ai */
public final class C85311ai {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f190967a;

    /* renamed from: com.ss.android.vesdk.ai$a */
    public static class C85312a<T> {

        /* renamed from: a */
        public final Class<? extends T> f190968a;

        /* renamed from: b */
        public final T f190969b;

        static {
            Covode.recordClassIndex(99423);
        }
    }

    static {
        Covode.recordClassIndex(99422);
        HashMap hashMap = new HashMap();
        f190967a = hashMap;
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

    /* renamed from: a */
    private static Object[] m146630a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C85312a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C85312a) obj).f190969b;
            }
        }
        return objArr2;
    }

    /* renamed from: a */
    public static Object m146629a(String str, Class[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getConstructor(clsArr).newInstance(m146630a(m146630a(objArr)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m146628a(String str, String str2, Object... objArr) {
        Method method;
        boolean z;
        Class<?> cls;
        try {
            Class<?> cls2 = Class.forName(str);
            Class<?>[] clsArr = new Class[4];
            for (int i = 0; i < 4; i++) {
                Object obj = objArr[i];
                if (obj != null && (obj instanceof C85312a)) {
                    cls = ((C85312a) obj).f190968a;
                } else if (obj == null) {
                    cls = null;
                } else {
                    cls = obj.getClass();
                }
                clsArr[i] = cls;
            }
            while (true) {
                Method[] declaredMethods = cls2.getDeclaredMethods();
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i2];
                    if (method.getName().equals(str2)) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes != null) {
                            if (parameterTypes.length == 4) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= parameterTypes.length) {
                                        z = true;
                                        break;
                                    }
                                    if (!parameterTypes[i3].isAssignableFrom(clsArr[i3])) {
                                        Map<Class<?>, Class<?>> map = f190967a;
                                        if (!map.containsKey(parameterTypes[i3])) {
                                            break;
                                        } else if (!map.get(parameterTypes[i3]).equals(map.get(clsArr[i3]))) {
                                            break;
                                        }
                                    }
                                    i3++;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            break;
                        }
                    }
                    i2++;
                }
                if (method != null) {
                    method.setAccessible(true);
                    Object[] a = m146630a(objArr);
                    Pair<Boolean, Object> a2 = C15346a.m28238a(method, new Object[]{null, a}, 110000, "java.lang.Object", true, "com_ss_android_vesdk_VEJavaCalls_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        return (T) a2.second;
                    }
                    T t = (T) method.invoke(null, a);
                    C15346a.m28242a(t, method, new Object[]{null, a}, "com_ss_android_vesdk_VEJavaCalls_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return t;
                } else if (cls2.getSuperclass() != null) {
                    cls2 = cls2.getSuperclass();
                } else {
                    throw new NoSuchMethodException();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
