package com.bytedance.android.livesdk.chatroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class FadingEdgeConstraintLayout extends ConstraintLayout {

    /* renamed from: g */
    private final float f19782g;

    static {
        Covode.recordClassIndex(8757);
    }

    public FadingEdgeConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final float getLeftFadingEdgeStrength() {
        if (!isHorizontalFadingEdgeEnabled() || !C6229a.m13521a(getContext()) || !m16082b()) {
            return 0.0f;
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public final float getRightFadingEdgeStrength() {
        if (!isHorizontalFadingEdgeEnabled() || C6229a.m13521a(getContext()) || !m16082b()) {
            return 0.0f;
        }
        return 1.0f;
    }

    /* renamed from: b */
    private final boolean m16082b() {
        int i;
        int i2;
        float paddingLeft = (this.f19782g - ((float) getPaddingLeft())) - ((float) getPaddingRight());
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                float measuredWidth = paddingLeft - ((float) childAt.getMeasuredWidth());
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.leftMargin;
                } else {
                    i = 0;
                }
                float f = measuredWidth - ((float) i);
                if (marginLayoutParams != null) {
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    i2 = 0;
                }
                paddingLeft = f - ((float) i2);
                if (paddingLeft < 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    private /* synthetic */ FadingEdgeConstraintLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FadingEdgeConstraintLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f19782g = context.getResources().getDimension(R.dimen.vi);
    }
}
