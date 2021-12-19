package com.google.android.gms.common.p1938c;

import android.app.AppOpsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.gms.common.util.C25609k;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.common.c.b */
public final class C25499b {

    /* renamed from: a */
    public final Context f60480a;

    static {
        Covode.recordClassIndex(30898);
    }

    /* renamed from: a */
    public static String[] m49171a(PackageManager packageManager, int i) {
        Pair<Boolean, Object> a = C15346a.m28238a(packageManager, new Object[]{Integer.valueOf(i)}, 101310, "java.lang.String[]", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (String[]) a.second;
        }
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        C15346a.m28240a(packagesForUid, packageManager, new Object[]{Integer.valueOf(i)}, 101310, "com_google_android_gms_common_wrappers_PackageManagerWrapper_android_content_pm_PackageManager_getPackagesForUid(Landroid/content/pm/PackageManager;I)[Ljava/lang/String;");
        return packagesForUid;
    }

    /* renamed from: a */
    public final boolean mo41738a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C25498a.m49168a(this.f60480a);
        }
        if (!C25609k.m49423e() || (nameForUid = this.f60480a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f60480a.getPackageManager().isInstantApp(nameForUid);
    }

    public C25499b(Context context) {
        this.f60480a = context;
    }

    /* renamed from: a */
    public final int mo41736a(String str) {
        return this.f60480a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public final ApplicationInfo mo41737a(String str, int i) {
        return m49169a(this.f60480a.getPackageManager(), str, i);
    }

    /* renamed from: b */
    public final PackageInfo mo41740b(String str, int i) {
        return this.f60480a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: a */
    public final boolean mo41739a(int i, String str) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            ((AppOpsManager) m49170a(this.f60480a, "appops")).checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Object m49170a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10221);
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
                    MethodCollector.m26664o(10221);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static ApplicationInfo m49169a(PackageManager packageManager, String str, int i) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, i);
        }
        return C58014b.f132218a;
    }
}
