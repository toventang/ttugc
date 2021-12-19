package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.C25504g;
import com.google.android.gms.common.C25505h;
import com.google.android.gms.common.p1938c.C25500c;

/* renamed from: com.google.android.gms.common.util.n */
public final class C25612n {
    static {
        Covode.recordClassIndex(31022);
    }

    /* renamed from: a */
    public static boolean m49429a(Context context, int i) {
        if (!m49430a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C25505h a = C25505h.m49190a(context);
            if (packageInfo != null) {
                if (C25505h.m49193a(packageInfo, false)) {
                    return true;
                }
                if (!C25505h.m49193a(packageInfo, true) || !C25504g.m49184b(a.f60491a)) {
                    return false;
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m49430a(Context context, int i, String str) {
        return C25500c.f60481a.mo41741a(context).mo41739a(i, str);
    }
}
