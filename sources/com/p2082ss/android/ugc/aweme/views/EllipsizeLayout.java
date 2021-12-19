package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.views.EllipsizeLayout */
public class EllipsizeLayout extends LinearLayout {
    static {
        Covode.recordClassIndex(94753);
    }

    public EllipsizeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        MethodCollector.m26663i(10529);
        if (getOrientation() == 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            TextView textView = null;
            int childCount = getChildCount();
            int i3 = 0;
            boolean z2 = false;
            int i4 = 0;
            while (true) {
                z = true;
                if (i3 < childCount && !z2) {
                    View childAt = getChildAt(i3);
                    if (!(childAt == null || childAt.getVisibility() == 8)) {
                        if (childAt instanceof TextView) {
                            TextView textView2 = (TextView) childAt;
                            if (textView2.getEllipsize() != null) {
                                if (textView == null) {
                                    textView2.setMaxWidth(Integer.MAX_VALUE);
                                    textView = textView2;
                                } else {
                                    z2 = true;
                                }
                            }
                        }
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                        if (layoutParams.weight <= 0.0f) {
                            z = false;
                        }
                        z2 |= z;
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                        i4 += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                    }
                    i3++;
                }
            }
            if (!(textView == null || i4 == 0)) {
                z = false;
            }
            boolean z3 = z2 | z;
            int size = View.MeasureSpec.getSize(i);
            if (!z3 && i4 > size) {
                int measuredWidth = textView.getMeasuredWidth() - (i4 - size);
                if (measuredWidth < 0) {
                    measuredWidth = 0;
                }
                textView.setMaxWidth(measuredWidth);
            }
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(10529);
    }

    private EllipsizeLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10383);
        MethodCollector.m26664o(10383);
    }
}
