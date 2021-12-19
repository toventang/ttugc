package android.view;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* renamed from: android.view.a */
public class C0174a extends View {
    static {
        Covode.recordClassIndex(198);
    }

    /* renamed from: a */
    public static void m578a(View view) {
        view.onFinishInflate();
    }

    /* renamed from: a */
    public static void m579a(View view, int i) {
        ((TextView) view).setMinWidth(i);
    }

    /* renamed from: b */
    public static void m580b(View view, int i) {
        ((TextView) view).setMinHeight(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Method m577a(Class cls, String str, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, cls2);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new IllegalStateException("getMethod failed ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: a */
    public static ViewGroup.MarginLayoutParams m576a(ViewGroup viewGroup, int i, int i2) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof ConstraintLayout) {
            return new ConstraintLayout.C0547a(i, i2);
        }
        return new ViewGroup.MarginLayoutParams(i, i2);
    }
}
