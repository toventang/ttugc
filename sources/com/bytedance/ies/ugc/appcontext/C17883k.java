package com.bytedance.ies.ugc.appcontext;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ies.ugc.appcontext.k */
public final class C17883k {

    /* renamed from: a */
    private static WeakReference<Bundle> f42653a;

    static {
        Covode.recordClassIndex(20484);
    }

    /* renamed from: a */
    private static Object m33119a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static int m33120b(Context context, String str) {
        return ((Integer) m33118a(context, str)).intValue();
    }

    /* renamed from: a */
    static Object m33118a(Context context, String str) {
        Bundle bundle;
        ApplicationInfo applicationInfo;
        if (context == null) {
            return null;
        }
        try {
            WeakReference<Bundle> weakReference = f42653a;
            if (weakReference != null) {
                bundle = weakReference.get();
            } else {
                bundle = null;
            }
            if (bundle == null) {
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
                bundle = applicationInfo.metaData;
                f42653a = new WeakReference<>(bundle);
            }
            return m33119a(bundle, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
