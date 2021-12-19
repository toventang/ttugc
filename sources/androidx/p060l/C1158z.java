package androidx.p060l;

import android.animation.LayoutTransition;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.l.z */
final class C1158z {

    /* renamed from: a */
    private static LayoutTransition f3916a;

    /* renamed from: b */
    private static Field f3917b;

    /* renamed from: c */
    private static boolean f3918c;

    /* renamed from: d */
    private static Method f3919d;

    /* renamed from: e */
    private static boolean f3920e;

    static {
        Covode.recordClassIndex(1251);
    }

    /* renamed from: a */
    private static void m3843a(LayoutTransition layoutTransition) {
        if (!f3920e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f3919d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3920e = true;
        }
        Method method = f3919d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r4 == false) goto L_0x0075;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m3844a(android.view.ViewGroup r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p060l.C1158z.m3844a(android.view.ViewGroup, boolean):void");
    }
}
