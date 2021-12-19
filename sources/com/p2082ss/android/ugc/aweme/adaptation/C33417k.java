package com.p2082ss.android.ugc.aweme.adaptation;

import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.adaptation.k */
public final class C33417k {

    /* renamed from: a */
    public static final C33417k f79448a = new C33417k();

    private C33417k() {
    }

    static {
        Covode.recordClassIndex(40274);
    }

    /* renamed from: a */
    private static int m68523a(Context context) {
        C89219l.m154721d(context, "");
        if (!C29843f.m60128a()) {
            return 0;
        }
        int[] iArr = {0, 0};
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Object invoke = loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
            if (invoke != null) {
                return ((int[]) invoke)[1];
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
        } catch (Throwable unused) {
            return iArr[1];
        }
    }

    /* renamed from: a */
    public static int m68524a(Context context, Window window) {
        DisplayCutout displayCutout;
        C89219l.m154721d(context, "");
        C89219l.m154721d(window, "");
        if (Build.VERSION.SDK_INT >= 28) {
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                return 0;
            }
            return displayCutout.getSafeInsetTop();
        } else if (C29843f.m60128a()) {
            return m68523a(context);
        } else {
            return C13628n.m24525e(context);
        }
    }
}
