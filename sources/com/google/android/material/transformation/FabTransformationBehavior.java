package com.google.android.material.transformation;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p1951a.C26562h;
import com.google.android.material.p1951a.C26563i;
import com.google.android.material.p1951a.C26564j;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f63329c;

    /* renamed from: d */
    private final RectF f63330d;

    /* renamed from: e */
    private final RectF f63331e;

    /* renamed from: f */
    private final int[] f63332f;

    static {
        Covode.recordClassIndex(32197);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C26732a mo44377a(Context context, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public static class C26732a {

        /* renamed from: a */
        public C26562h f63344a;

        /* renamed from: b */
        public C26564j f63345b;

        static {
            Covode.recordClassIndex(32202);
        }

        protected C26732a() {
        }
    }

    public FabTransformationBehavior() {
        this.f63329c = new Rect();
        this.f63330d = new RectF();
        this.f63331e = new RectF();
        this.f63332f = new int[2];
    }

    /* renamed from: a */
    private static ViewGroup m53069a(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2517a(CoordinatorLayout.C0560e eVar) {
        if (eVar.f2423h == 0) {
            eVar.f2423h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63329c = new Rect();
        this.f63330d = new RectF();
        this.f63331e = new RectF();
        this.f63332f = new int[2];
    }

    /* renamed from: a */
    private void m53071a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f63332f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: a */
    private float m53067a(View view, View view2, C26564j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f63330d;
        RectF rectF2 = this.f63331e;
        m53071a(view, rectF);
        m53071a(view2, rectF2);
        int i = jVar.f62674a & 7;
        if (i != 1) {
            if (i == 3) {
                f = rectF2.left;
                f2 = rectF.left;
            } else if (i != 5) {
                f3 = 0.0f;
            } else {
                f = rectF2.right;
                f2 = rectF.right;
            }
            f3 = f - f2;
        } else {
            f = rectF2.centerX();
            f2 = rectF.centerX();
            f3 = f - f2;
        }
        return f3 + jVar.f62675b;
    }

    /* renamed from: b */
    private float m53072b(View view, View view2, C26564j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f63330d;
        RectF rectF2 = this.f63331e;
        m53071a(view, rectF);
        m53071a(view2, rectF2);
        int i = jVar.f62674a & 112;
        if (i != 16) {
            if (i == 48) {
                f = rectF2.top;
                f2 = rectF.top;
            } else if (i != 80) {
                f3 = 0.0f;
            } else {
                f = rectF2.bottom;
                f2 = rectF.bottom;
            }
            f3 = f - f2;
        } else {
            f = rectF2.centerY();
            f2 = rectF.centerY();
            f3 = f - f2;
        }
        return f3 + jVar.f62676c;
    }

    /* renamed from: a */
    private static float m53068a(C26732a aVar, C26563i iVar, float f) {
        long j = iVar.f62669a;
        long j2 = iVar.f62670b;
        C26563i a = aVar.f63344a.mo43706a("expansion");
        return f + (iVar.mo43710a().getInterpolation(((float) (((a.f62669a + a.f62670b) + 17) - j)) / ((float) j2)) * (0.0f - f));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2529a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d3, code lost:
        if (r15 != false) goto L_0x00d5;
     */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet mo44375b(final android.view.View r28, final android.view.View r29, final boolean r30, boolean r31) {
        /*
        // Method dump skipped, instructions count: 846
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo44375b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* renamed from: a */
    private static void m53070a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }
}
