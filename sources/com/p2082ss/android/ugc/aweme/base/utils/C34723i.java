package com.p2082ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.base.utils.i */
public final class C34723i {

    /* renamed from: a */
    private static int f82010a = -1;

    /* renamed from: b */
    private static int f82011b = -1;

    /* renamed from: c */
    private static int f82012c = -1;

    /* renamed from: d */
    private static int f82013d = -1;

    static {
        Covode.recordClassIndex(41715);
    }

    /* renamed from: b */
    public static int m70927b() {
        Resources resources = C17867d.m33078a().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m70929c() {
        Resources resources = C17867d.m33078a().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static int[] m70926a() {
        DisplayMetrics displayMetrics = C17867d.m33078a().getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    /* renamed from: c */
    public static int m70930c(Context context) {
        int b = m70928b(context);
        int a = m70924a(context);
        return b > a ? a : b;
    }

    /* renamed from: a */
    public static int m70924a(Context context) {
        int i = f82011b;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        m70934g(context);
        int i2 = f82011b;
        if (i2 > 0) {
            return i2;
        }
        return 0;
    }

    /* renamed from: e */
    public static int m70932e(Context context) {
        Resources resources;
        int identifier;
        if (m70935h(context) && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m70928b(Context context) {
        int i = f82010a;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        m70934g(context);
        int i2 = f82010a;
        if (i2 > 0) {
            return i2;
        }
        return 0;
    }

    /* renamed from: d */
    public static int m70931d(Context context) {
        if (context == null) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        WindowManager windowManager = (WindowManager) m70925a(context, "window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 != 0) {
                return i2;
            }
        }
        return m70928b(context);
    }

    /* renamed from: g */
    private static void m70934g(Context context) {
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) m70925a(context, "window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    if (defaultDisplay != null) {
                        int i = Build.VERSION.SDK_INT;
                        defaultDisplay.getRealSize(point);
                        f82011b = point.y;
                        f82010a = point.x;
                        return;
                    }
                    return;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                f82011b = displayMetrics.heightPixels;
                f82010a = displayMetrics.widthPixels;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    public static int m70933f(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) m70925a(context, "window");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            int a = m70924a(context);
            e.printStackTrace();
            return a;
        }
    }

    /* renamed from: h */
    private static boolean m70935h(Context context) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if ("1".equals(str)) {
                return false;
            }
            if ("0".equals(str)) {
                return true;
            }
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier > 0) {
                return resources.getBoolean(identifier);
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static Object m70925a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(14036);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(14036);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
