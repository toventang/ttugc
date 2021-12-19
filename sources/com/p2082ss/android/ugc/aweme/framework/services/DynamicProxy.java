package com.p2082ss.android.ugc.aweme.framework.services;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.ss.android.ugc.aweme.framework.services.DynamicProxy */
public class DynamicProxy {
    static {
        Covode.recordClassIndex(60660);
    }

    public static <T> T get(Class<?> cls) {
        if (cls == null || !cls.isInterface()) {
            return null;
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            /* class com.p2082ss.android.ugc.aweme.framework.services.DynamicProxy.C514311 */

            static {
                Covode.recordClassIndex(60661);
            }

            /* renamed from: com_ss_android_ugc_aweme_framework_services_DynamicProxy$1_java_lang_reflect_Method_invoke */
            private static Object m95813x19e2bfa6(Method method, Object obj, Object[] objArr) {
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_framework_services_DynamicProxy$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    return a.second;
                }
                Object invoke = method.invoke(obj, objArr);
                C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_framework_services_DynamicProxy$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return invoke;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return m95813x19e2bfa6(method, this, objArr);
                }
                Class<?> returnType = method.getReturnType();
                if (returnType.isPrimitive()) {
                    return Defaults.defaultValue(returnType);
                }
                return method.getDefaultValue();
            }
        });
    }
}
