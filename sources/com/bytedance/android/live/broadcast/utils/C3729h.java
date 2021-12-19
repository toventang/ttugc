package com.bytedance.android.live.broadcast.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
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
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.live.broadcast.utils.h */
public final class C3729h {

    /* renamed from: a */
    private static WindowManager f10326a;

    /* renamed from: b */
    private static final Point f10327b = new Point();

    static {
        Covode.recordClassIndex(4244);
    }

    /* renamed from: a */
    public static final int m9239a() {
        Object obj;
        Context a;
        if (f10326a == null) {
            Context e = C3966y.m9669e();
            WindowManager windowManager = null;
            if (e == null || (a = m9240a(e)) == null) {
                obj = null;
            } else {
                obj = m9241a(a, "window");
            }
            if (obj instanceof WindowManager) {
                windowManager = obj;
            }
            f10326a = windowManager;
        }
        WindowManager windowManager2 = f10326a;
        if (windowManager2 == null) {
            return C3966y.m9664c();
        }
        Display defaultDisplay = windowManager2.getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getSize(f10327b);
        }
        return f10327b.x;
    }

    /* renamed from: b */
    public static final int m9242b() {
        Object obj;
        Context a;
        if (f10326a == null) {
            Context e = C3966y.m9669e();
            WindowManager windowManager = null;
            if (e == null || (a = m9240a(e)) == null) {
                obj = null;
            } else {
                obj = m9241a(a, "window");
            }
            if (obj instanceof WindowManager) {
                windowManager = obj;
            }
            f10326a = windowManager;
        }
        WindowManager windowManager2 = f10326a;
        if (windowManager2 == null) {
            return C3966y.m9664c();
        }
        Display defaultDisplay = windowManager2.getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getSize(f10327b);
        }
        return f10327b.y;
    }

    /* renamed from: a */
    private static Context m9240a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private static Object m9241a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5749);
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
                    MethodCollector.m26664o(5749);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
