package com.p2082ss.android.ugc.aweme.livewallpaper.p3419f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.f.a */
public final class C58892a {
    static {
        Covode.recordClassIndex(69208);
    }

    /* renamed from: a */
    public static int m108189a(Context context, String str) {
        String str2;
        int i = -1;
        if (context != null && !TextUtils.isEmpty(str)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                    if (packageInfo != null) {
                        i = packageInfo.versionCode;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    str2 = e.getMessage();
                }
            }
            str2 = "";
            if (!TextUtils.isEmpty(str2)) {
                C33830n.m69192a("get_app_info", "", new C33743c().mo59976a("errorMsg", str2).mo59977a());
            }
        }
        return i;
    }
}
