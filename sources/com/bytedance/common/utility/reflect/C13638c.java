package com.bytedance.common.utility.reflect;

import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.utility.reflect.c */
public final class C13638c {
    static {
        Covode.recordClassIndex(15666);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method m24546a(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>[] r4) {
        /*
            r1 = 0
            if (r2 == 0) goto L_0x0009
            boolean r0 = com.bytedance.common.utility.C13627m.m24498a(r3)
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            return r1
        L_0x000a:
            java.lang.reflect.Method r1 = r2.getMethod(r3, r4)     // Catch:{ all -> 0x000f }
            goto L_0x0009
        L_0x000f:
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r3, r4)     // Catch:{ all -> 0x0009 }
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.C13638c.m24546a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    public static Object m24545a(Class<?> cls, String str, Object... objArr) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        Object[] objArr2 = new Object[0];
        try {
            Method a = m24546a(cls, str, (Class<?>[]) new Class[0]);
            if (a == null) {
                return null;
            }
            a.setAccessible(true);
            Object obj = objArr[0];
            Pair<Boolean, Object> a2 = C15346a.m28238a(a, new Object[]{obj, objArr2}, 110000, "java.lang.Object", true, "com_bytedance_common_utility_reflect_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = a.invoke(obj, objArr2);
            C15346a.m28242a(invoke, a, new Object[]{obj, objArr2}, "com_bytedance_common_utility_reflect_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (Throwable unused) {
            return null;
        }
    }
}
