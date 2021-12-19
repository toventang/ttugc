package com.p2082ss.android.p2092ad.splash.p2109f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.f.c */
public final class C29640c {

    /* renamed from: a */
    public static Boolean f70697a;

    /* renamed from: b */
    public static List<String> f70698b;

    static {
        Covode.recordClassIndex(36036);
    }

    /* renamed from: a */
    public static boolean m59667a(String str) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.isEmpty(lowerCase)) {
            return lowerCase.equals(str);
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m59672f(View view) {
        if (view != null && view.isAttachedToWindow()) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                C29644g.m59691e("View#getRootWindowInsets() returned null");
                return false;
            }
            DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                C29644g.m59690d("WindowInsets#getDisplayCutout() returned null");
                return false;
            } else if (displayCutout.getSafeInsetTop() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m59673g(View view) {
        Activity i;
        boolean z = false;
        if (view == null || (i = m59675i(view)) == null) {
            return false;
        }
        Window window = i.getWindow();
        if ((window.getAttributes().flags & 1024) == 1024) {
            z = true;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if ((systemUiVisibility & 4) == 4 && (systemUiVisibility & 1024) == 1024) {
            return true;
        }
        return z;
    }

    /* renamed from: i */
    public static Activity m59675i(View view) {
        if (view == null) {
            return null;
        }
        do {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        } while (view != null);
        C29644g.m59691e("failed to find activity for view");
        return null;
    }

    /* renamed from: a */
    public static int m59666a(View view) {
        DisplayCutout displayCutout;
        if (view == null) {
            return 0;
        }
        Context context = view.getContext();
        if (context.getResources().getConfiguration().orientation != 1) {
            return 0;
        }
        if (m59667a("oppo")) {
            return C29646i.m59698a(context);
        }
        if (Build.VERSION.SDK_INT < 28 || !(context instanceof Activity) || !view.isAttachedToWindow() || (displayCutout = view.getRootWindowInsets().getDisplayCutout()) == null) {
            return C29646i.m59698a(context);
        }
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: b */
    public static boolean m59668b(View view) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m59672f(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            } catch (ClassNotFoundException unused) {
                C29644g.m59685a();
                return false;
            } catch (NoSuchMethodException unused2) {
                C29644g.m59685a();
                return false;
            } catch (Exception unused3) {
                C29644g.m59685a();
                return false;
            }
        } else {
            cls = Class.forName("com.huawei.android.util.HwNotchSizeUtil");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getMethod("hasNotchInScreen", new Class[0]).invoke(cls, new Object[0])).booleanValue();
    }

    /* renamed from: c */
    public static boolean m59669c(View view) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m59672f(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("android.util.FtFeature");
            } catch (ClassNotFoundException unused) {
                C29644g.m59685a();
                return false;
            } catch (NoSuchMethodException unused2) {
                C29644g.m59685a();
                return false;
            } catch (IllegalAccessException unused3) {
                C29644g.m59685a();
                return false;
            } catch (InvocationTargetException unused4) {
                C29644g.m59685a();
                return false;
            } catch (Exception unused5) {
                C29644g.m59685a();
                return false;
            }
        } else {
            cls = Class.forName("android.util.FtFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
    }

    /* renamed from: d */
    public static boolean m59670d(View view) {
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m59672f(view);
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("getInt", String.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            if (((Integer) declaredMethod.invoke(cls, "ro.miui.notch", 0)).intValue() == 1) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e) {
            e.getMessage();
            C29644g.m59685a();
            return false;
        } catch (NoSuchMethodException e2) {
            e2.getMessage();
            C29644g.m59685a();
            return false;
        } catch (IllegalAccessException e3) {
            e3.getMessage();
            C29644g.m59685a();
            return false;
        } catch (InvocationTargetException e4) {
            e4.getMessage();
            C29644g.m59685a();
            return false;
        } catch (Throwable th) {
            th.getMessage();
            C29644g.m59685a();
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m59671e(View view) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m59672f(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("flyme.config.FlymeFeature");
            } catch (IllegalAccessException unused) {
                C29644g.m59685a();
                return false;
            } catch (NoSuchFieldException unused2) {
                C29644g.m59685a();
                return false;
            } catch (ClassNotFoundException unused3) {
                C29644g.m59685a();
                return false;
            } catch (Exception unused4) {
                C29644g.m59685a();
                return false;
            }
        } else {
            cls = Class.forName("flyme.config.FlymeFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredField("IS_FRINGE_DEVICE").get(false)).booleanValue();
    }

    /* renamed from: h */
    public static boolean m59674h(View view) {
        Activity i;
        if (view == null || (i = m59675i(view)) == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int systemUiVisibility = i.getWindow().getDecorView().getSystemUiVisibility();
            int i2 = i.getWindow().getAttributes().flags;
            if (!((systemUiVisibility & 1024) != 0 && (systemUiVisibility & 4) == 0 && (i2 & 1024) == 0)) {
                return false;
            }
        } else {
            int i3 = Build.VERSION.SDK_INT;
            int i4 = i.getWindow().getAttributes().flags;
            if ((67108864 & i4) == 0 || (i4 & 1024) != 0) {
                return false;
            }
        }
        return true;
    }
}
