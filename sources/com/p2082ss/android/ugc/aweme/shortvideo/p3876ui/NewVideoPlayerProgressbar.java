package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar */
public class NewVideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a */
    private Paint f164630a;

    /* renamed from: b */
    private float f164631b;

    /* renamed from: c */
    private int f164632c;

    /* renamed from: d */
    private int f164633d;

    /* renamed from: e */
    private boolean f164634e;

    static {
        Covode.recordClassIndex(86028);
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
        this.f164633d = i;
    }

    public void setReachedProgressBarHeight(float f) {
        this.f164631b = f;
    }

    public NewVideoPlayerProgressbar(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f164632c) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f164630a.setColor(this.f164633d);
            this.f164630a.setStrokeWidth(this.f164631b);
            float height = ((float) getHeight()) / 2.0f;
            if (this.f164634e) {
                int i = this.f164632c;
                canvas.drawLine((float) i, height, ((float) i) - progress, height, this.f164630a);
            } else {
                canvas.drawLine(0.0f, height, progress, height, this.f164630a);
            }
        }
        canvas.restore();
    }

    public NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f164631b, Math.abs(this.f164630a.descent() - this.f164630a.ascent())));
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
        this.f164632c = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
        boolean z = true;
        if (C0792v.m2768e(this) != 1) {
            z = false;
        }
        this.f164634e = z;
    }

    private NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(3112);
        this.f164630a = new Paint();
        this.f164631b = (float) ((int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a9h, R.attr.a9i});
        this.f164633d = obtainStyledAttributes.getColor(0, -261935);
        this.f164631b = obtainStyledAttributes.getDimension(1, this.f164631b);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(3112);
    }
}
