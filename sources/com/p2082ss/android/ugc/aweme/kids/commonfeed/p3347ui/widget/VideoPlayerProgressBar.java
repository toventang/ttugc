package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VideoPlayerProgressBar */
public class VideoPlayerProgressBar extends ProgressBar {

    /* renamed from: a */
    private Paint f131335a;

    /* renamed from: b */
    private float f131336b;

    /* renamed from: c */
    private int f131337c;

    /* renamed from: d */
    private int f131338d;

    static {
        Covode.recordClassIndex(67477);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
    }

    public void setReachedBarColor(int i) {
        this.f131338d = i;
    }

    public void setReachedProgressBarHeight(float f) {
        this.f131336b = f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f131337c) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f131335a.setColor(this.f131338d);
            this.f131335a.setStrokeWidth(this.f131336b);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f131335a);
        }
        canvas.restore();
    }

    public VideoPlayerProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f131336b, Math.abs(this.f131335a.descent() - this.f131335a.ascent())));
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
        this.f131337c = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    private VideoPlayerProgressBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8593);
        this.f131335a = new Paint();
        this.f131336b = (float) ((int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a9h, R.attr.a9i});
        this.f131338d = obtainStyledAttributes.getColor(0, -261935);
        this.f131336b = obtainStyledAttributes.getDimension(1, this.f131336b);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(8593);
    }
}
