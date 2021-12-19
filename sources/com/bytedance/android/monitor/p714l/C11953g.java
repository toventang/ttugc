package com.bytedance.android.monitor.p714l;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitor.l.g */
public final class C11953g {
    static {
        Covode.recordClassIndex(13679);
    }

    /* renamed from: a */
    public static String m21109a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static int m21110b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
