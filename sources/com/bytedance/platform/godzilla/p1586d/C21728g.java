package com.bytedance.platform.godzilla.p1586d;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.d.g */
public final class C21728g {
    static {
        Covode.recordClassIndex(25369);
    }

    /* renamed from: a */
    private static List<Class<?>> m40694a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m40695a(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: a */
    public static Object m40693a(Object obj, InvocationHandler invocationHandler) {
        Class[] clsArr;
        List<Class<?>> a = m40694a(obj.getClass());
        if (a == null || a.size() <= 0) {
            clsArr = new Class[0];
        } else {
            clsArr = (Class[]) a.toArray(new Class[a.size()]);
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), clsArr, invocationHandler);
    }

    /* renamed from: a */
    private static void m40695a(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> cls2 : interfaces) {
                if (hashSet.add(cls2)) {
                    m40695a(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
