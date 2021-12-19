package com.bytedance.ies.bullet.p1184ui.common.p1188d;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.d */
public final class C17039d {

    /* renamed from: a */
    public static final C17039d f40578a = new C17039d();

    /* renamed from: b */
    private static final int f40579b = f40579b;

    /* renamed from: c */
    private static final int f40580c = f40580c;

    private C17039d() {
    }

    /* renamed from: a */
    public static boolean m31502a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(19488);
    }

    /* renamed from: b */
    private static Context m31503b(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static int m31496a(Context context) {
        C89219l.m154719c(context, "");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static void m31500a(Window window) {
        if (window != null && Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: a */
    public static void m31497a(Activity activity) {
        C89219l.m154719c(activity, "");
        activity.getWindow().setFlags(1024, 1024);
        try {
            Context b = m31503b(activity);
            C89219l.m154709a((Object) b, "");
            Class<?> loadClass = b.getClassLoader().loadClass("android.os.SystemProperties");
            Method method = loadClass.getMethod("getInt", String.class, Integer.TYPE);
            C89219l.m154709a((Object) method, "");
            Object invoke = method.invoke(loadClass, "ro.miui.notch", 0);
            if (invoke == null) {
                throw new C89388w("null cannot be cast to non-null type");
            } else if (((Integer) invoke).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                int i = f40579b | f40580c;
                try {
                    Class[] clsArr = new Class[1];
                    Class cls = Integer.TYPE;
                    if (cls == null) {
                        C89219l.m154707a();
                    }
                    clsArr[0] = cls;
                    Method method2 = Window.class.getMethod("addExtraFlags", clsArr);
                    C89219l.m154709a((Object) method2, "");
                    method2.invoke(activity.getWindow(), Integer.valueOf(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m31498a(Activity activity, int i) {
        C89219l.m154719c(activity, "");
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            Window window = activity.getWindow();
            C89219l.m154709a((Object) window, "");
            window.setStatusBarColor(i);
            View findViewById = activity.getWindow().findViewById(16908290);
            C89219l.m154709a((Object) findViewById, "");
            if (findViewById != null) {
                findViewById.setForeground(null);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window2 = activity.getWindow();
            C89219l.m154709a((Object) window2, "");
            window2.setStatusBarColor(i);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            C18247a.m33947a(activity, i);
        }
    }

    /* renamed from: a */
    private static void m31501a(boolean z, Window window) {
        int i;
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            C89219l.m154709a((Object) cls2, "");
            Field field = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
            C89219l.m154709a((Object) field, "");
            int i2 = field.getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            C89219l.m154709a((Object) method, "");
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m31499a(Activity activity, Window window, boolean z) {
        if (window != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    C89219l.m154709a((Object) decorView, "");
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    if (!z) {
                        decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                    } else {
                        decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                    }
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                }
                if (OSUtils.isMIUI6Later()) {
                    m31501a(z, window);
                }
                if (OSUtils.isFlymeOS4Later()) {
                    FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(activity, z);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
