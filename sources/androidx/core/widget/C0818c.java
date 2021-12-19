package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
public final class C0818c {

    /* renamed from: a */
    private static Field f3046a;

    /* renamed from: b */
    private static boolean f3047b;

    static {
        Covode.recordClassIndex(901);
    }

    /* renamed from: a */
    public static Drawable m2886a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f3047b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3046a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3047b = true;
        }
        Field field = f3046a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f3046a = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m2887a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof AbstractC0825i) {
            ((AbstractC0825i) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2888a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof AbstractC0825i) {
            ((AbstractC0825i) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
