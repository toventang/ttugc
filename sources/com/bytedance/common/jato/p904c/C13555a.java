package com.bytedance.common.jato.p904c;

import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.jato.c.a */
public final class C13555a {

    /* renamed from: a */
    private static Method f32982a;

    /* renamed from: b */
    private static Method f32983b;

    /* renamed from: c */
    private static Method f32984c;

    /* renamed from: d */
    private static Method f32985d;

    /* renamed from: a */
    private static Object m24353a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_common_jato_utils_DoubleReflector_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_common_jato_utils_DoubleReflector_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(15568);
        try {
            f32982a = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            f32983b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f32984c = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            f32985d = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static Class<?> m24352a(String str) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29 && (method = f32985d) != null) {
            Class<?> cls = (Class) m24353a(method, (Object) null, new Object[]{str});
            if (cls != null) {
                return cls;
            }
        }
        return Class.forName(str);
    }

    /* renamed from: a */
    public static Constructor m24354a(Class<?> cls, Class<?>... clsArr) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29 && (method = f32984c) != null) {
            Constructor constructor = (Constructor) m24353a(method, cls, new Object[]{clsArr});
            if (constructor != null) {
                return constructor;
            }
        }
        return cls.getDeclaredConstructor(clsArr);
    }

    /* renamed from: a */
    public static Method m24355a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29 && (method = f32983b) != null) {
            Method method2 = (Method) m24353a(method, cls, new Object[]{str, clsArr});
            if (method2 != null) {
                return method2;
            }
        }
        return cls.getDeclaredMethod(str, clsArr);
    }
}
