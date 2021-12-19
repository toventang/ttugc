package com.p2082ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.account.util.r */
public final class C33049r {
    static {
        Covode.recordClassIndex(39856);
    }

    /* renamed from: a */
    public static synchronized PackageInfo m67696a(Context context, String str) {
        PackageInfo packageInfo;
        synchronized (C33049r.class) {
            MethodCollector.m26663i(9980);
            packageInfo = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            MethodCollector.m26664o(9980);
        }
        return packageInfo;
    }
}
