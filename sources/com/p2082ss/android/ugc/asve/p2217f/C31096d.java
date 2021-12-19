package com.p2082ss.android.ugc.asve.p2217f;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.f.d */
public final class C31096d {

    /* renamed from: a */
    public static final C31096d f74514a = new C31096d();

    private C31096d() {
    }

    static {
        Covode.recordClassIndex(37735);
    }

    /* renamed from: a */
    public static final boolean m64298a(Context context) {
        C89219l.m154721d(context, "");
        int i = Build.VERSION.SDK_INT;
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        Configuration configuration = resources.getConfiguration();
        C89219l.m154716b(configuration, "");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int m64299b(Context context) {
        C89219l.m154721d(context, "");
        Object a = m64297a(context, "window");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    /* renamed from: c */
    public static final int m64300c(Context context) {
        WindowManager windowManager;
        C89219l.m154721d(context, "");
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
            C89219l.m154716b(windowManager, "");
        } else {
            Object a = m64297a(context, "window");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.WindowManager");
            windowManager = (WindowManager) a;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = Build.VERSION.SDK_INT;
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: a */
    private static Object m64297a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8867);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(8867);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
