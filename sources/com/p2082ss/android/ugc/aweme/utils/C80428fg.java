package com.p2082ss.android.ugc.aweme.utils;

import android.app.AppOpsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.C0607l;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.utils.p4203d.C80329c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.fg */
public class C80428fg {
    static {
        Covode.recordClassIndex(93696);
    }

    /* renamed from: b */
    public static void m139434b(Context context) {
        if (context != null && !m139437e(context)) {
            m139439g(context);
        }
    }

    /* renamed from: c */
    public static void m139435c(Context context) {
        if (context != null && !m139438f(context)) {
            m139439g(context);
        }
    }

    /* renamed from: a */
    public static boolean m139432a(Context context) {
        try {
            if (Build.VERSION.SDK_INT > 19) {
                return C0607l.m2289a(context).mo2639a();
            }
            int d = m139436d(context);
            if (d != 0) {
                if (d == 1) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m139439g(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            if (!m139433a(intent, context)) {
                return false;
            }
            m139431a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m139438f(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            if (!m139433a(intent, context)) {
                return false;
            }
            m139431a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static int m139436d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) m139430a(context, "appops");
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

    /* renamed from: e */
    private static boolean m139437e(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 26 || C80329c.m139263a()) {
                m139435c(context);
                return true;
            }
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                return true;
            }
            m139431a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static void m139431a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static boolean m139433a(Intent intent, Context context) {
        List<ResolveInfo> queryIntentActivities;
        if (context == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536)) == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Object m139430a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12143);
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
                    MethodCollector.m26664o(12143);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
