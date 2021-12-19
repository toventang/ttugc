package com.bytedance.common.utility.p906a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;

/* renamed from: com.bytedance.common.utility.a.a */
public final class C13584a {
    static {
        Covode.recordClassIndex(15609);
    }

    /* renamed from: a */
    private static Object m24417a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m24416a(Context context, String str) {
        Object b = m24418b(context, str);
        if (b == null) {
            return -1;
        }
        return ((Integer) b).intValue();
    }

    /* renamed from: b */
    private static Object m24418b(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (TextUtils.equals(packageName, C17867d.m33078a().getPackageName())) {
                if (C58014b.f132218a == null) {
                    C58014b.f132218a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = C58014b.f132218a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            return m24417a(applicationInfo.metaData, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
