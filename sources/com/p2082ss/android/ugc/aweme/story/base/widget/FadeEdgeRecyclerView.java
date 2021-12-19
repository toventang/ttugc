package com.p2082ss.android.ugc.aweme.story.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.widget.FadeEdgeRecyclerView */
public final class FadeEdgeRecyclerView extends RecyclerView {

    /* renamed from: O */
    private int f172038O;

    static {
        Covode.recordClassIndex(89644);
    }

    public FadeEdgeRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public final int getMaxHeight() {
        return this.f172038O;
    }

    /* access modifiers changed from: protected */
    public final float getLeftFadingEdgeStrength() {
        if (C78099c.m136517a(getContext())) {
            return 1.0f;
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final float getRightFadingEdgeStrength() {
        if (C78099c.m136517a(getContext())) {
            return 0.0f;
        }
        return 1.0f;
    }

    public final void setMaxHeight(int i) {
        this.f172038O = i;
        invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onMeasure(int i, int i2) {
        int i3 = this.f172038O;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    private /* synthetic */ FadeEdgeRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FadeEdgeRecyclerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}
