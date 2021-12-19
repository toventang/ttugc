package com.bytedance.android.monitor.p714l;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.monitor.l.h */
public final class C11954h {
    static {
        Covode.recordClassIndex(13680);
    }

    /* renamed from: a */
    private static Object m21112a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitor_util_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitor_util_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    public static Object m21111a(Class<?> cls, String str, Object... objArr) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            Object[] objArr2 = new Object[0];
            try {
                Method a = m21113a(cls, str, (Class<?>[]) new Class[0]);
                if (a == null) {
                    return null;
                }
                a.setAccessible(true);
                if (objArr.length > 0) {
                    return m21112a(a, objArr[0], objArr2);
                }
                return m21112a(a, (Object) null, objArr2);
            } catch (Throwable th) {
                C11937b.m21064c("ReflectUtils", "exception in invokeMethod, pkg : " + cls.getName() + ", function : " + str + ", " + th.toString());
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Method m21113a(Class<?> cls, String str, Class<?>[] clsArr) {
        Method method = null;
        if (cls == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            method = cls.getMethod(str, clsArr);
            return method;
        } catch (Throwable unused) {
            return method;
        }
    }
}
