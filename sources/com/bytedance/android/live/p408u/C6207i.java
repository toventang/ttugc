package com.bytedance.android.live.p408u;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.live.u.i */
public final class C6207i {

    /* renamed from: a */
    public static int f15483a = 1000;

    /* renamed from: b */
    public static int f15484b = 60;

    /* renamed from: c */
    public static float f15485c = 16.666668f;

    /* renamed from: d */
    static long f15486d = -1;

    /* renamed from: e */
    static long f15487e = -1;

    static {
        Covode.recordClassIndex(6913);
    }

    /* renamed from: a */
    public static float m13486a() {
        if (m13488b() > 0.0f) {
            return ((float) f15483a) / m13488b();
        }
        return f15485c;
    }

    /* renamed from: b */
    private static float m13488b() {
        int i;
        WindowManager windowManager = (WindowManager) m13487a(C3966y.m9669e(), "window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                return defaultDisplay.getRefreshRate();
            }
            i = f15484b;
        } else {
            i = f15484b;
        }
        return (float) i;
    }

    /* renamed from: a */
    private static Object m13487a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11159);
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
                    MethodCollector.m26664o(11159);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
