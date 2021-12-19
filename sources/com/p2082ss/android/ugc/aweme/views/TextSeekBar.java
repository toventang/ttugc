package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.views.TextSeekBar */
public class TextSeekBar extends LinearLayout {

    /* renamed from: a */
    private TextView f181979a;

    /* renamed from: b */
    private SeekBar f181980b;

    /* renamed from: c */
    private boolean f181981c = true;

    static {
        Covode.recordClassIndex(94788);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f181979a = (TextView) getChildAt(0);
        this.f181980b = (SeekBar) getChildAt(1);
    }

    /* renamed from: a */
    private void m141186a() {
        int paddingLeft = this.f181980b.getPaddingLeft();
        int measuredWidth = (this.f181980b.getMeasuredWidth() - paddingLeft) - this.f181980b.getPaddingRight();
        int progress = this.f181980b.getProgress();
        this.f181979a.setText(String.valueOf(progress));
        double d = (double) progress;
        Double.isNaN(d);
        int measuredWidth2 = this.f181979a.getMeasuredWidth();
        double d2 = (double) paddingLeft;
        double d3 = (double) measuredWidth;
        Double.isNaN(d3);
        Double.isNaN(d2);
        double d4 = (double) measuredWidth2;
        Double.isNaN(d4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f181979a.getLayoutParams());
        layoutParams.leftMargin = (int) ((d2 + ((d / 100.0d) * d3)) - (d4 / 2.0d));
        this.f181979a.setLayoutParams(layoutParams);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent) {
            m141186a();
        }
        return dispatchTouchEvent;
    }

    public TextSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(5055);
        MethodCollector.m26664o(5055);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(5070);
        super.onMeasure(i, i2);
        if (this.f181980b.getMeasuredWidth() != 0 && this.f181981c) {
            m141186a();
            this.f181981c = false;
        }
        MethodCollector.m26664o(5070);
    }
}
