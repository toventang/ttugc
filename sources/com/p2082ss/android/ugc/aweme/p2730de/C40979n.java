package com.p2082ss.android.ugc.aweme.p2730de;

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
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.de.n */
public final class C40979n {

    /* renamed from: a */
    private static int f95815a = -1;

    /* renamed from: b */
    private static int f95816b = -1;

    /* renamed from: c */
    private static int f95817c = -1;

    /* renamed from: d */
    private static int f95818d = -1;

    static {
        Covode.recordClassIndex(48831);
    }

    /* renamed from: a */
    public static int m82503a() {
        Resources resources = C40963b.m82473a().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m82506b() {
        Resources resources = C40963b.m82473a().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m82508c(Context context) {
        Resources resources;
        int identifier;
        if (m82511f(context) && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m82504a(Context context) {
        int i = f95816b;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        m82510e(context);
        int i2 = f95816b;
        if (i2 > 0) {
            return i2;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m82507b(Context context) {
        int i = f95815a;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        m82510e(context);
        int i2 = f95815a;
        if (i2 > 0) {
            return i2;
        }
        return 0;
    }

    /* renamed from: e */
    private static void m82510e(Context context) {
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) m82505a(context, "window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    if (defaultDisplay != null) {
                        int i = Build.VERSION.SDK_INT;
                        defaultDisplay.getRealSize(point);
                        f95816b = point.y;
                        f95815a = point.x;
                        return;
                    }
                    return;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                f95816b = displayMetrics.heightPixels;
                f95815a = displayMetrics.widthPixels;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static int m82509d(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) m82505a(context, "window");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            int a = m82504a(context);
            e.printStackTrace();
            return a;
        }
    }

    /* renamed from: f */
    private static boolean m82511f(Context context) {
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
    private static Object m82505a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5579);
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
                    MethodCollector.m26664o(5579);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
