package com.p2082ss.android.ugc.aweme.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.p908c.C13601c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.p4202c.C80287a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.cp */
public class C80310cp {

    /* renamed from: a */
    private static final List<Intent> f179839a = new ArrayList();

    static {
        Covode.recordClassIndex(93578);
    }

    /* renamed from: a */
    private static boolean m139215a() {
        try {
            String trim = C13601c.m24432a("ro.miui.ui.version.name").trim();
            if (trim == null || trim.isEmpty() || Integer.valueOf(trim.substring(1)).intValue() < 125) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: a */
    public static void m139213a(Context context) {
        if (context != null) {
            m139216b(context);
            if ((C80287a.m139192a() || !m139218c(context)) && !m139219d(context)) {
                m139220e(context);
            }
        }
    }

    /* renamed from: e */
    private static boolean m139220e(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            m139214a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m139219d(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            m139214a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static void m139216b(Context context) {
        List<Intent> list = f179839a;
        if (list.size() == 0) {
            String packageName = context.getPackageName();
            Intent component = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
            component.putExtra("pkg_name", packageName);
            component.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
            component.putExtra("class_name", C80310cp.class.getName());
            list.add(component);
            Intent component2 = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionAppAllPermissionActivity"));
            component2.putExtra("packageName", packageName);
            list.add(component2);
            Intent component3 = new Intent().setComponent(new ComponentName("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
            component3.putExtra("android.intent.extra.PACKAGE_NAME", packageName);
            list.add(component3);
        }
    }

    /* renamed from: c */
    private static boolean m139218c(Context context) {
        Intent intent;
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (TextUtils.equals(lowerCase, "oppo") && Build.VERSION.SDK_INT <= 23) {
                Iterator<Intent> it = f179839a.iterator();
                while (it.hasNext()) {
                    intent = it.next();
                    if (m139217b(context, intent)) {
                        intent.addFlags(268435456);
                    }
                }
                return false;
            } else if (TextUtils.equals(lowerCase, "huawei")) {
                intent = new Intent();
                intent.setFlags(268435456);
                intent.putExtra("packageName", context.getPackageName());
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            } else if (TextUtils.equals(lowerCase, "xiaomi")) {
                if (m139215a()) {
                    return false;
                }
                intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                intent.putExtra("extra_pkgname", context.getPackageName());
            } else if (!TextUtils.equals(lowerCase, "meizu")) {
                return false;
            } else {
                intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.putExtra("packageName", context.getPackageName());
            }
            if (!m139217b(context, intent)) {
                return false;
            }
            m139214a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static void m139214a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: b */
    private static boolean m139217b(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            try {
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 1);
                if (resolveActivity == null) {
                    return false;
                }
                if (resolveActivity.activityInfo == null) {
                    return false;
                }
                return resolveActivity.activityInfo.exported;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
