package android.p003ss.com.vboost.p008e;

import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: android.ss.com.vboost.e.b */
public final class C0061b {

    /* renamed from: a */
    private static Method f220a;

    /* renamed from: b */
    private static Method f221b;

    /* renamed from: c */
    private static Method f222c;

    /* renamed from: d */
    private static Method f223d;

    /* renamed from: a */
    private static Object m99a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "android_ss_com_vboost_utils_DoubleReflector_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "android_ss_com_vboost_utils_DoubleReflector_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(64);
        try {
            f220a = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            f221b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f222c = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            f223d = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static Class<?> m98a(String str) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29 && (method = f223d) != null) {
            Class<?> cls = (Class) m99a(method, (Object) null, new Object[]{str});
            if (cls != null) {
                return cls;
            }
        }
        return Class.forName(str);
    }

    /* renamed from: a */
    public static Constructor m100a(Class<?> cls, Class<?>... clsArr) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29 && (method = f222c) != null) {
            Constructor constructor = (Constructor) m99a(method, cls, new Object[]{clsArr});
            if (constructor != null) {
                return constructor;
            }
        }
        return cls.getDeclaredConstructor(clsArr);
    }

    /* renamed from: a */
    public static Method m101a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29 && (method = f221b) != null) {
            Method method2 = (Method) m99a(method, cls, new Object[]{str, clsArr});
            if (method2 != null) {
                return method2;
            }
        }
        return cls.getDeclaredMethod(str, clsArr);
    }
}
