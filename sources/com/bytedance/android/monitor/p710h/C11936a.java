package com.bytedance.android.monitor.p710h;

import android.util.Pair;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p714l.C11954h;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.monitor.h.a */
public final class C11936a {

    /* renamed from: a */
    private static final HashMap<String, Method> f28556a = new HashMap<>();

    /* renamed from: b */
    private static boolean f28557b = false;

    /* renamed from: a */
    private static Object m21053a(Method method, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitor_logger_ALogUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(null, objArr);
        C15346a.m28242a(invoke, method, new Object[]{null, objArr}, "com_bytedance_android_monitor_logger_ALogUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(13662);
    }

    /* renamed from: a */
    private static boolean m21055a() {
        if (f28557b) {
            return true;
        }
        try {
            Method a = C11954h.m21113a(Class.forName("com.ss.android.agilelogger.ALog"), "isInitSuccess", (Class<?>[]) null);
            a.setAccessible(true);
            f28557b = ((Boolean) m21053a(a, (Object[]) null)).booleanValue();
        } catch (ClassNotFoundException unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
        return f28557b;
    }

    /* renamed from: a */
    static Method m21054a(String str) {
        HashMap<String, Method> hashMap = f28556a;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        Method b = m21058b(str);
        hashMap.put(str, b);
        return b;
    }

    /* renamed from: b */
    private static Method m21058b(String str) {
        try {
            return C11954h.m21113a(Class.forName("com.ss.android.agilelogger.ALog"), str, (Class<?>[]) new Class[]{String.class, String.class});
        } catch (ClassNotFoundException unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    /* renamed from: a */
    static boolean m21056a(String str, String str2) {
        return m21057a(m21054a("i"), str, str2);
    }

    /* renamed from: b */
    static boolean m21059b(String str, String str2) {
        return m21057a(m21054a("e"), str, str2);
    }

    /* renamed from: a */
    static boolean m21057a(Method method, String str, String str2) {
        if (m21055a() && method != null) {
            try {
                m21053a(method, new Object[]{str, str2});
                return true;
            } catch (Throwable unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        }
        return false;
    }
}
