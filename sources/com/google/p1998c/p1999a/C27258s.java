package com.google.p1998c.p1999a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.c.a.s */
public final class C27258s {

    /* renamed from: a */
    public static final Object f64419a;

    /* renamed from: b */
    public static final Method f64420b;

    /* renamed from: c */
    public static final Method f64421c;

    /* renamed from: a */
    private static Object m54264a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Method a;
        Covode.recordClassIndex(32838);
        Object a2 = m54264a();
        f64419a = a2;
        Method method = null;
        if (a2 == null) {
            a = null;
        } else {
            a = m54265a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f64420b = a;
        if (a2 != null) {
            method = m54269b();
        }
        f64421c = method;
    }

    /* renamed from: b */
    private static Method m54269b() {
        try {
            Method a = m54265a("getStackTraceDepth", Throwable.class);
            if (a == null) {
                return null;
            }
            Object a2 = m54264a();
            Object[] objArr = {new Throwable()};
            Pair<Boolean, Object> a3 = C15346a.m28238a(a, new Object[]{a2, objArr}, 110000, "java.lang.Object", true, "com_google_common_base_Throwables_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a3.first).booleanValue()) {
                Object obj = a3.second;
            } else {
                C15346a.m28242a(a.invoke(a2, objArr), a, new Object[]{a2, objArr}, "com_google_common_base_Throwables_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            return a;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m54268b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static void m54266a(Throwable th) {
        C27245k.m54229a(th);
        if (th instanceof RuntimeException) {
            throw th;
        } else if (th instanceof Error) {
            throw th;
        }
    }

    /* renamed from: a */
    private static Method m54265a(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <X extends Throwable> void m54267a(Throwable th, Class<X> cls) {
        if (th != null) {
            C27245k.m54229a(th);
            if (!cls.isInstance(th)) {
                m54266a(th);
                return;
            }
            throw cls.cast(th);
        }
    }
}
