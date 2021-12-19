package com.bytedance.ies.bullet.service.popup.p1183b;

import android.content.ClipboardManager;
import android.content.Context;
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
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.ies.bullet.service.popup.b.c */
public final class C16934c {

    /* renamed from: a */
    public static final C16934c f40273a = new C16934c();

    /* renamed from: b */
    private static float f40274b = -1.0f;

    /* renamed from: c */
    private static int f40275c = -1;

    /* renamed from: d */
    private static int f40276d = -1;

    private C16934c() {
    }

    static {
        Covode.recordClassIndex(19376);
    }

    /* renamed from: a */
    public static final C16935a m31205a(Context context) {
        C89219l.m154719c(context, "");
        int i = f40275c;
        int i2 = f40276d;
        if (i > 0 && i2 > 0 && i2 >= i) {
            return new C16935a(i, i2);
        }
        try {
            Object a = m31206a(context, "window");
            if (a != null) {
                WindowManager windowManager = (WindowManager) a;
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    if (defaultDisplay == null) {
                        return new C16935a(i, i2);
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    defaultDisplay.getRealSize(point);
                    i = m31207b(point.x, context);
                    i2 = m31207b(point.y, context);
                } else {
                    Resources resources = context.getResources();
                    C89219l.m154709a((Object) resources, "");
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i = m31207b(displayMetrics.widthPixels, context);
                    i2 = m31207b(displayMetrics.heightPixels, context);
                }
                return new C16935a(i, i2);
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.b.c$a */
    public static final class C16935a {

        /* renamed from: a */
        public final int f40277a;

        /* renamed from: b */
        public final int f40278b;

        static {
            Covode.recordClassIndex(19377);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16935a)) {
                return false;
            }
            C16935a aVar = (C16935a) obj;
            return this.f40277a == aVar.f40277a && this.f40278b == aVar.f40278b;
        }

        public final int hashCode() {
            return (this.f40277a * 31) + this.f40278b;
        }

        public final String toString() {
            return "DisplayMetric(width=" + this.f40277a + ", height=" + this.f40278b + ")";
        }

        public C16935a(int i, int i2) {
            this.f40277a = i;
            this.f40278b = i2;
        }
    }

    /* renamed from: a */
    public static final int m31204a(int i, Context context) {
        C89219l.m154719c(context, "");
        if (f40274b < 0.0f) {
            Resources resources = context.getResources();
            C89219l.m154709a((Object) resources, "");
            f40274b = resources.getDisplayMetrics().density;
        }
        return C89241a.m154730a((((float) i) * f40274b) + 0.5f);
    }

    /* renamed from: b */
    public static final int m31207b(int i, Context context) {
        C89219l.m154719c(context, "");
        if (f40274b < 0.0f) {
            Resources resources = context.getResources();
            C89219l.m154709a((Object) resources, "");
            f40274b = resources.getDisplayMetrics().density;
        }
        return (int) ((((float) i) / f40274b) + 0.5f);
    }

    /* renamed from: a */
    private static Object m31206a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1046);
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
                    MethodCollector.m26664o(1046);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
