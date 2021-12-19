package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.epoxy.g */
public final class C1936g {

    /* renamed from: a */
    private static final Map<Class<?>, Constructor<?>> f5802a = new LinkedHashMap();

    /* renamed from: b */
    private static final NoOpControllerHelper f5803b = new NoOpControllerHelper();

    static {
        Covode.recordClassIndex(2127);
    }

    /* renamed from: a */
    static AbstractC1935f m6159a(AbstractC1944n nVar) {
        Constructor<?> a = m6160a(nVar.getClass());
        if (a == null) {
            return f5803b;
        }
        try {
            return (AbstractC1935f) a.newInstance(nVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke ".concat(String.valueOf(a)), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke ".concat(String.valueOf(a)), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            } else if (cause instanceof Error) {
                throw cause;
            } else {
                throw new RuntimeException("Unable to get Epoxy helper class.", cause);
            }
        }
    }

    /* renamed from: a */
    private static Constructor<?> m6160a(Class<?> cls) {
        Constructor<?> constructor;
        Map<Class<?>, Constructor<?>> map = f5802a;
        Constructor<?> constructor2 = map.get(cls);
        if (constructor2 != null || map.containsKey(cls)) {
            return constructor2;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            constructor = Class.forName(name + "_EpoxyHelper").getConstructor(cls);
        } catch (ClassNotFoundException unused) {
            constructor = m6160a(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find Epoxy Helper constructor for ".concat(String.valueOf(name)), e);
        }
        f5802a.put(cls, constructor);
        return constructor;
    }
}
