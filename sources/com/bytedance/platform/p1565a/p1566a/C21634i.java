package com.bytedance.platform.p1565a.p1566a;

import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.platform.a.a.i */
public final class C21634i {
    static {
        Covode.recordClassIndex(25275);
    }

    /* renamed from: a */
    public static boolean m40587a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 27 || Build.VERSION.PREVIEW_SDK_INT <= 0) {
            return false;
        }
        return true;
    }
}
