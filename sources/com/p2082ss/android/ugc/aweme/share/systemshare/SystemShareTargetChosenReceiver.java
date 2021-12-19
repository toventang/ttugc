package com.p2082ss.android.ugc.aweme.share.systemshare;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.share.systemshare.SystemShareTargetChosenReceiver */
public class SystemShareTargetChosenReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(81815);
    }

    /* renamed from: a */
    private static String m122695a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m122693a(Context context, ComponentName componentName) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = componentName.getPackageName();
            TextUtils.equals(packageName, C17867d.m33078a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            if (applicationInfo == null) {
                return "";
            }
            return applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            C13468b.m24211a(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
            return "";
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && context != null && Build.VERSION.SDK_INT >= 22) {
            try {
                ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                if (componentName != null) {
                    String str = null;
                    String a = m122695a(intent, "extra_type");
                    if (!C13627m.m24498a(a)) {
                        str = m122694a(context, componentName, a);
                    }
                    if (C13627m.m24498a(str)) {
                        str = m122693a(context, componentName);
                    }
                    C39162r.m79460a("share_video_more_track", new C33744d().mo59983a("platform", str).mo59983a("package_name", componentName.getPackageName()).mo59983a("component_name", componentName.getClassName()).f79943a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static String m122694a(Context context, ComponentName componentName, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
                if (resolveInfo.activityInfo != null && C13627m.m24499a(resolveInfo.activityInfo.name, componentName.getClassName()) && C13627m.m24499a(resolveInfo.activityInfo.packageName, componentName.getPackageName())) {
                    return resolveInfo.loadLabel(packageManager).toString();
                }
            }
            return "";
        } catch (Throwable th) {
            C13468b.m24211a(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
            return "";
        }
    }
}
