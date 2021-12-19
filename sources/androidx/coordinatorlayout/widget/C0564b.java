package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.coordinatorlayout.widget.b */
public final class C0564b {

    /* renamed from: a */
    static final ThreadLocal<Matrix> f2439a = new ThreadLocal<>();

    /* renamed from: b */
    static final ThreadLocal<RectF> f2440b = new ThreadLocal<>();

    static {
        Covode.recordClassIndex(639);
    }

    /* renamed from: a */
    static void m2172a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m2172a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
