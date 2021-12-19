package com.bytedance.lynx.hybrid.p1523i;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.lynx.tasm.base.LLog;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.i.b */
public final class C21202b {

    /* renamed from: a */
    public static final C21202b f50315a = new C21202b();

    /* renamed from: b */
    private static int f50316b;

    private C21202b() {
    }

    static {
        Covode.recordClassIndex(24818);
    }

    /* renamed from: b */
    public static int m39912b(Context context) {
        C89219l.m154719c(context, "");
        Display d = m39914d(context);
        int i = 0;
        if (d == null) {
            return 0;
        }
        try {
            Point point = new Point();
            d.getSize(point);
            i = point.x;
            return i;
        } catch (Exception e) {
            LLog.m56862d("DevicesUtil", e.getMessage());
            return i;
        }
    }

    /* renamed from: d */
    private static Display m39914d(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            Object a = m39911a(context, "window");
            if (a != null) {
                windowManager = (WindowManager) a;
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: a */
    public static int m39910a(Context context) {
        C89219l.m154719c(context, "");
        Display d = m39914d(context);
        int i = 0;
        if (d == null) {
            return 0;
        }
        try {
            Point point = new Point();
            d.getSize(point);
            i = point.y;
            return i;
        } catch (Exception e) {
            LLog.m56862d("DevicesUtil", e.getMessage());
            return i;
        }
    }

    /* renamed from: c */
    public static int m39913c(Context context) {
        int i;
        C89219l.m154719c(context, "");
        int i2 = f50316b;
        if (i2 > 0) {
            return i2;
        }
        if (C21201a.m39903a(context)) {
            int a = (int) C21204d.m39916a(context, 27.0f);
            f50316b = a;
            return a;
        } else if (C21201a.m39904b(context)) {
            int c = C21201a.m39905c(context);
            f50316b = c;
            return c;
        } else {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0 || (i = context.getResources().getDimensionPixelOffset(identifier)) == 0) {
                i = (int) C21204d.m39916a(context, 25.0f);
            }
            f50316b = i;
            return i;
        }
    }

    /* renamed from: a */
    public static int m39908a(double d, Context context) {
        C89219l.m154719c(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        double d2 = (double) resources.getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d / d2) + 0.5d);
    }

    /* renamed from: a */
    public static int m39909a(int i, Activity activity) {
        C89219l.m154719c(activity, "");
        Rect rect = new Rect();
        Window window = activity.getWindow();
        C89219l.m154709a((Object) window, "");
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (m39908a((double) rect.top, activity) >= i) {
            return m39908a((double) rect.height(), activity);
        }
        return m39908a((double) rect.height(), activity) - i;
    }

    /* renamed from: a */
    private static Object m39911a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3588);
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
                    MethodCollector.m26664o(3588);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
