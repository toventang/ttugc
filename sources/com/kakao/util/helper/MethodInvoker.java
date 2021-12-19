package com.kakao.util.helper;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

public final class MethodInvoker {
    static {
        Covode.recordClassIndex(34059);
    }

    /* renamed from: com_kakao_util_helper_MethodInvoker_java_lang_reflect_Method_invoke */
    private static Object m56186xf4f988ac(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_kakao_util_helper_MethodInvoker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_kakao_util_helper_MethodInvoker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private static Method findMethod(String str, Method[] methodArr) {
        for (Method method : methodArr) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static void invoke(Object obj, String str, Object... objArr) {
        Method findMethod;
        if (obj != null) {
            for (Class<?> cls = obj.getClass(); !cls.equals(Object.class); cls = cls.getSuperclass()) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                if (declaredMethods != null && (findMethod = findMethod(str, declaredMethods)) != null) {
                    m56186xf4f988ac(findMethod, obj, objArr);
                    return;
                }
            }
            return;
        }
        throw new RuntimeException("methodOwnerClass is null.");
    }
}
