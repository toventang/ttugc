package com.bytedance.android.livesdk.p605r;

import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3904ad;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.r.k */
public class C10330k {

    /* renamed from: a */
    private static final String f24986a = C10330k.class.getCanonicalName();

    private C10330k() {
    }

    static {
        Covode.recordClassIndex(11896);
    }

    /* renamed from: a */
    private static String m18804a() {
        return ((IHostContext) C6193a.m13435a(IHostContext.class)).getPackageName();
    }

    /* renamed from: h */
    private static void m18816h(Context context) {
        m18809b(context, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
    }

    /* renamed from: i */
    private static void m18817i(Context context) {
        m18809b(context, "android.settings.PICTURE_IN_PICTURE_SETTINGS");
    }

    /* renamed from: b */
    public static void m18808b(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            m18816h(context);
        } else {
            m18813e(context);
        }
    }

    /* renamed from: c */
    public static void m18811c(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            m18817i(context);
        } else {
            m18813e(context);
        }
    }

    /* renamed from: a */
    public static boolean m18807a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return m18815g(context);
    }

    /* renamed from: f */
    private static void m18814f(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            if (m18810b(context, intent)) {
                m18805a(context, intent);
            }
        } catch (Exception e) {
            C3854a.m9459b(e.getMessage());
        }
    }

    /* renamed from: d */
    public static boolean m18812d(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) m18803a(context, "appops");
            if (((Integer) appOpsManager.getClass().getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, 10021, Integer.valueOf(Process.myUid()), context.getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C3854a.m9460b(f24986a, "not support", e);
            return true;
        }
    }

    /* renamed from: g */
    private static boolean m18815g(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) m18803a(context, "appops");
            Method method = AppOpsManager.class.getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class);
            Object[] objArr = new Object[3];
            objArr[0] = 24;
            objArr[1] = Integer.valueOf(Binder.getCallingUid());
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            objArr[2] = applicationContext.getPackageName();
            if (((Integer) method.invoke(appOpsManager, objArr)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private static void m18813e(Context context) {
        String str = Build.MANUFACTURER;
        C3854a.m9453a(6, C10330k.class.getCanonicalName(), "jumpPermissionPage --- name : ".concat(String.valueOf(str)));
        str.hashCode();
        switch (str.hashCode()) {
            case -1678088054:
                if (str.equals("Coolpad")) {
                    m18806a("com.yulong.android.security:remote", context);
                    return;
                }
                break;
            case -1675632421:
                if (str.equals("Xiaomi")) {
                    String a = C3904ad.m9536a("ro.miui.ui.version.name");
                    C3854a.m9453a(6, f24986a, "goMiaoMiMainager --- rom : ".concat(String.valueOf(a)));
                    Intent intent = new Intent();
                    if ("V6".equals(a) || "V7".equals(a)) {
                        intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                        intent.putExtra("extra_pkgname", m18804a());
                    } else if ("V8".equals(a) || "V9".equals(a) || "V10".equals(a)) {
                        intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                        intent.putExtra("extra_pkgname", m18804a());
                    } else {
                        m18814f(context);
                        return;
                    }
                    if (m18810b(context, intent)) {
                        m18805a(context, intent);
                        return;
                    }
                    return;
                }
                break;
            case 2427:
                if (str.equals("LG")) {
                    try {
                        Intent intent2 = new Intent(m18804a());
                        intent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity"));
                        if (m18810b(context, intent2)) {
                            m18805a(context, intent2);
                            return;
                        } else {
                            m18814f(context);
                            return;
                        }
                    } catch (Exception unused) {
                        m18814f(context);
                        return;
                    }
                }
                break;
            case 2432928:
                if (str.equals("OPPO")) {
                    m18806a("com.coloros.safecenter", context);
                    return;
                }
                break;
            case 2582855:
                if (str.equals("Sony")) {
                    try {
                        Intent intent3 = new Intent(m18804a());
                        intent3.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
                        if (m18810b(context, intent3)) {
                            m18805a(context, intent3);
                            return;
                        } else {
                            m18814f(context);
                            return;
                        }
                    } catch (Exception e) {
                        C3854a.m9460b(f24986a, "goSonyMainager: ", e);
                        m18814f(context);
                        return;
                    }
                }
                break;
            case 3620012:
                if (str.equals("vivo")) {
                    m18806a("com.bairenkeji.icaller", context);
                    return;
                }
                break;
            case 74224812:
                if (str.equals("Meizu")) {
                    try {
                        Intent intent4 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                        intent4.addCategory("android.intent.category.DEFAULT");
                        intent4.putExtra("packageName", m18804a());
                        if (m18810b(context, intent4)) {
                            m18805a(context, intent4);
                            return;
                        } else {
                            m18814f(context);
                            return;
                        }
                    } catch (ActivityNotFoundException e2) {
                        C3854a.m9459b(e2.getMessage());
                        m18814f(context);
                        return;
                    }
                }
                break;
            case 1864941562:
                if (str.equals("samsung")) {
                    m18814f(context);
                    return;
                }
                break;
            case 2141820391:
                if (str.equals("HUAWEI")) {
                    try {
                        Intent intent5 = new Intent(m18804a());
                        intent5.setFlags(268435456);
                        intent5.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                        if (m18810b(context, intent5)) {
                            m18805a(context, intent5);
                            return;
                        } else {
                            m18814f(context);
                            return;
                        }
                    } catch (Exception unused2) {
                        m18814f(context);
                        return;
                    }
                }
                break;
        }
        m18814f(context);
    }

    /* renamed from: a */
    private static void m18805a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: b */
    private static boolean m18810b(Context context, Intent intent) {
        if (context != null) {
            try {
                if (context.getPackageManager().resolveActivity(intent, 0) != null) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                C3854a.m9459b(e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: b */
    private static void m18809b(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            if (m18810b(context, intent)) {
                m18805a(context, intent);
            }
        } catch (Exception e) {
            C3854a.m9459b(e.getMessage());
        }
    }

    /* renamed from: a */
    private static Object m18803a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10362);
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
                    MethodCollector.m26664o(10362);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static void m18806a(String str, Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                m18814f(context);
                return;
            }
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(packageInfo.packageName);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            C3854a.m9453a(6, "PermissionPageManager", "resolveinfoList" + queryIntentActivities.size());
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                C3854a.m9453a(6, "PermissionPageManager", queryIntentActivities.get(i).activityInfo.packageName + queryIntentActivities.get(i).activityInfo.name);
            }
            try {
                ResolveInfo next = queryIntentActivities.iterator().next();
                if (next != null) {
                    String str2 = next.activityInfo.packageName;
                    String str3 = next.activityInfo.name;
                    Intent intent2 = new Intent("android.intent.action.MAIN");
                    intent2.addCategory("android.intent.category.LAUNCHER");
                    intent2.setComponent(new ComponentName(str2, str3));
                    m18805a(context, intent2);
                }
            } catch (Exception e) {
                m18814f(context);
                C3854a.m9460b(f24986a, "doStartApplicationWithPackageName: ", e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            C3854a.m9460b(f24986a, "doStartApplicationWithPackageName: ", e2);
        }
    }
}
