package com.bytedance.p1436j.p1437a.p1444g;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
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

/* renamed from: com.bytedance.j.a.g.b */
public final class C20122b {

    /* renamed from: a */
    public static int f47889a;

    /* renamed from: b */
    public static final C20122b f47890b = new C20122b();

    private C20122b() {
    }

    static {
        Covode.recordClassIndex(23630);
    }

    /* renamed from: a */
    public static int m38075a(Context context) {
        C89219l.m154719c(context, "");
        Display c = m38078c(context);
        int i = 0;
        if (c == null) {
            return 0;
        }
        try {
            Point point = new Point();
            c.getSize(point);
            i = point.y;
            return i;
        } catch (Exception e) {
            LLog.m56862d("DevicesUtil", e.getMessage());
            return i;
        }
    }

    /* renamed from: b */
    public static int m38077b(Context context) {
        C89219l.m154719c(context, "");
        Display c = m38078c(context);
        int i = 0;
        if (c == null) {
            return 0;
        }
        try {
            Point point = new Point();
            c.getSize(point);
            i = point.x;
            return i;
        } catch (Exception e) {
            LLog.m56862d("DevicesUtil", e.getMessage());
            return i;
        }
    }

    /* renamed from: c */
    private static Display m38078c(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            Object a = m38076a(context, "window");
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
    public static int m38074a(double d, Context context) {
        C89219l.m154719c(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        double d2 = (double) resources.getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d / d2) + 0.5d);
    }

    /* renamed from: a */
    private static Object m38076a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12285);
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
                    MethodCollector.m26664o(12285);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
