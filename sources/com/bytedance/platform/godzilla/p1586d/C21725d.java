package com.bytedance.platform.godzilla.p1586d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.godzilla.d.d */
public final class C21725d {

    /* renamed from: a */
    private static Map<String, Method> f51496a = new HashMap();

    /* renamed from: b */
    private static final HashMap<Class<?>, Class<?>> f51497b;

    static {
        Covode.recordClassIndex(25366);
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f51497b = hashMap;
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
    public static Object m40687a(Class cls, String str, Object... objArr) {
        Object[] b = C21723b.m40686b(objArr);
        return m40688a(cls, str, b, C21723b.m40685a(b));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x00be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010b A[LOOP:1: B:19:0x006e->B:73:0x010b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0104 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method m40689a(java.lang.Class<?> r13, java.lang.String r14, java.lang.Class... r15) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.godzilla.p1586d.C21725d.m40689a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private static Object m40688a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            clsArr = C21723b.f51493b;
        }
        Object[] b = C21723b.m40686b(objArr);
        Method a = m40689a((Class<?>) cls, str, (Class[]) clsArr);
        if (a == null) {
            return null;
        }
        Pair<Boolean, Object> a2 = C15346a.m28238a(a, new Object[]{null, b}, 110000, "java.lang.Object", true, "com_bytedance_platform_godzilla_utils_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = a.invoke(null, b);
        C15346a.m28242a(invoke, a, new Object[]{null, b}, "com_bytedance_platform_godzilla_utils_MethodUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }
}
