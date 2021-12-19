package com.snapchat.kit.sdk.p2066b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import java.io.File;

/* renamed from: com.snapchat.kit.sdk.b.b */
public final class C28949b {
    static {
        Covode.recordClassIndex(35133);
    }

    /* renamed from: a */
    private static String m57971a(Context context) {
        return context.getPackageName() + ".fileprovider";
    }

    /* renamed from: a */
    public static Uri m57970a(Context context, File file) {
        if (file == null) {
            return null;
        }
        return FileProvider.getUriForFile(context, m57971a(context), file);
    }

    /* renamed from: a */
    public static boolean m57972a(PackageManager packageManager, String str) {
        try {
            TextUtils.equals(str, C17867d.m33078a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (!applicationInfo.enabled || packageInfo.versionCode < 1729) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
