package androidx.p060l;

import android.graphics.Matrix;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.l.ag */
class C1086ag extends C1085af {

    /* renamed from: a */
    private static Method f3735a;

    /* renamed from: b */
    private static boolean f3736b;

    /* renamed from: c */
    private static Method f3737c;

    /* renamed from: d */
    private static boolean f3738d;

    static {
        Covode.recordClassIndex(1179);
    }

    C1086ag() {
    }

    @Override // androidx.p060l.C1088ai
    /* renamed from: a */
    public final void mo3853a(View view, Matrix matrix) {
        if (!f3736b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f3735a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3736b = true;
        }
        Method method = f3735a;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // androidx.p060l.C1088ai
    /* renamed from: b */
    public final void mo3854b(View view, Matrix matrix) {
        if (!f3738d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f3737c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3738d = true;
        }
        Method method = f3737c;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
