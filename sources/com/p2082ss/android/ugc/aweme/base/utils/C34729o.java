package com.p2082ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1281c.C18247a;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.utils.o */
public final class C34729o {

    /* renamed from: a */
    public static final WeakHashMap<View, Long> f82017a = new WeakHashMap<>();

    /* renamed from: b */
    private static View.OnTouchListener f82018b = View$OnTouchListenerC34733q.f82023a;

    static {
        Covode.recordClassIndex(41721);
    }

    /* renamed from: a */
    public static boolean m70957a(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Activity m70950a(Context context) {
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m70958b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    /* renamed from: d */
    public static Activity m70962d(View view) {
        if (view != null) {
            for (Context context = view.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Rect m70961c(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* renamed from: e */
    private static boolean m70963e(View view) {
        if (view != null && C0792v.m2791y(view)) {
            while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
                if (view.getId() == 16908290) {
                    return true;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m70960b(View view) {
        Rect rect = new Rect();
        if (!m70963e(view) || !view.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m70953a(Activity activity) {
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT < 21) {
            int i = Build.VERSION.SDK_INT;
            window.addFlags(67108864);
        } else if (window.getStatusBarColor() != 0) {
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    /* renamed from: a */
    public static Drawable m70951a(int i, float f) {
        return m70952a(i, new float[]{f, f, f, f});
    }

    /* renamed from: b */
    public static void m70959b(boolean z, View... viewArr) {
        int i;
        for (View view : viewArr) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            m70955a(view, i);
        }
    }

    /* renamed from: a */
    private static Drawable m70952a(int i, float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[0], fArr[1], fArr[1], fArr[2], fArr[2], fArr[3], fArr[3]};
        C347301 r0 = new GradientDrawable() {
            /* class com.p2082ss.android.ugc.aweme.base.utils.C34729o.C347301 */

            static {
                Covode.recordClassIndex(41722);
            }

            public final int getOpacity() {
                return -3;
            }
        };
        r0.setColor(i);
        r0.setCornerRadii(fArr2);
        return r0;
    }

    /* renamed from: a */
    public static void m70954a(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        C18247a.m33947a(activity, i);
    }

    /* renamed from: a */
    public static void m70955a(View view, int i) {
        if (view != null && view.getVisibility() != i) {
            if (i == 0 && view.getAlpha() < Float.MIN_VALUE) {
                view.setAlpha(1.0f);
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m70956a(boolean z, View... viewArr) {
        int i;
        for (View view : viewArr) {
            if (view != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }
}
