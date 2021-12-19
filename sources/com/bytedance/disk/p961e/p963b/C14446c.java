package com.bytedance.disk.p961e.p963b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.disk.e.b.c */
public final class C14446c {
    static {
        Covode.recordClassIndex(16525);
    }

    /* renamed from: com.bytedance.disk.e.b.c$a */
    public static class C14447a<T> {

        /* renamed from: a */
        Method f34948a;

        static {
            Covode.recordClassIndex(16526);
        }

        /* renamed from: a */
        public final T mo23274a(Object obj, Object[] objArr) {
            try {
                Method method = this.f34948a;
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_disk_migrateapi_utils_RefUtils$MethodRef_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    return (T) a.second;
                }
                T t = (T) method.invoke(obj, objArr);
                C15346a.m28242a(t, method, new Object[]{obj, objArr}, "com_bytedance_disk_migrateapi_utils_RefUtils$MethodRef_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return t;
            } catch (Exception unused) {
                return null;
            }
        }

        public C14447a(String str, String str2, Class[] clsArr) {
            try {
                this.f34948a = C14446c.m26381a(Class.forName(str), str2, clsArr);
            } catch (Exception unused) {
            }
            Method method = this.f34948a;
            if (method != null) {
                method.setAccessible(true);
            }
        }
    }

    /* renamed from: a */
    public static Method m26381a(Class cls, String str, Class[] clsArr) {
        if (!(cls == null || str == null)) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }
}
