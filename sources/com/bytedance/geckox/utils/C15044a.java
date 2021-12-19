package com.bytedance.geckox.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.ies.ugc.appcontext.C17867d;

/* renamed from: com.bytedance.geckox.utils.a */
public final class C15044a {
    static {
        Covode.recordClassIndex(17212);
    }

    /* renamed from: a */
    public static float m27702a() {
        long j;
        if (Environment.getDataDirectory() != null) {
            j = m27703a(Environment.getDataDirectory().getPath());
        } else {
            j = -1;
        }
        return ((float) j) / 1048576.0f;
    }

    /* renamed from: a */
    private static long m27703a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static String m27705b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            TextUtils.equals(packageName, C17867d.m33078a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            if (applicationInfo == null) {
                return "";
            }
            return applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable unused) {
            C14957a.m27542a();
            return "";
        }
    }

    /* renamed from: a */
    public static String m27704a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            C14957a.m27542a();
            return "null";
        }
    }
}
