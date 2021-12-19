package com.bytedance.platform.p1565a.p1566a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.a.a.h */
public final class C21633h {

    /* renamed from: a */
    private static Map<String, Method> f51322a = new HashMap();

    /* renamed from: b */
    private static final HashMap<Class<?>, Class<?>> f51323b;

    static {
        Covode.recordClassIndex(25274);
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f51323b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
    }

    /* renamed from: a */
    public static Object m40584a(Class cls, String str, Object... objArr) {
        Object[] b = C21628e.m40581b(objArr);
        return m40585a(cls, str, b, C21628e.m40580a(b));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method m40586a(java.lang.Class<?> r13, java.lang.String r14, java.lang.Class... r15) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.p1565a.p1566a.C21633h.m40586a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private static Object m40585a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            clsArr = C21628e.f51317b;
        }
        Object[] b = C21628e.m40581b(objArr);
        Method a = m40586a((Class<?>) cls, str, (Class[]) clsArr);
        if (a == null) {
            return null;
        }
        Pair<Boolean, Object> a2 = C15346a.m28238a(a, new Object[]{null, b}, 110000, "java.lang.Object", true, "com_bytedance_platform_horae_common_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = a.invoke(null, b);
        C15346a.m28242a(invoke, a, new Object[]{null, b}, "com_bytedance_platform_horae_common_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }
}
