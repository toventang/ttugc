package androidx.core.p037h.p038a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.a.b */
public final class C0729b {
    static {
        Covode.recordClassIndex(810);
    }

    /* renamed from: a */
    public static void m2592a(AccessibilityEvent accessibilityEvent, int i) {
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setContentChangeTypes(i);
    }
}
