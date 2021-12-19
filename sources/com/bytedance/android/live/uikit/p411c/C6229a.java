package com.bytedance.android.live.uikit.p411c;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15401f;

/* renamed from: com.bytedance.android.live.uikit.c.a */
public final class C6229a {
    static {
        Covode.recordClassIndex(6935);
    }

    /* renamed from: a */
    public static boolean m13521a(Context context) {
        if (context == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (context.getResources().getConfiguration().locale.getLanguage().equals(C15401f.f37600a) || context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
