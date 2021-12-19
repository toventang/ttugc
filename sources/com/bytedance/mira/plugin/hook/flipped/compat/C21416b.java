package com.bytedance.mira.plugin.hook.flipped.compat;

import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.mira.plugin.hook.flipped.compat.b */
public final class C21416b implements AbstractC21417c {
    static {
        Covode.recordClassIndex(25037);
    }

    /* renamed from: a */
    private static Object m40199a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_mira_plugin_hook_flipped_compat_FlippedV1Impl_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_mira_plugin_hook_flipped_compat_FlippedV1Impl_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.bytedance.mira.plugin.hook.flipped.compat.AbstractC21417c
    /* renamed from: a */
    public final void mo35017a() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method method = (Method) declaredMethod.invoke(cls, "getRuntime", new Class[0]);
            method.setAccessible(true);
            Object a = m40199a(method, null, new Object[0]);
            Method method2 = (Method) declaredMethod.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            method2.setAccessible(true);
            m40199a(method2, a, new Object[]{new String[]{"L"}});
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }
}
