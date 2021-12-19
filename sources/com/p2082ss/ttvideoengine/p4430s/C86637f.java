package com.p2082ss.ttvideoengine.p4430s;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.ttvideoengine.s.f */
public final class C86637f {
    static {
        Covode.recordClassIndex(101865);
    }

    /* renamed from: a */
    public static int m150066a() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    /* renamed from: b */
    public static float m150069b() {
        return Resources.getSystem().getDisplayMetrics().xdpi;
    }

    /* renamed from: c */
    public static float m150071c() {
        return Resources.getSystem().getDisplayMetrics().ydpi;
    }

    /* renamed from: a */
    public static Point m150067a(Context context) {
        Point point = new Point();
        Display defaultDisplay = ((WindowManager) m150068a(context, "window")).getDefaultDisplay();
        int i = Build.VERSION.SDK_INT;
        defaultDisplay.getRealSize(point);
        return point;
    }

    /* renamed from: b */
    public static int m150070b(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    private static Object m150068a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5750);
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
                    MethodCollector.m26664o(5750);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
