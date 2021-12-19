package com.bytedance.android.live.core.p218f;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.f.y */
public final class C3966y {

    /* renamed from: a */
    public static int f10868a = 1;

    /* renamed from: b */
    public static int[] f10869b = {0, 0};

    /* renamed from: c */
    public static boolean f10870c;

    /* renamed from: f */
    public static boolean m9670f() {
        if (f10868a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m9664c() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    static {
        Covode.recordClassIndex(4495);
    }

    /* renamed from: b */
    public static int m9662b() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: e */
    public static Context m9669e() {
        IHostContext iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class);
        if (iHostContext != null) {
            return iHostContext.context();
        }
        return null;
    }

    /* renamed from: a */
    public static Resources m9655a() {
        Context e = m9669e();
        if (e == null) {
            return null;
        }
        return e.getResources();
    }

    /* renamed from: d */
    public static final int m9666d() {
        int identifier;
        Context e = m9669e();
        if (e != null && (identifier = e.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return e.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: g */
    public static boolean m9672g() {
        boolean z;
        boolean z2;
        int i = Build.VERSION.SDK_INT;
        if (m9669e() != null) {
            if ((m9669e().getApplicationInfo().flags & 4194304) == 4194304) {
                z = true;
            } else {
                z = false;
            }
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m9653a(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static float m9661b(float f) {
        return TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: e */
    public static float m9668e(int i) {
        return ((float) i) / Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: c */
    public static Drawable m9665c(int i) {
        Context e = m9669e();
        if (e == null || e.getResources() == null) {
            return null;
        }
        return e.getResources().getDrawable(i);
    }

    /* renamed from: d */
    public static int m9667d(int i) {
        Context e = m9669e();
        if (e == null || e.getResources() == null) {
            return 0;
        }
        return (int) e.getResources().getDimension(i);
    }

    /* renamed from: f */
    public static String[] m9671f(int i) {
        Context e = m9669e();
        if (e == null) {
            return new String[0];
        }
        return e.getResources().getStringArray(i);
    }

    /* renamed from: b */
    public static int m9663b(int i) {
        Context e = m9669e();
        if (e == null || e.getResources() == null) {
            return 0;
        }
        return e.getResources().getColor(i);
    }

    /* renamed from: a */
    public static DisplayMetrics m9656a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = Build.VERSION.SDK_INT;
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public static String m9657a(int i) {
        Context e = m9669e();
        if (e == null) {
            return null;
        }
        return e.getString(i);
    }

    /* renamed from: a */
    public static int m9654a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            if (!str.startsWith("#")) {
                str = "#".concat(String.valueOf(str));
            }
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static String m9658a(int i, int i2) {
        Context e = m9669e();
        if (e == null) {
            return null;
        }
        return e.getResources().getQuantityString(i, i2);
    }

    /* renamed from: a */
    public static String m9660a(int i, Object... objArr) {
        Context e = m9669e();
        if (e == null) {
            return null;
        }
        return e.getString(i, objArr);
    }

    /* renamed from: a */
    public static String m9659a(int i, int i2, Object... objArr) {
        Context e = m9669e();
        if (e == null) {
            return null;
        }
        return e.getResources().getQuantityString(i, i2, objArr);
    }
}
