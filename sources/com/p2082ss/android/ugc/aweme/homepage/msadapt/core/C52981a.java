package com.p2082ss.android.ugc.aweme.homepage.msadapt.core;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.microsoft.device.display.DisplayMask;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.core.a */
public final class C52981a {

    /* renamed from: a */
    public static Boolean f121831a;

    /* renamed from: b */
    public static final C52982a f121832b = new C52982a((byte) 0);

    static {
        Covode.recordClassIndex(62516);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.core.a$a */
    public static final class C52982a {
        static {
            Covode.recordClassIndex(62517);
        }

        private C52982a() {
        }

        public /* synthetic */ C52982a(byte b) {
            this();
        }

        /* renamed from: f */
        private static Rect m97916f(Context context) {
            C89219l.m154721d(context, "");
            Rect rect = new Rect();
            Object a = m97911a(context, "window");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) a).getDefaultDisplay().getRectSize(rect);
            return rect;
        }

        /* renamed from: a */
        public static Rect m97910a(Context context) {
            DisplayMask fromResourcesRectApproximation;
            C89219l.m154721d(context, "");
            if (!m97912b(context) || (fromResourcesRectApproximation = DisplayMask.fromResourcesRectApproximation(context)) == null) {
                return null;
            }
            List<Rect> boundingRectsForRotation = fromResourcesRectApproximation.getBoundingRectsForRotation(m97915e(context));
            if (boundingRectsForRotation.size() == 0) {
                return new Rect(0, 0, 0, 0);
            }
            return boundingRectsForRotation.get(0);
        }

        /* renamed from: b */
        public static boolean m97912b(Context context) {
            boolean z;
            boolean z2;
            C89219l.m154721d(context, "");
            if (C52981a.f121831a == null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        z2 = packageManager.hasSystemFeature("com.microsoft.device.display.displaymask");
                    } else {
                        z2 = false;
                    }
                    z = Boolean.valueOf(z2);
                } catch (Exception unused) {
                    z = false;
                }
                C52981a.f121831a = z;
            }
            Boolean bool = C52981a.f121831a;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* renamed from: d */
        public static boolean m97914d(Context context) {
            C89219l.m154721d(context, "");
            Rect a = m97910a(context);
            Rect f = m97916f(context);
            if (a == null || f.width() <= 0 || f.height() <= 0) {
                return false;
            }
            return a.intersect(f);
        }

        /* renamed from: e */
        public static int m97915e(Context context) {
            C89219l.m154721d(context, "");
            try {
                Object a = m97911a(context, "window");
                if (a != null) {
                    Display defaultDisplay = ((WindowManager) a).getDefaultDisplay();
                    C89219l.m154716b(defaultDisplay, "");
                    return defaultDisplay.getRotation();
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            } catch (IllegalStateException unused) {
                return 0;
            }
        }

        /* renamed from: c */
        public static List<Rect> m97913c(Context context) {
            C89219l.m154721d(context, "");
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect a = m97910a(context);
            Rect f = m97916f(context);
            if (a != null) {
                if (a.left > 0) {
                    rect.left = 0;
                    rect.right = a.left;
                    rect.top = 0;
                    rect.bottom = f.bottom;
                    rect2.left = a.right;
                    rect2.right = f.right;
                    rect2.top = 0;
                    rect2.bottom = f.bottom;
                } else {
                    rect.left = 0;
                    rect.right = f.right;
                    rect.top = 0;
                    rect.bottom = a.top;
                    rect2.left = 0;
                    rect2.right = f.right;
                    rect2.top = a.bottom;
                    rect2.bottom = f.bottom;
                }
            }
            if (rect.isEmpty() || rect2.isEmpty()) {
                return null;
            }
            return C89070n.m154522b(rect, rect2);
        }

        /* renamed from: a */
        private static Object m97911a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(10369);
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
                        MethodCollector.m26664o(10369);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }
}
