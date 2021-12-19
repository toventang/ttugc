package androidx.core.p037h;

import android.os.Build;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: androidx.core.h.g */
public final class C0777g {

    /* renamed from: a */
    private static Field f2938a;

    /* renamed from: b */
    private static boolean f2939b;

    static {
        Covode.recordClassIndex(858);
    }

    /* renamed from: a */
    public static void m2700a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m2701b(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m2701b(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: b */
    private static void m2701b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f2939b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f2938a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2939b = true;
        }
        Field field = f2938a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
