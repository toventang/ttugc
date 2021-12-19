package androidx.p060l;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.l.ah */
final class C1087ah extends C1086ag {

    /* renamed from: a */
    private static Method f3739a;

    /* renamed from: b */
    private static boolean f3740b;

    static {
        Covode.recordClassIndex(1180);
    }

    C1087ah() {
    }

    @Override // androidx.p060l.C1088ai
    /* renamed from: a */
    public final void mo3855a(View view, int i, int i2, int i3, int i4) {
        if (!f3740b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                f3739a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3740b = true;
        }
        Method method = f3739a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
