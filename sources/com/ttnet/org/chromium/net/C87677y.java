package com.ttnet.org.chromium.net;

import android.net.TrafficStats;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ttnet.org.chromium.net.y */
public final class C87677y {

    /* renamed from: a */
    private static final Method f199167a;

    /* renamed from: b */
    private static final Method f199168b;

    /* renamed from: a */
    private static Object m152572a(Method method, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_ttnet_org_chromium_net_ThreadStatsUid_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(null, objArr);
        C15346a.m28242a(invoke, method, new Object[]{null, objArr}, "com_ttnet_org_chromium_net_ThreadStatsUid_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    public static void m152573a() {
        try {
            m152572a(f199168b, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e2);
        }
    }

    static {
        Covode.recordClassIndex(103660);
        try {
            f199167a = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            f199168b = TrafficStats.class.getMethod("clearThreadStatsUid", new Class[0]);
        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("Unable to get TrafficStats methods", e);
        }
    }

    /* renamed from: a */
    public static void m152574a(int i) {
        try {
            m152572a(f199167a, new Object[]{Integer.valueOf(i)});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e2);
        }
    }
}
