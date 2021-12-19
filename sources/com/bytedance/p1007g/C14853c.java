package com.bytedance.p1007g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1007g.p1010c.C14855a;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;

/* renamed from: com.bytedance.g.c */
public final class C14853c {

    /* renamed from: a */
    public static AbstractC14865j f36264a;

    /* renamed from: b */
    public static volatile C14845b f36265b;

    /* renamed from: c */
    public static volatile Future f36266c;

    /* renamed from: d */
    public static volatile boolean f36267d = false;

    /* renamed from: e */
    public static Object f36268e = new Object();

    /* renamed from: f */
    public static Map<String, String> f36269f = new ConcurrentHashMap();

    /* renamed from: g */
    public static Set<String> f36270g = new ConcurrentSkipListSet();

    /* renamed from: h */
    private static final Map<String, Object> f36271h = new ConcurrentHashMap();

    /* renamed from: i */
    private static boolean f36272i = false;

    /* renamed from: j */
    private static AbstractC14861f f36273j;

    /* renamed from: k */
    private static boolean f36274k = false;

    /* renamed from: l */
    private static final Map<String, String> f36275l = new ConcurrentHashMap();

    /* renamed from: b */
    public static void m27281b() {
        m27282c();
        f36265b.mo23883b();
    }

    static {
        Covode.recordClassIndex(16954);
    }

    /* renamed from: a */
    public static boolean m27279a() {
        m27282c();
        C14845b bVar = f36265b;
        if (bVar.f36241a == null || bVar.f36241a.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static void m27282c() {
        MethodCollector.m26663i(4833);
        if (!f36267d && f36272i) {
            synchronized (f36268e) {
                try {
                    if (!f36267d) {
                        try {
                            f36268e.wait(10000);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4833);
                    throw th;
                }
            }
        }
        if (f36266c != null) {
            try {
                f36266c.get();
                MethodCollector.m26664o(4833);
            } catch (Exception e) {
                RuntimeException runtimeException = new RuntimeException(e);
                MethodCollector.m26664o(4833);
                throw runtimeException;
            }
        } else {
            RuntimeException runtimeException2 = new RuntimeException("ExperimentManager has not been init");
            MethodCollector.m26664o(4833);
            throw runtimeException2;
        }
    }

    /* renamed from: a */
    private static String m27278a(String str) {
        m27282c();
        C14859e eVar = f36265b.f36242b;
        if (!TextUtils.isEmpty(str)) {
            String str2 = eVar.f36297e.get(str);
            if (TextUtils.isEmpty(str2)) {
                for (Map<String, String> map : eVar.f36298f.values()) {
                    String str3 = map.get(str);
                    if (!TextUtils.isEmpty(str3)) {
                        return str3;
                    }
                }
            } else if (eVar.f36294b.contains(str2)) {
                return str2;
            } else {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static <T> T m27276a(String str, Type type, T t, boolean z) {
        return (T) m27280b(str, type, t, false, z, null);
    }

    /* renamed from: a */
    private static <T> T m27275a(String str, T t, boolean z, String str2) {
        if (z && t != null) {
            f36271h.put(str, t);
        }
        f36275l.put(str, str2);
        if (f36273j != null) {
            m27278a(str);
        }
        return t;
    }

    /* renamed from: a */
    public static <T> T m27277a(String str, Type type, T t, boolean z, boolean z2, C14855a<T> aVar) {
        return (T) m27280b(str, type, t, z, z2, aVar);
    }

    /* renamed from: b */
    private static <T> T m27280b(String str, Type type, T t, boolean z, boolean z2, C14855a<T> aVar) {
        Object a;
        Object a2;
        Object a3;
        Object a4;
        m27282c();
        if (z) {
            Map<String, Object> map = f36271h;
            if (map.containsKey(str) && map.get(str).getClass() == type) {
                if (z2) {
                    try {
                        C14845b bVar = f36265b;
                        Runnable runnable = bVar.f36243c.get(str);
                        if (runnable != null) {
                            bVar.f36243c.remove(str);
                            runnable.run();
                        }
                    } catch (Exception unused) {
                    }
                }
                return (T) m27275a(str, map.get(str), z, "sticky");
            }
        }
        if (C14857d.f36292a == null) {
            a = null;
        } else {
            a = C14857d.f36292a.mo23891a();
        }
        if (a != null) {
            return (T) m27275a(str, a, z, "panel");
        }
        if (f36274k && (a4 = f36265b.mo23881a(str, type, z2)) != null) {
            return (T) m27275a(str, a4, z, "libra");
        }
        AbstractC14865j jVar = f36264a;
        if (jVar != null && (a3 = jVar.mo23899a(str, type)) != null) {
            return (T) m27275a(str, a3, z, "setting");
        }
        if (!f36274k && (a2 = f36265b.mo23881a(str, type, z2)) != null) {
            return (T) m27275a(str, a2, z, "libra");
        }
        Object a5 = f36265b.mo23880a(str, aVar, z2);
        return a5 != null ? (T) m27275a(str, a5, z, "client") : (T) m27275a(str, t, z, "default");
    }
}
