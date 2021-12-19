package com.bytedance.mira.plugin.hook.flipped.compat;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.lang.reflect.Method;

public class FlippedV2Impl implements AbstractC21417c {
    /* renamed from: a */
    private static Object m40196a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_mira_plugin_hook_flipped_compat_FlippedV2Impl_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_mira_plugin_hook_flipped_compat_FlippedV2Impl_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private native Method getDeclaredMethod(Object obj, String str, Class<?>[] clsArr);

    static {
        Covode.recordClassIndex(25035);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a("flipped", false, (Context) null);
        C58032m.m104852a(uptimeMillis, "flipped");
    }

    @Override // com.bytedance.mira.plugin.hook.flipped.compat.AbstractC21417c
    /* renamed from: a */
    public final void mo35017a() {
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = getDeclaredMethod(cls, "getRuntime", new Class[0]);
            declaredMethod.setAccessible(true);
            Object a = m40196a(declaredMethod, null, new Object[0]);
            Method declaredMethod2 = getDeclaredMethod(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            declaredMethod2.setAccessible(true);
            m40196a(declaredMethod2, a, new Object[]{new String[]{"L"}});
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }
}
