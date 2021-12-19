package com.bytedance.android.livesdk.container.util;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.uikit.p410b.C6228a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.util.c */
public final class C8302c {

    /* renamed from: a */
    public static final C8302c f20571a = new C8302c();

    private C8302c() {
    }

    static {
        Covode.recordClassIndex(9139);
    }

    /* renamed from: a */
    public static void m16457a(Activity activity, int i) {
        C89219l.m154721d(activity, "");
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            Window window = activity.getWindow();
            C89219l.m154716b(window, "");
            window.setStatusBarColor(i);
            View findViewById = activity.getWindow().findViewById(16908290);
            C89219l.m154716b(findViewById, "");
            if (findViewById != null) {
                findViewById.setForeground(null);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window2 = activity.getWindow();
            C89219l.m154716b(window2, "");
            window2.setStatusBarColor(i);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            C6228a.m13519a(activity, i);
        }
    }
}
