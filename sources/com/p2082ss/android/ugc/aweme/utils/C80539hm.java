package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.utils.hm */
public final class C80539hm {
    static {
        Covode.recordClassIndex(93812);
    }

    /* renamed from: a */
    public static synchronized PackageInfo m139615a(Context context, String str) {
        PackageInfo packageInfo;
        synchronized (C80539hm.class) {
            MethodCollector.m26663i(9797);
            packageInfo = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            MethodCollector.m26664o(9797);
        }
        return packageInfo;
    }
}
