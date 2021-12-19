package com.p2082ss.android.ugc.aweme.newfollow.p3507ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagGroup */
public class FollowFeedTagGroup extends LinearLayout {
    static {
        Covode.recordClassIndex(72170);
    }

    public FollowFeedTagGroup(Context context) {
        this(context, null);
    }

    public FollowFeedTagGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(4301);
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 1; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    measureChild(childAt, i, i2);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    i4 = childAt.getMeasuredHeight();
                    i3 += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
            }
            View childAt2 = getChildAt(0);
            if (childAt2.getVisibility() == 8) {
                MethodCollector.m26664o(4301);
                return;
            }
            measureChild(childAt2, i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
            if (childAt2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + i3 < measuredWidth) {
                MethodCollector.m26664o(4301);
                return;
            }
            int i6 = ((measuredWidth - i3) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
            if (i4 == 0) {
                i4 = childAt2.getMeasuredHeight();
            }
            measureChild(childAt2, View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        MethodCollector.m26664o(4301);
    }

    private FollowFeedTagGroup(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(4291);
        setOrientation(0);
        MethodCollector.m26664o(4291);
    }
}
