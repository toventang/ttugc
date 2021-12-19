package androidx.p060l;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.l.af */
class C1085af extends C1088ai {

    /* renamed from: a */
    private static Method f3731a;

    /* renamed from: b */
    private static boolean f3732b;

    /* renamed from: c */
    private static Method f3733c;

    /* renamed from: d */
    private static boolean f3734d;

    static {
        Covode.recordClassIndex(1178);
    }

    @Override // androidx.p060l.C1088ai
    /* renamed from: b */
    public final void mo3851b(View view) {
    }

    @Override // androidx.p060l.C1088ai
    /* renamed from: c */
    public final void mo3852c(View view) {
    }

    C1085af() {
    }

    @Override // androidx.p060l.C1088ai
    /* renamed from: a */
    public final float mo3849a(View view) {
        if (!f3734d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f3733c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3734d = true;
        }
        Method method = f3733c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo3849a(view);
    }

    @Override // androidx.p060l.C1088ai
    /* renamed from: a */
    public final void mo3850a(View view, float f) {
        if (!f3732b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f3731a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3732b = true;
        }
        Method method = f3731a;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(f));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }
}
