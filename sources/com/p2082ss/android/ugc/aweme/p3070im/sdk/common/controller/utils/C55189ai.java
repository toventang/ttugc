package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ai */
public final class C55189ai {

    /* renamed from: a */
    public static final C55189ai f126260a = new C55189ai();

    private C55189ai() {
    }

    static {
        Covode.recordClassIndex(64934);
    }

    /* renamed from: f */
    private static int m100900f(Context context) {
        C89219l.m154721d(context, "");
        return m100897c(context) - m100896b(context);
    }

    /* renamed from: a */
    public static final int m100894a(Context context) {
        C89219l.m154721d(context, "");
        if (!m100898d(context) || m100899e(context)) {
            return 0;
        }
        return m100900f(context);
    }

    /* renamed from: d */
    private static boolean m100898d(Context context) {
        C89219l.m154721d(context, "");
        if (m100897c(context) != m100896b(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m100896b(Context context) {
        C89219l.m154721d(context, "");
        Object a = m100895a(context, "window");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    private static int m100897c(Context context) {
        C89219l.m154721d(context, "");
        Object a = m100895a(context, "window");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: e */
    private static boolean m100899e(Context context) {
        C89219l.m154721d(context, "");
        int i = Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0);
        int i2 = Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
        if (i == 0 && i2 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Object m100895a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3338);
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
                    MethodCollector.m26664o(3338);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
