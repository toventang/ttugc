package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout */
public class ScrollableLinearLayout extends LinearLayout {

    /* renamed from: a */
    public int f166948a;

    static {
        Covode.recordClassIndex(87025);
    }

    public ScrollableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(8572);
        MethodCollector.m26664o(8572);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
            i3 += childAt.getMeasuredWidth();
            i4 = Math.max(i4, childAt.getMeasuredHeight());
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            int i6 = this.f166948a;
            if (i3 < size + i6) {
                i3 = size + i6;
            }
        }
        setMeasuredDimension(i3, resolveSize(i4, i2));
    }
}
