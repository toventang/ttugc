package com.bytedance.ies.bullet.p1184ui.common.p1188d;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.a */
public final class C17034a {
    static {
        Covode.recordClassIndex(19483);
    }

    /* renamed from: a */
    private static boolean m31488a() {
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
    private static boolean m31490b(Context context) {
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

    /* renamed from: d */
    private static boolean m31492d(Context context) {
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

    /* renamed from: c */
    private static boolean m31491c(Context context) {
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
    public static boolean m31489a(Context context) {
        boolean z;
        if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
            z = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } else {
            z = false;
        }
        if (z || m31488a() || m31490b(context) || m31487a("ro.miui.notch", context) == 1 || m31491c(context) || m31492d(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m31487a(String str, Context context) {
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
