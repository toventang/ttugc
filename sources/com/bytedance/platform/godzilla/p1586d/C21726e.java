package com.bytedance.platform.godzilla.p1586d;

import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.platform.godzilla.d.e */
public final class C21726e {
    static {
        Covode.recordClassIndex(25367);
    }

    /* renamed from: a */
    public static boolean m40690a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 27 || Build.VERSION.PREVIEW_SDK_INT <= 0) {
            return false;
        }
        return true;
    }
}
