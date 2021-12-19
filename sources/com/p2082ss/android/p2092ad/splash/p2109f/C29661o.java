package com.p2082ss.android.p2092ad.splash.p2109f;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.ad.splash.f.o */
public final class C29661o {

    /* renamed from: a */
    private static int f70737a = -1;

    /* renamed from: a */
    private static boolean m59773a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    static {
        Covode.recordClassIndex(36057);
    }

    /* renamed from: e */
    private static Context m59777e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static final int m59768a(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static int m59774b(Context context) {
        if (f70737a == -1 && context != null) {
            f70737a = m59777e(context).getResources().getDisplayMetrics().densityDpi;
        }
        return f70737a;
    }

    /* renamed from: c */
    public static final int m59775c(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m59776d(Context context) {
        try {
            if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
                return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static void m59769a(View view) {
        MethodCollector.m26663i(9150);
        if (view == null) {
            MethodCollector.m26664o(9150);
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            MethodCollector.m26664o(9150);
            return;
        }
        ((ViewGroup) parent).removeView(view);
        MethodCollector.m26664o(9150);
    }

    /* renamed from: a */
    public static float m59767a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: a */
    public static final void m59770a(View view, int i) {
        if (view != null && view.getVisibility() != i && m59773a(i)) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m59771a(View view, ViewGroup viewGroup) {
        MethodCollector.m26663i(9294);
        if (view == null || viewGroup == null) {
            MethodCollector.m26664o(9294);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent == viewGroup) {
            MethodCollector.m26664o(9294);
            return;
        }
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
        viewGroup.addView(view);
        MethodCollector.m26664o(9294);
    }

    /* renamed from: a */
    public static void m59772a(boolean z, View... viewArr) {
        int i;
        for (View view : viewArr) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            m59770a(view, i);
        }
    }
}
