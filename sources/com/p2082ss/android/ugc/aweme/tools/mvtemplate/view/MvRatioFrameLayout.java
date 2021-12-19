package com.p2082ss.android.ugc.aweme.tools.mvtemplate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.MvRatioFrameLayout */
public class MvRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    private float f177546a = 0.5625f;

    static {
        Covode.recordClassIndex(92166);
    }

    public void setRatio(float f) {
        this.f177546a = f;
    }

    public MvRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(5668);
        MethodCollector.m26664o(5668);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(5794);
        int size = View.MeasureSpec.getSize(i2);
        float f = this.f177546a;
        if (f != 0.0f) {
            i = View.MeasureSpec.makeMeasureSpec((int) (((float) size) * f), 1073741824);
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(5794);
    }
}
