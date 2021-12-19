package com.bytedance.p1746v.p1747a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.v.a.c */
public final class C23536c {
    static {
        Covode.recordClassIndex(27572);
    }

    /* renamed from: com.bytedance.v.a.c$a */
    public static class C23537a<T> {

        /* renamed from: a */
        Method f55762a;

        static {
            Covode.recordClassIndex(27573);
        }

        /* renamed from: a */
        public final T mo38338a(Object[] objArr) {
            try {
                Method method = this.f55762a;
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_bytedance_storagehandlerapi_utils_RefUtils$MethodRef_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    return (T) a.second;
                }
                T t = (T) method.invoke(null, objArr);
                C15346a.m28242a(t, method, new Object[]{null, objArr}, "com_bytedance_storagehandlerapi_utils_RefUtils$MethodRef_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return t;
            } catch (Exception unused) {
                return null;
            }
        }

        public C23537a(String str, String str2, Class[] clsArr) {
            try {
                this.f55762a = C23536c.m44244a(Class.forName(str), str2, clsArr);
            } catch (Exception unused) {
            }
            Method method = this.f55762a;
            if (method != null) {
                method.setAccessible(true);
            }
        }
    }

    /* renamed from: a */
    public static Method m44244a(Class cls, String str, Class[] clsArr) {
        if (!(cls == null || str == null)) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }
}
