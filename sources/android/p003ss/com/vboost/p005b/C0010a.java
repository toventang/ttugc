package android.p003ss.com.vboost.p005b;

import android.os.Build;
import android.p003ss.com.vboost.p008e.C0061b;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: android.ss.com.vboost.b.a */
class C0010a {

    /* renamed from: a */
    static boolean f41a;

    /* renamed from: b */
    private static Class<?> f42b;

    /* renamed from: c */
    private static Method f43c;

    /* renamed from: d */
    private static Object f44d;

    static {
        Covode.recordClassIndex(13);
    }

    /* renamed from: a */
    private static Object m14a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "android_ss_com_vboost_hardware_CHRYBoostFramework_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "android_ss_com_vboost_hardware_CHRYBoostFramework_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    C0010a() {
        synchronized (C0010a.class) {
            if (!f41a) {
                try {
                    if (Build.VERSION.SDK_INT == 29) {
                        f42b = C0061b.m98a("android.scrollerboostmanager.ScrollerBoostManager");
                        f43c = C0061b.m101a(f42b, "listFling", Integer.TYPE);
                    } else if (Build.VERSION.SDK_INT == 28 || Build.VERSION.SDK_INT == 27 || Build.VERSION.SDK_INT == 26) {
                        Class<?> a = C0061b.m98a("android.iawareperf.UniPerf");
                        f42b = a;
                        f43c = C0061b.m101a(a, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                    }
                } catch (Exception unused) {
                }
            }
        }
        try {
            if (f42b == null) {
                return;
            }
            if (Build.VERSION.SDK_INT == 29) {
                f44d = m14a(C0061b.m101a(f42b, "getInstance", new Class[0]), f42b, new Object[0]);
                m14a(C0061b.m101a(f42b, "init", new Class[0]), f44d, new Object[0]);
                f41a = true;
            } else if (Build.VERSION.SDK_INT == 28 || Build.VERSION.SDK_INT == 27 || Build.VERSION.SDK_INT == 26) {
                f44d = m14a(C0061b.m101a(f42b, "getInstance", new Class[0]), null, new Object[0]);
                f41a = true;
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    static int m13a(long j) {
        try {
            if (Build.VERSION.SDK_INT == 29) {
                m14a(f43c, f44d, new Object[]{Integer.valueOf((int) j)});
                return -1;
            } else if (Build.VERSION.SDK_INT != 28 && Build.VERSION.SDK_INT != 27 && Build.VERSION.SDK_INT != 26) {
                return -1;
            } else {
                return ((Integer) m14a(f43c, f44d, new Object[]{4099, "canBoost=true|screenOn=1", new int[0]})).intValue();
            }
        } catch (Throwable th) {
            th.getMessage();
            return -1;
        }
    }
}
