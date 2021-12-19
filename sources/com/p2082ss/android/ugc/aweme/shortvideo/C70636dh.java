package com.p2082ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
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
import com.p2082ss.android.ugc.aweme.utils.C80564i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dh */
public final class C70636dh {

    /* renamed from: a */
    private static int f158097a;

    static {
        Covode.recordClassIndex(83102);
    }

    /* renamed from: a */
    public static int m124828a(Context context) {
        if (context == null) {
            return 0;
        }
        return m124829a(m124839h(context));
    }

    /* renamed from: b */
    public static int m124831b(Context context) {
        if (context == null) {
            return 0;
        }
        return m124832b(m124839h(context));
    }

    /* renamed from: e */
    public static int m124836e(Context context) {
        if (context == null) {
            return 0;
        }
        return m124834c(m124839h(context));
    }

    /* renamed from: a */
    private static int m124829a(Display display) {
        if (display == null) {
            return 0;
        }
        Point point = new Point();
        display.getSize(point);
        return point.y;
    }

    /* renamed from: b */
    private static int m124832b(Display display) {
        if (display == null) {
            return 0;
        }
        Point point = new Point();
        display.getSize(point);
        return point.x;
    }

    /* renamed from: c */
    public static int m124833c(Context context) {
        int i = f158097a;
        if (i != 0) {
            return i;
        }
        Resources resources = context.getResources();
        int i2 = 0;
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = resources.getDimensionPixelSize(identifier);
        }
        f158097a = i2;
        return i2;
    }

    /* renamed from: f */
    public static boolean m124837f(Context context) {
        try {
            int e = m124836e(context);
            if (((double) (((float) e) / context.getResources().getDisplayMetrics().density)) < 690.5d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static Display m124839h(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) m124830a(context, "window");
        }
        return windowManager.getDefaultDisplay();
    }

    /* renamed from: c */
    private static int m124834c(Display display) {
        if (display == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = Build.VERSION.SDK_INT;
        display.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: d */
    public static int m124835d(Context context) {
        int i;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        Rect rect = new Rect();
        Activity a = C80564i.m139647a(context);
        if (a != null) {
            a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return Math.min(Math.max((m124836e(context) - m124833c(context)) - rect.height(), 0), i);
        } else if (!m124838g(context)) {
            return 0;
        } else {
            return i;
        }
    }

    /* renamed from: g */
    private static boolean m124838g(Context context) {
        boolean z;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier <= 0 || !resources.getBoolean(identifier)) {
            z = false;
        } else {
            z = true;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if ("0".equals(str)) {
                return true;
            }
            if ("1".equals(str)) {
                return false;
            }
            return z;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static Object m124830a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8487);
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
                    MethodCollector.m26664o(8487);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
