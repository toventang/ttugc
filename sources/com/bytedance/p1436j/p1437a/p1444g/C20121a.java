package com.bytedance.p1436j.p1437a.p1444g;

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
import java.lang.reflect.Method;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.j.a.g.a */
public final class C20121a {

    /* renamed from: a */
    public static int f47884a = -1;

    /* renamed from: b */
    public static int f47885b = -1;

    /* renamed from: c */
    public static final C20121a f47886c = new C20121a();

    /* renamed from: d */
    private static int f47887d = -1;

    /* renamed from: e */
    private static int f47888e = -1;

    private C20121a() {
    }

    static {
        Covode.recordClassIndex(23629);
    }

    /* renamed from: a */
    public static boolean m38070a() {
        int i = f47887d;
        boolean z = false;
        if (i == -1) {
            try {
                Class<?> cls = Class.forName("android.util.FtFeature");
                C89219l.m154709a((Object) cls, "");
                Method declaredMethod = cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE);
                C89219l.m154709a((Object) declaredMethod, "");
                Object invoke = declaredMethod.invoke(cls, 32);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i2 = z ? 1 : 0;
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    f47887d = i2;
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

    /* renamed from: b */
    public static boolean m38072b(Context context) {
        C89219l.m154719c(context, "");
        int i = f47888e;
        boolean z = false;
        if (i == -1) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                Method method = loadClass.getMethod("hasNotchInScreen", new Class[0]);
                C89219l.m154709a((Object) method, "");
                Object invoke = method.invoke(loadClass, new Object[0]);
                if (invoke != null) {
                    z = ((Boolean) invoke).booleanValue();
                    int i2 = z ? 1 : 0;
                    int i3 = z ? 1 : 0;
                    int i4 = z ? 1 : 0;
                    f47888e = i2;
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

    /* renamed from: c */
    public static int[] m38073c(Context context) {
        int[] iArr = {0, 0};
        if (context == null) {
            return iArr;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Method method = loadClass.getMethod("getNotchSize", new Class[0]);
            C89219l.m154709a((Object) method, "");
            Object invoke = method.invoke(loadClass, new Object[0]);
            if (invoke != null) {
                return (int[]) invoke;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return iArr;
        }
    }

    /* renamed from: a */
    public static boolean m38071a(Context context) {
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
                        Object a = m38069a(context, "window");
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
    private static Object m38069a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12628);
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
                    MethodCollector.m26664o(12628);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
