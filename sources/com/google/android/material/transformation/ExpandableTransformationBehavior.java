package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f63327b;

    static {
        Covode.recordClassIndex(32195);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo44375b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    public boolean mo44373a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.f63327b;
        if (animatorSet != null) {
            z3 = true;
            animatorSet.cancel();
        } else {
            z3 = false;
        }
        AnimatorSet b = mo44375b(view, view2, z, z3);
        this.f63327b = b;
        b.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.transformation.ExpandableTransformationBehavior.C267271 */

            static {
                Covode.recordClassIndex(32196);
            }

            public final void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.f63327b = null;
            }
        });
        this.f63327b.start();
        if (!z2) {
            this.f63327b.end();
        }
        return true;
    }
}
