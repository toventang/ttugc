package com.p2082ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout */
public class FixedRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    int f82059a;

    /* renamed from: b */
    float f82060b;

    static {
        Covode.recordClassIndex(41739);
    }

    public int getMode() {
        return this.f82059a;
    }

    public float getWhRatio() {
        return this.f82060b;
    }

    public void setMode(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("mode must be either FIXED_HEIGHT or FIXED_WIDTH");
        } else if (this.f82059a != i) {
            this.f82059a = i;
            requestLayout();
        }
    }

    public void setWhRatio(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("whRatio must be positive.");
        } else if (this.f82060b != f) {
            this.f82060b = f;
            requestLayout();
        }
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(10905);
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingBottom()) - getPaddingTop();
        if (this.f82059a == 0) {
            i = View.MeasureSpec.makeMeasureSpec((int) ((((float) size2) * this.f82060b) + 0.5f), 1073741824);
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec((int) ((((float) size) / this.f82060b) + 0.5f), 1073741824);
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(10905);
    }

    private FixedRatioFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10903);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.uw, R.attr.ate}, 0, 0);
        this.f82059a = obtainStyledAttributes.getInteger(0, 1);
        this.f82060b = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(10903);
    }
}
