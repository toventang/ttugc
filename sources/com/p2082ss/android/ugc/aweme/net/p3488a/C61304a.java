package com.p2082ss.android.ugc.aweme.net.p3488a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.net.a.a */
public class C61304a {

    /* renamed from: a */
    private static C61304a f139221a;

    /* renamed from: b */
    private Object f139222b;

    static {
        Covode.recordClassIndex(71934);
    }

    private C61304a() {
        try {
            Constructor<?> declaredConstructor = Class.forName("android.os.SystemProperties").getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            this.f139222b = declaredConstructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C61304a m110982a() {
        MethodCollector.m26663i(10762);
        if (f139221a == null) {
            synchronized (C61304a.class) {
                try {
                    if (f139221a == null) {
                        f139221a = new C61304a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10762);
                    throw th;
                }
            }
        }
        C61304a aVar = f139221a;
        MethodCollector.m26664o(10762);
        return aVar;
    }

    /* renamed from: a */
    public final String mo98933a(String str) {
        Object obj = this.f139222b;
        if (obj == null) {
            return "";
        }
        try {
            Method method = obj.getClass().getMethod("get", String.class);
            method.setAccessible(true);
            String str2 = (String) method.invoke(this.f139222b, str);
            if (str2 == null) {
                return "";
            }
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }
}
