package com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.b.c */
public final class C41098c {
    static {
        Covode.recordClassIndex(48968);
    }

    /* renamed from: a */
    public static int m82777a(Context context) {
        Display defaultDisplay = ((WindowManager) m82778a(context, "window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    /* renamed from: a */
    private static Object m82778a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8471);
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
                    MethodCollector.m26664o(8471);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
