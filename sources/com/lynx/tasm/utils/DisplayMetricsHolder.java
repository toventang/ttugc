package com.lynx.tasm.utils;

import android.content.ClipboardManager;
import android.content.Context;
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

public class DisplayMetricsHolder {

    /* renamed from: a */
    public static DisplayMetrics f68335a;

    /* renamed from: b */
    public static DisplayMetrics f68336b;

    /* renamed from: c */
    public static int f68337c = -1;

    /* renamed from: d */
    public static float f68338d = -1.0f;

    /* renamed from: e */
    public static boolean f68339e;

    public static native void nativeUpdateDevice(int i, int i2, float f, String str);

    static {
        Covode.recordClassIndex(35039);
    }

    /* renamed from: a */
    public static synchronized DisplayMetrics m57911a() {
        DisplayMetrics displayMetrics;
        synchronized (DisplayMetricsHolder.class) {
            MethodCollector.m26663i(842);
            displayMetrics = f68336b;
            MethodCollector.m26664o(842);
        }
        return displayMetrics;
    }

    /* renamed from: a */
    public static DisplayMetrics m57912a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(f68335a);
        WindowManager windowManager = (WindowManager) m57913a(context, "window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            int i = Build.VERSION.SDK_INT;
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        }
        throw new AssertionError("WindowManager is null!");
    }

    /* renamed from: a */
    private static Object m57913a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(839);
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
                    MethodCollector.m26664o(839);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
