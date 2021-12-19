package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.ar */
public final class C0415ar {

    /* renamed from: a */
    private static Method f1632a;

    static {
        Covode.recordClassIndex(480);
        int i = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1632a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f1632a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m1540a(View view) {
        if (C0792v.m2768e(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m1541b(View view) {
        int i = Build.VERSION.SDK_INT;
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    /* renamed from: a */
    public static void m1539a(View view, Rect rect, Rect rect2) {
        Method method = f1632a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }
}
