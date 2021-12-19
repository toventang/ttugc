package com.p2082ss.android.ugc.aweme.push.downgrade;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.h */
public class C65717h {

    /* renamed from: a */
    static volatile boolean f148070a;

    /* renamed from: b */
    private static volatile String f148071b;

    /* renamed from: c */
    private static volatile String f148072c;

    /* renamed from: d */
    private static volatile boolean f148073d;

    /* renamed from: e */
    private static volatile boolean f148074e;

    static {
        Covode.recordClassIndex(77215);
    }

    /* renamed from: a */
    public static String m117631a(Context context) {
        m117638f(context);
        return f148071b;
    }

    /* renamed from: b */
    public static String m117634b(Context context) {
        m117638f(context);
        return f148072c;
    }

    /* renamed from: c */
    public static boolean m117635c(Context context) {
        m117636d(context);
        return f148070a;
    }

    /* renamed from: d */
    private static void m117636d(Context context) {
        MethodCollector.m26663i(13741);
        if (f148074e || f148070a) {
            MethodCollector.m26664o(13741);
            return;
        }
        synchronized (C65717h.class) {
            try {
                if (!f148074e && !f148070a) {
                    m117637e(context);
                }
                f148074e = true;
            } finally {
                MethodCollector.m26664o(13741);
            }
        }
    }

    /* renamed from: e */
    private static void m117637e(Context context) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) m117633b(context, "activity")).getRunningAppProcesses();
            m117638f(context);
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && !TextUtils.isEmpty(runningAppProcessInfo.processName)) {
                        if (TextUtils.equals(runningAppProcessInfo.processName, f148071b) || TextUtils.equals(runningAppProcessInfo.processName, f148072c)) {
                            f148070a = true;
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
    }

    /* renamed from: f */
    private static void m117638f(Context context) {
        MethodCollector.m26663i(13830);
        if (!f148073d) {
            synchronized (C65717h.class) {
                try {
                    if (!f148073d) {
                        String packageName = context.getPackageName();
                        f148071b = packageName + ":push";
                        f148072c = packageName + ":pushservice";
                        f148073d = true;
                    }
                } finally {
                    MethodCollector.m26664o(13830);
                }
            }
            return;
        }
        MethodCollector.m26664o(13830);
    }

    /* renamed from: a */
    public static boolean m117632a(Context context, String str) {
        m117638f(context);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(f148071b, str) || TextUtils.equals(f148072c, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Object m117633b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13798);
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
                    MethodCollector.m26664o(13798);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
