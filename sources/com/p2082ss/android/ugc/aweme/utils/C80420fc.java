package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.fc */
public final class C80420fc {

    /* renamed from: a */
    public static final C80420fc f179980a = new C80420fc();

    private C80420fc() {
    }

    static {
        Covode.recordClassIndex(93688);
    }

    /* renamed from: a */
    public static final void m139414a(Window window) {
        C89219l.m154721d(window, "");
        m139415a(window, -16777216, false);
    }

    /* renamed from: a */
    public static int m139412a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return view.getHeight() + iArr[1];
    }

    /* renamed from: a */
    public static final C89391z m139413a(Activity activity) {
        C89219l.m154721d(activity, "");
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        m139414a(window);
        return C89391z.f203057a;
    }

    /* renamed from: b */
    public static final int m139417b(Activity activity) {
        C89219l.m154721d(activity, "");
        if (Build.VERSION.SDK_INT > 28) {
            try {
                Window window = activity.getWindow();
                C89219l.m154716b(window, "");
                View decorView = window.getDecorView();
                C89219l.m154716b(decorView, "");
                WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
                C89219l.m154716b(rootWindowInsets, "");
                int i = rootWindowInsets.getTappableElementInsets().bottom;
                if (i >= 0) {
                    if (i > 0) {
                        return 1;
                    }
                    return 0;
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static void m139416a(Window window, boolean z) {
        int i;
        C89219l.m154721d(window, "");
        if (Build.VERSION.SDK_INT >= 26) {
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                window.clearFlags(134217728);
                window.addFlags(Integer.MIN_VALUE);
                i = systemUiVisibility | 16;
            } else {
                i = systemUiVisibility & -17;
            }
            if (i != systemUiVisibility) {
                View decorView2 = window.getDecorView();
                C89219l.m154716b(decorView2, "");
                decorView2.setSystemUiVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public static void m139415a(Window window, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(i);
            m139416a(window, z);
        }
    }
}
