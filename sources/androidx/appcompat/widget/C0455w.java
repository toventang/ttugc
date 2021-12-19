package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.appcompat.p019b.p020a.C0268c;
import androidx.core.graphics.drawable.AbstractC0711f;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.widget.w */
public final class C0455w {

    /* renamed from: a */
    public static final Rect f1757a = new Rect();

    /* renamed from: b */
    private static Class<?> f1758b;

    static {
        Covode.recordClassIndex(520);
        int i = Build.VERSION.SDK_INT;
        try {
            f1758b = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: b */
    static void m1696b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m1698d(drawable);
        }
    }

    /* renamed from: d */
    private static void m1698d(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C0401ah.f1570e);
        } else {
            drawable.setState(C0401ah.f1573h);
        }
        drawable.setState(state);
    }

    /* renamed from: c */
    public static boolean m1697c(Drawable drawable) {
        while (true) {
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            int i3 = Build.VERSION.SDK_INT;
            if (drawable instanceof DrawableContainer) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                    return true;
                }
                Drawable[] children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                for (Drawable drawable2 : children) {
                    if (!m1697c(drawable2)) {
                        return false;
                    }
                }
                return true;
            } else if (drawable instanceof AbstractC0711f) {
                drawable = ((AbstractC0711f) drawable).mo2756a();
            } else if (drawable instanceof C0268c) {
                drawable = ((C0268c) drawable).f873a;
            } else if (!(drawable instanceof ScaleDrawable)) {
                return true;
            } else {
                drawable = ((ScaleDrawable) drawable).getDrawable();
            }
        }
    }

    /* renamed from: a */
    public static Rect m1695a(Drawable drawable) {
        if (f1758b != null) {
            try {
                if (drawable instanceof AbstractC0711f) {
                    drawable = ((AbstractC0711f) drawable).mo2756a();
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    Field[] fields = f1758b.getFields();
                    for (Field field : fields) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
            }
        }
        return f1757a;
    }

    /* renamed from: a */
    public static PorterDuff.Mode m1694a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
