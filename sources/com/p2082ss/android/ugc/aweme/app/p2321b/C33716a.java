package com.p2082ss.android.ugc.aweme.app.p2321b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.b.a */
public final class C33716a {
    static {
        Covode.recordClassIndex(40611);
    }

    /* renamed from: a */
    private static boolean m69033a() {
        if (!TextUtils.equals("vivo", Build.BRAND.toLowerCase())) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m69035b(Context context) {
        if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m69036c(Context context) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.equals("huawei", lowerCase) && !TextUtils.equals("honor", lowerCase)) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m69038e(Context context) {
        String string;
        if (context != null && Build.VERSION.SDK_INT >= 27) {
            try {
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
                if (identifier <= 0 || (string = resources.getString(identifier)) == null || TextUtils.isEmpty(string)) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m69037d(Context context) {
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 28) {
            View decorView = ((Activity) context).getWindow().getDecorView();
            try {
                Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
                Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
                List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
                if (list == null || list.size() <= 0) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m69034a(Context context) {
        if (m69035b(context) || m69033a() || m69036c(context) || m69032a("ro.miui.notch", context) == 1 || m69037d(context) || m69038e(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m69032a(String str, Context context) {
        int i = 0;
        if (!"Xiaomi".equals(Build.MANUFACTURER)) {
            return 0;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            i = ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), new Integer(0))).intValue();
            return i;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return i;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return i;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return i;
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return i;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return i;
        }
    }
}
