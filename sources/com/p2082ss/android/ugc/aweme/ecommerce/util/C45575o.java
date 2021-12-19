package com.p2082ss.android.ugc.aweme.ecommerce.util;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.common.utility.C13598c;
import com.bytedance.covode.number.Covode;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.o */
public final class C45575o {
    static {
        Covode.recordClassIndex(54068);
    }

    /* renamed from: a */
    public static final void m88124a(Window window) {
        if (window != null) {
            m88125b(window);
            if (OSUtils.isMIUI6Later()) {
                C13598c.m24427a(window);
            }
            if (OSUtils.isFlymeOS4Later()) {
                FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(window, true);
            }
        }
    }

    /* renamed from: b */
    private static void m88125b(Window window) {
        C89219l.m154721d(window, "");
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        }
    }
}
