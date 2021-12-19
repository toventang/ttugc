package com.zhihu.matisse.internal.p4516ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.zhihu.matisse.internal.ui.widget.SquareFrameLayout */
public class SquareFrameLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(104005);
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(12815);
        MethodCollector.m26664o(12815);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(12816);
        super.onMeasure(i, i);
        MethodCollector.m26664o(12816);
    }
}
