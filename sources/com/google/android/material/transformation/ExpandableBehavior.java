package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.google.android.material.p1955d.AbstractC26627b;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0557b<View> {

    /* renamed from: a */
    public int f63322a;

    static {
        Covode.recordClassIndex(32193);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo44373a(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public abstract boolean mo2529a(CoordinatorLayout coordinatorLayout, View view, View view2);

    public ExpandableBehavior() {
    }

    /* renamed from: a */
    private boolean m53060a(boolean z) {
        if (z) {
            int i = this.f63322a;
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (this.f63322a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    public final boolean mo2533b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        AbstractC26627b bVar = (AbstractC26627b) view2;
        if (!m53060a(bVar.mo44024a())) {
            return false;
        }
        if (bVar.mo44024a()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f63322a = i;
        return mo44373a((View) bVar, view, bVar.mo44024a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2524a(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final int i2;
        if (!C0792v.m2788v(view)) {
            List<View> b = coordinatorLayout.mo2475b(view);
            int size = b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                View view2 = b.get(i3);
                if (mo2529a(coordinatorLayout, view, view2)) {
                    final AbstractC26627b bVar = (AbstractC26627b) view2;
                    if (bVar != null && m53060a(bVar.mo44024a())) {
                        if (bVar.mo44024a()) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        this.f63322a = i2;
                        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                            /* class com.google.android.material.transformation.ExpandableBehavior.ViewTreeObserver$OnPreDrawListenerC267261 */

                            static {
                                Covode.recordClassIndex(32194);
                            }

                            public final boolean onPreDraw() {
                                view.getViewTreeObserver().removeOnPreDrawListener(this);
                                if (ExpandableBehavior.this.f63322a == i2) {
                                    ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                                    AbstractC26627b bVar = bVar;
                                    expandableBehavior.mo44373a((View) bVar, view, bVar.mo44024a(), false);
                                }
                                return false;
                            }
                        });
                    }
                } else {
                    i3++;
                }
            }
        }
        return false;
    }
}
