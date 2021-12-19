package androidx.p060l;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.l.ai */
public class C1088ai {
    static {
        Covode.recordClassIndex(1181);
    }

    C1088ai() {
    }

    /* renamed from: c */
    public void mo3852c(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.dp1, null);
        }
    }

    /* renamed from: a */
    public float mo3849a(View view) {
        Float f = (Float) view.getTag(R.id.dp1);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: b */
    public void mo3851b(View view) {
        if (view.getTag(R.id.dp1) == null) {
            view.setTag(R.id.dp1, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: a */
    public void mo3850a(View view, float f) {
        Float f2 = (Float) view.getTag(R.id.dp1);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public void mo3854b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo3854b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: a */
    public void mo3853a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo3853a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: a */
    public void mo3855a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }
}
