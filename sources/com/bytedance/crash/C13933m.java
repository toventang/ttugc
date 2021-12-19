package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13868e;
import com.bytedance.crash.runtime.C14004d;
import com.bytedance.crash.runtime.C14010h;
import com.bytedance.crash.runtime.C14031r;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.crash.util.C14062n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.m */
public final class C13933m {

    /* renamed from: a */
    public static Context f33936a;

    /* renamed from: b */
    public static Application f33937b;

    /* renamed from: c */
    public static long f33938c;

    /* renamed from: d */
    public static long f33939d;

    /* renamed from: e */
    public static String f33940e = "default";

    /* renamed from: f */
    public static boolean f33941f;

    /* renamed from: g */
    public static final ConfigManager f33942g = new ConfigManager();

    /* renamed from: h */
    public static final C13814a f33943h = new C13814a();

    /* renamed from: i */
    public static volatile ConcurrentHashMap<Integer, String> f33944i;

    /* renamed from: j */
    public static final JSONObject f33945j = new JSONObject();

    /* renamed from: k */
    public static volatile int f33946k;

    /* renamed from: l */
    public static volatile String f33947l;

    /* renamed from: m */
    static long f33948m = 0;

    /* renamed from: n */
    private static C14004d f33949n;

    /* renamed from: o */
    private static C14031r f33950o;

    /* renamed from: p */
    private static volatile String f33951p;

    /* renamed from: q */
    private static final Object f33952q = new Object();

    /* renamed from: r */
    private static boolean f33953r = false;

    /* renamed from: s */
    private static String f33954s;

    /* renamed from: a */
    public static C14004d m25221a() {
        if (f33949n == null) {
            f33949n = C14010h.m25403a(f33936a);
        }
        return f33949n;
    }

    /* renamed from: c */
    public static boolean m25227c() {
        return m25232h().contains("test_crash");
    }

    /* renamed from: h */
    private static String m25232h() {
        Object obj = m25221a().mo22518a().get("channel");
        if (obj == null) {
            return "unknown";
        }
        return String.valueOf(obj);
    }

    static {
        Covode.recordClassIndex(15993);
    }

    /* renamed from: b */
    public static C14031r m25226b() {
        MethodCollector.m26663i(1731);
        if (f33950o == null) {
            synchronized (C13933m.class) {
                try {
                    f33950o = new C14031r();
                } catch (Throwable th) {
                    MethodCollector.m26664o(1731);
                    throw th;
                }
            }
        }
        C14031r rVar = f33950o;
        MethodCollector.m26664o(1731);
        return rVar;
    }

    /* renamed from: d */
    public static String m25228d() {
        return m25229e() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    /* renamed from: e */
    public static String m25229e() {
        MethodCollector.m26663i(1816);
        if (f33951p == null) {
            synchronized (f33952q) {
                try {
                    if (f33951p == null) {
                        f33951p = m25230f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1816);
                    throw th;
                }
            }
        }
        String str = f33951p;
        MethodCollector.m26664o(1816);
        return str;
    }

    /* renamed from: f */
    public static String m25230f() {
        return Long.toHexString(new Random().nextLong()) + '-' + f33938c + '-' + Process.myPid() + "G";
    }

    /* renamed from: g */
    public static String m25231g() {
        MethodCollector.m26663i(1845);
        if (f33954s == null) {
            synchronized (C13933m.class) {
                try {
                    if (f33954s == null) {
                        f33954s = C13868e.m25094d().optString("bytrace_id_prefix", String.valueOf(UUID.randomUUID())) + "-" + Process.myPid();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1845);
                    throw th;
                }
            }
        }
        String str = f33954s;
        MethodCollector.m26664o(1845);
        return str;
    }

    /* renamed from: a */
    public static void m25225a(String str, String str2) {
        C14062n.m25593a(f33945j, str, str2);
    }

    /* renamed from: a */
    public static void m25223a(Application application, Context context) {
        if (f33937b == null || f33936a == null) {
            f33938c = System.currentTimeMillis();
            f33939d = SystemClock.uptimeMillis();
            f33936a = context;
            f33937b = application;
            f33951p = m25229e();
        }
    }

    /* renamed from: a */
    static void m25224a(Application application, Context context, ICommonParams iCommonParams) {
        if (!f33953r) {
            m25223a(application, context);
            f33949n = new C14004d(f33936a, iCommonParams, m25221a());
            f33953r = true;
        }
    }

    /* renamed from: a */
    public static String m25222a(long j, CrashType crashType, boolean z, boolean z2) {
        String str;
        StringBuilder append = new StringBuilder().append(j).append("_").append(crashType.getName()).append('_').append(m25229e()).append('_');
        String str2 = "normal_";
        if (z) {
            str = "oom_";
        } else {
            str = str2;
        }
        StringBuilder append2 = append.append(str).append(f33938c).append('_');
        if (z2) {
            str2 = "ignore_";
        }
        return append2.append(str2).append(Long.toHexString(new Random().nextLong())).append("G").toString();
    }
}
