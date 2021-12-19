package com.bytedance.android.live.core.p218f;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.android.live.uikit.p410b.C6228a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.core.f.ac */
public final class C3903ac {
    static {
        Covode.recordClassIndex(4432);
    }

    /* renamed from: b */
    private static int m9535b(Activity activity) {
        return activity.getResources().getColor(R.color.c9);
    }

    /* renamed from: a */
    public static int m9533a(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: a */
    public static void m9534a(Activity activity) {
        if (activity != null && !C3931d.m9571a(activity)) {
            int i = Build.VERSION.SDK_INT;
            activity.getWindow().setFlags(1024, 1024);
            if (Build.VERSION.SDK_INT >= 21) {
                activity.getWindow().setStatusBarColor(m9535b(activity));
                return;
            }
            int i2 = Build.VERSION.SDK_INT;
            C6228a.m13519a(activity, m9535b(activity));
        }
    }
}
