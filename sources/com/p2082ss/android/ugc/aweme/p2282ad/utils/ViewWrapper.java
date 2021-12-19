package com.p2082ss.android.ugc.aweme.p2282ad.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.ViewWrapper */
public final class ViewWrapper {
    private final View view;

    static {
        Covode.recordClassIndex(40239);
    }

    public final View getView() {
        return this.view;
    }

    public final int getHeight() {
        return this.view.getLayoutParams().height;
    }

    public final int getWidth() {
        return this.view.getLayoutParams().width;
    }

    public final ViewGroup.MarginLayoutParams getMarginLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        if (this.view.getParent() instanceof FrameLayout) {
            ViewGroup.LayoutParams layoutParams2 = this.view.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = this.view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public ViewWrapper(View view2) {
        C89219l.m154721d(view2, "");
        this.view = view2;
    }

    public final void setHeight(int i) {
        this.view.getLayoutParams().height = i;
        this.view.requestLayout();
    }

    public final void setWidth(int i) {
        this.view.getLayoutParams().width = i;
        this.view.requestLayout();
    }
}
