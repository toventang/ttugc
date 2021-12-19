package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p030b.C0622a;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.google.android.material.appbar.b */
public abstract class AbstractC26578b extends C26579c<View> {

    /* renamed from: a */
    final Rect f62744a = new Rect();

    /* renamed from: b */
    final Rect f62745b = new Rect();

    /* renamed from: c */
    public int f62746c = 0;

    /* renamed from: d */
    public int f62747d;

    static {
        Covode.recordClassIndex(32015);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo43756a(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract View mo43757a(List<View> list);

    public AbstractC26578b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43758b(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo43820c(View view) {
        if (this.f62747d == 0) {
            return 0;
        }
        float a = mo43756a(view);
        int i = this.f62747d;
        return C0622a.m2312a((int) (a * ((float) i)), 0, i);
    }

    public AbstractC26578b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C26579c
    /* renamed from: a_ */
    public final void mo43819a_(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = mo43757a(coordinatorLayout.mo2475b(view));
        if (a != null) {
            CoordinatorLayout.C0560e eVar = (CoordinatorLayout.C0560e) view.getLayoutParams();
            Rect rect = this.f62744a;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, a.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            C0753ad lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0792v.m2781o(coordinatorLayout) && !C0792v.m2781o(view)) {
                rect.left += lastWindowInsets.mo2865a();
                rect.right -= lastWindowInsets.mo2868c();
            }
            Rect rect2 = this.f62745b;
            int i2 = eVar.f2418c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            C0774e.m2694a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = mo43820c(a);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            this.f62746c = rect2.top - a.getBottom();
            return;
        }
        super.mo43819a_(coordinatorLayout, view, i);
        this.f62746c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public boolean mo2525a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View a;
        int i5;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (a = mo43757a(coordinatorLayout.mo2475b(view))) == null) {
            return false;
        }
        if (C0792v.m2781o(a) && !C0792v.m2781o(view)) {
            view.setFitsSystemWindows(true);
            if (C0792v.m2781o(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        int measuredHeight = (size - a.getMeasuredHeight()) + mo43758b(a);
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        coordinatorLayout.mo2470a(view, i, i2, View.MeasureSpec.makeMeasureSpec(measuredHeight, i5), i4);
        return true;
    }
}
