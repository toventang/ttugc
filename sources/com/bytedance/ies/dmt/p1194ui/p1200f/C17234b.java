package com.bytedance.ies.dmt.p1194ui.p1200f;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.ies.dmt.ui.f.b */
public final class C17234b {

    /* renamed from: a */
    private static int f41167a;

    /* renamed from: b */
    private static int f41168b;

    static {
        Covode.recordClassIndex(19695);
    }

    /* renamed from: c */
    public static int m31809c(Context context) {
        int i = f41168b;
        if (i != 0) {
            return i;
        }
        int i2 = f41167a;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f41167a = displayMetrics.widthPixels;
        f41168b = displayMetrics.heightPixels;
        return f41168b;
    }

    /* renamed from: a */
    public static int m31806a(Context context) {
        int i = f41167a;
        if (i != 0) {
            return i;
        }
        WindowManager windowManager = (WindowManager) m31807a(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            f41167a = point.x;
            f41168b = point.y;
        }
        if (f41167a == 0 || f41168b == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f41167a = displayMetrics.widthPixels;
            f41168b = displayMetrics.heightPixels;
        }
        return f41167a;
    }

    /* renamed from: b */
    public static int m31808b(Context context) {
        int i = f41168b;
        if (i != 0) {
            return i;
        }
        WindowManager windowManager = (WindowManager) m31807a(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            f41167a = point.x;
            f41168b = point.y;
        }
        if (f41167a == 0 || f41168b == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f41167a = displayMetrics.widthPixels;
            f41168b = displayMetrics.heightPixels;
        }
        return f41168b;
    }

    /* renamed from: a */
    private static Object m31807a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11380);
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
                    MethodCollector.m26664o(11380);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
