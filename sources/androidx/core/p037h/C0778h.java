package androidx.core.p037h;

import android.os.Build;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.h */
public final class C0778h {
    static {
        Covode.recordClassIndex(859);
    }

    /* renamed from: a */
    public static int m2702a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginStart();
    }

    /* renamed from: b */
    public static int m2704b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginEnd();
    }

    /* renamed from: a */
    public static void m2703a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginStart(i);
    }

    /* renamed from: b */
    public static void m2705b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginEnd(i);
    }
}
