package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.graphics.drawable.a */
public final class C0705a {

    /* renamed from: a */
    private static Method f2778a;

    /* renamed from: b */
    private static boolean f2779b;

    /* renamed from: c */
    private static Method f2780c;

    /* renamed from: d */
    private static boolean f2781d;

    static {
        Covode.recordClassIndex(786);
    }

    /* renamed from: b */
    public static int m2502b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getAlpha();
    }

    /* renamed from: c */
    public static boolean m2504c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: e */
    public static Drawable m2506e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!(drawable instanceof AbstractC0710e)) {
                return new C0713h(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof AbstractC0710e)) {
            return new C0712g(drawable);
        } else {
            return drawable;
        }
    }

    /* renamed from: f */
    public static int m2507f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        int i = Build.VERSION.SDK_INT;
        if (!f2781d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2780c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2781d = true;
        }
        Method method = f2780c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f2780c = null;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public static void m2505d(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        while (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                drawable = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof AbstractC0711f) {
                drawable = ((AbstractC0711f) drawable).mo2756a();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Drawable child = drawableContainerState.getChild(i);
                    if (child != null) {
                        m2505d(child);
                    }
                }
                return;
            } else {
                return;
            }
        }
        drawable.clearColorFilter();
    }

    /* renamed from: a */
    public static boolean m2501a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }

    /* renamed from: a */
    public static void m2500a(Drawable drawable, boolean z) {
        int i = Build.VERSION.SDK_INT;
        drawable.setAutoMirrored(z);
    }

    /* renamed from: a */
    public static void m2494a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof AbstractC0710e) {
            ((AbstractC0710e) drawable).setTint(i);
        }
    }

    /* renamed from: b */
    public static boolean m2503b(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!f2779b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f2778a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2779b = true;
        }
        Method method = f2778a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                f2778a = null;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m2496a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof AbstractC0710e) {
            ((AbstractC0710e) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2497a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m2499a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof AbstractC0710e) {
            ((AbstractC0710e) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m2493a(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m2495a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m2498a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }
}
