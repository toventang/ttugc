package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.utils.ap */
public final class C11227ap {
    static {
        Covode.recordClassIndex(12855);
    }

    /* renamed from: a */
    public static int m19886a(Context context) {
        if (context == null) {
            return 0;
        }
        int a = C13628n.m24504a(context);
        int b = C13628n.m24521b(context);
        if (b > a) {
            return a;
        }
        return b;
    }

    /* renamed from: a */
    public static float m19885a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    public static int m19887b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
