package com.bytedance.common.utility;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.common.utility.c */
public final class C13598c {

    /* renamed from: a */
    private static Boolean f33073a;

    /* renamed from: b */
    private static int f33074b;

    /* renamed from: c */
    private static int f33075c = -1;

    /* renamed from: d */
    private static int f33076d = -1;

    /* renamed from: e */
    private static final Map<String, String> f33077e = new HashMap();

    static {
        Covode.recordClassIndex(15623);
    }

    /* renamed from: a */
    private static boolean m24428a() {
        Boolean bool = f33073a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if ((invoke instanceof String) && !C13627m.m24498a((String) invoke) && !"unknown".equals((String) invoke)) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        f33073a = Boolean.valueOf(z);
        return z;
    }

    /* renamed from: a */
    public static int m24425a(Context context) {
        int i;
        int i2 = f33074b;
        if (i2 > 0) {
            return i2;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0 || (i = context.getResources().getDimensionPixelSize(identifier)) == 0) {
            i = (int) C13628n.m24520b(context, 25.0f);
        }
        f33074b = i;
        return i;
    }

    /* renamed from: a */
    public static void m24427a(Window window) {
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE).invoke(window, Integer.valueOf(i), Integer.valueOf(i));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m24429b(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.C13598c.m24429b(android.content.Context):int");
    }

    /* renamed from: b */
    private static int m24430b(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                return Math.round((((float) dimensionPixelSize) * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public static Object m24426a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12713);
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
                    MethodCollector.m26664o(12713);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
