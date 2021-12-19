package com.bytedance.monitor.p1546a.p1550c;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.monitor.a.c.a */
public final class C21455a {

    /* renamed from: a */
    static C21455a f50859a;

    static {
        Covode.recordClassIndex(25078);
    }

    C21455a() {
    }

    /* renamed from: a */
    public static Method m40298a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Object m40297a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_monitor_util_unsafe_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_monitor_util_unsafe_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
