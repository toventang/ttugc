package com.p2082ss.android.ugc.aweme.tools;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.c */
public final class C78099c {
    static {
        Covode.recordClassIndex(91197);
    }

    /* renamed from: a */
    public static boolean m136517a(Context context) {
        if (context != null) {
            int i = Build.VERSION.SDK_INT;
            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                return true;
            }
        }
        return false;
    }
}
