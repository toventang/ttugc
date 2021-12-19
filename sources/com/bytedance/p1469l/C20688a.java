package com.bytedance.p1469l;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.common.utility.reflect.C13635a;
import com.bytedance.common.utility.reflect.C13637b;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.l.a */
public class C20688a extends C6193a {

    /* renamed from: a */
    private static volatile AbstractC11846d f48886a;

    static {
        Covode.recordClassIndex(24261);
    }

    /* renamed from: com.bytedance.l.a$a */
    static class C20689a implements InvocationHandler {

        /* renamed from: a */
        private Object f48887a = null;

        static {
            Covode.recordClassIndex(24262);
        }

        C20689a() {
        }

        /* renamed from: a */
        private static Object m38944a(Class cls) {
            if (cls == Boolean.class) {
                return false;
            }
            if (cls == Integer.class || cls == Short.class || cls == Byte.class) {
                return 0;
            }
            if (cls == Double.class) {
                return Double.valueOf(0.0d);
            }
            if (cls == Character.class) {
                return "";
            }
            if (cls == Long.class) {
                return 0L;
            }
            if (cls == Float.class) {
                return Float.valueOf(0.0f);
            }
            return null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2 = this.f48887a;
            if (obj2 == null) {
                return m38944a(Reflect.wrapper(method.getReturnType()));
            }
            try {
                return Reflect.m24529on(obj2).call(method.getName(), method.getParameterTypes(), objArr).get();
            } catch (C13637b unused) {
                return m38944a(Reflect.wrapper(method.getReturnType()));
            }
        }
    }

    /* renamed from: a */
    public static AbstractC11846d m38942a() {
        MethodCollector.m26663i(10914);
        if (f48886a == null) {
            synchronized (C20688a.class) {
                try {
                    if (f48886a == null) {
                        f48886a = (AbstractC11846d) C13635a.m24536a("com.ss.android.ugc.aweme.live.Live", "getService", new Object[0]);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10914);
                    throw th;
                }
            }
        }
        AbstractC11846d dVar = f48886a;
        MethodCollector.m26664o(10914);
        return dVar;
    }

    /* renamed from: b */
    public static <T extends AbstractC2953a> T m38943b(Class<T> cls) {
        T t = (T) m13435a(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC2953a) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C20689a()));
        m13436a(cls, t2);
        return t2;
    }
}
