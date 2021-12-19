package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: com.lynx.tasm.behavior.utils.b */
public final class C28701b {

    /* renamed from: a */
    static HashMap<Class, HashMap<String, Method>> f67699a = new HashMap<>();

    static {
        Covode.recordClassIndex(34795);
    }

    /* renamed from: a */
    public static HashMap<String, Method> m57482a(Class<? extends LynxBaseUI> cls) {
        if (cls == null) {
            return null;
        }
        return m57483b(cls);
    }

    /* renamed from: b */
    private static HashMap<String, Method> m57483b(Class<?> cls) {
        if (f67699a.containsKey(cls)) {
            return f67699a.get(cls);
        }
        HashMap<String, Method> hashMap = new HashMap<>();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getAnnotation(AbstractC28528p.class) != null) {
                hashMap.put(method.getName(), method);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            hashMap.putAll(m57483b(superclass));
        }
        f67699a.put(cls, hashMap);
        return hashMap;
    }
}
