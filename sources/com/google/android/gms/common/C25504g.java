package com.google.android.gms.common;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.p1938c.C25500c;
import com.google.android.gms.common.util.C25609k;
import com.google.android.gms.common.util.C25615q;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.g */
public class C25504g {

    /* renamed from: a */
    private static boolean f60485a;

    /* renamed from: b */
    public static final int f60486b = 12451000;

    /* renamed from: c */
    static final AtomicBoolean f60487c = new AtomicBoolean();

    /* renamed from: d */
    private static boolean f60488d;

    /* renamed from: e */
    private static final AtomicBoolean f60489e = new AtomicBoolean();

    C25504g() {
    }

    static {
        Covode.recordClassIndex(30903);
    }

    /* renamed from: c */
    public static Resources m49187c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Context m49188d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static int m49189e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m49184b(Context context) {
        if (!f60488d) {
            try {
                PackageInfo b = C25500c.f60481a.mo41741a(context).mo41740b("com.google.android.gms", 64);
                C25505h.m49190a(context);
                if (b == null || C25505h.m49193a(b, false) || !C25505h.m49193a(b, true)) {
                    f60485a = false;
                } else {
                    f60485a = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                f60488d = true;
            }
        }
        if (f60485a || !"user".equals(Build.TYPE)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m49185b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m49186b(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (com.google.android.gms.common.util.C25606h.f60717a.booleanValue() == false) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m49180a(android.content.Context r5, int r6) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C25504g.m49180a(android.content.Context, int):int");
    }

    /* renamed from: b */
    static boolean m49186b(Context context, String str) {
        Bundle applicationRestrictions;
        boolean equals = str.equals("com.google.android.gms");
        if (C25609k.m49421c()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo a = m49182a(context.getPackageManager(), str, 8192);
            if (equals) {
                return a.enabled;
            }
            if (a.enabled) {
                if (!C25609k.m49419a() || (applicationRestrictions = ((UserManager) m49183a(context, "user")).getApplicationRestrictions(context.getPackageName())) == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    /* renamed from: a */
    public static Object m49183a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9598);
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
                    MethodCollector.m26664o(9598);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static ApplicationInfo m49182a(PackageManager packageManager, String str, int i) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, i);
        }
        return C58014b.f132218a;
    }

    /* renamed from: a */
    private static int m49181a(Context context, boolean z, int i) {
        boolean z2;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C25565r.m49324b(z2);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C25505h.m49190a(context);
            if (!C25505h.m49193a(packageInfo2, true)) {
                return 9;
            }
            if (z && (!C25505h.m49193a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                return 9;
            }
            if (C25615q.m49449a(packageInfo2.versionCode) < C25615q.m49449a(i)) {
                int i2 = packageInfo2.versionCode;
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = m49182a(packageManager, "com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                    return 1;
                }
            }
            if (!applicationInfo.enabled) {
                return 3;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused2) {
            return 1;
        }
    }
}
