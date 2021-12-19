package com.bytedance.monitor.p1546a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.monitor.a.e */
public final class C21458e {

    /* renamed from: a */
    private static Map<String, Method> f50866a = new HashMap();

    static {
        Covode.recordClassIndex(25081);
    }

    /* renamed from: a */
    private static Method m40306a(Method method) {
        if (method == null || !Modifier.isPublic(method.getModifiers()) || method.isSynthetic()) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return method;
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method d = m40309d(declaringClass, name, parameterTypes);
        if (d == null) {
            return m40308c(declaringClass, name, parameterTypes);
        }
        return d;
    }

    /* renamed from: a */
    public static Object m40303a(Class cls, String str, Object... objArr) {
        Object[] b = C21459f.m40312b(objArr);
        return m40304a(cls, str, b, C21459f.m40311a(b));
    }

    /* renamed from: c */
    private static Method m40308c(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (Modifier.isPublic(superclass.getModifiers())) {
                try {
                    return superclass.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Method m40305a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        String b = m40307b(cls, str, clsArr);
        synchronized (f50866a) {
            method = f50866a.get(b);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        Method a = m40306a(cls.getMethod(str, clsArr));
        synchronized (f50866a) {
            f50866a.put(b, a);
        }
        return a;
    }

    /* renamed from: b */
    private static String m40307b(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString()).append("#").append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.toString());
        } else {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.toString()).append("#");
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static Method m40309d(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (Modifier.isPublic(interfaces[i].getModifiers())) {
                    try {
                        return interfaces[i].getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        Method d = m40309d(interfaces[i], str, clsArr);
                        if (d != null) {
                            return d;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x006f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method m40310e(java.lang.Class<?> r10, java.lang.String r11, java.lang.Class<?>... r12) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.p1546a.C21458e.m40310e(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private static Object m40304a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            clsArr = C21459f.f50868b;
        }
        Object[] b = C21459f.m40312b(objArr);
        Method e = m40310e(cls, str, clsArr);
        if (e != null) {
            Pair<Boolean, Object> a = C15346a.m28238a(e, new Object[]{null, b}, 110000, "java.lang.Object", true, "com_bytedance_monitor_util_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = e.invoke(null, b);
            C15346a.m28242a(invoke, e, new Object[]{null, b}, "com_bytedance_monitor_util_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + cls.getName());
    }
}
