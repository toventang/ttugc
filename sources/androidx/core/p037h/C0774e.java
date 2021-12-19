package androidx.core.p037h;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.e */
public final class C0774e {
    static {
        Covode.recordClassIndex(855);
    }

    /* renamed from: a */
    public static int m2693a(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return Gravity.getAbsoluteGravity(i, i2);
    }

    /* renamed from: a */
    public static void m2694a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }
}
