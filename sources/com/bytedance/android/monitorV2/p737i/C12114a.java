package com.bytedance.android.monitorV2.p737i;

import android.util.Pair;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.p740l.C12133i;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.monitorV2.i.a */
public final class C12114a {

    /* renamed from: a */
    private static final HashMap<String, Method> f29131a = new HashMap<>();

    /* renamed from: b */
    private static boolean f29132b = false;

    /* renamed from: a */
    private static Object m21571a(Method method, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitorV2_logger_ALogUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(null, objArr);
        C15346a.m28242a(invoke, method, new Object[]{null, objArr}, "com_bytedance_android_monitorV2_logger_ALogUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(13843);
    }

    /* renamed from: a */
    private static boolean m21573a() {
        if (f29132b) {
            return true;
        }
        try {
            Method a = C12133i.m21665a(Class.forName("com.ss.android.agilelogger.ALog"), "isInitSuccess", (Class<?>[]) null);
            a.setAccessible(true);
            f29132b = ((Boolean) m21571a(a, (Object[]) null)).booleanValue();
        } catch (ClassNotFoundException unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
        return f29132b;
    }

    /* renamed from: a */
    private static Method m21572a(String str) {
        HashMap<String, Method> hashMap = f29131a;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        Method b = m21576b(str);
        hashMap.put(str, b);
        return b;
    }

    /* renamed from: b */
    private static Method m21576b(String str) {
        try {
            return C12133i.m21665a(Class.forName("com.ss.android.agilelogger.ALog"), str, (Class<?>[]) new Class[]{String.class, String.class});
        } catch (ClassNotFoundException unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    /* renamed from: a */
    static boolean m21574a(String str, String str2) {
        return m21575a(m21572a("d"), str, str2);
    }

    /* renamed from: b */
    static boolean m21577b(String str, String str2) {
        return m21575a(m21572a("i"), str, str2);
    }

    /* renamed from: c */
    static boolean m21578c(String str, String str2) {
        return m21575a(m21572a("e"), str, str2);
    }

    /* renamed from: a */
    private static boolean m21575a(Method method, String str, String str2) {
        if (m21573a() && method != null) {
            try {
                m21571a(method, new Object[]{str, str2});
                return true;
            } catch (Throwable unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }
        return false;
    }
}
