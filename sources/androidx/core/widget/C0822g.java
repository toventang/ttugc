package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.g */
public final class C0822g {

    /* renamed from: a */
    private static Method f3050a;

    /* renamed from: b */
    private static boolean f3051b;

    /* renamed from: c */
    private static Field f3052c;

    /* renamed from: d */
    private static boolean f3053d;

    static {
        Covode.recordClassIndex(905);
    }

    /* renamed from: a */
    public static void m2900a(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f3051b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f3050a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3051b = true;
        }
        Method method = f3050a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m2902a(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (Build.VERSION.SDK_INT >= 21) {
            if (!f3053d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f3052c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f3053d = true;
            }
            Field field = f3052c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2901a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
