package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;

/* renamed from: androidx.core.content.c */
public final class C0645c {
    static {
        Covode.recordClassIndex(724);
    }

    /* renamed from: a */
    public static int m2379a(Context context, String str) {
        return m2380a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    private static int m2380a(Context context, String str, int i, int i2, String str2) {
        String str3;
        String[] packagesForUid;
        String str4 = str2;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            str3 = AppOpsManager.permissionToOp(str);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return 0;
        }
        if (str4 == null) {
            PackageManager packageManager = context.getPackageManager();
            Pair<Boolean, Object> a = C15346a.m28238a(packageManager, new Object[]{Integer.valueOf(i2)}, 101310, "java.lang.String[]", false, null);
            if (((Boolean) a.first).booleanValue()) {
                packagesForUid = (String[]) a.second;
            } else {
                packagesForUid = packageManager.getPackagesForUid(i2);
                C15346a.m28240a(packagesForUid, packageManager, new Object[]{Integer.valueOf(i2)}, 101310, "androidx_core_content_PermissionChecker_android_content_pm_PackageManager_getPackagesForUid(Landroid/content/pm/PackageManager;I)[Ljava/lang/String;");
            }
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str4 = packagesForUid[0];
        }
        if (Build.VERSION.SDK_INT < 23 || ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str3, str4) != 0) {
            return -2;
        }
        return 0;
    }
}
