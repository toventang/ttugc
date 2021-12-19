package com.p2082ss.android.ugc.aweme.newfollow.p3507ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsHeadLayout */
public class InsHeadLayout extends LinearLayout {
    static {
        Covode.recordClassIndex(72172);
    }

    public InsHeadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7434);
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth == 0) {
                MethodCollector.m26664o(7434);
                return;
            } else if (getChildAt(0).getVisibility() == 8) {
                MethodCollector.m26664o(7434);
                return;
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() != 8) {
                        measureChild(childAt, i, i2);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                        i3 += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    }
                }
                if (i3 > measuredWidth) {
                    View childAt2 = getChildAt(0);
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(measuredWidth - (i3 - childAt2.getMeasuredWidth()), 0), Integer.MIN_VALUE), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt2.getLayoutParams().height));
                }
            }
        }
        MethodCollector.m26664o(7434);
    }

    private InsHeadLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, -1);
        MethodCollector.m26663i(7432);
        setOrientation(0);
        MethodCollector.m26664o(7432);
    }
}
