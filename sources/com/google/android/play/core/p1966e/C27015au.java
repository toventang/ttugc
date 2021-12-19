package com.google.android.play.core.p1966e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.io.File;

/* renamed from: com.google.android.play.core.e.au */
public final class C27015au {

    /* renamed from: a */
    public final Context f63933a;

    static {
        Covode.recordClassIndex(32491);
    }

    C27015au(Context context) {
        this.f63933a = context;
    }

    /* renamed from: a */
    static File m53681a(Context context) {
        ApplicationInfo applicationInfo;
        String string;
        File file;
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
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                return null;
            }
            if (!TextUtils.isEmpty(null)) {
                file = context.getExternalFilesDir(null);
            } else {
                if (C58016d.f132223d == null || !C58016d.f132224e) {
                    C58016d.f132223d = context.getExternalFilesDir(null);
                }
                file = C58016d.f132223d;
            }
            return new File(file, string);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
