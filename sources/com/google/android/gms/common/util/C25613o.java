package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.google.android.gms.common.p1938c.C25499b;
import com.google.android.gms.common.p1938c.C25500c;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.common.util.o */
public final class C25613o {

    /* renamed from: a */
    private static final int f60725a = Process.myUid();

    /* renamed from: b */
    private static final Method f60726b = m49436a();

    /* renamed from: c */
    private static final Method f60727c = m49438b();

    /* renamed from: d */
    private static final Method f60728d = m49439c();

    /* renamed from: e */
    private static final Method f60729e = m49440d();

    /* renamed from: f */
    private static final Method f60730f = m49441e();

    /* renamed from: g */
    private static final Method f60731g = m49442f();

    /* renamed from: h */
    private static final Method f60732h = m49443g();

    /* renamed from: a */
    private static Object m49434a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_google_android_gms_common_util_WorkSourceUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_google_android_gms_common_util_WorkSourceUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: c */
    private static Method m49439c() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Method m49438b() {
        if (C25609k.m49419a()) {
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private static Method m49440d() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m49441e() {
        if (C25609k.m49419a()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static final Method m49442f() {
        if (C25609k.m49424f()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    static {
        Covode.recordClassIndex(31023);
    }

    /* renamed from: g */
    private static final Method m49443g() {
        if (C25609k.m49424f()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Method m49436a() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m49431a(WorkSource workSource) {
        Method method = f60728d;
        if (method != null) {
            try {
                return ((Integer) m49434a(method, workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m49437a(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        C25499b a = C25500c.f60481a.mo41741a(context);
        if (a.f60480a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static WorkSource m49432a(int i, String str) {
        WorkSource workSource = new WorkSource();
        Method method = f60727c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                m49434a(method, workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = f60726b;
            if (method2 != null) {
                try {
                    m49434a(method2, workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
        return workSource;
    }

    /* renamed from: a */
    public static WorkSource m49433a(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo a = C25500c.f60481a.mo41741a(context).mo41737a(str, 0);
                if (a != null) {
                    return m49432a(a.uid, str);
                }
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Could not get applicationInfo from package: ".concat(valueOf);
                } else {
                    new String("Could not get applicationInfo from package: ");
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    "Could not find package: ".concat(valueOf2);
                } else {
                    new String("Could not find package: ");
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m49435a(WorkSource workSource, int i) {
        Method method = f60730f;
        if (method == null) {
            return null;
        }
        try {
            return (String) m49434a(method, workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }
}
