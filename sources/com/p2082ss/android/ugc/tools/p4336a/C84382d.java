package com.p2082ss.android.ugc.tools.p4336a;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.a.d */
public final class C84382d {

    /* renamed from: a */
    static final ThreadLocal<Matrix> f188656a = new ThreadLocal<>();

    /* renamed from: b */
    static final ThreadLocal<RectF> f188657b = new ThreadLocal<>();

    /* renamed from: c */
    public static final C84382d f188658c = new C84382d();

    private C84382d() {
    }

    static {
        Covode.recordClassIndex(98347);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo129389a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            mo129389a(viewParent, view2, matrix);
            matrix.preTranslate(-((float) view2.getScrollX()), -((float) view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        C89219l.m154716b(matrix2, "");
        if (!matrix2.isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
