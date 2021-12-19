package com.bytedance.lynx.hybrid.p1523i;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.i.a */
public final class C21201a {

    /* renamed from: a */
    public static final C21201a f50310a = new C21201a();

    /* renamed from: b */
    private static int f50311b = -1;

    /* renamed from: c */
    private static int f50312c = -1;

    /* renamed from: d */
    private static int f50313d = -1;

    /* renamed from: e */
    private static int f50314e = -1;

    private C21201a() {
    }

    static {
        Covode.recordClassIndex(24817);
    }

    /* renamed from: a */
    private static boolean m39902a() {
        int i = f50311b;
        boolean z = false;
        if (i == -1) {
            try {
                Class<?> cls = Class.forName("android.util.FtFeature");
                Object invoke = cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i2 = z ? 1 : 0;
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    f50311b = i2;
                    return z;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Exception unused) {
            }
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m39903a(android.content.Context r4) {
        /*
            boolean r0 = m39902a()
            r3 = 1
            if (r0 != 0) goto L_0x000f
            int r2 = com.bytedance.lynx.hybrid.p1523i.C21201a.f50312c
            r0 = -1
            r1 = 0
            if (r2 == r0) goto L_0x0010
            if (r2 != r3) goto L_0x0019
        L_0x000f:
            return r3
        L_0x0010:
            boolean r0 = m39906d(r4)
            com.bytedance.lynx.hybrid.p1523i.C21201a.f50312c = r0
            if (r0 == 0) goto L_0x0019
            goto L_0x000f
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.p1523i.C21201a.m39903a(android.content.Context):boolean");
    }

    /* renamed from: c */
    public static int m39905c(Context context) {
        C89219l.m154719c(context, "");
        int i = f50314e;
        if (i != -1) {
            return i;
        }
        int i2 = m39907e(context)[1];
        if (i2 <= 0) {
            i2 = (int) C21204d.m39916a(context, 28.0f);
        }
        f50314e = i2;
        return i2;
    }

    /* renamed from: b */
    public static boolean m39904b(Context context) {
        C89219l.m154719c(context, "");
        int i = f50313d;
        boolean z = false;
        if (i == -1) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                Object invoke = loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0]);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i2 = z ? 1 : 0;
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    f50313d = i2;
                    return z;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Exception unused) {
            }
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private static int[] m39907e(Context context) {
        int[] iArr = {0, 0};
        if (context == null) {
            return iArr;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Object invoke = loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
            if (invoke != null) {
                return (int[]) invoke;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return iArr;
        }
    }

    /* renamed from: d */
    private static boolean m39906d(Context context) {
        try {
            String str = Build.BRAND;
            C89219l.m154709a((Object) str, "");
            if (str != null) {
                String lowerCase = str.toLowerCase();
                C89219l.m154709a((Object) lowerCase, "");
                if (TextUtils.equals("oppo", lowerCase) && context != null && context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) {
                    int i = Build.VERSION.SDK_INT;
                    if (context != null) {
                        int i2 = Build.VERSION.SDK_INT;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        Object a = m39901a(context, "window");
                        if (a != null) {
                            ((WindowManager) a).getDefaultDisplay().getRealMetrics(displayMetrics);
                            if (displayMetrics.heightPixels >= 2280) {
                                return true;
                            }
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    }
                    return false;
                }
                return false;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static Object m39901a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4256);
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
                    MethodCollector.m26664o(4256);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
