package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.p1938c.C25500c;

/* renamed from: com.google.android.gms.common.util.d */
public final class C25602d {
    static {
        Covode.recordClassIndex(31012);
    }

    /* renamed from: a */
    public static boolean m49406a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C25500c.f60481a.mo41741a(context).mo41737a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
