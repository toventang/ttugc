package com.bytedance.immersionbar;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.immersionbar.d */
public final class C20056d {

    /* renamed from: a */
    private static Method f47676a;

    /* renamed from: b */
    private static Method f47677b;

    /* renamed from: c */
    private static Field f47678c;

    /* renamed from: d */
    private static int f47679d;

    /* renamed from: a */
    private static Object m37942a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_immersionbar_FlymeOSStatusBarFontUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_immersionbar_FlymeOSStatusBarFontUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(23561);
        try {
            f47676a = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            f47677b = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            f47678c = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException unused3) {
        }
        try {
            f47679d = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException unused4) {
        }
    }

    /* renamed from: a */
    private static void m37945a(View view, boolean z) {
        int i;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i = f47679d | systemUiVisibility;
        } else {
            i = (f47679d ^ -1) & systemUiVisibility;
        }
        if (i != systemUiVisibility) {
            view.setSystemUiVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m37943a(Activity activity, int i) {
        Method method = f47676a;
        boolean z = false;
        if (method != null) {
            try {
                m37942a(method, activity, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        } else {
            if (((((((16711680 & i) >> 16) * 38) + (((65280 & i) >> 8) * 75)) + ((i & 255) * 15)) >> 7) < 50) {
                z = true;
            }
            if (f47678c != null) {
                m37944a(activity, z, z);
                Window window = activity.getWindow();
                try {
                    m37946a(window, i);
                    if (C20059f.f47697a > 22) {
                        m37945a(window.getDecorView(), true);
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else {
                m37944a(activity, z, true);
            }
        }
    }

    /* renamed from: a */
    private static void m37946a(Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        Field field = f47678c;
        if (field != null) {
            try {
                if (field.getInt(attributes) != i) {
                    f47678c.set(attributes, Integer.valueOf(i));
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m37947a(Window window, boolean z) {
        if (C20059f.f47697a < 23) {
            m37948a(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
            return;
        }
        m37945a(window.getDecorView(), z);
        m37946a(window, 0);
    }

    /* renamed from: a */
    static void m37944a(Activity activity, boolean z, boolean z2) {
        Method method = f47677b;
        if (method != null) {
            try {
                m37942a(method, activity, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        } else if (z2) {
            m37947a(activity.getWindow(), z);
        }
    }

    /* renamed from: a */
    private static boolean m37948a(WindowManager.LayoutParams layoutParams, String str, boolean z) {
        int i;
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(layoutParams);
            Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i3 = declaredField2.getInt(layoutParams);
            if (z) {
                i = i2 | i3;
            } else {
                i = (i2 ^ -1) & i3;
            }
            if (i3 == i) {
                return false;
            }
            declaredField2.setInt(layoutParams, i);
            return true;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
