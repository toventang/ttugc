package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.C24889n;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.internal.ae */
public final class C24699ae {

    /* renamed from: a */
    private static final String f58636a = C24699ae.class.getName();

    static {
        Covode.recordClassIndex(28852);
    }

    /* renamed from: a */
    public static void m47299a() {
        if (!C24872m.m47685a()) {
            throw new C24889n("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* renamed from: b */
    public static String m47305b() {
        m47299a();
        String str = C24872m.f59041a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* renamed from: c */
    public static String m47308c() {
        m47299a();
        String str = C24872m.f59043c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    /* renamed from: a */
    public static <T> void m47303a(Collection<T> collection, String str) {
        m47310c(collection, str);
        m47307b(collection, str);
    }

    /* renamed from: a */
    public static void m47300a(Context context, boolean z) {
        m47301a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && z) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    /* renamed from: b */
    public static void m47306b(Context context, boolean z) {
        if (!z) {
            try {
                m47309c(context, z);
            } catch (Exception unused) {
            }
        } else {
            m47309c(context, z);
        }
    }

    /* renamed from: a */
    public static void m47301a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    /* renamed from: b */
    private static <T> void m47307b(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Container '" + str + "' cannot be empty");
        }
    }

    /* renamed from: c */
    private static void m47309c(Context context, boolean z) {
        m47301a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1) != null) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (z) {
            throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    /* renamed from: a */
    public static void m47302a(String str, String str2) {
        if (C24693ad.m47261a(str)) {
            throw new IllegalArgumentException("Argument '" + str2 + "' cannot be null or empty");
        }
    }

    /* renamed from: c */
    private static <T> void m47310c(Collection<T> collection, String str) {
        m47301a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    /* renamed from: a */
    public static boolean m47304a(Context context, String str) {
        List<ResolveInfo> list;
        m47301a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
