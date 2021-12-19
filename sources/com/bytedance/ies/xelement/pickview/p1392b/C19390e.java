package com.bytedance.ies.xelement.pickview.p1392b;

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
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89332a;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.xelement.pickview.b.e */
public final class C19390e {
    static {
        Covode.recordClassIndex(22185);
    }

    /* renamed from: a */
    private static final int m36187a(Context context) {
        Object b;
        WindowManager windowManager;
        Display display = null;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else if (context == null || (b = m36190b(context, "window")) == null) {
            throw new C89388w("null cannot be cast to non-null type");
        } else {
            windowManager = (WindowManager) b;
        }
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        }
        if (display == null) {
            return 0;
        }
        try {
            Point point = new Point();
            display.getSize(point);
            return point.x;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static final Long m36189a(String str) {
        C89219l.m154719c(str, "");
        if (!C89361p.m154874b(str, "#", false)) {
            return null;
        }
        String a = C89361p.m154869a(str, "#", "", false);
        if (a.length() != 8 && a.length() != 6) {
            return null;
        }
        if (a.length() == 6) {
            a = a + "FF";
        }
        try {
            long parseLong = Long.parseLong(a, C89332a.m154829a(16));
            return Long.valueOf(((parseLong >> 8) & 16777215) | ((parseLong << 24) & 4278190080L));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final int m36188a(Context context, String str) {
        float f;
        float f2;
        C89219l.m154719c(str, "");
        if (C89361p.m154876c(str, "rpx", false)) {
            try {
                f = (Float.parseFloat(C89361p.m154869a(str, "rpx", "", false)) * ((float) m36187a(context))) / 750.0f;
            } catch (Exception unused) {
                return 0;
            }
        } else {
            if (C89361p.m154876c(str, "px", false)) {
                String a = C89361p.m154869a(str, "px", "", false);
                if (context == null) {
                    C89219l.m154707a();
                    f2 = 2.0f;
                } else {
                    Resources resources = context.getResources();
                    C89219l.m154709a((Object) resources, "");
                    f2 = resources.getDisplayMetrics().density;
                }
                try {
                    f = Float.parseFloat(a) * f2;
                } catch (Exception unused2) {
                }
            }
            return 0;
        }
        return (int) f;
    }

    /* renamed from: b */
    private static Object m36190b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5393);
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
                    MethodCollector.m26664o(5393);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
