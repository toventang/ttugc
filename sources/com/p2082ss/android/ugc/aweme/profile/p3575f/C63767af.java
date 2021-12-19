package com.p2082ss.android.ugc.aweme.profile.p3575f;

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
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.profile.f.af */
public final class C63767af {

    /* renamed from: a */
    public static final C63767af f144542a = new C63767af();

    private C63767af() {
    }

    static {
        Covode.recordClassIndex(75095);
    }

    /* renamed from: a */
    public static final int m115319a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            Object a = m115320a(context, "window");
            if (!(a instanceof WindowManager)) {
                a = null;
            }
            WindowManager windowManager = (WindowManager) a;
            if (windowManager == null) {
                return C34723i.m70928b(context);
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay == null) {
                return 0;
            }
            defaultDisplay.getSize(point);
            return point.x;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static Object m115320a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7515);
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
                    MethodCollector.m26664o(7515);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
