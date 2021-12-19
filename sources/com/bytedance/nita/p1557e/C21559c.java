package com.bytedance.nita.p1557e;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.nita.e.c */
public final class C21559c {

    /* renamed from: a */
    private static Method f51162a;

    static {
        Covode.recordClassIndex(25200);
    }

    /* renamed from: a */
    public static <T> T m40494a(Object obj, String str) {
        Object invoke;
        try {
            if (f51162a == null) {
                f51162a = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            }
            Method method = f51162a;
            Class<?> cls = obj.getClass();
            Object[] objArr = {str};
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{cls, objArr}, 110000, "java.lang.Object", true, "com_bytedance_nita_utils_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                invoke = a.second;
            } else {
                invoke = method.invoke(cls, objArr);
                C15346a.m28242a(invoke, method, new Object[]{cls, objArr}, "com_bytedance_nita_utils_ReflectUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            Field field = (Field) invoke;
            field.setAccessible(true);
            return (T) field.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
