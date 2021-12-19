package com.p2082ss.android.message.p2159a;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.net.p3488a.C61304a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.message.a.a */
public final class C30062a {

    /* renamed from: a */
    public static String f71750a;

    /* renamed from: b */
    public static String f71751b = ":push";

    /* renamed from: c */
    public static String f71752c = ":pushservice";

    /* renamed from: d */
    public static Boolean f71753d;

    /* renamed from: e */
    public static boolean f71754e;

    /* renamed from: f */
    public static boolean f71755f;

    static {
        Covode.recordClassIndex(36557);
    }

    /* renamed from: c */
    private static String m60808c() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C61304a.m110982a().mo98933a("ro.build.version.emui");
        }
        return m60810d();
    }

    /* renamed from: e */
    private static boolean m60811e() {
        if (!f71755f) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f71754e = true;
                    f71755f = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f71755f = true;
        }
        return f71754e;
    }

    /* renamed from: b */
    private static boolean m60807b() {
        try {
            if ((C13627m.m24498a(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("huawei")) && (C13627m.m24498a(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith("huawei"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static String m60810d() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033 A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067 A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[Catch:{ all -> 0x00aa }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m60800a() {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.message.p2159a.C30062a.m60800a():java.lang.String");
    }

    /* renamed from: c */
    public static String m60809c(Context context) {
        try {
            ComponentName resolveActivity = C29843f.m60127a(context, context.getPackageName()).resolveActivity(context.getPackageManager());
            if (resolveActivity != null) {
                return resolveActivity.getClassName();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static int m60805b(Context context) {
        if (context == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                if (((Boolean) Reflect.m24529on((NotificationManager) m60806b(context, "notification")).call("areNotificationsEnabled").get()).booleanValue()) {
                    return 1;
                }
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) m60806b(context, "appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            String packageName = applicationContext.getPackageName();
            int i = applicationInfo.uid;
            Reflect on = Reflect.m24529on(appOpsManager);
            int intValue = ((Integer) on.field("OP_POST_NOTIFICATION", Integer.TYPE).get()).intValue();
            if (((Integer) on.call("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(intValue), Integer.valueOf(i), packageName).get()).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m60803a(Context context) {
        Boolean bool = f71753d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String b = C29843f.m60132b(context);
        boolean z = false;
        if (b != null) {
            if (b.contains(":")) {
                return false;
            }
            if (b.equals(context.getPackageName())) {
                z = true;
            }
        }
        Boolean valueOf = Boolean.valueOf(z);
        f71753d = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    public static boolean m60804a(Context context, String str) {
        if (context == null || C13627m.m24498a(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m60801a(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(C13624l.m24483a(list, "UTF-8"));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m60802a(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        return m60801a(str, arrayList);
    }

    /* renamed from: b */
    private static Object m60806b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3501);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3501);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
