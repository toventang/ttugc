package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.content.ClipboardManager;
import android.content.Context;
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
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.f */
public final class C76274f {

    /* renamed from: a */
    public static final C76274f f171336a = new C76274f();

    private C76274f() {
    }

    static {
        Covode.recordClassIndex(89225);
    }

    /* renamed from: a */
    public static final float m133713a(Context context) {
        C89219l.m154721d(context, "");
        return m133715b(context) + m133716c(context);
    }

    /* renamed from: c */
    private static float m133716c(Context context) {
        C89219l.m154721d(context, "");
        return C84912r.m145930a(context, 12.0f);
    }

    /* renamed from: b */
    private static float m133715b(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        Object a = m133714a(context, "window");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.x;
        float c = m133716c(context);
        C89219l.m154721d(context, "");
        float a2 = C84912r.m145930a(context, 20.0f);
        C89219l.m154721d(context, "");
        float a3 = C84912r.m145930a(context, 52.0f);
        C89219l.m154721d(context, "");
        float a4 = C84912r.m145930a(context, 80.0f);
        double d = (double) ((((float) i) - a2) - (c * 5.0f));
        Double.isNaN(d);
        float f = (float) (d / 5.3d);
        if (f < a3) {
            return a3;
        }
        return f > a4 ? a4 : f;
    }

    /* renamed from: a */
    private static Object m133714a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7395);
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
                    MethodCollector.m26664o(7395);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
