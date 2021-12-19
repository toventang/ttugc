package androidx.p060l;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.l.aa */
final class C1077aa {

    /* renamed from: a */
    private static Method f3717a;

    /* renamed from: b */
    private static boolean f3718b;

    static {
        Covode.recordClassIndex(1170);
    }

    /* renamed from: a */
    private static void m3634a() {
        if (!f3718b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                f3717a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3718b = true;
        }
    }

    /* renamed from: a */
    static void m3635a(ViewGroup viewGroup, boolean z) {
        m3634a();
        Method method = f3717a;
        if (method != null) {
            try {
                method.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
