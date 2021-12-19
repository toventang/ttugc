package com.p2082ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dz */
public final class C70751dz {
    static {
        Covode.recordClassIndex(83222);
    }

    /* renamed from: a */
    public static void m124975a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        activity.getWindow().addFlags(67108864);
    }

    /* renamed from: b */
    public static void m124976b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            return;
        }
        m124975a(activity);
    }
}
