package com.bytedance.tux.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class ExpandableLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f55382a;

    /* renamed from: b */
    public final ValueAnimator f55383b;

    /* renamed from: c */
    public float f55384c;

    /* renamed from: d */
    public boolean f55385d;

    /* renamed from: e */
    private int f55386e;

    static {
        Covode.recordClassIndex(27311);
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55383b.cancel();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11615);
        if (this.f55382a) {
            if (this.f55386e <= 0) {
                super.onMeasure(i, i2);
                this.f55386e = getMeasuredHeight();
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((float) this.f55386e) * this.f55384c), 1073741824));
            MethodCollector.m26664o(11615);
        } else if (this.f55385d) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            this.f55386e = 0;
            MethodCollector.m26664o(11615);
        } else {
            super.onMeasure(i, i2);
            this.f55386e = 0;
            MethodCollector.m26664o(11615);
        }
    }

    private /* synthetic */ ExpandableLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ExpandableLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(11760);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f55383b = ofFloat;
        this.f55385d = true;
        C89219l.m154709a((Object) ofFloat, "");
        ofFloat.setInterpolator(C22971a.m43307c());
        C89219l.m154709a((Object) ofFloat, "");
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.bytedance.tux.widget.ExpandableLayout.C233571 */

            /* renamed from: a */
            final /* synthetic */ ExpandableLayout f55387a;

            static {
                Covode.recordClassIndex(27312);
            }

            {
                this.f55387a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandableLayout expandableLayout = this.f55387a;
                C89219l.m154709a((Object) valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    expandableLayout.f55384c = ((Float) animatedValue).floatValue();
                    this.f55387a.requestLayout();
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter(this) {
            /* class com.bytedance.tux.widget.ExpandableLayout.C233582 */

            /* renamed from: a */
            final /* synthetic */ ExpandableLayout f55388a;

            static {
                Covode.recordClassIndex(27313);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f55388a = r1;
            }

            public final void onAnimationEnd(Animator animator) {
                this.f55388a.f55382a = false;
                this.f55388a.requestLayout();
            }

            public final void onAnimationStart(Animator animator, boolean z) {
                super.onAnimationStart(animator, z);
                this.f55388a.f55382a = true;
            }
        });
        MethodCollector.m26664o(11760);
    }
}
