package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dg */
public final class C70635dg {
    static {
        Covode.recordClassIndex(83101);
    }

    /* renamed from: a */
    public static boolean m124827a(int i, int i2) {
        if (i2 * 9 >= i * 16) {
            return true;
        }
        double d = (double) i2;
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        if (Math.abs((d / d2) - 1.7777777910232544d) < 0.1d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m124826a(View view, int i, int i2) {
        Context context = view.getContext();
        int e = C70636dh.m124836e(context);
        int b = C70636dh.m124831b(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (e * 9 < b * 16 || i >= i2) {
            layoutParams.width = b;
            layoutParams.height = e;
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.width = (i * e) / i2;
            layoutParams.height = e;
            layoutParams.leftMargin = (b - layoutParams.width) / 2;
            layoutParams.topMargin = 0;
        }
        int i3 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        view.setLayoutParams(layoutParams);
    }
}
